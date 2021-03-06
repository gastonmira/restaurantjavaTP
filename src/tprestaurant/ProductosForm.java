package tprestaurant;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.SortedSet;
import javax.swing.JFrame;
import javax.swing.JTable;
import tprestaurant.misc.Callback;
import tprestaurant.misc.MyJTableModel;
import tprestaurant.model.Restaurant;
import tprestaurant.model.productos.Bebida;
import tprestaurant.model.productos.Entrada;
import tprestaurant.model.productos.Postre;
import tprestaurant.model.productos.Principal;
import tprestaurant.model.productos.Producto;
import tprestaurant.model.productos.Vino;

/**
 *
 * @author gastonmira
 */
public class ProductosForm extends javax.swing.JFrame {

    private Restaurant restaurant;
    private String[] colName = {"Nombre", "Precio", "Tipo", "%Ganancia"};
    private AltaBebida altaBebida;
    private AltaPostre altaPostre;
    private AltaEntrada altaEntrada;
    private AltaPrincipal altaPrincipal;
    private AltaVino altaVino;

    public ProductosForm() {
        initComponents();
    }

    /**
     * Creates new form ProductosForm
     *
     * @param restaurant
     */
    public ProductosForm(Restaurant restaurant) {
        this.restaurant = restaurant;
        initComponents();

        createTableListeners();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tabProductos = new javax.swing.JTabbedPane();
        panelEntrada = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEntrada = new javax.swing.JTable();
        btnAddEntrada = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiarEntrada = new javax.swing.JButton();
        btnFiltrarEntrada = new javax.swing.JButton();
        txtBuscadorEntrada = new javax.swing.JTextField();
        panelPrincipal = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPrincipal = new javax.swing.JTable();
        btnAddPrincipal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnLimpiarPrincipal = new javax.swing.JButton();
        btnFiltrarPrincipal = new javax.swing.JButton();
        txtBuscadorPrincipal = new javax.swing.JTextField();
        panelPostre = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPostre = new javax.swing.JTable();
        btnAddPostre = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnLimpiarPostre = new javax.swing.JButton();
        btnFiltrarPostre = new javax.swing.JButton();
        txtBuscadorPostre = new javax.swing.JTextField();
        panelBebida = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaBebida = new javax.swing.JTable();
        btnAddBebida = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnLimpiarBebida = new javax.swing.JButton();
        btnFiltrarBebida = new javax.swing.JButton();
        txtBuscadorBebida = new javax.swing.JTextField();
        panelVino = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaVino = new javax.swing.JTable();
        btnAddVino = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiarVino = new javax.swing.JButton();
        btnFiltrarVino = new javax.swing.JButton();
        txtBuscadorVino = new javax.swing.JTextField();
        panelTodos = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaTodos = new javax.swing.JTable();
        btnFiltrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtBuscador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabProductos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabProductosStateChanged(evt);
            }
        });

        tablaEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEntradaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaEntradaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEntrada);

        btnAddEntrada.setText("Agregar Entrada");
        btnAddEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddEntradaMouseClicked(evt);
            }
        });

        jLabel1.setText("Para editar un producto haga doble click en el mismo");

        btnLimpiarEntrada.setText("Limpiar");
        btnLimpiarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarEntradaActionPerformed(evt);
            }
        });

        btnFiltrarEntrada.setText("Filtrar");
        btnFiltrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarEntradaActionPerformed(evt);
            }
        });

        txtBuscadorEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorEntradaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelEntradaLayout = new javax.swing.GroupLayout(panelEntrada);
        panelEntrada.setLayout(panelEntradaLayout);
        panelEntradaLayout.setHorizontalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFiltrarEntrada)
                    .addComponent(btnLimpiarEntrada)
                    .addComponent(txtBuscadorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addComponent(btnAddEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelEntradaLayout.setVerticalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEntradaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtBuscadorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFiltrarEntrada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarEntrada)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEntrada)
                    .addComponent(jLabel1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tabProductos.addTab("Entrada", panelEntrada);

        tablaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tablaPrincipal);

        btnAddPrincipal.setText("Agregar plato principal");
        btnAddPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPrincipalMouseClicked(evt);
            }
        });

        jLabel2.setText("Para editar un producto haga doble click en el mismo");

        btnLimpiarPrincipal.setText("Limpiar");
        btnLimpiarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarPrincipalActionPerformed(evt);
            }
        });

        btnFiltrarPrincipal.setText("Filtrar");
        btnFiltrarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarPrincipalActionPerformed(evt);
            }
        });

        txtBuscadorPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorPrincipalKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFiltrarPrincipal)
                    .addComponent(btnLimpiarPrincipal)
                    .addComponent(txtBuscadorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(btnAddPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtBuscadorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFiltrarPrincipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarPrincipal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPrincipal)
                    .addComponent(jLabel2))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        tabProductos.addTab("Principal", panelPrincipal);

        tablaPostre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Title 3"
            }
        ));
        jScrollPane3.setViewportView(tablaPostre);

        btnAddPostre.setText("Agregar Postre");
        btnAddPostre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPostreMouseClicked(evt);
            }
        });

        jLabel3.setText("Para editar un producto haga doble click en el mismo");

        btnLimpiarPostre.setText("Limpiar");
        btnLimpiarPostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarPostreActionPerformed(evt);
            }
        });

        btnFiltrarPostre.setText("Filtrar");
        btnFiltrarPostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarPostreActionPerformed(evt);
            }
        });

        txtBuscadorPostre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorPostreKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelPostreLayout = new javax.swing.GroupLayout(panelPostre);
        panelPostre.setLayout(panelPostreLayout);
        panelPostreLayout.setHorizontalGroup(
            panelPostreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPostreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFiltrarPostre)
                    .addComponent(btnLimpiarPostre)
                    .addComponent(txtBuscadorPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(panelPostreLayout.createSequentialGroup()
                .addComponent(btnAddPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelPostreLayout.setVerticalGroup(
            panelPostreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostreLayout.createSequentialGroup()
                .addGroup(panelPostreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPostreLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscadorPostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFiltrarPostre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarPostre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPostreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPostre)
                    .addComponent(jLabel3))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        tabProductos.addTab("Postre", panelPostre);

        tablaBebida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Title 3"
            }
        ));
        jScrollPane4.setViewportView(tablaBebida);

        btnAddBebida.setText("Agregar Bebida");
        btnAddBebida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddBebidaMouseClicked(evt);
            }
        });

        jLabel4.setText("Para editar un producto haga doble click en el mismo");

        btnLimpiarBebida.setText("Limpiar");
        btnLimpiarBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarBebidaActionPerformed(evt);
            }
        });

        btnFiltrarBebida.setText("Filtrar");
        btnFiltrarBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarBebidaActionPerformed(evt);
            }
        });

        txtBuscadorBebida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorBebidaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelBebidaLayout = new javax.swing.GroupLayout(panelBebida);
        panelBebida.setLayout(panelBebidaLayout);
        panelBebidaLayout.setHorizontalGroup(
            panelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBebidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFiltrarBebida)
                    .addComponent(btnLimpiarBebida)
                    .addComponent(txtBuscadorBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(panelBebidaLayout.createSequentialGroup()
                .addComponent(btnAddBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelBebidaLayout.setVerticalGroup(
            panelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBebidaLayout.createSequentialGroup()
                .addGroup(panelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBebidaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtBuscadorBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFiltrarBebida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarBebida)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddBebida)
                    .addComponent(jLabel4))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        tabProductos.addTab("Bebida", panelBebida);

        tablaVino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Title 3"
            }
        ));
        jScrollPane5.setViewportView(tablaVino);

        btnAddVino.setText("Agregar Vino");
        btnAddVino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddVinoMouseClicked(evt);
            }
        });

        jLabel5.setText("Para editar un producto haga doble click en el mismo");

        btnLimpiarVino.setText("Limpiar");
        btnLimpiarVino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarVinoActionPerformed(evt);
            }
        });

        btnFiltrarVino.setText("Filtrar");
        btnFiltrarVino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarVinoActionPerformed(evt);
            }
        });

        txtBuscadorVino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorVinoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelVinoLayout = new javax.swing.GroupLayout(panelVino);
        panelVino.setLayout(panelVinoLayout);
        panelVinoLayout.setHorizontalGroup(
            panelVinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVinoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFiltrarVino)
                    .addComponent(btnLimpiarVino)
                    .addComponent(txtBuscadorVino, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(panelVinoLayout.createSequentialGroup()
                .addComponent(btnAddVino, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelVinoLayout.setVerticalGroup(
            panelVinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVinoLayout.createSequentialGroup()
                .addGroup(panelVinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelVinoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtBuscadorVino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFiltrarVino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarVino)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelVinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddVino)
                    .addComponent(jLabel5))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        tabProductos.addTab("Vino", panelVino);

        tablaTodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Precio"
            }
        ));
        jScrollPane6.setViewportView(tablaTodos);

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelTodosLayout = new javax.swing.GroupLayout(panelTodos);
        panelTodos.setLayout(panelTodosLayout);
        panelTodosLayout.setHorizontalGroup(
            panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFiltrar)
                    .addComponent(btnLimpiar)
                    .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panelTodosLayout.setVerticalGroup(
            panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodosLayout.createSequentialGroup()
                .addGroup(panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTodosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTodosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        tabProductos.addTab("Todos", panelTodos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabProductos)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabProductos)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtBuscador.setText("");
        setAllTableModel(tablaTodos, txtBuscador.getText(), 1);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiarVinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarVinoActionPerformed
        txtBuscadorVino.setText("");
        setTableModel(tablaVino, "Vino", txtBuscadorVino.getText(), 1);
    }//GEN-LAST:event_btnLimpiarVinoActionPerformed

    private void btnLimpiarBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarBebidaActionPerformed
        txtBuscadorBebida.setText("");
        setTableModel(tablaBebida, "Bebida", txtBuscadorBebida.getText(), 1);
    }//GEN-LAST:event_btnLimpiarBebidaActionPerformed

    private void btnLimpiarPostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarPostreActionPerformed
        txtBuscadorPostre.setText("");
        setTableModel(tablaPostre, "Postre", txtBuscadorPostre.getText(), 1);
    }//GEN-LAST:event_btnLimpiarPostreActionPerformed

    private void btnLimpiarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarPrincipalActionPerformed
        txtBuscadorPrincipal.setText("");
        setTableModel(tablaPrincipal, "Principal", txtBuscadorPrincipal.getText(), 1);
    }//GEN-LAST:event_btnLimpiarPrincipalActionPerformed

    private void btnLimpiarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEntradaActionPerformed
        txtBuscadorEntrada.setText("");
        setEntradaTableModel(tablaEntrada, "Entrada", txtBuscadorEntrada.getText(), 1);

    }//GEN-LAST:event_btnLimpiarEntradaActionPerformed

    private void btnAddEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddEntradaMouseClicked
        altaEntrada = new AltaEntrada(null, restaurant, new Callback<Restaurant>() {
            @Override
            public void onSuccess(Restaurant restaurant) {
                setEntradaTableModel(tablaEntrada, "Entrada", "", 0);
                altaEntrada.dispose();
            }
        });

        altaEntrada.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        altaEntrada.setVisible(true);
        altaEntrada.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAddEntradaMouseClicked

    private void btnAddPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPrincipalMouseClicked
        altaPrincipal = new AltaPrincipal(null, restaurant, new Callback<Restaurant>() {
            @Override
            public void onSuccess(Restaurant restaurant) {
                setTableModel(tablaPrincipal, "Principal", "", 0);
                altaPrincipal.dispose();
            }
        });
        altaPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        altaPrincipal.setVisible(true);
        altaPrincipal.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAddPrincipalMouseClicked

    private void btnAddPostreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPostreMouseClicked
        altaPostre = new AltaPostre(null, restaurant, new Callback<Restaurant>() {
            @Override
            public void onSuccess(Restaurant restaurant) {
                setTableModel(tablaPostre, "Postre", "", 0);
                altaPostre.dispose();
            }
        });

        altaPostre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        altaPostre.setVisible(true);
        altaPostre.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAddPostreMouseClicked

    private void btnAddBebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBebidaMouseClicked
        altaBebida = new AltaBebida(null, restaurant, new Callback<Restaurant>() {
            @Override
            public void onSuccess(Restaurant restaurant) {
                setTableModel(tablaBebida, "Bebida", "", 0);
                altaBebida.dispose();
            }
        });
        altaBebida.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        altaBebida.setVisible(true);
        altaBebida.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAddBebidaMouseClicked

    private void btnAddVinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddVinoMouseClicked
        altaVino = new AltaVino(null, restaurant, new Callback<Restaurant>() {
            @Override
            public void onSuccess(Restaurant restaurant) {
                setTableModel(tablaVino, "Vino", "", 0);
                altaVino.dispose();
            }
        });

        altaVino.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        altaVino.setVisible(true);
        altaVino.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAddVinoMouseClicked

    private void tabProductosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabProductosStateChanged
        switch (tabProductos.getSelectedIndex()) {
            case 0: {
                setEntradaTableModel(tablaEntrada, "Entrada", "", 0);
            }
            break;
            case 1: {
                setTableModel(tablaPrincipal, "Principal", "", 0);
            }
            break;
            case 2: {
                setTableModel(tablaPostre, "Postre", "", 0);
            }
            break;
            case 3: {
                setTableModel(tablaBebida, "Bebida", "", 0);
            }
            break;
            case 4: {
                setTableModel(tablaVino, "Vino", "", 0);
            }
            break;
            case 5: {
                setAllTableModel(tablaTodos, "", 0);
            }
            break;
        }
    }//GEN-LAST:event_tabProductosStateChanged

    private void tablaEntradaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEntradaMousePressed

    }//GEN-LAST:event_tablaEntradaMousePressed

    private void tablaEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEntradaMouseClicked

    }//GEN-LAST:event_tablaEntradaMouseClicked

    private void btnFiltrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarEntradaActionPerformed
        setEntradaTableModel(tablaEntrada, "Entrada", txtBuscadorEntrada.getText(), 1);
    }//GEN-LAST:event_btnFiltrarEntradaActionPerformed

    private void btnFiltrarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarPrincipalActionPerformed
        setTableModel(tablaPrincipal, "Principal", txtBuscadorPrincipal.getText(), 1);
    }//GEN-LAST:event_btnFiltrarPrincipalActionPerformed

    private void btnFiltrarPostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarPostreActionPerformed
        setTableModel(tablaPostre, "Postre", txtBuscadorPostre.getText(), 1);
    }//GEN-LAST:event_btnFiltrarPostreActionPerformed

    private void btnFiltrarBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarBebidaActionPerformed
        setTableModel(tablaBebida, "Bebida", txtBuscadorBebida.getText(), 1);
    }//GEN-LAST:event_btnFiltrarBebidaActionPerformed

    private void btnFiltrarVinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarVinoActionPerformed
        setTableModel(tablaVino, "Vino", txtBuscadorVino.getText(), 1);
    }//GEN-LAST:event_btnFiltrarVinoActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        setAllTableModel(tablaTodos, txtBuscador.getText(), 1);
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void txtBuscadorEntradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorEntradaKeyReleased
        setEntradaTableModel(tablaEntrada, "Entrada", txtBuscadorEntrada.getText(), 1);
    }//GEN-LAST:event_txtBuscadorEntradaKeyReleased

    private void txtBuscadorPrincipalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorPrincipalKeyReleased
        setTableModel(tablaPrincipal, "Principal", txtBuscadorPrincipal.getText(), 1);
    }//GEN-LAST:event_txtBuscadorPrincipalKeyReleased

    private void txtBuscadorPostreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorPostreKeyReleased
        setTableModel(tablaPostre, "Postre", txtBuscadorPostre.getText(), 1);
    }//GEN-LAST:event_txtBuscadorPostreKeyReleased

    private void txtBuscadorBebidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorBebidaKeyReleased
        setTableModel(tablaBebida, "Bebida", txtBuscadorBebida.getText(), 1);
    }//GEN-LAST:event_txtBuscadorBebidaKeyReleased

    private void txtBuscadorVinoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorVinoKeyReleased
        setTableModel(tablaVino, "Vino", txtBuscadorVino.getText(), 1);
    }//GEN-LAST:event_txtBuscadorVinoKeyReleased

    private void txtBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyReleased
        setAllTableModel(tablaTodos, txtBuscador.getText(), 1);
    }//GEN-LAST:event_txtBuscadorKeyReleased

    private void setTableModel(JTable table, String productType, String key, int tipoBusqueda) {
        MyJTableModel tbModel = new MyJTableModel();
        tbModel.addColumn(colName[0]);
        tbModel.addColumn(colName[1]);

        SortedSet<Producto> list = null;
        if (tipoBusqueda == 0) {
            list = restaurant.getProductosByType(productType);
        } else {
            if (tipoBusqueda == 1) {
                list = restaurant.buscarProductoPorTipo(productType, key);
            }
        }
        if (list != null) {
            for (Producto p : list) {
                String[] data = new String[2];

                data[0] = p.getDescripcion();
                data[1] = String.valueOf(p.precio());

                tbModel.addRow(data);
            }
            table.setModel(tbModel);
        }
    }

    //tipoBusqueda:  0 por tipo de producto
    // 1  por descripcion incompleta. 
    private void setEntradaTableModel(JTable table, String productType, String key, int tipoBusqueda) {
        MyJTableModel tbModel = new MyJTableModel();
        tbModel.addColumn(colName[0]);
        tbModel.addColumn(colName[1]);
        tbModel.addColumn(colName[3]);
        SortedSet<Producto> list = null;
        if (tipoBusqueda == 0) {
            list = restaurant.getProductosByType(productType);
        } else {
            if (tipoBusqueda == 1) {
                list = restaurant.buscarProductoPorTipo(productType, key);
            }
        }
        if (list != null) {
            for (Producto p : list) {
                String[] data = new String[3];

                data[0] = p.getDescripcion();
                data[1] = String.valueOf(p.precio());
                data[2] = String.valueOf(p.getPorcentajeGanancia());
                tbModel.addRow(data);
            }
            table.setModel(tbModel);
        }
    }

    private void setAllTableModel(JTable table, String key, int tipoBusqueda) {

        MyJTableModel tbModel = new MyJTableModel();
        tbModel.addColumn(colName[0]);
        tbModel.addColumn(colName[1]);
        tbModel.addColumn(colName[2]);
        SortedSet<Producto> list = null;
        if (tipoBusqueda == 0) {
            list = restaurant.getProductos();
        } else {
            if (tipoBusqueda == 1) {
                list = restaurant.buscarProducto(key);
            }
        }

        for (Producto p : list) {
            String[] data = new String[3];

            data[0] = p.getDescripcion();
            data[1] = String.valueOf(p.precio());
            data[2] = p.getClass().getSimpleName();
            tbModel.addRow(data);
        }

        table.setModel(tbModel);
    }

    private void createTableListeners() {
        /*BEBIDA*/
        tablaBebida.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {

                if (me.getClickCount() == 2) {

                    // float p = Float.parseFloat((String) tablaBebida.getModel().getValueAt(tablaBebida.getSelectedRow(), 1));
                    String n = (String) tablaBebida.getModel().getValueAt(tablaBebida.getSelectedRow(), 0);
                    Bebida beb = (Bebida) restaurant.getProductobyDescTipo("Bebida", n);
                    // Bebida beb= new Bebida(p,n);
                    altaBebida = new AltaBebida(beb, restaurant, new Callback<Restaurant>() {

                        @Override
                        public void onSuccess(Restaurant restaurant) {

                            setTableModel(tablaBebida, "Bebida", "", 0);
                            altaBebida.dispose();
                        }
                    });
                    altaBebida.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    altaBebida.setVisible(true);
                    altaBebida.setLocationRelativeTo(null);
                }
            }
        });
        /*ENTRADA*/

        tablaEntrada.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 2) {
                    String n = (String) tablaEntrada.getModel().getValueAt(tablaEntrada.getSelectedRow(), 0);
                    Entrada ent = (Entrada) restaurant.getProductobyDescTipo("Entrada", n);
                    altaEntrada = new AltaEntrada(ent, restaurant, new Callback<Restaurant>() {
                        @Override
                        public void onSuccess(Restaurant restaurant) {
                            setEntradaTableModel(tablaEntrada, "Entrada", "", 0);
                            altaEntrada.dispose();
                        }
                    });

                    altaEntrada.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    altaEntrada.setVisible(true);
                    altaEntrada.setLocationRelativeTo(null);
                }
            }
        });
        /*POSTRE*/

        tablaPostre.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 2) {
                    String n = (String) tablaPostre.getModel().getValueAt(tablaPostre.getSelectedRow(), 0);
                    Postre pos = (Postre) restaurant.getProductobyDescTipo("Postre", n);
                    altaPostre = new AltaPostre(pos, restaurant, new Callback<Restaurant>() {
                        @Override
                        public void onSuccess(Restaurant restaurant) {
                            setTableModel(tablaPostre, "Postre", "", 0);
                            altaPostre.dispose();
                        }
                    });

                    altaPostre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    altaPostre.setVisible(true);
                    altaPostre.setLocationRelativeTo(null);
                }
            }
        });
        /*PRINCIPAL*/

        tablaPrincipal.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 2) {
                    String n = (String) tablaPrincipal.getModel().getValueAt(tablaPrincipal.getSelectedRow(), 0);
                    Principal pri = (Principal) restaurant.getProductobyDescTipo("Principal", n);
                    altaPrincipal = new AltaPrincipal(pri, restaurant, new Callback<Restaurant>() {
                        @Override
                        public void onSuccess(Restaurant restaurant) {
                            setEntradaTableModel(tablaPrincipal, "Principal", "", 0);
                            altaPrincipal.dispose();
                        }
                    });

                    altaPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    altaPrincipal.setVisible(true);
                    altaPrincipal.setLocationRelativeTo(null);
                }
            }
        });

        /*VINOS*/
        tablaVino.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 2) {
                    String n = (String) tablaVino.getModel().getValueAt(tablaVino.getSelectedRow(), 0);
                    Vino vino = (Vino) restaurant.getProductobyDescTipo("Vino", n);
                    altaVino = new AltaVino(vino, restaurant, new Callback<Restaurant>() {
                        @Override
                        public void onSuccess(Restaurant restaurant) {
                            setTableModel(tablaVino, "Vino", "", 0);
                            altaVino.dispose();
                        }
                    });

                    altaVino.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    altaVino.setVisible(true);
                    altaVino.setLocationRelativeTo(null);
                }
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBebida;
    private javax.swing.JButton btnAddEntrada;
    private javax.swing.JButton btnAddPostre;
    private javax.swing.JButton btnAddPrincipal;
    private javax.swing.JButton btnAddVino;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnFiltrarBebida;
    private javax.swing.JButton btnFiltrarEntrada;
    private javax.swing.JButton btnFiltrarPostre;
    private javax.swing.JButton btnFiltrarPrincipal;
    private javax.swing.JButton btnFiltrarVino;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarBebida;
    private javax.swing.JButton btnLimpiarEntrada;
    private javax.swing.JButton btnLimpiarPostre;
    private javax.swing.JButton btnLimpiarPrincipal;
    private javax.swing.JButton btnLimpiarVino;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel panelBebida;
    private javax.swing.JPanel panelEntrada;
    private javax.swing.JPanel panelPostre;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTodos;
    private javax.swing.JPanel panelVino;
    private javax.swing.JTabbedPane tabProductos;
    private javax.swing.JTable tablaBebida;
    private javax.swing.JTable tablaEntrada;
    private javax.swing.JTable tablaPostre;
    private javax.swing.JTable tablaPrincipal;
    private javax.swing.JTable tablaTodos;
    private javax.swing.JTable tablaVino;
    private javax.swing.JTextField txtBuscador;
    private javax.swing.JTextField txtBuscadorBebida;
    private javax.swing.JTextField txtBuscadorEntrada;
    private javax.swing.JTextField txtBuscadorPostre;
    private javax.swing.JTextField txtBuscadorPrincipal;
    private javax.swing.JTextField txtBuscadorVino;
    // End of variables declaration//GEN-END:variables
}
