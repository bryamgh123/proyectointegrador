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
@Table(name = "qrmascarilla")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Qrmascarilla.findAll", query = "SELECT q FROM Qrmascarilla q"),
    @NamedQuery(name = "Qrmascarilla.findByCorreoVen", query = "SELECT q FROM Qrmascarilla q WHERE q.correoVen = :correoVen"),
    @NamedQuery(name = "Qrmascarilla.findByModeBusq", query = "SELECT q FROM Qrmascarilla q WHERE q.modeBusq = :modeBusq"),
    @NamedQuery(name = "Qrmascarilla.findByCaraBusq", query = "SELECT q FROM Qrmascarilla q WHERE q.caraBusq = :caraBusq")})
public class Qrmascarilla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "correo_ven")
    private Integer correoVen;
    @Basic(optional = false)
    @Column(name = "mode_busq")
    private String modeBusq;
    @Basic(optional = false)
    @Column(name = "cara_busq")
    private String caraBusq;

    public Qrmascarilla() {
    }

    public Qrmascarilla(Integer correoVen) {
        this.correoVen = correoVen;
    }

    public Qrmascarilla(Integer correoVen, String modeBusq, String caraBusq) {
        this.correoVen = correoVen;
        this.modeBusq = modeBusq;
        this.caraBusq = caraBusq;
    }

    public Integer getCorreoVen() {
        return correoVen;
    }

    public void setCorreoVen(Integer correoVen) {
        this.correoVen = correoVen;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (correoVen != null ? correoVen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Qrmascarilla)) {
            return false;
        }
        Qrmascarilla other = (Qrmascarilla) object;
        if ((this.correoVen == null && other.correoVen != null) || (this.correoVen != null && !this.correoVen.equals(other.correoVen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectointegrador.Qrmascarilla[ correoVen=" + correoVen + " ]";
    }
    
}
