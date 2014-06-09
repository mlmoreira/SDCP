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
import model.DetalhePeca;

public class DetalhePecaJpaController implements Serializable {

    public DetalhePecaJpaController() {
        emf = Persistence.createEntityManagerFactory("SDCPPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DetalhePeca detalhePeca) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalhePeca);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DetalhePeca detalhePeca) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalhePeca = em.merge(detalhePeca);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalhePeca.getId();
                if (findDetalhePeca(id) == null) {
                    throw new NonexistentEntityException("The detalhePeca with id " + id + " no longer exists.");
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
            DetalhePeca detalhePeca;
            try {
                detalhePeca = em.getReference(DetalhePeca.class, id);
                detalhePeca.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalhePeca with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalhePeca);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DetalhePeca> findDetalhePecaEntities() {
        return findDetalhePecaEntities(true, -1, -1);
    }

    public List<DetalhePeca> findDetalhePecaEntities(int maxResults, int firstResult) {
        return findDetalhePecaEntities(false, maxResults, firstResult);
    }

    private List<DetalhePeca> findDetalhePecaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetalhePeca.class));
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

    public DetalhePeca findDetalhePeca(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetalhePeca.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalhePecaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DetalhePeca> rt = cq.from(DetalhePeca.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
