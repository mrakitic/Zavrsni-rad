/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Klub;
import edunova.model.Utakmica;
import edunova.pomocno.EdunovaException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Borna
 */
public class ObradaUtakmica extends Obrada implements ObradaInterface<Utakmica>{

    
    public List<Utakmica> getEntiteti() {
         return session.createQuery(" from Utakmica").list();
    }
    
    public List<Utakmica> getEntiteti(String uvjet){
        return session.createQuery(" from Utakmica e where "
                + " datumOdigravanja like :uvjet")
                .setString("uvjet", "%" + uvjet + "%")
                .list();
    }
          

    
    public Utakmica dodaj(Utakmica e) throws EdunovaException {
        spremi(e);
        return e;
    }

   
    public Utakmica promjena(Utakmica e) throws EdunovaException {
        spremi(e);
        return e;
    }
    
}
