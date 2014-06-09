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
import model.DetalheSintoma;

public class DetalheSintomaJpaController implements Serializable {

    public DetalheSintomaJpaController() {
        emf = Persistence.createEntityManagerFactory("SDCPPU");;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DetalheSintoma detalheSintoma) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalheSintoma);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DetalheSintoma detalheSintoma) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalheSintoma = em.merge(detalheSintoma);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalheSintoma.getId();
                if (findDetalheSintoma(id) == null) {
                    throw new NonexistentEntityException("The detalheSintoma with id " + id + " no longer exists.");
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
            DetalheSintoma detalheSintoma;
            try {
                detalheSintoma = em.getReference(DetalheSintoma.class, id);
                detalheSintoma.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalheSintoma with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalheSintoma);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DetalheSintoma> findDetalheSintomaEntities() {
        return findDetalheSintomaEntities(true, -1, -1);
    }

    public List<DetalheSintoma> findDetalheSintomaEntities(int maxResults, int firstResult) {
        return findDetalheSintomaEntities(false, maxResults, firstResult);
    }

    private List<DetalheSintoma> findDetalheSintomaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetalheSintoma.class));
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

    public DetalheSintoma findDetalheSintoma(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetalheSintoma.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalheSintomaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DetalheSintoma> rt = cq.from(DetalheSintoma.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
