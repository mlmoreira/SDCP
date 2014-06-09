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
import model.Cidade;
import model.LojaPecas;
import model.Uf;

public class LojaPecasJpaController implements Serializable {

    public LojaPecasJpaController() {
        emf = Persistence.createEntityManagerFactory("SDCPPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(LojaPecas lojaPecas) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(lojaPecas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LojaPecas lojaPecas) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            lojaPecas = em.merge(lojaPecas);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = lojaPecas.getId();
                if (findLojaPecas(id) == null) {
                    throw new NonexistentEntityException("The lojaPecas with id " + id + " no longer exists.");
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
            LojaPecas lojaPecas;
            try {
                lojaPecas = em.getReference(LojaPecas.class, id);
                lojaPecas.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The lojaPecas with id " + id + " no longer exists.", enfe);
            }
            em.remove(lojaPecas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public LojaPecas getLojaPecas(String nome) {
        EntityManager em = getEntityManager();
        return (LojaPecas) em.createQuery("select lp from LojaPecas lp where lp.nome like '" + nome + "%'").getSingleResult();
    }

    public List getLojaPecasRegiao(Bairro b) {
        EntityManager em = getEntityManager();
        List lojasPecasRegiao = em.createQuery("select lp from LojaPecas lp where lp.bairro.id =" + b.getId() + " order by lp.nome").getResultList();
        return lojasPecasRegiao;
    }

    public List<LojaPecas> findLojaPecasEntities() {
        return findLojaPecasEntities(true, -1, -1);
    }

    public List<LojaPecas> findLojaPecasEntities(int maxResults, int firstResult) {
        return findLojaPecasEntities(false, maxResults, firstResult);
    }

    private List<LojaPecas> findLojaPecasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LojaPecas.class));
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

    public LojaPecas findLojaPecas(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(LojaPecas.class, id);
        } finally {
            em.close();
        }
    }

    public int getLojaPecasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LojaPecas> rt = cq.from(LojaPecas.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
