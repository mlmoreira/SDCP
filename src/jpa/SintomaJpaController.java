package jpa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import jpa.exceptions.NonexistentEntityException;
import model.Sintoma;

public class SintomaJpaController implements Serializable {

    public SintomaJpaController() {
        emf = Persistence.createEntityManagerFactory("SDCPPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Sintoma sintoma) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(sintoma);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Sintoma sintoma) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            sintoma = em.merge(sintoma);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = sintoma.getId();
                if (findSintoma(id) == null) {
                    throw new NonexistentEntityException("The sintoma with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sintoma sintoma;
            try {
                sintoma = em.getReference(Sintoma.class, id);
                sintoma.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sintoma with id " + id + " no longer exists.", enfe);
            }
            em.remove(sintoma);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public Sintoma getSintoma(String abv){
        EntityManager em = getEntityManager();
        return (Sintoma) em.createQuery("select s from Sintoma s where s.abreviacao like '" + abv + "%'").getSingleResult();
    }

    public List<Sintoma> findSintomaEntities() {
        return findSintomaEntities(true, -1, -1);
    }

    public List<Sintoma> findSintomaEntities(int maxResults, int firstResult) {
        return findSintomaEntities(false, maxResults, firstResult);
    }

    private List<Sintoma> findSintomaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sintoma.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Sintoma findSintoma(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Sintoma.class, id);
        } finally {
            em.close();
        }
    }

    public int getSintomaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Sintoma> rt = cq.from(Sintoma.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
