/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import edunova.controller.ObradaKlub;
import edunova.controller.ObradaUtakmica;
import edunova.model.Klub;
import edunova.model.Utakmica;
import edunova.pomocno.EdunovaException;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Borna
 */
public class UtakmicePanel extends javax.swing.JPanel {

    private Utakmica entitet;
    private ObradaUtakmica obradaUtakmica;
    private ObradaKlub obradaKlub;

    /**
     * Creates new form UtakmicePanel
     */
    public UtakmicePanel() {
        initComponents();
        setName("Utakmice");
        dpDatumUtakmice.setDate(new Date());
        dpDatumUtakmice.getMonthView().setZoomable(true);
        dpDatumUtakmice.setFormats(DateFormat.getDateInstance(DateFormat.MEDIUM));
        obradaUtakmica = new ObradaUtakmica();
        obradaKlub = new ObradaKlub();
        ucitajDomacin();
        ucitajGost();
        ucitajUtakmice();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUtakmice = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dpDatumUtakmice = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstUtakmice = new javax.swing.JList<>();
        pnlDodavanje = new javax.swing.JPanel();
        btnDodajNovi = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        cmbDomacin = new javax.swing.JComboBox<>();
        cmbGost = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("Odaberite datum utakmice:");

        dpDatumUtakmice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpDatumUtakmiceActionPerformed(evt);
            }
        });

        lstUtakmice.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstUtakmice.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstUtakmiceValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstUtakmice);

        javax.swing.GroupLayout pnlUtakmiceLayout = new javax.swing.GroupLayout(pnlUtakmice);
        pnlUtakmice.setLayout(pnlUtakmiceLayout);
        pnlUtakmiceLayout.setHorizontalGroup(
            pnlUtakmiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUtakmiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUtakmiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpDatumUtakmice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlUtakmiceLayout.setVerticalGroup(
            pnlUtakmiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUtakmiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dpDatumUtakmice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        btnDodajNovi.setText("Dodaj novu");
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

        jLabel2.setText("Domacin:");

        jLabel3.setText("Gost:");

        javax.swing.GroupLayout pnlDodavanjeLayout = new javax.swing.GroupLayout(pnlDodavanje);
        pnlDodavanje.setLayout(pnlDodavanjeLayout);
        pnlDodavanjeLayout.setHorizontalGroup(
            pnlDodavanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDodavanjeLayout.createSequentialGroup()
                .addGroup(pnlDodavanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDodavanjeLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnlDodavanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(cmbGost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDomacin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDodavanjeLayout.createSequentialGroup()
                        .addComponent(btnDodajNovi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPromjena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnObrisi)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlDodavanjeLayout.setVerticalGroup(
            pnlDodavanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDodavanjeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(cmbDomacin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbGost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDodavanjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodajNovi)
                    .addComponent(btnPromjena)
                    .addComponent(btnObrisi))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlUtakmice, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDodavanje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUtakmice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlDodavanje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajNoviActionPerformed

        entitet = new Utakmica();

        if (!popuniSvojstva()) {
            return;
        }
        try {
            obradaUtakmica.dodaj(entitet);
            ucitajUtakmice();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajNoviActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        entitet = lstUtakmice.getSelectedValue();
        if (entitet == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi utakmicu");
            return;
        }

        if (!popuniSvojstva()) {
            return;
        }

        try {
            obradaUtakmica.promjena(entitet);
            ucitajUtakmice();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed

        entitet = lstUtakmice.getSelectedValue();
        if (entitet == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi utakmicu");
            return;
        }

        obradaUtakmica.obrisi(entitet);

        ucitajUtakmice();
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void lstUtakmiceValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstUtakmiceValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        entitet = lstUtakmice.getSelectedValue();
        if (entitet == null) {
            return;
        }
        ocistiPolja();
        cmbDomacin.setSelectedItem(entitet.getDomacin());
        cmbGost.setSelectedItem(entitet.getGost());


    }//GEN-LAST:event_lstUtakmiceValueChanged

    private void dpDatumUtakmiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpDatumUtakmiceActionPerformed
        
        
        ucitajUtakmice();
        
        
    }//GEN-LAST:event_dpDatumUtakmiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajNovi;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JComboBox<Klub> cmbDomacin;
    private javax.swing.JComboBox<Klub> cmbGost;
    private org.jdesktop.swingx.JXDatePicker dpDatumUtakmice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Utakmica> lstUtakmice;
    private javax.swing.JPanel pnlDodavanje;
    private javax.swing.JPanel pnlUtakmice;
    // End of variables declaration//GEN-END:variables
private boolean popuniSvojstva() {
        entitet.setDomacin((Klub) cmbDomacin.getSelectedItem());
        entitet.setGost((Klub) cmbGost.getSelectedItem());
        entitet.setDatumOdigravanja(dpDatumUtakmice.getDate());

        return true;
    }

    private void ocistiPolja() {

        for (Component c : pnlDodavanje.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }
    }

    private void ucitajDomacin() {
        DefaultComboBoxModel<Klub> model = new DefaultComboBoxModel<>();
        obradaKlub.getEntiteti().forEach((s) -> {
            model.addElement(s);
        });
        cmbDomacin.setModel(model);
    }

    private void ucitajGost() {
        DefaultComboBoxModel<Klub> model = new DefaultComboBoxModel<>();
        obradaKlub.getEntiteti().forEach((s) -> {
            model.addElement(s);
        });
        cmbGost.setModel(model);
    }

    private void ucitajUtakmice() {

        DefaultListModel<Utakmica> m = new DefaultListModel<>();
        SimpleDateFormat sd = new SimpleDateFormat("YYYY-MM-dd");
        
        
        obradaUtakmica.getEntiteti(sd.format(dpDatumUtakmice.getDate())).forEach((s) -> {
            m.addElement(s);
        });
        lstUtakmice.setModel(m);
    }
}
