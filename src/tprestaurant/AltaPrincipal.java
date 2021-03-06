package tprestaurant;

import tprestaurant.misc.Validator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import tprestaurant.misc.Callback;
import tprestaurant.misc.MyJTableModel;
import tprestaurant.model.ExcepcionLogica;
import tprestaurant.model.Ingrediente;
import tprestaurant.model.IngredienteDePrincipal;
import tprestaurant.model.Restaurant;
import tprestaurant.model.productos.Principal;

public class AltaPrincipal extends javax.swing.JFrame {

    Restaurant restaurant;
    Callback callback;
    MyJTableModel tbModel;
    Principal principal;
    private String[] colName = {"Nombre", "Cantidad", "Unidad de Medida"};
    ArrayList<IngredienteDePrincipal> ingredientesDePrincipal = new ArrayList<IngredienteDePrincipal>();

    /**
     * Creates new form AltaPrincipal
     */
    public AltaPrincipal(Principal principal, Restaurant restaurant, Callback callback) {
        this.callback = callback;
        this.restaurant = restaurant;
        this.principal = principal;
        initComponents();

        AltaOMod(principal);

        cargaIngredientes(principal);

        setDefaultComboSelection();
    }

    private void AltaOMod(Principal principal) {
        if (principal != null) {
            txtNombrePrincipal.setText(principal.getDescripcion());
            txtNombrePrincipal.setEnabled(false);
            porcGananciaPrin.setText(String.valueOf(principal.getPorcentajeGanancia()));
            setModel(principal);
            btnEliminar.setVisible(true);
            checkBoxPrin.setSelected(principal.isActivo());
            jLabel1.setText("Modificar Principal");
        } else {
            txtNombrePrincipal.setText("");
            txtNombrePrincipal.setEnabled(true);
            porcGananciaPrin.setText("");
            tbModel = new MyJTableModel();
            tbModel.addColumn(colName[0]);
            tbModel.addColumn(colName[1]);
            tbModel.addColumn(colName[2]);
            tableIngredientes.setModel(tbModel);
            btnEliminar.setVisible(false);
            checkBoxPrin.setSelected(true);
            jLabel1.setText("Alta Principal");
        }
    }

    private void setDefaultComboSelection() {
        if (jComboBox1.getItemAt(0) != null) {
            Ingrediente ing = restaurant.getIngredientebyDesc(jComboBox1.getItemAt(0).toString());
            lblUnidadMedidaIngrediente.setText(ing.getUnidad().toString());
        }
    }

    private void setModel(Principal principal) {
        tbModel = new MyJTableModel();
        tbModel.addColumn(colName[0]);
        tbModel.addColumn(colName[1]);
        tbModel.addColumn(colName[2]);

        ArrayList<IngredienteDePrincipal> list = principal.getIngredientes();
        ingredientesDePrincipal.addAll(list);
        if (list != null) {
            for (IngredienteDePrincipal p : list) {
                String[] data = new String[3];

                data[0] = p.getDescripcion();
                data[1] = String.valueOf(p.getCantidadUtilizada());
                data[2] = p.getUnidad().toString();
                tbModel.addRow(data);
            }
            tableIngredientes.setModel(tbModel);
        }
    }

    private void cargaIngredientes(Principal principal) {
        DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<String>();
        TreeSet<Ingrediente> ingredientes = null;

        ingredientes = restaurant.getIngredientes();

        for (Iterator<Ingrediente> it = ingredientes.iterator(); it.hasNext();) {
            Ingrediente i = it.next();
            cbModel.addElement(i.getDescripcion());
        }
        
        jComboBox1.setModel(cbModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGuardarPrin = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelarPrin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        porcGananciaPrin = new javax.swing.JTextField();
        checkBoxPrin = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox();
        lblUnidadMedidaIngrediente = new javax.swing.JLabel();
        txtNombrePrincipal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableIngredientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnEliminarIngrediente = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGuardarPrin.setText("Guardar");
        btnGuardarPrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPrinActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelarPrin.setText("Cancelar");
        btnCancelarPrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPrinActionPerformed(evt);
            }
        });

        jLabel1.setText("Alta Principal");

        jLabel5.setText("Porcentaje de ganancia");

        porcGananciaPrin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                porcGananciaPrinKeyReleased(evt);
            }
        });

        checkBoxPrin.setText("¿Activo?");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        lblUnidadMedidaIngrediente.setText(" ");

        jLabel7.setText("Nombre");

        tableIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Cantidad", "Unidad de medida"
            }
        ));
        jScrollPane4.setViewportView(tableIngredientes);

        jButton1.setText("Agregar Ingrediente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEliminarIngrediente.setText("Quitar Ingrediente");
        btnEliminarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarIngredienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(porcGananciaPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkBoxPrin)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblUnidadMedidaIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarIngrediente)))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombrePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardarPrin)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarPrin)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(checkBoxPrin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombrePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(btnEliminarIngrediente))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUnidadMedidaIngrediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(porcGananciaPrin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarPrin)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardarPrin))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void porcGananciaPrinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_porcGananciaPrinKeyReleased
        // TODO add your handling code here:
        if (!Validator.esFloat(porcGananciaPrin.getText())) {
            porcGananciaPrin.setText("");
            JOptionPane.showMessageDialog(null, "Porcentaje de Ganancia para Principal Inválido");
        }
    }//GEN-LAST:event_porcGananciaPrinKeyReleased

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if (jComboBox1.getSelectedItem() != null) {
            Ingrediente ing = restaurant.getIngredientebyDesc(jComboBox1.getSelectedItem().toString());
            lblUnidadMedidaIngrediente.setText(ing.getUnidad().toString());
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!Validator.esFloat(jTextField1.getText())) {
            jTextField1.setText("");
            JOptionPane.showMessageDialog(null, "Cantidad de ingrediente invalida");
            
            return;
        }
        
        if(Float.parseFloat(jTextField1.getText()) <0) {
            jTextField1.setText("");
            JOptionPane.showMessageDialog(null, "La cantidad debe ser positiva");
            
            return;
        }

        if (tbModel == null) {
            tbModel = new MyJTableModel();
            tbModel.addColumn(colName[0]);
            tbModel.addColumn(colName[1]);
            tbModel.addColumn(colName[2]);

            tableIngredientes.setModel(tbModel);
        }

        Ingrediente ing = restaurant.getIngredientebyDesc(jComboBox1.getSelectedItem().toString());
        float cantidadAdicional = 0;

        if (checkIngrediente(ing)) {
            IngredienteDePrincipal ingPrincipal = getIngredienteFromLocalList(jComboBox1.getSelectedItem().toString());
            cantidadAdicional = ingPrincipal.getCantidadUtilizada();
            ingredientesDePrincipal.remove(ingPrincipal);
        }

        IngredienteDePrincipal ingPrincipal = new IngredienteDePrincipal(Float.parseFloat(jTextField1.getText()) + cantidadAdicional, ing.getCostoPorUnidad(), ing.getUnidad(), ing.getDescripcion());
        ingredientesDePrincipal.add(ingPrincipal);
        String[] data = new String[3];
        data[0] = ing.getDescripcion();
        data[1] = String.valueOf(Float.parseFloat(jTextField1.getText()) + cantidadAdicional);
        data[2] = ing.getUnidad().toString();
        tbModel.addRow(data);
    }//GEN-LAST:event_jButton1ActionPerformed

    private IngredienteDePrincipal getIngredienteFromLocalList(String desc) {
        for (IngredienteDePrincipal i : ingredientesDePrincipal) {
            if (i.getDescripcion().equals(desc)) {
                return i;
            }
        }

        return null;
    }
    private void btnGuardarPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPrinActionPerformed
        if (!("".equals(txtNombrePrincipal.getText())) && !("".equals(porcGananciaPrin.getText()))) {
            Principal nuevoPrincipal = new Principal(ingredientesDePrincipal, Float.parseFloat(porcGananciaPrin.getText()), txtNombrePrincipal.getText());
            nuevoPrincipal.setActivo(checkBoxPrin.isSelected());
            try {
                if (principal == null) {

                    restaurant.agregarProducto(nuevoPrincipal);
                    JOptionPane.showMessageDialog(rootPane, "Nuevo Plato Principal agregado con exito ");

                } else {

                    restaurant.modificarProducto(nuevoPrincipal);
                    JOptionPane.showMessageDialog(rootPane, "Plato Principal Modificado con exito ");
                }
                callback.onSuccess(restaurant);
            } catch (ExcepcionLogica ex) {
                Logger.getLogger(AltaBebida.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Campos faltantes o invalidos");
        }
    }//GEN-LAST:event_btnGuardarPrinActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            restaurant.eliminarProducto(principal);
            JOptionPane.showMessageDialog(rootPane, "Plato Principal Eliminado con exito ");
            callback.onSuccess(restaurant);
        } catch (ExcepcionLogica ex) {
            Logger.getLogger(AltaPostre.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPrinActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarPrinActionPerformed

    private void btnEliminarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarIngredienteActionPerformed
        if (tableIngredientes.getSelectedRow() != -1) {
            ingredientesDePrincipal.remove(getIngredienteFromLocalList((String) tableIngredientes.getValueAt(tableIngredientes.getSelectedRow(), 0)));
            tbModel.removeRow(tableIngredientes.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un elemento antes de eliminar");
        }
    }//GEN-LAST:event_btnEliminarIngredienteActionPerformed

    private Boolean checkIngrediente(Ingrediente ing) {
        for (int i = 0; i < tableIngredientes.getRowCount(); i++) {
            if (ing.getDescripcion().equalsIgnoreCase((String) tableIngredientes.getValueAt(i, 0))) {
                tbModel.removeRow(i);
                return true;
            }
        }
        return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarPrin;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarIngrediente;
    private javax.swing.JButton btnGuardarPrin;
    private javax.swing.JCheckBox checkBoxPrin;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblUnidadMedidaIngrediente;
    private javax.swing.JTextField porcGananciaPrin;
    private javax.swing.JTable tableIngredientes;
    private javax.swing.JTextField txtNombrePrincipal;
    // End of variables declaration//GEN-END:variables

}
