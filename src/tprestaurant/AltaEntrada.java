package tprestaurant;

import tprestaurant.misc.Validator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tprestaurant.misc.Callback;
import tprestaurant.model.ExcepcionLogica;
import tprestaurant.model.Restaurant;
import tprestaurant.model.productos.Bebida;
import tprestaurant.model.productos.Entrada;

public class AltaEntrada extends javax.swing.JFrame {

    Callback callback;
    Restaurant restaurant;
    Entrada entrada;

    /**
     * Creates new form AltaEntrada
     */
    public AltaEntrada(Entrada entrada, Restaurant restaurant, Callback callback) {
        this.callback = callback;
        this.restaurant = restaurant;
        this.entrada = entrada;
        initComponents();
        AltaOMod(this.entrada);
    }

    private void AltaOMod(Entrada entrada) {

        if (entrada != null) {
            txtNombreEnt.setText(entrada.getDescripcion());
            costoEnt.setText(String.valueOf(entrada.costo()));
            porcentajeEnt.setText(String.valueOf(entrada.getPorcentajeGanancia()));
            jLabel5.setText("Modificar Entrada");
            btnEliminar.setVisible(true);
            txtNombreEnt.setEnabled(false);
            checkBoxEnt.setSelected(entrada.isActivo());
        } else {
            txtNombreEnt.setText("");
            costoEnt.setText("");
            porcentajeEnt.setText("");
            jLabel5.setText("Alta Entrada");
            btnEliminar.setVisible(false);
            txtNombreEnt.setEnabled(true);
            checkBoxEnt.setSelected(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombreEnt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        costoEnt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        porcentajeEnt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAddEntradaAProd = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        checkBoxEnt = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel3.setText("Costo");

        costoEnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                costoEntKeyReleased(evt);
            }
        });

        jLabel4.setText("Porcentaje ganancia");

        porcentajeEnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                porcentajeEntKeyReleased(evt);
            }
        });

        jLabel5.setText("Alta Entrada");

        btnAddEntradaAProd.setText("Guardar");
        btnAddEntradaAProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEntradaAProdActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        checkBoxEnt.setText("¿Activo?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkBoxEnt))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddEntradaAProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(costoEnt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtNombreEnt)
                            .addComponent(porcentajeEnt))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxEnt))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(costoEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(porcentajeEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEntradaAProd)
                    .addComponent(btnEliminar)
                    .addComponent(jButton2))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void costoEntKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costoEntKeyReleased
       
        if (!Validator.esFloat(costoEnt.getText())) {
            costoEnt.setText("");
            JOptionPane.showMessageDialog(null, "Costo de Entrada Inválido");
        }
    }//GEN-LAST:event_costoEntKeyReleased

    private void porcentajeEntKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_porcentajeEntKeyReleased
        // TODO add your handling code here:
        if (!Validator.esFloat(porcentajeEnt.getText())) {
            porcentajeEnt.setText("");
            JOptionPane.showMessageDialog(null, "Porcentaje de ganancia de Entrada Inválido");
        }
    }//GEN-LAST:event_porcentajeEntKeyReleased

    private void btnAddEntradaAProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEntradaAProdActionPerformed
        if (!("".equals(txtNombreEnt.getText())) && !("".equals(costoEnt.getText())) && !("".equals(porcentajeEnt.getText()))) {

            Entrada nuevaEntrada = new Entrada(Float.parseFloat(costoEnt.getText()), Float.parseFloat(porcentajeEnt.getText()), txtNombreEnt.getText());
            nuevaEntrada.setActivo(checkBoxEnt.isSelected());
            try {
                if (entrada == null) {

                    restaurant.agregarProducto(nuevaEntrada);
                    JOptionPane.showMessageDialog(rootPane, "Nueva Entrada agregada con exito");
                } else {
                    restaurant.modificarProducto(nuevaEntrada);
                    JOptionPane.showMessageDialog(rootPane, "Entrada Modificada con exito ");
                }
                callback.onSuccess(restaurant);

            } catch (ExcepcionLogica ex) {
                Logger.getLogger(AltaBebida.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Campos faltantes o invalidos");
        }
    }//GEN-LAST:event_btnAddEntradaAProdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            restaurant.eliminarProducto(entrada);
            JOptionPane.showMessageDialog(rootPane, "Entrada Eliminada con exito ");
            callback.onSuccess(restaurant);
        } catch (ExcepcionLogica ex) {
            Logger.getLogger(AltaEntrada.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEntradaAProd;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JCheckBox checkBoxEnt;
    private javax.swing.JTextField costoEnt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField porcentajeEnt;
    private javax.swing.JTextField txtNombreEnt;
    // End of variables declaration//GEN-END:variables
}
