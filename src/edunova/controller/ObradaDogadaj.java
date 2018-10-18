/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Dogadaj;
import edunova.model.Tip;
import edunova.pomocno.EdunovaException;
import java.util.List;

/**
 *
 * @author Borna
 */
public class ObradaDogadaj extends Obrada implements ObradaInterface<Dogadaj>{

    
    public List<Dogadaj> getEntiteti() {
        return session.createQuery(" from Dogadaj").list();
    }
    
    public List<Dogadaj> getBrojGolova(String utakmica, String igrac, String tip){
        return session.createSQLQuery(" select * from Dogadaj e where "
                + " utakmica_sifra = :utakmica and igrac_sifra = :igrac and tip_sifra = :tip")
                .setString("utakmica" ,utakmica ).setString("igrac", igrac).setString("tip", tip).list();
             
    }


    
    public Dogadaj dodaj(Dogadaj e) throws EdunovaException {
       spremi(e);
        return e;
    }

  
    public Dogadaj promjena(Dogadaj e) throws EdunovaException {
        spremi(e);
        return e;
    }
    
}
