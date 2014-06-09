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
import model.Peca;

public class PecaJpaController implements Serializable {

    public PecaJpaController() {
        emf = Persistence.createEntityManagerFactory("SDCPPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Peca peca) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(peca);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Peca peca) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            peca = em.merge(peca);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = peca.getId();
                if (findPeca(id) == null) {
                    throw new NonexistentEntityException("The peca with id " + id + " no longer exists.");
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
            Peca peca;
            try {
                peca = em.getReference(Peca.class, id);
                peca.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The peca with id " + id + " no longer exists.", enfe);
            }
            em.remove(peca);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Peca getPeca(String nome){
        EntityManager em = getEntityManager();
        return (Peca) em.createQuery("select p from Peca p where p.nome like '" + nome + "%'").getSingleResult();
    }
    
    public List<Peca> findPecaEntities() {
        return findPecaEntities(true, -1, -1);
    }

    public List<Peca> findPecaEntities(int maxResults, int firstResult) {
        return findPecaEntities(false, maxResults, firstResult);
    }

    private List<Peca> findPecaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Peca.class));
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

    public Peca findPeca(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Peca.class, id);
        } finally {
            em.close();
        }
    }

    public int getPecaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Peca> rt = cq.from(Peca.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
