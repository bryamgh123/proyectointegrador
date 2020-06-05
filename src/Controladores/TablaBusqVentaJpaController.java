/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Controladores.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidades.TablaBusqVenta;
import javax.persistence.Persistence;

/**
 *
 * @author ACER
 */
public class TablaBusqVentaJpaController implements Serializable {

    public TablaBusqVentaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("proyectointegradorPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TablaBusqVenta tablaBusqVenta) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tablaBusqVenta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTablaBusqVenta(tablaBusqVenta.getIdBusq()) != null) {
                throw new PreexistingEntityException("TablaBusqVenta " + tablaBusqVenta + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TablaBusqVenta tablaBusqVenta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tablaBusqVenta = em.merge(tablaBusqVenta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tablaBusqVenta.getIdBusq();
                if (findTablaBusqVenta(id) == null) {
                    throw new NonexistentEntityException("The tablaBusqVenta with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TablaBusqVenta tablaBusqVenta;
            try {
                tablaBusqVenta = em.getReference(TablaBusqVenta.class, id);
                tablaBusqVenta.getIdBusq();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tablaBusqVenta with id " + id + " no longer exists.", enfe);
            }
            em.remove(tablaBusqVenta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TablaBusqVenta> findTablaBusqVentaEntities() {
        return findTablaBusqVentaEntities(true, -1, -1);
    }

    public List<TablaBusqVenta> findTablaBusqVentaEntities(int maxResults, int firstResult) {
        return findTablaBusqVentaEntities(false, maxResults, firstResult);
    }

    private List<TablaBusqVenta> findTablaBusqVentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TablaBusqVenta.class));
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

    public TablaBusqVenta findTablaBusqVenta(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TablaBusqVenta.class, id);
        } finally {
            em.close();
        }
    }

    public int getTablaBusqVentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TablaBusqVenta> rt = cq.from(TablaBusqVenta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
