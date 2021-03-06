/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import edunova.model.Operater;
import edunova.pomocno.PocetniInsert;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Borna
 */
public class Prozor extends javax.swing.JFrame {
    private JPanel pnlPocetna;
    private JPanel pnlKlubovi;
    private JPanel pnlIgraci;
    private JPanel pnlDogadaji;
    private JPanel pnlUtakmice;
    private JPanel pnlGitHub;
    private JPanel pnlTip;
    private JPanel pnlEra;
    private JPanel pnlRezultati;

    private Operater operater;
    
    
    
    /**
     * Creates new form Prozor
     */
    public Prozor(Operater operater) {
        initComponents();
        this.operater = operater;
        setTitle("Prva HNL " + operater.getIme() + " " + operater.getPrezime());
        pnlPocetna = new IzbornikPanel();
        
        
        vrijeme();
        

        postaviPanel(pnlPocetna);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlIzbornik = new javax.swing.JPanel();
        btnKlubovi = new javax.swing.JButton();
        btnIgraci = new javax.swing.JButton();
        btnUtakmice = new javax.swing.JButton();
        btnDogadaji = new javax.swing.JButton();
        btnTip = new javax.swing.JButton();
        btnGitHub = new javax.swing.JButton();
        btnEra = new javax.swing.JButton();
        timeLab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRezultati = new javax.swing.JButton();
        pnlSadrzaj = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKlubovi.setText("Klubovi");
        btnKlubovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKluboviActionPerformed(evt);
            }
        });

        btnIgraci.setText("Igraci");
        btnIgraci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgraciActionPerformed(evt);
            }
        });

        btnUtakmice.setText("Utakmice");
        btnUtakmice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtakmiceActionPerformed(evt);
            }
        });

        btnDogadaji.setText("Dogadaji");
        btnDogadaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDogadajiActionPerformed(evt);
            }
        });

        btnTip.setText("Tip");
        btnTip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipActionPerformed(evt);
            }
        });

        btnGitHub.setText("GitHub");
        btnGitHub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGitHubActionPerformed(evt);
            }
        });

        btnEra.setText("ERA");
        btnEra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEraActionPerformed(evt);
            }
        });

        timeLab.setText("Time");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edunova/slike/250px-Prvaliga_2018.png"))); // NOI18N

        btnRezultati.setText("Rezultati");
        btnRezultati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRezultatiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIzbornikLayout = new javax.swing.GroupLayout(pnlIzbornik);
        pnlIzbornik.setLayout(pnlIzbornikLayout);
        pnlIzbornikLayout.setHorizontalGroup(
            pnlIzbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzbornikLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlIzbornikLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIzbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRezultati, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlIzbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnGitHub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDogadaji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUtakmice, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                        .addComponent(btnIgraci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKlubovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnEra, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(timeLab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlIzbornikLayout.setVerticalGroup(
            pnlIzbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzbornikLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(btnKlubovi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIgraci, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUtakmice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDogadaji, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTip, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRezultati, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlSadrzajLayout = new javax.swing.GroupLayout(pnlSadrzaj);
        pnlSadrzaj.setLayout(pnlSadrzajLayout);
        pnlSadrzajLayout.setHorizontalGroup(
            pnlSadrzajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        pnlSadrzajLayout.setVerticalGroup(
            pnlSadrzajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlIzbornik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSadrzaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlIzbornik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSadrzaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKluboviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKluboviActionPerformed
        pnlKlubovi = new KluboviPanel();
        postaviPanel(pnlKlubovi);
    }//GEN-LAST:event_btnKluboviActionPerformed

    private void btnIgraciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgraciActionPerformed
       
        pnlIgraci = new IgraciPanel();
        postaviPanel(pnlIgraci);
    }//GEN-LAST:event_btnIgraciActionPerformed

    private void btnUtakmiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUtakmiceActionPerformed
       pnlUtakmice = new UtakmicePanel();
               
        postaviPanel(pnlUtakmice);
    }//GEN-LAST:event_btnUtakmiceActionPerformed

    private void btnDogadajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDogadajiActionPerformed
        pnlDogadaji = new DogadajiPanel();
        postaviPanel(pnlDogadaji);
    }//GEN-LAST:event_btnDogadajiActionPerformed

    private void btnTipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipActionPerformed
      pnlTip = new TipPanel();
        postaviPanel(pnlTip);
    }//GEN-LAST:event_btnTipActionPerformed

    private void btnGitHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGitHubActionPerformed
       Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://github.com/mrakitic/Zavrsni-rad"));
        } catch (IOException err) {
        }
        catch(URISyntaxException err)
        {
      
        }
    }//GEN-LAST:event_btnGitHubActionPerformed

    private void btnEraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEraActionPerformed
        EraPanel e = new EraPanel();
        e.setVisible(true);
    }//GEN-LAST:event_btnEraActionPerformed

    private void btnRezultatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRezultatiActionPerformed
    pnlRezultati = new RezultatPanel();
    postaviPanel(pnlRezultati);
        
    }//GEN-LAST:event_btnRezultatiActionPerformed

    /**
     * @param args the command line arguments
     */
    private void postaviPanel(JPanel panel) {
        pnlSadrzaj.removeAll();
        pnlSadrzaj.add(panel);
        panel.setSize(pnlSadrzaj.getSize());
        pnlSadrzaj.revalidate();
        pnlSadrzaj.repaint();

        resetPozadinaButton();

        switch (panel.getName()) {
            
            case "Klubovi":
                btnKlubovi.setBackground(Color.GREEN);
                break;
            case "Igraci":
                btnIgraci.setBackground(Color.GREEN);
                break;
            case "Dogadaji":
                btnDogadaji.setBackground(Color.GREEN);
                break;
            case "Utakmice":
                btnUtakmice.setBackground(Color.GREEN);
                break;
            case "Operateri":
                btnGitHub.setBackground(Color.GREEN);
                break;  
            case "Tip":
                btnTip.setBackground(Color.GREEN);
                break;
            case "Era":
                btnEra.setBackground(Color.GREEN);
                break;
            case "Rezultati":
                btnRezultati.setBackground(Color.GREEN);
                break;
             
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDogadaji;
    private javax.swing.JButton btnEra;
    private javax.swing.JButton btnGitHub;
    private javax.swing.JButton btnIgraci;
    private javax.swing.JButton btnKlubovi;
    private javax.swing.JButton btnRezultati;
    private javax.swing.JButton btnTip;
    private javax.swing.JButton btnUtakmice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlIzbornik;
    private javax.swing.JPanel pnlSadrzaj;
    private javax.swing.JLabel timeLab;
    // End of variables declaration//GEN-END:variables

private void resetPozadinaButton() {
        for (Component c : pnlIzbornik.getComponents()) {
            c.setBackground(Color.gray);
        }
    }



private void vrijeme() {
    new Timer(0, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
            timeLab.setText(s.format(d));
        }
    }).start();
}


}
