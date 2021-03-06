package tprestaurant;

import tprestaurant.misc.Validator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import tprestaurant.misc.Callback;
import tprestaurant.model.ExcepcionLogica;
import tprestaurant.model.Restaurant;
import tprestaurant.model.enums.Provincias;
import tprestaurant.model.enums.Varietales;
import tprestaurant.model.productos.Vino;

public class AltaVino extends javax.swing.JFrame {

    Callback callback;
    Restaurant restaurant;
    Vino vino;

    /**
     * Creates new form AltaVino
     */
    public AltaVino(Vino vino, Restaurant restaurant, Callback callback) {
        this.callback = callback;
        this.restaurant = restaurant;
        this.vino = vino;
        initComponents();
        cargaVarietales();
        cargaProvincias();

        AltaOMod(vino);
    }

    private void AltaOMod(Vino vino) {
        if (vino != null) {
            txtDescripcionVino.setText(vino.getDescripcion());
            txtDescripcionVino.setEnabled(false);
            precioVino.setText(String.valueOf(vino.getPrecioVenta()));
            ComboVarietales.setSelectedItem(vino.getVarietal().toString());
            ComboProvincia.setSelectedItem(vino.getProvincia().toString());
            jLabel1.setText("Modificar Entrada");
            btnEliminar.setVisible(true);
            checkBoxVino.setSelected(vino.isActivo());

        } else {
            txtDescripcionVino.setText("");
            txtDescripcionVino.setEnabled(true);
            precioVino.setText("");
            jLabel1.setText("Alta Entrada");
            btnEliminar.setVisible(false);
            checkBoxVino.setSelected(true);
        }
    }

    private void cargaProvincias() {
        DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<String>();
        Provincias[] provincias = Provincias.values();
        for (int i = 0; i < provincias.length; i++) {
            {
                cbModel.addElement(provincias[i].toString());
            }
            ComboProvincia.setModel(cbModel);
        }
    }

    private void cargaVarietales() {
        DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<String>();
        Varietales[] varietales = Varietales.values();
        for (int i = 0; i < varietales.length; i++) {
            {
                cbModel.addElement(varietales[i].toString());
            }
            ComboVarietales.setModel(cbModel);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcionVino = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ComboVarietales = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        ComboProvincia = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        precioVino = new javax.swing.JTextField();
        checkBoxVino = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Alta Vino");

        jLabel2.setText("Descripción");

        jLabel3.setText("Varietal");

        jLabel4.setText("Provincia de procedencia");

        jLabel5.setText("Precio de venta");

        precioVino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precioVinoKeyReleased(evt);
            }
        });

        checkBoxVino.setText("¿Activo?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(183, 183, 183)
                            .addComponent(checkBoxVino))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(236, 236, 236)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDescripcionVino, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(precioVino, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(36, 36, 36)
                                .addComponent(ComboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)))
                        .addComponent(ComboVarietales, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(checkBoxVino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescripcionVino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboVarietales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(precioVino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void precioVinoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioVinoKeyReleased
        // TODO add your handling code here:
        if (!Validator.esFloat(precioVino.getText())) {
            precioVino.setText("");
            JOptionPane.showMessageDialog(null, "Precio de Vino Inválido");
        }
    }//GEN-LAST:event_precioVinoKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!("".equals(txtDescripcionVino.getText())) && !("".equals(precioVino.getText()))) {
            Vino nuevoVino = new Vino(Varietales.valueOf(ComboVarietales.getSelectedItem().toString()), Provincias.valueOf(ComboProvincia.getSelectedItem().toString()), Float.parseFloat(precioVino.getText()), txtDescripcionVino.getText());
            nuevoVino.setActivo(checkBoxVino.isSelected());

            try {
                if (vino == null) {

                    restaurant.agregarProducto(nuevoVino);
                    JOptionPane.showMessageDialog(rootPane, "Nuevo Vino agregado con exito ");

                } else {

                    restaurant.modificarProducto(nuevoVino);
                    JOptionPane.showMessageDialog(rootPane, "Vino Modificado con exito ");
                }
                callback.onSuccess(restaurant);
            } catch (ExcepcionLogica ex) {
                Logger.getLogger(AltaBebida.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Campos faltantes o invalidos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            restaurant.eliminarProducto(vino);
            JOptionPane.showMessageDialog(rootPane, "Vino Eliminado con exito ");

            callback.onSuccess(restaurant);
        } catch (ExcepcionLogica ex) {
            Logger.getLogger(AltaPostre.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboProvincia;
    private javax.swing.JComboBox ComboVarietales;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox checkBoxVino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField precioVino;
    private javax.swing.JTextField txtDescripcionVino;
    // End of variables declaration//GEN-END:variables
}
