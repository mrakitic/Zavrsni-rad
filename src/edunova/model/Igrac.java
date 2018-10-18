/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Borna
 */
@Entity
public class Igrac extends Entitet implements Serializable{
    
    private String ime;
    private String prezime;
    private String pozicija;
    private String visina;
    private String kilogrami;
    
    
    private Date datumRodenja;
    
    @ManyToOne
    private Klub klub;

    public Klub getKlub() {
        return klub;
    }

    public void setKlub(Klub klub) {
        this.klub = klub;
    }

   

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public String getVisina() {
        return visina;
    }

    public void setVisina(String visina) {
        this.visina = visina;
    }

    public String getKilogrami() {
        return kilogrami;
    }

    public void setKilogrami(String kilogrami) {
        this.kilogrami = kilogrami;
    }

    public Date getDatumRodenja() {
        return datumRodenja;
    }

    public void setDatumRodenja(Date datumRodenja) {
        this.datumRodenja = datumRodenja;
    }

    

   

    

    
    public int getAge() {

      

      Calendar today    = Calendar.getInstance(); 
      Calendar birthday = new GregorianCalendar();
      birthday.setTime( datumRodenja );

     

      int yearDiff = today.get( Calendar.YEAR ) - birthday.get( Calendar.YEAR );

      

      if ( today.get(Calendar.MONTH) < birthday.get(Calendar.MONTH) )
	  yearDiff = yearDiff - 1;
      else if (today.get(Calendar.MONTH) == birthday.get(Calendar.MONTH)  ) {
	  yearDiff = yearDiff - 1;
      }

      return yearDiff;
   }

   public void setBirthDate(Date aBirthDate) {
      this.datumRodenja = aBirthDate;
   }

   public void setBirthDate(int iYear, int iMonth, int iDay ) {
      Calendar cal = Calendar.getInstance();
      cal.set( iYear, iMonth, iDay );
      this.datumRodenja = cal.getTime();
   }

   public Date getBirthDate() {
      return datumRodenja;
   }

    @Override
    public String toString() {
        return getIme() + " " + getPrezime();
    }
   
   

   
   

  
    
    
    
    
}
