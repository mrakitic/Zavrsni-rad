/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Borna
 */
@Entity
public class Dogadaj extends Entitet implements Serializable {
    
    @ManyToOne
    private Utakmica utakmica;
    private String opis;
    @ManyToOne
    private Tip tip;
    @ManyToOne
    private Igrac igrac;

    public Utakmica getUtakmica() {
        return utakmica;
    }

    public void setUtakmica(Utakmica utakmica) {
        this.utakmica = utakmica;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Tip getTip() {
        return tip;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }

    public Igrac getIgrac() {
        return igrac;
    }

    public void setIgrac(Igrac igrac) {
        this.igrac = igrac;
    }
    
    
}
