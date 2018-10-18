/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Igrac;
import edunova.pomocno.EdunovaException;
import edunova.pomocno.Kontrola;

/**
 *
 * @author Borna
 */
public abstract class ObradaOsoba extends Obrada {
    
    protected void kontrola(Igrac e) throws EdunovaException{
        
        if (e.getIme().trim().isEmpty()){
            throw new EdunovaException("Ime obavezno");
        }
        
        if (e.getPrezime().trim().isEmpty()){
            throw new EdunovaException("Prezime obavezno");
        }
    }
}
    
    
    

