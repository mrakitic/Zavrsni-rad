/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Igrac;
import edunova.pomocno.EdunovaException;
import edunova.pomocno.Kontrola;
import java.util.List;

/**
 *
 * @author Borna
 */
public class ObradaIgrac extends ObradaOsoba implements ObradaInterface<Igrac>{

    
    public List<Igrac> getEntiteti() {
        return session.createQuery(" from Igrac").list();
    }
    
    public List<Igrac> getEntiteti(String uvjet){
        return session.createQuery(" from Igrac e where "
                + " concat(e.ime, ' ', e.prezime) like :uvjet")
                .setString("uvjet", "%" + uvjet + "%")
                .list();
    }

    @Override
    public Igrac dodaj(Igrac e) throws EdunovaException {
        kontrola(e);
        spremi(e);
        return e;
    }

    @Override
    public Igrac promjena(Igrac e) throws EdunovaException {
        kontrola(e);
        spremi(e);
        return e;
    }
        
    
    
    protected void kontrola(Igrac e) throws EdunovaException{
        
        super.kontrola(e);
    }
    
    
}
