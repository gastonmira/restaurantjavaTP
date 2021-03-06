package tprestaurant;

import java.util.List;
import tprestaurant.misc.MyJTableModel;
import tprestaurant.reporting.Cambio;

public class ReporteModificacionForm extends javax.swing.JFrame {

    List<Cambio> cambios;
    private String[] colName = {"Descripcion", "Precio Anterior", "Precio Nuevo", "Transicion"};

    /**
     * Creates new form ReporteModificacion
     */
    public ReporteModificacionForm(List<Cambio> cambios) {
        this.cambios = cambios;
        initComponents();
        setModel(cambios);
    }

    private void setModel(List<Cambio> cambios) {
        MyJTableModel tbModel = new MyJTableModel();
        tbModel.addColumn(colName[0]);
        tbModel.addColumn(colName[1]);
        tbModel.addColumn(colName[2]);
        tbModel.addColumn(colName[3]);
        if (cambios != null) {
            for (Cambio p : cambios) {
                String[] data = new String[4];

                data[0] = p.getDescripcion();
                data[1] = String.valueOf(p.getPrecioViejo());
                data[2] = String.valueOf(p.getPrecioNuevo());
                data[3] = p.getTransicion();

                tbModel.addRow(data);
            }
            tablaReporte.setModel(tbModel);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReporte = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Descripción", "Precio Anterior", "Precio Nuevo", "Transición"
            }
        ));
        jScrollPane1.setViewportView(tablaReporte);

        jLabel1.setText("Reporte de Modificación de Menúes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReporte;
    // End of variables declaration//GEN-END:variables
}
