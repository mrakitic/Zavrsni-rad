/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Borna
 */
@Entity
public class Utakmica extends Entitet implements Serializable {
    
    @ManyToOne
    private Klub domacin;
    @ManyToOne
    private Klub gost;
    
    private String mjesto;
    private BigDecimal ulaznica;
    @Temporal(TemporalType.DATE)
    private Date datumOdigravanja;

    public Date getDatumOdigravanja() {
        return datumOdigravanja;
    }

    public void setDatumOdigravanja(Date datumOdigravanja) {
        this.datumOdigravanja = datumOdigravanja;
    }
    

    public Klub getDomacin() {
        return domacin;
    }

    public void setDomacin(Klub domacin) {
        this.domacin = domacin;
    }

    public Klub getGost() {
        return gost;
    }

    public void setGost(Klub gost) {
        this.gost = gost;
    }

    public String getMjesto() {
        return mjesto;
    }

    public void setMjesto(String mjesto) {
        this.mjesto = mjesto;
    }

    public BigDecimal getUlaznica() {
        return ulaznica;
    }

    public void setUlaznica(BigDecimal ulaznica) {
        this.ulaznica = ulaznica;
    }

    @Override
    public String toString() {
        return getDomacin() + " : " + getGost();
    }
    
    
    
    
}
