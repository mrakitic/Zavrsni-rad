/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import edunova.controller.ObradaIgrac;
import edunova.controller.ObradaKlub;
import edunova.model.Igrac;
import edunova.model.Klub;
import edunova.pomocno.EdunovaException;
import java.awt.Component;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Borna
 */
public class KluboviPanel extends javax.swing.JPanel {
    
    private ObradaKlub obradaKlub; 
    private ObradaIgrac obradaIgrac;
    final private DecimalFormat df;
    private Klub klub;

    /**
     * Creates new form GrupePanel
     */
    public KluboviPanel() {
        initComponents();
        setName("Klubovi");
        obradaKlub = new ObradaKlub();
        obradaIgrac = new ObradaIgrac();
        lstKlubovi.setCellRenderer(new KlubRenderer());
        ucitajKlubove();
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("hr", "HR"));
        df = (DecimalFormat) nf;
        df.applyPattern("###,##0.00");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPodaci = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        btnDodajNovi = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtImeStadiona = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGrad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstIgraci = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstKlubovi = new javax.swing.JList<>();

        jLabel1.setText("Naziv");

        btnDodajNovi.setText("Dodaj novi");
        btnDodajNovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajNoviActionPerformed(evt);
            }
        });

        btnPromjena.setText("Promjena");
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        jLabel2.setText("Ime stadiona");

        jLabel4.setText("Grad");

        jScrollPane2.setViewportView(lstIgraci);

        javax.swing.GroupLayout pnlPodaciLayout = new javax.swing.GroupLayout(pnlPodaci);
        pnlPodaci.setLayout(pnlPodaciLayout);
        pnlPodaciLayout.setHorizontalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNaziv)
                    .addComponent(txtImeStadiona)
                    .addComponent(jLabel1)
                    .addComponent(txtGrad)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addComponent(btnDodajNovi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPromjena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnObrisi))
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        pnlPodaciLayout.setVerticalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtImeStadiona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodajNovi)
                    .addComponent(btnPromjena)
                    .addComponent(btnObrisi))
                .addGap(24, 24, 24))
        );

        jLabel3.setText("Uvjet");

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUvjetKeyPressed(evt);
            }
        });

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        lstKlubovi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstKlubovi.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstKluboviValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstKlubovi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrazi))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(pnlPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrazi))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
            .addComponent(pnlPodaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        if (evt.getKeyCode() == 10) {
            ucitajKlubove();
        }
    }//GEN-LAST:event_txtUvjetKeyPressed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitajKlubove();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void lstKluboviValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstKluboviValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        klub = lstKlubovi.getSelectedValue();
        if (klub == null) {
            return;
        }
        ocistiPolja();
        txtNaziv.setText(klub.getNaziv());
        txtImeStadiona.setText((klub.getImeStadiona()));
        txtGrad.setText(klub.getImeGrada());
        ucitajIgrace(klub);
        
    }//GEN-LAST:event_lstKluboviValueChanged

    private void btnDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajNoviActionPerformed

        klub = new Klub();

        if (!popuniSvojstva()) {
            return;
        }
        try {
            obradaKlub.dodaj(klub);
            ucitajKlubove();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajNoviActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        klub = lstKlubovi.getSelectedValue();
        if (klub == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi klub");
            return;
        }

        if (!popuniSvojstva()) {
            return;
        }

        try {
            obradaKlub.promjena(klub);
            ucitajKlubove();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }

    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed

        klub = lstKlubovi.getSelectedValue();
        if (klub == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi klub");
            return;
        }
        try {
            obradaKlub.obrisi(klub);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(getRootPane(), "Nemože se obrisati klub, ima igrača u njemu.");
        }
        
        ucitajKlubove();

    }//GEN-LAST:event_btnObrisiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajNovi;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Igrac> lstIgraci;
    private javax.swing.JList<Klub> lstKlubovi;
    private javax.swing.JPanel pnlPodaci;
    private javax.swing.JTextField txtGrad;
    private javax.swing.JTextField txtImeStadiona;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    private void ucitajKlubove(){
        DefaultListModel<Klub> m = new DefaultListModel<>();
        obradaKlub.getEntiteti(txtUvjet.getText()).forEach((s) -> {
            m.addElement(s);
        });
        lstKlubovi.setModel(m);
    }
    
    
    private void ucitajIgrace(Klub k){
        DefaultListModel<Igrac> m = new DefaultListModel<>();
        obradaIgrac.getEntiteti().forEach((s) -> {
         if(s.getKlub().getSifra()==k.getSifra()){
             m.addElement(s);
             
         }
        });
        lstIgraci.setModel(m);
    }
    
    private class KlubRenderer extends JLabel implements ListCellRenderer<Klub> {

        public KlubRenderer(){
            setOpaque(true);
        }
        
        @Override
        public Component getListCellRendererComponent(
                JList<? extends Klub> list, Klub s, int index,
                boolean isSelected, boolean cellHasFocus) {

            setText(s.getNaziv());

            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }

            return this;
        }

    }
    
    private void ocistiPolja() {

        for (Component c : pnlPodaci.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }
    }

    private boolean popuniSvojstva() {
        klub.setNaziv(txtNaziv.getText());
        klub.setImeGrada(txtGrad.getText());
        klub.setImeStadiona(txtImeStadiona.getText());
        
        return true;
    }
}




