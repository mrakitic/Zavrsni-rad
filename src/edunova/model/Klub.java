/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Borna
 */
@Entity
public class Klub extends Entitet implements Serializable{
    
    private String naziv;
    private String imeStadiona;
    private String imeGrada;
    
    @OneToMany(mappedBy = "klub")
    private List<Igrac> igraci;

    public List<Igrac> getIgraci() {
        return igraci;
    }

    public void setIgraci(List<Igrac> igraci) {
        this.igraci = igraci;
    }
    

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getImeStadiona() {
        return imeStadiona;
    }

    public void setImeStadiona(String imeStadiona) {
        this.imeStadiona = imeStadiona;
    }

    public String getImeGrada() {
        return imeGrada;
    }

    public void setImeGrada(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    @Override
    public String toString() {
        return getNaziv();
    }
    
    
    
    
}
