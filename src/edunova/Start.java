package edunova;

// domaća zadaća:

import edunova.pomocno.PocetniInsert;
import edunova.view.Loading;
import javax.swing.UIManager;
import org.jdesktop.swingx.plaf.basic.CalendarHeaderHandler;
import org.jdesktop.swingx.plaf.basic.SpinningCalendarHeaderHandler;

//upogoniti Hibernate prateći https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-maven-example/
public class Start {

    public static void main(String[] args) {
        UIManager.put(
                CalendarHeaderHandler.uiControllerID,
                "org.jdesktop.swingx.plaf.basic.SpinningCalendarHeaderHandler");
        UIManager.put(
                SpinningCalendarHeaderHandler.ARROWS_SURROUND_MONTH,
                Boolean.TRUE);
       // PocetniInsert.izvedi();
      new Loading().setVisible(true);
        
        
    }
    
}
