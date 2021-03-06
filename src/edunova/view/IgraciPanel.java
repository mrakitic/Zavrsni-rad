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
import edunova.pomocno.HibernateUtil;
import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Borna
 */
public class IgraciPanel extends javax.swing.JPanel {

    private Igrac entitet;
    private ObradaIgrac obrada;
    private ObradaKlub obradaKlub;

    /**
     * Creates new form IgraciPanel
     */
    public IgraciPanel() {
        initComponents();
        obradaKlub = new ObradaKlub();
        dpDatumRodenja.getMonthView().setZoomable(true);
        dpDatumRodenja.setFormats(DateFormat.getDateInstance(DateFormat.MEDIUM));
        setName("Igraci");
        obrada = new ObradaIgrac();
        ucitajKlubove();
        ucitaj();
    }

    private void ucitaj() {
        DefaultListModel<Igrac> m = new DefaultListModel<>();
        List<Igrac> lista = obrada.getEntiteti(txtUvjet.getText());

        //sortirati po prezimenu
        Collections.sort(lista, new Comparator<Igrac>() {
            public int compare(Igrac o1, Igrac o2) {
                return o1.getPrezime().compareTo(o2.getPrezime());
            }
        });

        lista.forEach((s) -> {
            m.addElement(s);
        });
        lstEntiteti.setModel(m);
        ocistiPolja();
        if (m.getSize() > 0) {
            lstEntiteti.setSelectedIndex(0);
        }

    }

    public void showDate() {
        //Date d = new Date();
        //SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        //txtDatumRodenja.setText(sdf.format(d));

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
        txtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVisina = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtKilogrami = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPozicija = new javax.swing.JTextField();
        btnDodajNovi = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        dpDatumRodenja = new org.jdesktop.swingx.JXDatePicker();
        prbBrisanje = new javax.swing.JProgressBar();
        cmbKlub = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstKlub = new javax.swing.JList<>();

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel4.setText("Visina");

        jLabel5.setText("Kilogrami");

        jLabel6.setText("Datum rođenja");

        jLabel7.setText("Pozicija");

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

        jLabel8.setText("Klub");

        javax.swing.GroupLayout pnlPodaciLayout = new javax.swing.GroupLayout(pnlPodaci);
        pnlPodaci.setLayout(pnlPodaciLayout);
        pnlPodaciLayout.setHorizontalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(txtPrezime, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addComponent(txtVisina)
                                .addComponent(txtKilogrami)
                                .addComponent(txtPozicija)
                                .addComponent(txtIme))
                            .addComponent(dpDatumRodenja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prbBrisanje, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlPodaciLayout.createSequentialGroup()
                                .addComponent(btnDodajNovi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPromjena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnObrisi))
                            .addComponent(cmbKlub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(0, 31, Short.MAX_VALUE))))
        );
        pnlPodaciLayout.setVerticalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVisina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKilogrami, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dpDatumRodenja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPozicija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbKlub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodajNovi)
                    .addComponent(btnPromjena)
                    .addComponent(btnObrisi))
                .addGap(18, 18, 18)
                .addComponent(prbBrisanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jLabel9.setText("Klub");

        jScrollPane2.setViewportView(lstKlub);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnTrazi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPodaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrazi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        if (evt.getKeyCode() == 10) {
            ucitaj();
        }
    }//GEN-LAST:event_txtUvjetKeyPressed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitaj();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void btnDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajNoviActionPerformed

        entitet = new Igrac();

        if (!popuniSvojstva()) {
            return;
        }

        ocistiBoje();

        try {

            Igrac novi = obrada.dodaj(entitet);

            ucitaj();

            for (int i = 0; i < lstEntiteti.getModel().getSize(); i++) {
                if (lstEntiteti.getModel().getElementAt(i).getSifra()
                        == novi.getSifra()) {
                    lstEntiteti.setSelectedIndex(i);
                    lstEntiteti.ensureIndexIsVisible(lstEntiteti.getSelectedIndex());
                    break;
                }
            }

        } catch (EdunovaException ex) {
            switch (ex.getPoruka()) {
                case "Ime obavezno":
                    txtIme.setBackground(Color.RED);
                    break;
            }
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajNoviActionPerformed

    private boolean popuniSvojstva() {

        entitet.setIme(txtIme.getText());
        entitet.setPrezime(txtPrezime.getText());
        entitet.setPozicija(txtPozicija.getText());
        entitet.setVisina(txtVisina.getText());
        entitet.setKilogrami(txtKilogrami.getText());
        entitet.setDatumRodenja(dpDatumRodenja.getDate());
        entitet.setKlub(cmbKlub.getItemAt(cmbKlub.getSelectedIndex()));
        return true;
    }


    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed

        entitet = lstEntiteti.getSelectedValue();
        if (entitet == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi klub");
            return;
        }

        ocistiBoje();

        if (!popuniSvojstva()) {
            return;
        }

        try {
            obrada.promjena(entitet);
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        /*
        entitet = lstEntiteti.getSelectedValue();
        if (entitet == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi smjer");
            return;
        }

        obrada.obrisi(entitet);
         */

        if (lstEntiteti.getSelectedValuesList().size() == 0) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite jednog ili više igraca za brisanje");
            return;
        }

        if (lstEntiteti.getSelectedValuesList().size() == 1) {
            try {
                obrada.obrisi(lstEntiteti.getSelectedValuesList().get(0));
            } catch (Exception ex) {
                HibernateUtil.getSession().clear();
                JOptionPane.showMessageDialog(getRootPane(), "Igraca "
                        + lstEntiteti.getSelectedValuesList().get(0)
                        + " ne mogu obrisati jer je clan nekog kluba");
            }
            ucitaj();
        } else {
            new BrisanjePolaznika().start();
        }

    }//GEN-LAST:event_btnObrisiActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged

        if (evt.getValueIsAdjusting()) {
            return;
        }

        entitet = lstEntiteti.getSelectedValue();
        if (entitet == null) {
            return;
        }

        txtIme.setText(entitet.getIme());
        txtPrezime.setText(entitet.getPrezime());
        txtPozicija.setText(entitet.getPozicija());
        txtVisina.setText(entitet.getVisina());
        txtKilogrami.setText(entitet.getKilogrami());
        dpDatumRodenja.setDate(entitet.getDatumRodenja());
        cmbKlub.setSelectedItem(entitet.getKlub());


    }//GEN-LAST:event_lstEntitetiValueChanged

    private class BrisanjePolaznika extends Thread {

        public void run() {
            prbBrisanje.setMinimum(0);
            prbBrisanje.setMaximum(lstEntiteti.getSelectedValuesList().size());
            int i = 0;

            for (Igrac e : lstEntiteti.getSelectedValuesList()) {
                prbBrisanje.setValue(++i);
                try {
                    obrada.obrisi(e);
                } catch (Exception ex) {
                    HibernateUtil.getSession().clear();
                    // JOptionPane.showMessageDialog(getRootPane(), "Polaznika " + e + 
                    //         " ne mogu obrisati jer je prijavljen na neku od grupa");
                }
            }
            ucitaj();
        }
    }

    private void ocistiBoje() {
        for (Component c : pnlPodaci.getComponents()) {
            if (c instanceof JTextField) {
                c.setBackground(Color.WHITE);
            }
        }
    }

    private void ocistiPolja() {
        for (Component c : pnlPodaci.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajNovi;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Klub> cmbKlub;
    private org.jdesktop.swingx.JXDatePicker dpDatumRodenja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Igrac> lstEntiteti;
    private javax.swing.JList<Klub> lstKlub;
    private javax.swing.JPanel pnlPodaci;
    private javax.swing.JProgressBar prbBrisanje;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtKilogrami;
    private javax.swing.JTextField txtPozicija;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtUvjet;
    private javax.swing.JTextField txtVisina;
    // End of variables declaration//GEN-END:variables
    private void ucitajKlubove() {
        DefaultComboBoxModel<Klub> model = new DefaultComboBoxModel<>();
        obradaKlub.getEntiteti().forEach((s) -> {
            model.addElement(s);
        });
        cmbKlub.setModel(model);
    }

}
