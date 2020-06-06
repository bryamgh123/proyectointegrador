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
import javax.swing.JTable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "tabla_busq_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TablaBusqVenta.findAll", query = "SELECT t FROM TablaBusqVenta t"),
    @NamedQuery(name = "TablaBusqVenta.findByIdBusq", query = "SELECT t FROM TablaBusqVenta t WHERE t.idBusq = :idBusq"),
    @NamedQuery(name = "TablaBusqVenta.findByModeBusq", query = "SELECT t FROM TablaBusqVenta t WHERE t.modeBusq = :modeBusq"),
    @NamedQuery(name = "TablaBusqVenta.findByCaraBusq", query = "SELECT t FROM TablaBusqVenta t WHERE t.caraBusq = :caraBusq"),
    @NamedQuery(name = "TablaBusqVenta.findByColoBusq", query = "SELECT t FROM TablaBusqVenta t WHERE t.coloBusq = :coloBusq"),
    @NamedQuery(name = "TablaBusqVenta.findByCantBusq", query = "SELECT t FROM TablaBusqVenta t WHERE t.cantBusq = :cantBusq"),
    @NamedQuery(name = "TablaBusqVenta.findByPrecBusq", query = "SELECT t FROM TablaBusqVenta t WHERE t.precBusq = :precBusq")})
public class TablaBusqVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_busq")
    private Integer idBusq;
    @Column(name = "mode_busq")
    private String modeBusq;
    @Column(name = "cara_busq")
    private String caraBusq;
    @Column(name = "colo_busq")
    private String coloBusq;
    @Column(name = "cant_busq")
    private String cantBusq;
    @Column(name = "prec_busq")
    private String precBusq;

    public TablaBusqVenta() {
    }

    public TablaBusqVenta(Integer idBusq) {
        this.idBusq = idBusq;
    }

    public Integer getIdBusq() {
        return idBusq;
    }

    public void setIdBusq(Integer idBusq) {
        this.idBusq = idBusq;
    }

    public String getModeBusq() {
        return modeBusq;
    }

    public void setModeBusq(String modeBusq) {
        this.modeBusq = modeBusq;
    }

    public String getCaraBusq() {
        return caraBusq;
    }

    public void setCaraBusq(String caraBusq) {
        this.caraBusq = caraBusq;
    }

    public String getColoBusq() {
        return coloBusq;
    }

    public void setColoBusq(String coloBusq) {
        this.coloBusq = coloBusq;
    }

    public String getCantBusq() {
        return cantBusq;
    }

    public void setCantBusq(String cantBusq) {
        this.cantBusq = cantBusq;
    }

    public String getPrecBusq() {
        return precBusq;
    }

    public void setPrecBusq(String precBusq) {
        this.precBusq = precBusq;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBusq != null ? idBusq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TablaBusqVenta)) {
            return false;
        }
        TablaBusqVenta other = (TablaBusqVenta) object;
        if ((this.idBusq == null && other.idBusq != null) || (this.idBusq != null && !this.idBusq.equals(other.idBusq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectointegrador.TablaBusqVenta[ idBusq=" + idBusq + " ]";
    }
    
     
    
}
