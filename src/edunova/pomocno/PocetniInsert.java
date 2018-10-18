/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.pomocno;

import edunova.model.Dogadaj;
import edunova.model.Igrac;
import edunova.model.Klub;
import edunova.model.Operater;
import edunova.model.Tip;
import edunova.model.Utakmica;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.hibernate.Session;

/**
 *
 * @author Borna
 */
public class PocetniInsert {
    
   
    
    
    public static void izvedi(){
        
        
        
        
        Session session = HibernateUtil.getSession();
        
        session.beginTransaction();
        
        kreirajOperatera(session);
        
        Klub k1 = null;
        Klub k2= null;
        kreirajKlub(session,k1,k2);
        Igrac i = kreirajIgraca(session, k1);
        Igrac y = kreirajDrugogIgraca(session, k2);
        Utakmica u = kreirajUtakmicu(session, k1, k2);
        Tip t = kreirajTip(session);
        Dogadaj d = kreirajDogadaj(session, u, i, t);
        
        session.getTransaction().commit();
    }
    
    private static void kreirajOperatera(Session session) {
        Operater o = new Operater();
        o.setIme("Matija");
        o.setPrezime("Rakitic");
        o.setEmail("matija_dm7@hotmail.com");
        o.setLozinka(Autorizacija.getHash("m"));

        session.save(o);
    }
    
    private static void kreirajKlub(Session session,Klub klub1, Klub klub2){
        Klub k1 = new Klub();
        k1.setNaziv("GNK Dinamo");
        k1.setImeGrada("Zagreb");
        k1.setImeStadiona("Maksimir");
        
        session.save(k1);
        
        
        
        
        Klub k2 = new Klub();
        k2.setNaziv("NK Hajduk");
        k2.setImeGrada("Split");
        k2.setImeStadiona("Poljud");
        
        session.save(k2);
        klub1 = k1;
        klub2=k2;
   
        
        
        
    }
    private static Igrac kreirajIgraca(Session session, Klub k1){
        Igrac i = new Igrac();
        i.setIme("Arijan");
        i.setPrezime("Ademi");
        i.setPozicija("Vezni");
        i.setVisina("183");
        i.setKilogrami("74");
        i.setKlub(k1);
        i.setBirthDate(1991,Calendar.MAY,29);
        
        session.save(i);
        return i;
    }
        private static Igrac kreirajDrugogIgraca(Session session, Klub k2){
        Igrac y = new Igrac();
        y.setIme("Mijo");
        y.setPrezime("Caktaš");
        y.setPozicija("Vezni");
        y.setVisina("178");
        y.setKilogrami("49");
        y.setKlub(k2);
        y.setBirthDate(1992,Calendar.MAY,8);
        
        session.save(y);
        return y;
        
        
    }
    private static Utakmica kreirajUtakmicu(Session session, Klub k1, Klub k2){
        Utakmica u = new Utakmica();
        u.setDomacin(k1);
        u.setGost(k2);
        u.setMjesto("Zagreb");
        u.setUlaznica(new BigDecimal(40.00));
        
        session.save(u);
        return u;
        
    }
    
    private static Tip kreirajTip(Session session){
        Tip t = new Tip();
        t.setVrsta("Zuti karton");
        
        
        session.save(t);
        return t;
    }
    
    
    
    
    private static Dogadaj kreirajDogadaj(Session session, Utakmica u, Igrac i, Tip t){
        Dogadaj d = new Dogadaj();
        d.setUtakmica(u);
        d.setIgrac(i);
        d.setOpis("Zestoki prekrsaj");
        d.setTip(t);
        
        session.save(d);
        return d;
    }
    
}
