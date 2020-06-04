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
import Entidades.Qrmascarilla;
import javax.persistence.Persistence;

/**
 *
 * @author ACER
 */
public class QrmascarillaJpaController implements Serializable {

    public QrmascarillaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("proyectointegradorPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Qrmascarilla qrmascarilla) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(qrmascarilla);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findQrmascarilla(qrmascarilla.getCorreoVen()) != null) {
                throw new PreexistingEntityException("Qrmascarilla " + qrmascarilla + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Qrmascarilla qrmascarilla) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            qrmascarilla = em.merge(qrmascarilla);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = qrmascarilla.getCorreoVen();
                if (findQrmascarilla(id) == null) {
                    throw new NonexistentEntityException("The qrmascarilla with id " + id + " no longer exists.");
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
            Qrmascarilla qrmascarilla;
            try {
                qrmascarilla = em.getReference(Qrmascarilla.class, id);
                qrmascarilla.getCorreoVen();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The qrmascarilla with id " + id + " no longer exists.", enfe);
            }
            em.remove(qrmascarilla);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Qrmascarilla> findQrmascarillaEntities() {
        return findQrmascarillaEntities(true, -1, -1);
    }

    public List<Qrmascarilla> findQrmascarillaEntities(int maxResults, int firstResult) {
        return findQrmascarillaEntities(false, maxResults, firstResult);
    }

    private List<Qrmascarilla> findQrmascarillaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Qrmascarilla.class));
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

    public Qrmascarilla findQrmascarilla(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Qrmascarilla.class, id);
        } finally {
            em.close();
        }
    }

    public int getQrmascarillaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Qrmascarilla> rt = cq.from(Qrmascarilla.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
