/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tprestaurant.misc.Callback;
import tprestaurant.model.ExcepcionLogica;
import tprestaurant.model.Restaurant;
import tprestaurant.model.productos.Bebida;
import tprestaurant.model.productos.Producto;

/**
 *
 * @author gastonmira
 */
public class AltaBebida extends javax.swing.JFrame {
Restaurant restaurant;
Callback<Restaurant> callback;
    /**
     * Creates new form AltaBebida
     * @param restaurant
     * @param callback
     */
    public AltaBebida(Restaurant restaurant,Callback<Restaurant> callback) {
        initComponents();
        this.callback=callback;
       this.restaurant=restaurant;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcionBebida = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        precioBebida = new javax.swing.JTextField();
        btnGuardarBebida = new javax.swing.JButton();
        btnEliminarBebida = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Alta Bebida");

        jLabel2.setText("Descripción");

        jLabel3.setText("Precio de venta");

        precioBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioBebidaActionPerformed(evt);
            }
        });
        precioBebida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precioBebidaKeyReleased(evt);
            }
        });

        btnGuardarBebida.setText("Guardar");
        btnGuardarBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarBebidaActionPerformed(evt);
            }
        });

        btnEliminarBebida.setText("Eliminar");

        btnCancelar.setText("Cancelar");

        jLabel4.setText("Precio decimal con \",\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(txtDescripcionBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btnGuardarBebida))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminarBebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(precioBebida))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescripcionBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(precioBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarBebida)
                    .addComponent(btnEliminarBebida)
                    .addComponent(btnCancelar))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void precioBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioBebidaActionPerformed
       
       
    }//GEN-LAST:event_precioBebidaActionPerformed

    private void precioBebidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioBebidaKeyReleased
        // TODO add your handling code here:
    
         if (!Validator.esFloat(precioBebida.getText())){
            precioBebida.setText("");
            JOptionPane.showMessageDialog(null,"Precio de Bebida Inválido");
          }
        
        /*  try{
           Float.parseFloat(precioBebida.getText());
       }catch(NumberFormatException e){
          precioBebida.setText("");
          JOptionPane.showMessageDialog(null,"Precio de Bebida Inválido");
       }*/
    }//GEN-LAST:event_precioBebidaKeyReleased

    private void btnGuardarBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarBebidaActionPerformed
        Producto nuevaBebida = new Bebida(Float.parseFloat(precioBebida.getText()), txtDescripcionBebida.getText());
    try {
        restaurant.agregarProducto(nuevaBebida);
        JOptionPane.showMessageDialog(rootPane, "Nueva Bebida agregada con exito.: ");
        callback.onSuccess(restaurant);
        
    } catch (ExcepcionLogica ex) {
        Logger.getLogger(AltaBebida.class.getName()).log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(rootPane, "Error al crear nueva bebida.");
             
    }
        
        
    }//GEN-LAST:event_btnGuardarBebidaActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarBebida;
    private javax.swing.JButton btnGuardarBebida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField precioBebida;
    private javax.swing.JTextField txtDescripcionBebida;
    // End of variables declaration//GEN-END:variables
}
