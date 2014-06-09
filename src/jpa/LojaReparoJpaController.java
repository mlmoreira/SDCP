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
import model.Bairro;
import model.LojaReparo;

public class LojaReparoJpaController implements Serializable {

    public LojaReparoJpaController() {
        emf = Persistence.createEntityManagerFactory("SDCPPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(LojaReparo lojaReparo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(lojaReparo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LojaReparo lojaReparo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            lojaReparo = em.merge(lojaReparo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = lojaReparo.getId();
                if (findLojaReparo(id) == null) {
                    throw new NonexistentEntityException("The lojaReparo with id " + id + " no longer exists.");
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
            LojaReparo lojaReparo;
            try {
                lojaReparo = em.getReference(LojaReparo.class, id);
                lojaReparo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The lojaReparo with id " + id + " no longer exists.", enfe);
            }
            em.remove(lojaReparo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public LojaReparo getLojaReparo(String nome){
        EntityManager em = getEntityManager();
        return (LojaReparo) em.createQuery("select lr from LojaReparo lr where lr.nome like '" + nome + "%'").getSingleResult();
    }
    
    public List getLojaReparoRegiao(Bairro b) {
        EntityManager em = getEntityManager();
        List lojasReparoRegiao = em.createQuery("select lr from LojaReparo lr where lr.bairro.id =" + b.getId() + " order by lr.nome").getResultList();
        return lojasReparoRegiao;
    }
    
    public List<LojaReparo> findLojaReparoEntities() {
        return findLojaReparoEntities(true, -1, -1);
    }

    public List<LojaReparo> findLojaReparoEntities(int maxResults, int firstResult) {
        return findLojaReparoEntities(false, maxResults, firstResult);
    }

    private List<LojaReparo> findLojaReparoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LojaReparo.class));
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

    public LojaReparo findLojaReparo(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(LojaReparo.class, id);
        } finally {
            em.close();
        }
    }

    public int getLojaReparoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LojaReparo> rt = cq.from(LojaReparo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
