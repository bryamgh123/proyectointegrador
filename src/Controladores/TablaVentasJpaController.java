/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Controladores.exceptions.PreexistingEntityException;
import Entidades.TablaVentas;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author ACER
 */
public class TablaVentasJpaController implements Serializable {

    public TablaVentasJpaController() {
        this.emf = Persistence.createEntityManagerFactory("proyectointegradorPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TablaVentas tablaVentas) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tablaVentas);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTablaVentas(tablaVentas.getDniVen()) != null) {
                throw new PreexistingEntityException("TablaVentas " + tablaVentas + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TablaVentas tablaVentas) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tablaVentas = em.merge(tablaVentas);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tablaVentas.getDniVen();
                if (findTablaVentas(id) == null) {
                    throw new NonexistentEntityException("The tablaVentas with id " + id + " no longer exists.");
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
            TablaVentas tablaVentas;
            try {
                tablaVentas = em.getReference(TablaVentas.class, id);
                tablaVentas.getDniVen();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tablaVentas with id " + id + " no longer exists.", enfe);
            }
            em.remove(tablaVentas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TablaVentas> findTablaVentasEntities() {
        return findTablaVentasEntities(true, -1, -1);
    }

    public List<TablaVentas> findTablaVentasEntities(int maxResults, int firstResult) {
        return findTablaVentasEntities(false, maxResults, firstResult);
    }

    private List<TablaVentas> findTablaVentasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TablaVentas.class));
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

    public TablaVentas findTablaVentas(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TablaVentas.class, id);
        } finally {
            em.close();
        }
    }

    public int getTablaVentasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TablaVentas> rt = cq.from(TablaVentas.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
