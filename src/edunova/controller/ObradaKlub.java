/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

import edunova.model.Klub;
import edunova.pomocno.EdunovaException;
import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author Borna
 */
public class ObradaKlub extends Obrada implements ObradaInterface<Klub>{

    
    public List<Klub> getEntiteti() {
        return session.createQuery(" from Klub e order by e.naziv").list();
    }
    
    public List<Klub> getEntiteti(String uvjet){
        return session.createQuery(" from Klub e where e.naziv like :uvjet "
                + " order by e.naziv")
                .setString("uvjet", "%" + uvjet + "%")
                .list();
    }
    
    

    
    public Klub dodaj(Klub k) throws EdunovaException {
       kontrola(k);
       
       BigInteger postojeci  = (BigInteger)session.createSQLQuery("select count(sifra) from klub where naziv=:naziv").
                setString("naziv", k.getNaziv()).uniqueResult();
        if(postojeci.intValue()==1){
            throw new EdunovaException("Klub s istim nazivom postoji");
        }
       spremi(k);
        
        return k;
    }

    
    public Klub promjena(Klub k) throws EdunovaException {
        
                kontrola(k);
        
        BigInteger postojeci  = (BigInteger)session.createSQLQuery("select count(sifra) from klub where naziv=:naziv and sifra<>:sifra").
                setString("naziv", k.getNaziv()).setInteger("sifra", k.getSifra()).uniqueResult();
        if(postojeci.intValue()==1){
            throw new EdunovaException("Klub s istim nazivom postoji");
        }
        
        //ovdje dođu sve ostale kontrole
        
        spremi(k);
        
        return k;
    }
    
    
    private void kontrola(Klub k) throws EdunovaException{
        kontrolaObaveznoVrijednost(k);
        kontrolaNeViseOd50Znakova(k); 
        kontrolaBrojeviNeMoguBitiUNazivu(k);
        
    }
    
    
    private void kontrolaObaveznoVrijednost(Klub k) throws EdunovaException {
        if(k.getNaziv()==null || k.getNaziv().isEmpty()){
            throw new EdunovaException("Naziv obavezno");
        }
    }

    private void kontrolaBrojeviNeMoguBitiUNazivu(Klub k) throws EdunovaException{
         try {
            Integer.parseInt(k.getNaziv());
            throw new EdunovaException("Klub ne smije imati samo brojeve u nazivu");
        } catch (Exception e) {
            
        }
    }

    private void kontrolaNeViseOd50Znakova(Klub k) throws EdunovaException{
        if(k.getNaziv().length()>50){
            throw new EdunovaException("Naziv ne smije imati više od 50 znakova");
        }
    }
    
}
