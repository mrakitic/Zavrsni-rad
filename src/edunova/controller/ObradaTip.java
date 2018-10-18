/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Tip;
import edunova.pomocno.EdunovaException;
import java.util.List;

/**
 *
 * @author Borna
 */
public class ObradaTip extends Obrada implements ObradaInterface<Tip>{

    
    public List<Tip> getEntiteti() {
        return session.createQuery(" from Tip").list();
    }

   
    public Tip dodaj(Tip e) throws EdunovaException {
        spremi(e);
        return e;
    }

    
    public Tip promjena(Tip e) throws EdunovaException {
        spremi(e);
        return e;
    }
    
}
