/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.pomocno;

/**
 *
 * @author Borna
 */
public class Kontrola {
    
    public static void stringNijePrazan(String s,String poruka) throws EdunovaException{
        if(s==null || s.isEmpty()){
            throw new EdunovaException("Naziv obavezno");
        }
    }
    
}
