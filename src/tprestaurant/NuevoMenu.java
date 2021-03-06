package tprestaurant;

import tprestaurant.misc.Validator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import tprestaurant.misc.Callback;
import tprestaurant.model.ExcepcionLogica;
import tprestaurant.model.Restaurant;

/**
 *
 * @author Administrador
 */
public class NuevoMenu extends javax.swing.JDialog {

    Restaurant restaurant;
    Callback callback;

    /**
     * Creates new form NuevoMenu
     */
    public NuevoMenu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setMask();
        setLocationRelativeTo(null);
    }

    public NuevoMenu(java.awt.Frame parent, boolean modal, Restaurant restaurant, Callback callback) {
        super(parent, modal);
        initComponents();
        setMask();
        this.callback = callback;
        this.restaurant = restaurant;
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        crearMenuButton = new javax.swing.JButton();
        txtFechaInicioVigencia = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nuevo Menu");

        crearMenuButton.setText("Crear Menú");
        crearMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMenuButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha Inicio de Vigencia");

        jLabel3.setText("dd-mm-aaaa");

        jLabel4.setText("Descripcion: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtDescripcion))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(txtFechaInicioVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(crearMenuButton)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFechaInicioVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(crearMenuButton)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMenuButtonActionPerformed

        if (Validator.isFechaValida(txtFechaInicioVigencia.getText())) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
            try {
                Date date = sdf.parse(txtFechaInicioVigencia.getText());
                restaurant.generarNuevoMenu(date, txtDescripcion.getText());
                JOptionPane.showMessageDialog(rootPane, "El menu ha sido generado con exito.");
                callback.onSuccess("");
                dispose();
            } catch (ParseException ex) {
                Logger.getLogger(NuevoMenu.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Error al Generar el nuevo menu.");
                dispose();
            } catch (ExcepcionLogica ex2) {
                JOptionPane.showMessageDialog(rootPane, ex2.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Formato de Fecha Invalida");
        }
    }//GEN-LAST:event_crearMenuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearMenuButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JFormattedTextField txtFechaInicioVigencia;
    // End of variables declaration//GEN-END:variables

    private void setMask() {
        MaskFormatter formatter;
        try {
            formatter = new MaskFormatter("##-##-####");
            formatter.install(txtFechaInicioVigencia);
        } catch (ParseException ex) {
            Logger.getLogger(NuevoMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
