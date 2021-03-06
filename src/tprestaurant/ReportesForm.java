package tprestaurant;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tprestaurant.model.ExcepcionLogica;
import tprestaurant.model.Menu;
import tprestaurant.model.Restaurant;
import tprestaurant.reporting.Reporte;

public class ReportesForm extends javax.swing.JFrame {

    Restaurant restaurant;
    Reporte reporte;

    public ReportesForm(Restaurant restaurant) {
        this.restaurant = restaurant;
        initComponents();
        cargaMenuEnComboBox();
    }

    private void cargaMenuEnComboBox() {
        DefaultComboBoxModel<String> cbModel2 = new DefaultComboBoxModel<String>();
        DefaultComboBoxModel<String> cbModel1 = new DefaultComboBoxModel<String>();
        ArrayList<Menu> menus = restaurant.getMenus();
        for (Menu m : menus) {
            cbModel1.addElement(m.getDescripcion());
            cbModel2.addElement(m.getDescripcion());
        }
        comboMenu1.setModel(cbModel1);
        comboMenu2.setModel(cbModel2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboMenu1 = new javax.swing.JComboBox();
        comboMenu2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReporteMod = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        checkBoxEntrada = new javax.swing.JCheckBox();
        checkBoxPrin = new javax.swing.JCheckBox();
        checkBoxPostre = new javax.swing.JCheckBox();
        checkBoxBebida = new javax.swing.JCheckBox();
        checkBoxVino = new javax.swing.JCheckBox();
        btnRepRanking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Reporte de Modificación");

        comboMenu1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboMenu2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Menú a seleccionar");

        jLabel3.setText("Menú a seleccionar");

        btnReporteMod.setText("Generar Reporte de Modificación");
        btnReporteMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteModMouseClicked(evt);
            }
        });

        jLabel4.setText("Reporte Ranking");

        checkBoxEntrada.setText("Entrada");

        checkBoxPrin.setText("Principal");

        checkBoxPostre.setText("Postre");

        checkBoxBebida.setText("Bebida");

        checkBoxVino.setText("Vino");

        btnRepRanking.setText("Generar Reporte de Ranking");
        btnRepRanking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRepRankingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(comboMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnReporteMod)
                    .addComponent(jLabel4)
                    .addComponent(btnRepRanking)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxEntrada)
                            .addComponent(checkBoxBebida))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxVino)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkBoxPrin)
                                .addGap(18, 18, 18)
                                .addComponent(checkBoxPostre)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnReporteMod)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxEntrada)
                    .addComponent(checkBoxPrin)
                    .addComponent(checkBoxPostre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxBebida)
                    .addComponent(checkBoxVino))
                .addGap(26, 26, 26)
                .addComponent(btnRepRanking)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteModMouseClicked

        Menu menu1;
        Menu menu2;
        reporte = new Reporte();
        if (comboMenu1.getSelectedItem() != null && comboMenu2.getSelectedItem() != null) {
            menu1 = restaurant.getMenubyDesc(comboMenu1.getSelectedItem().toString());
            menu2 = restaurant.getMenubyDesc(comboMenu2.getSelectedItem().toString());
            try {
                JFrame reporteModForm = new ReporteModificacionForm(reporte.menuModificacion(menu1, menu2));
                reporteModForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                reporteModForm.setVisible(true);
                reporteModForm.setLocationRelativeTo(null);
            } catch (ExcepcionLogica ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione menus para reportar.");
        }
    }//GEN-LAST:event_btnReporteModMouseClicked

    private void btnRepRankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepRankingMouseClicked
        // TODO add your handling code here:
        ArrayList<String> check = new ArrayList();
        reporte = new Reporte();
        if (checkBoxEntrada.isSelected()) {
            check.add("Entrada");
        }
        if (checkBoxPrin.isSelected()) {
            check.add("Principal");
        }
        if (checkBoxPostre.isSelected()) {
            check.add("Postre");
        }
        if (checkBoxBebida.isSelected()) {
            check.add("Bebida");
        }
        if (checkBoxVino.isSelected()) {
            check.add("Vino");
        }

        if (check.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione grupos de productos para reportar.");
        } else {
            try {
                JFrame reporteRanForm = new ReporteRankingForm(reporte.rankingPrecios(check, restaurant));
                reporteRanForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                reporteRanForm.setVisible(true);
                reporteRanForm.setLocationRelativeTo(null);
            } catch (ExcepcionLogica ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnRepRankingMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRepRanking;
    private javax.swing.JButton btnReporteMod;
    private javax.swing.JCheckBox checkBoxBebida;
    private javax.swing.JCheckBox checkBoxEntrada;
    private javax.swing.JCheckBox checkBoxPostre;
    private javax.swing.JCheckBox checkBoxPrin;
    private javax.swing.JCheckBox checkBoxVino;
    private javax.swing.JComboBox comboMenu1;
    private javax.swing.JComboBox comboMenu2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
