/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

/**
 *
 * @author Tecnologer
 */
public class interfaz extends javax.swing.JFrame {

    private static int Xi;
    private static int Yi;
    private static int Xf;
    private static int Yf;
    
    ArrayList<figuras> list=new ArrayList<>();
    
    public interfaz() {
        initComponents();
        btnLinea.setSelected(true);
        isFill.setVisible(false);
        jPanel4.setVisible(false);
        this.setExtendedState(interfaz.MAXIMIZED_BOTH);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actionGroup = new javax.swing.ButtonGroup();
        colorShooser = new javax.swing.JDialog();
        ColorChooser = new javax.swing.JColorChooser();
        btnAceptarColor = new javax.swing.JButton();
        btnCancelarColor = new javax.swing.JButton();
        autor = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        borradorGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        isFill = new javax.swing.JCheckBox();
        btnLinea = new javax.swing.JToggleButton();
        btnCuadro = new javax.swing.JToggleButton();
        btnTriangulo = new javax.swing.JToggleButton();
        btnCirculo = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        colorSelected = new javax.swing.JTextField();
        colorSelected2 = new javax.swing.JTextField();
        btnLapiz = new javax.swing.JToggleButton();
        btnClean = new javax.swing.JButton();
        btnChangerFondo = new javax.swing.JButton();
        btnBorrador = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        ovalBorrador = new javax.swing.JRadioButton();
        rectBorrador = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        colorRojo = new javax.swing.JTextField();
        colorAzul = new javax.swing.JTextField();
        colorAma = new javax.swing.JTextField();
        colorVerde = new javax.swing.JTextField();
        colorCielo = new javax.swing.JTextField();
        colorNegro = new javax.swing.JTextField();
        colorGris = new javax.swing.JTextField();
        colorBlanco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblY = new javax.swing.JLabel();
        lblX = new javax.swing.JLabel();
        btnColorShooser = new javax.swing.JButton();
        colorSeleccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblXi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblYi = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblXf = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblYf = new javax.swing.JLabel();
        panelP = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblAlgoritmo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblRelleno = new javax.swing.JLabel();

        colorShooser.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        colorShooser.setTitle("Selector de color");
        colorShooser.setMinimumSize(new java.awt.Dimension(620, 400));
        colorShooser.setPreferredSize(new java.awt.Dimension(620, 400));
        colorShooser.setResizable(false);

        btnAceptarColor.setText("Aceptar");
        btnAceptarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarColorActionPerformed(evt);
            }
        });

        btnCancelarColor.setText("Cancelar");
        btnCancelarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout colorShooserLayout = new javax.swing.GroupLayout(colorShooser.getContentPane());
        colorShooser.getContentPane().setLayout(colorShooserLayout);
        colorShooserLayout.setHorizontalGroup(
            colorShooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorShooserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptarColor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarColor)
                .addGap(221, 221, 221))
        );
        colorShooserLayout.setVerticalGroup(
            colorShooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorShooserLayout.createSequentialGroup()
                .addComponent(ColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(colorShooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarColor)
                    .addComponent(btnCancelarColor))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        autor.setMinimumSize(new java.awt.Dimension(570, 220));
        autor.setPreferredSize(new java.awt.Dimension(570, 220));
        autor.setResizable(false);
        autor.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                activeThis(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Instituto Tecnologíco de Culiacán");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tec_culiacan.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Domínguez Soto Rey David");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Numero de control:   09170814");

        jLabel11.setText("Mayo 2013");

        jLabel14.setText("Materia:   Graficación");

        jLabel15.setText("Maestra: María del Rosario Gonzalez");

        javax.swing.GroupLayout autorLayout = new javax.swing.GroupLayout(autor.getContentPane());
        autor.getContentPane().setLayout(autorLayout);
        autorLayout.setHorizontalGroup(
            autorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(autorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(autorLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)))
        );
        autorLayout.setVerticalGroup(
            autorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(autorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(autorLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(autorLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paintando ");
        setIconImage(getIcon());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setFocusable(false);
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 388));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 388));

        isFill.setBackground(new java.awt.Color(153, 153, 153));
        isFill.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        isFill.setText("Relleno");
        isFill.setToolTipText("Rellenar figura");
        isFill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        actionGroup.add(btnLinea);
        btnLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/line_icon.png"))); // NOI18N
        btnLinea.setSelected(true);
        btnLinea.setToolTipText("Linea recta");
        btnLinea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noFill(evt);
            }
        });

        actionGroup.add(btnCuadro);
        btnCuadro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/square_icon.png"))); // NOI18N
        btnCuadro.setToolTipText("Rectangulo");
        btnCuadro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCuadro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadroActionPerformed(evt);
            }
        });

        actionGroup.add(btnTriangulo);
        btnTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/triangle_icon.png"))); // NOI18N
        btnTriangulo.setToolTipText("Triangulo");
        btnTriangulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadroActionPerformed(evt);
            }
        });

        actionGroup.add(btnCirculo);
        btnCirculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circle_icon.png"))); // NOI18N
        btnCirculo.setToolTipText("Circulo");
        btnCirculo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadroActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setFocusable(false);
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        colorSelected.setBackground(new java.awt.Color(255, 0, 0));
        colorSelected.setEnabled(false);
        colorSelected.setFocusable(false);
        jPanel3.add(colorSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, -1));

        colorSelected2.setEnabled(false);
        colorSelected2.setFocusable(false);
        jPanel3.add(colorSelected2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, -1));

        actionGroup.add(btnLapiz);
        btnLapiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pencil_icon.png"))); // NOI18N
        btnLapiz.setMaximumSize(new java.awt.Dimension(29, 27));
        btnLapiz.setMinimumSize(new java.awt.Dimension(29, 27));
        btnLapiz.setPreferredSize(new java.awt.Dimension(29, 27));
        btnLapiz.setRequestFocusEnabled(false);
        btnLapiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noFill(evt);
            }
        });

        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/broom_icon.png"))); // NOI18N
        btnClean.setToolTipText("Limpiar pantalla");
        btnClean.setMaximumSize(new java.awt.Dimension(29, 27));
        btnClean.setMinimumSize(new java.awt.Dimension(29, 27));
        btnClean.setPreferredSize(new java.awt.Dimension(29, 27));
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnChangerFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/color_icon.png"))); // NOI18N
        btnChangerFondo.setToolTipText("Cambiar color del fondo");
        btnChangerFondo.setMaximumSize(new java.awt.Dimension(29, 27));
        btnChangerFondo.setMinimumSize(new java.awt.Dimension(29, 27));
        btnChangerFondo.setPreferredSize(new java.awt.Dimension(29, 27));
        btnChangerFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeFondoPanel(evt);
            }
        });

        actionGroup.add(btnBorrador);
        btnBorrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eraser_icon.png"))); // NOI18N
        btnBorrador.setToolTipText("Borrador");
        btnBorrador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrador.setMaximumSize(new java.awt.Dimension(29, 27));
        btnBorrador.setMinimumSize(new java.awt.Dimension(29, 27));
        btnBorrador.setPreferredSize(new java.awt.Dimension(29, 27));
        btnBorrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorradorActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        ovalBorrador.setBackground(new java.awt.Color(153, 153, 153));
        borradorGroup.add(ovalBorrador);
        ovalBorrador.setSelected(true);
        ovalBorrador.setText("Redondo");
        ovalBorrador.setToolTipText("");

        rectBorrador.setBackground(new java.awt.Color(153, 153, 153));
        borradorGroup.add(rectBorrador);
        rectBorrador.setText("Cuadrado");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ovalBorrador)
                    .addComponent(rectBorrador)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ovalBorrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rectBorrador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChangerFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLapiz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCuadro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(isFill, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCuadro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCirculo)
                    .addComponent(btnTriangulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLapiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChangerFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(isFill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFocusable(false);

        colorRojo.setBackground(new java.awt.Color(255, 0, 0));
        colorRojo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        colorRojo.setEnabled(false);
        colorRojo.setFocusable(false);
        colorRojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                selectColor(evt);
            }
        });

        colorAzul.setBackground(new java.awt.Color(0, 0, 255));
        colorAzul.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        colorAzul.setEnabled(false);
        colorAzul.setFocusable(false);
        colorAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setBlueColor(evt);
            }
        });

        colorAma.setBackground(new java.awt.Color(255, 255, 0));
        colorAma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        colorAma.setEnabled(false);
        colorAma.setFocusable(false);
        colorAma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setYellorColor(evt);
            }
        });

        colorVerde.setBackground(new java.awt.Color(0, 255, 0));
        colorVerde.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        colorVerde.setEnabled(false);
        colorVerde.setFocusable(false);
        colorVerde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setGreenColor(evt);
            }
        });

        colorCielo.setBackground(new java.awt.Color(0, 255, 255));
        colorCielo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        colorCielo.setEnabled(false);
        colorCielo.setFocusable(false);
        colorCielo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setCielo(evt);
            }
        });

        colorNegro.setBackground(new java.awt.Color(0, 0, 0));
        colorNegro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        colorNegro.setEnabled(false);
        colorNegro.setFocusable(false);
        colorNegro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setnegro(evt);
            }
        });

        colorGris.setBackground(new java.awt.Color(204, 204, 204));
        colorGris.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        colorGris.setEnabled(false);
        colorGris.setFocusable(false);
        colorGris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setgris(evt);
            }
        });

        colorBlanco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        colorBlanco.setEnabled(false);
        colorBlanco.setFocusable(false);
        colorBlanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setBlanco(evt);
            }
        });

        jLabel1.setText("X:");

        jLabel2.setText("Y:");

        btnColorShooser.setBackground(new java.awt.Color(255, 255, 255));
        btnColorShooser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus_icon.png"))); // NOI18N
        btnColorShooser.setBorder(null);
        btnColorShooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorShooserActionPerformed(evt);
            }
        });

        colorSeleccion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        colorSeleccion.setEnabled(false);
        colorSeleccion.setFocusable(false);
        colorSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                colorSeleccionsetBlanco(evt);
            }
        });

        jLabel3.setText("Xi:");

        jLabel4.setText("Yi:");

        jLabel5.setText("Xf:");

        jLabel6.setText("Yf:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblY, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(colorRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorAma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorCielo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorNegro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorGris, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnColorShooser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblXi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblYi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblXf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblYf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnColorShooser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(colorRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(colorAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(colorAma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(colorVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(colorCielo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(colorNegro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(colorGris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(colorBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1)
                .addComponent(jLabel2)
                .addComponent(lblY, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(colorSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblYi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblXi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblYf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblXf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelP.setBackground(new java.awt.Color(255, 255, 255));
        panelP.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        panelP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inicioDibujo(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setLabel(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                finDibujo(evt);
            }
        });
        panelP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                setLabel(evt);
            }
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dibujado(evt);
            }
        });

        javax.swing.GroupLayout panelPLayout = new javax.swing.GroupLayout(panelP);
        panelP.setLayout(panelPLayout);
        panelPLayout.setHorizontalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPLayout.setVerticalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda_icon.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Algoritmo:");

        jLabel13.setText("Tipo de relleno:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRelleno, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblAlgoritmo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblRelleno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static Image getIcon()
    {
        Image icono=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/paint_icon.png"));
        return icono;
    }
    
    private void selectColor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectColor
         if(evt.isMetaDown())
             colorSelected2.setBackground(colorRojo.getBackground());
        else if(!evt.isAltDown())
            colorSelected.setBackground(colorRojo.getBackground());
    }//GEN-LAST:event_selectColor

    private void setBlueColor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setBlueColor
        if(evt.isMetaDown())
            colorSelected2.setBackground(colorAzul.getBackground());
         else if(!evt.isAltDown())
             colorSelected.setBackground(colorAzul.getBackground());
    }//GEN-LAST:event_setBlueColor

    private void setYellorColor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setYellorColor
        if(evt.isMetaDown()) 
            colorSelected2.setBackground(colorAma.getBackground());
        else if(!evt.isAltDown())
            colorSelected.setBackground(colorAma.getBackground());
    }//GEN-LAST:event_setYellorColor

    private void setGreenColor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setGreenColor
        if(evt.isMetaDown()) 
            colorSelected2.setBackground(colorVerde.getBackground());
        else if(!evt.isAltDown())
            colorSelected.setBackground(colorVerde.getBackground());
    }//GEN-LAST:event_setGreenColor

    private void setCielo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setCielo
        if(evt.isMetaDown()) 
            colorSelected2.setBackground(colorCielo.getBackground());
        else if(!evt.isAltDown())
            colorSelected.setBackground(colorCielo.getBackground());
    }//GEN-LAST:event_setCielo

    private void setnegro(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setnegro
       if(evt.isMetaDown()) 
            colorSelected2.setBackground(colorNegro.getBackground());
        else if(!evt.isAltDown())
            colorSelected.setBackground(colorNegro.getBackground());
    }//GEN-LAST:event_setnegro

    private void setgris(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setgris
        if(evt.isMetaDown()) 
            colorSelected2.setBackground(colorGris.getBackground());
        else if(!evt.isAltDown())
            colorSelected.setBackground(colorGris.getBackground());
    }//GEN-LAST:event_setgris

    private void setBlanco(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setBlanco
       if(evt.isMetaDown()) 
            colorSelected2.setBackground(colorBlanco.getBackground());
        else if(!evt.isAltDown())
            colorSelected.setBackground(colorBlanco.getBackground());
    }//GEN-LAST:event_setBlanco
    
    private void inicioDibujo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioDibujo
        reStartXY();
        Xi=evt.getX();
        Yi=evt.getY();        
        if(getAction()!=5 && getAction()!=6 )
        {
            panelP.repaint();
            Xf=evt.getX();
            Yf=evt.getY();
             figuras fig=new figuras(Xi,Yi, Xf, Yf,getAction(),colorSelected.getBackground(),colorSelected2.getBackground(),isFill.isSelected(),0);
            list.add(list.size(), fig);
            redibujar();
        }
        else if(getAction()==6)
        {
            figuras fig=new figuras(Xi,Yi, Xf, Yf,getAction(),colorSelected2.getBackground(),colorSelected2.getBackground(),isFill.isSelected(),getBorrador());
            list.add(list.size(), fig);
        }
        else
        {
            figuras fig=new figuras(Xi,Yi, Xf, Yf,getAction(),colorSelected.getBackground(),colorSelected2.getBackground(),isFill.isSelected(),0);
            list.add(list.size(), fig);
        }
       setLblXY(evt.getX(), evt.getY());
       dibujar(getAction());
    }//GEN-LAST:event_inicioDibujo

    private void finDibujo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finDibujo
       Xf=evt.getX();
       Yf=evt.getY();
       setLblXY(evt.getX(), evt.getY());
       if(getAction()==5)
       {
           Xi=Xf;
           Yi=Yf;
       }
       else if(getAction()==6)
       {
            dibujar(getAction());
            figuras fig=new figuras(Xi,Yi, Xf, Yf,getAction(),colorSelected2.getBackground(),colorSelected2.getBackground(),isFill.isSelected(),0);
            list.add(list.size(), fig);
       }
       else
       {
           
            dibujar(getAction());
            figuras fig=new figuras(Xi,Yi, Xf, Yf,getAction(),colorSelected.getBackground(),colorSelected2.getBackground(),isFill.isSelected(),0);
            list.add(list.size(), fig);
       }
       redibujar();
    }//GEN-LAST:event_finDibujo

    private void dibujado(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dibujado
       Xf=evt.getX();
       Yf=evt.getY();
       if(getAction()==5 )
       {
           Xi=Xf;
           Yi=Yf;
           setLblXY(evt.getX(), evt.getY());
           dibujar(getAction());
           figuras fig=new figuras(Xi,Yi, Xf, Yf,getAction(),colorSelected.getBackground(),colorSelected2.getBackground(),isFill.isSelected(),0);
           list.add(list.size(), fig);
       }
       else if(getAction()==6)
       {
           Xi=Xf;
           Yi=Yf;
           setLblXY(evt.getX(), evt.getY());
           dibujar(getAction());
           figuras fig=new figuras(Xi,Yi, Xf, Yf,getAction(),colorSelected2.getBackground(),colorSelected2.getBackground(),isFill.isSelected(),getBorrador());
           list.add(list.size(), fig);
       }
       else
       {
            panelP.repaint();
            redibujar();
            setLblXY(evt.getX(), evt.getY());
            dibujar(getAction());
       }
    }//GEN-LAST:event_dibujado

    private void setLabel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setLabel
        setLblXY(evt.getX(), evt.getY());
    }//GEN-LAST:event_setLabel

    private void btnColorShooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorShooserActionPerformed
        this.setEnabled(false);
        colorShooser.setVisible(true);
        colorShooser.setLocationRelativeTo(btnColorShooser);
    }//GEN-LAST:event_btnColorShooserActionPerformed

    private void colorSeleccionsetBlanco(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorSeleccionsetBlanco
       if(evt.isMetaDown()) 
            colorSelected2.setBackground(colorSeleccion.getBackground());
        else if(!evt.isAltDown())
            colorSelected.setBackground(colorSeleccion.getBackground());
    }//GEN-LAST:event_colorSeleccionsetBlanco

    private void btnAceptarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarColorActionPerformed
       colorSeleccion.setBackground(ColorChooser.getColor());
       colorSelected.setBackground(colorSeleccion.getBackground());
       this.setEnabled(true);
       colorShooser.dispose();
    }//GEN-LAST:event_btnAceptarColorActionPerformed

    private void btnCancelarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarColorActionPerformed
        this.setEnabled(true);
       colorShooser.dispose();
    }//GEN-LAST:event_btnCancelarColorActionPerformed

    private void noFill(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noFill
        isFill.setSelected(false);
        isFill.setVisible(false);
        btnBorradorActionPerformed(evt);
    }//GEN-LAST:event_noFill

    private void btnCuadroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuadroActionPerformed
       isFill.setSelected(false);
       isFill.setVisible(true);
        btnBorradorActionPerformed(evt);
    }//GEN-LAST:event_btnCuadroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        autor.setVisible(true);
        autor.setLocationRelativeTo(this);
        this.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void activeThis(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_activeThis
       this.setEnabled(true);
    }//GEN-LAST:event_activeThis

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
       dibujos.clean(panelP.getBackground());
       list.clear();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void changeFondoPanel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeFondoPanel
      panelP.setBackground(colorSelected.getBackground());
      colorSelected2.setBackground(panelP.getBackground());
      panelP.repaint();
      redibujar();
    }//GEN-LAST:event_changeFondoPanel

    private void btnBorradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorradorActionPerformed
       if(btnBorrador.isSelected())
       {
           jPanel4.setVisible(true);
           isFill.setVisible(false);
       }
       else
          jPanel4.setVisible(false); 
    }//GEN-LAST:event_btnBorradorActionPerformed
                                                                
    void dibujar(int tipo)
    {
        lblRelleno.setText("");
        setXiYiLbl();
        Graphics g= panelP.getGraphics();        
        if(tipo==1)
        {
            dibujos.lineaDDA(Xi, Yi, Xf, Yf,colorSelected.getBackground());
            lblAlgoritmo.setText("DDA");
            lblRelleno.setText("Sin relleno");
        }
        else if(tipo==2)
        {
            dibujos.cuadrado(Xi, Yi, Xf, Yf,colorSelected.getBackground(),colorSelected2.getBackground(),isFill.isSelected());
            lblAlgoritmo.setText("DDA");
            if(isFill.isSelected())
                lblRelleno.setText("Patrones");
            else
                lblRelleno.setText("Sin relleno");
        }
        else if(tipo==3)
        {
            dibujos.triangulo(Xi, Yi, Xf, Yf, colorSelected.getBackground(), isFill.isSelected());
            lblAlgoritmo.setText("Bresenham");
            if(isFill.isSelected())
                lblRelleno.setText("Fonteras");
            else
                lblRelleno.setText("Sin relleno");
        }
        else if(tipo==4)
        {
            int dx = (Xf-Xi)/2;
            int dy = (Yf-Yi)/2;
            lblAlgoritmo.setText("Bresenham");
            int distancia;
                if(Math.abs(dx)>Math.abs(dy)){
                    distancia = Math.abs(dx);
                }else{
                    distancia = Math.abs(dy);
                }
                
                if(!isFill.isSelected())
                {
                    lblRelleno.setText("Sin relleno");
                    //CIRCULO SIN RELLENO
                    dibujos.CirculoBresenham(Xi+dx,Yi+dy,distancia,colorSelected.getBackground());
                }else
                {
                    lblRelleno.setText("LLenado por fronteras");
                    //CIRCULO CON RELLENO
                    for(int x = 0; x<distancia ; x++){
                        dibujos.CirculoBresenham(Xi+dx,Yi+dy,distancia,colorSelected.getBackground());
                    }
                }
        }
        else if(tipo==5)
        {
            dibujos.putPixel(Xi, Yi, colorSelected.getBackground());
            lblAlgoritmo.setText("PutPixel");
            lblRelleno.setText("Sin relleno");
        }
        else if(tipo==6)
        {
            dibujos.borrador(Xi, Yi, panelP.getBackground(),getBorrador());
            lblAlgoritmo.setText("");
            lblRelleno.setText("");
        }
        
    }
    
    int getAction()
    {
        if(btnLinea.isSelected())
            return 1;
        else if(btnCuadro.isSelected())
            return 2;
        else if(btnTriangulo.isSelected())
            return 3;
        else if(btnCirculo.isSelected())
            return 4;
        else if(btnLapiz.isSelected())
            return 5;
        else if(btnBorrador.isSelected())
            return 6;
        else
        {
            btnLinea.setSelected(true);
            return 1;
        }
    }
    
    int getBorrador()
    {
        if(ovalBorrador.isSelected())
            return 1;
        else if(rectBorrador.isSelected())
            return 2;
        else
            return 0;
            
    }
    void reStartXY()
    {
        Xi=0;
        Yi=0;
        Xf=0;
        Yf=0;
    }
    
    void setLblXY(int x, int y)
    {
        lblX.setText(""+x);
        lblY.setText(""+y);
    }
    
    void setXiYiLbl()
    {
        lblXi.setText(""+Xi);
        lblYi.setText(""+Yi);
        lblXf.setText(""+Xf);
        lblYf.setText(""+Yf);
    }
    
    void redibujar()
    {
        for(int i=0;i<list.size();i++)
        {
            redibujado(list.get(i).getXi(),list.get(i).getYi(),list.get(i).getXf(),
                        list.get(i).getYf(),list.get(i).getTipo(),list.get(i).getColor(),list.get(i).getColor1(),
                        list.get(i).isFill(),list.get(i).getTipoB());
        }
    }
    
    void redibujado(int xi, int yi, int xf, int yf,int tipo,Color color,Color color1,boolean fill,int tipoB)
    {
        setXiYiLbl();
        Graphics g= panelP.getGraphics();        
        if(tipo==1)
            dibujos.Bresenham(xi, yi, xf, yf,color);
        else if(tipo==2)
        {
            dibujos.cuadrado(xi, yi, xf, yf,color,color1,fill);
        }
        else if(tipo==3)
        {
            dibujos.triangulo(xi, yi, xf, yf, color, fill);
        }
        else if(tipo==4)
        {
            int dx = (xf-xi)/2;
            int dy = (yf-yi)/2;
            int distancia;
                if(Math.abs(dx)>Math.abs(dy)){
                    distancia = Math.abs(dx);
                }else{
                    distancia = Math.abs(dy);
                }
                
                if(!fill){
                    //CIRCULO SIN RELLENO
                    dibujos.CirculoBresenham(xi+dx,yi+dy,distancia,color);
                }else{
                    //CIRCULO CON RELLENO
                    for(int x = 0; x<distancia ; x++){
                        dibujos.CirculoBresenham(xi+dx,yi+dy,x,color);
                    }
                }
        }
        else if(tipo==5)
        {
            dibujos.putPixel(xi, yi, color);
        }
        else if(tipo==6)
        {
            dibujos.borrador(xi, yi, panelP.getBackground(),tipoB);
        }
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser ColorChooser;
    private javax.swing.ButtonGroup actionGroup;
    private javax.swing.JDialog autor;
    private javax.swing.ButtonGroup borradorGroup;
    private javax.swing.JButton btnAceptarColor;
    private javax.swing.JToggleButton btnBorrador;
    private javax.swing.JButton btnCancelarColor;
    private javax.swing.JButton btnChangerFondo;
    private javax.swing.JToggleButton btnCirculo;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnColorShooser;
    private javax.swing.JToggleButton btnCuadro;
    private javax.swing.JToggleButton btnLapiz;
    private javax.swing.JToggleButton btnLinea;
    private javax.swing.JToggleButton btnTriangulo;
    private javax.swing.JTextField colorAma;
    private javax.swing.JTextField colorAzul;
    private javax.swing.JTextField colorBlanco;
    private javax.swing.JTextField colorCielo;
    private javax.swing.JTextField colorGris;
    private javax.swing.JTextField colorNegro;
    private javax.swing.JTextField colorRojo;
    private javax.swing.JTextField colorSeleccion;
    private javax.swing.JTextField colorSelected;
    private javax.swing.JTextField colorSelected2;
    private javax.swing.JDialog colorShooser;
    private javax.swing.JTextField colorVerde;
    private javax.swing.JCheckBox isFill;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblAlgoritmo;
    public static javax.swing.JLabel lblRelleno;
    private javax.swing.JLabel lblX;
    private javax.swing.JLabel lblXf;
    private javax.swing.JLabel lblXi;
    private javax.swing.JLabel lblY;
    private javax.swing.JLabel lblYf;
    private javax.swing.JLabel lblYi;
    private javax.swing.JRadioButton ovalBorrador;
    public static javax.swing.JPanel panelP;
    private javax.swing.JRadioButton rectBorrador;
    // End of variables declaration//GEN-END:variables
}
