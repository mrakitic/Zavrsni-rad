/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.view;

import edunova.controller.ObradaTip;
import edunova.model.Tip;
import javax.swing.JOptionPane;
import sun.java2d.d3d.D3DRenderQueue;

/**
 *
 * @author Borna
 */
public class TipPanel extends javax.swing.JPanel {

    private Tip entitet;
    private ObradaTip obrada;
    
    
    public TipPanel() {
        initComponents();
         setName("Tip");
         obrada = new ObradaTip();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtVD = new javax.swing.JTextField();
        btnSpremi = new javax.swing.JButton();

        jLabel1.setText("Vrsta događaja:");

        txtVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVDActionPerformed(evt);
            }
        });

        btnSpremi.setText("Spremi");
        btnSpremi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpremiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtVD, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btnSpremi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnSpremi)
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVDActionPerformed

    private void btnSpremiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpremiActionPerformed
       entitet = new Tip();
       if(txtVD.getText().isEmpty()){
           JOptionPane.showMessageDialog(getRootPane(), "Prvo upisi vrstu događaja");
           return;
       }else{
           entitet.setVrsta(txtVD.getText());
       }
        try {
            System.out.println(entitet.getVrsta());
            obrada.dodaj(entitet);
            JOptionPane.showMessageDialog(getRootPane(), "Događdaj je dodan.");
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnSpremiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSpremi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtVD;
    // End of variables declaration//GEN-END:variables
}
