/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "tabla_ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TablaVentas.findAll", query = "SELECT t FROM TablaVentas t"),
    @NamedQuery(name = "TablaVentas.findByDniVen", query = "SELECT t FROM TablaVentas t WHERE t.dniVen = :dniVen"),
    @NamedQuery(name = "TablaVentas.findByPaisVen", query = "SELECT t FROM TablaVentas t WHERE t.paisVen = :paisVen"),
    @NamedQuery(name = "TablaVentas.findByCiudVen", query = "SELECT t FROM TablaVentas t WHERE t.ciudVen = :ciudVen"),
    @NamedQuery(name = "TablaVentas.findByPostVen", query = "SELECT t FROM TablaVentas t WHERE t.postVen = :postVen"),
    @NamedQuery(name = "TablaVentas.findByDireVen", query = "SELECT t FROM TablaVentas t WHERE t.direVen = :direVen"),
    @NamedQuery(name = "TablaVentas.findByIdBusq", query = "SELECT t FROM TablaVentas t WHERE t.idBusq = :idBusq"),
    @NamedQuery(name = "TablaVentas.findByNumTar", query = "SELECT t FROM TablaVentas t WHERE t.numTar = :numTar"),
    @NamedQuery(name = "TablaVentas.findByFechTar", query = "SELECT t FROM TablaVentas t WHERE t.fechTar = :fechTar"),
    @NamedQuery(name = "TablaVentas.findByCodiTar", query = "SELECT t FROM TablaVentas t WHERE t.codiTar = :codiTar")})
public class TablaVentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "dni_ven")
    private Integer dniVen;
    @Basic(optional = false)
    @Column(name = "pais_ven")
    private String paisVen;
    @Basic(optional = false)
    @Column(name = "ciud_ven")
    private String ciudVen;
    @Basic(optional = false)
    @Column(name = "post_ven")
    private String postVen;
    @Basic(optional = false)
    @Column(name = "dire_ven")
    private String direVen;
    @Basic(optional = false)
    @Column(name = "id_busq")
    private int idBusq;
    @Basic(optional = false)
    @Column(name = "num_tar")
    private int numTar;
    @Basic(optional = false)
    @Column(name = "fech_tar")
    private int fechTar;
    @Basic(optional = false)
    @Column(name = "codi_tar")
    private int codiTar;

    public TablaVentas() {
    }

    public TablaVentas(Integer dniVen) {
        this.dniVen = dniVen;
    }

    public TablaVentas(Integer dniVen, String paisVen, String ciudVen, String postVen, String direVen, int idBusq, int numTar, int fechTar, int codiTar) {
        this.dniVen = dniVen;
        this.paisVen = paisVen;
        this.ciudVen = ciudVen;
        this.postVen = postVen;
        this.direVen = direVen;
        this.idBusq = idBusq;
        this.numTar = numTar;
        this.fechTar = fechTar;
        this.codiTar = codiTar;
    }

    public Integer getDniVen() {
        return dniVen;
    }

    public void setDniVen(Integer dniVen) {
        this.dniVen = dniVen;
    }

    public String getPaisVen() {
        return paisVen;
    }

    public void setPaisVen(String paisVen) {
        this.paisVen = paisVen;
    }

    public String getCiudVen() {
        return ciudVen;
    }

    public void setCiudVen(String ciudVen) {
        this.ciudVen = ciudVen;
    }

    public String getPostVen() {
        return postVen;
    }

    public void setPostVen(String postVen) {
        this.postVen = postVen;
    }

    public String getDireVen() {
        return direVen;
    }

    public void setDireVen(String direVen) {
        this.direVen = direVen;
    }

    public int getIdBusq() {
        return idBusq;
    }

    public void setIdBusq(int idBusq) {
        this.idBusq = idBusq;
    }

    public int getNumTar() {
        return numTar;
    }

    public void setNumTar(int numTar) {
        this.numTar = numTar;
    }

    public int getFechTar() {
        return fechTar;
    }

    public void setFechTar(int fechTar) {
        this.fechTar = fechTar;
    }

    public int getCodiTar() {
        return codiTar;
    }

    public void setCodiTar(int codiTar) {
        this.codiTar = codiTar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dniVen != null ? dniVen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TablaVentas)) {
            return false;
        }
        TablaVentas other = (TablaVentas) object;
        if ((this.dniVen == null && other.dniVen != null) || (this.dniVen != null && !this.dniVen.equals(other.dniVen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TablaVentas[ dniVen=" + dniVen + " ]";
    }
    
}
