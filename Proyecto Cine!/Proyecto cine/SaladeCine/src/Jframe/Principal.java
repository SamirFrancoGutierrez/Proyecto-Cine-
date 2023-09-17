
package Jframe;

import Clases.Conexion;
import Clases.Venta;
import Clases.VentaDAO;
import Clases.mantenimiento;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Principal extends javax.swing.JFrame {
    DefaultTableModel modelo= new   DefaultTableModel();
  String catper="";int pr,can,canI=0, precio, vuelto,aforo=5;
  int tpagar;
  Venta v= new Venta();
  VentaDAO vdo= new VentaDAO();
    public Principal() {
        initComponents();
          txtIngreso.setText(""+canI);
        this.setExtendedState(getExtendedState()|Principal.MAXIMIZED_BOTH);//Tamaño Completa/sin parpadeo
     txtfecha.setText(fecha());
     txtaforo.setText(""+aforo);
     panelVenta.setVisible(false);
     txtnombrepeli.setBackground(new java.awt.Color(0,0,0,1));
     txtApe.setBackground(new java.awt.Color(0,0,0,1));
     txtNom.setBackground(new java.awt.Color(0,0,0,1));
     txtaforo.setBackground(new java.awt.Color(0,0,0,1));
     txtDni.setBackground(new java.awt.Color(0,0,0,1));
     txtIngreso.setBackground(new java.awt.Color(0,0,0,1));
     txtprecio.setBackground(new java.awt.Color(0,0,0,1));
     txtVuelto.setBackground(new java.awt.Color(0,0,0,1));
     txtPago.setBackground(new java.awt.Color(0,0,0,1));
     txtotalpagar.setBackground(new java.awt.Color(0,0,0,1));
     txttp.setBackground(new java.awt.Color(0,0,0,1));
     btnAgregar.setBackground(new java.awt.Color(0,0,0,1));
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEImagePanel1 = new LIB.JEImagePanel();
        PanelSlider = new javax.swing.JPanel();
        fSButtonMD1 = new LIB.FSButtonMD();
        btnVenta = new LIB.FSButtonMD();
        fSButtonMD3 = new LIB.FSButtonMD();
        fSButtonMD4 = new LIB.FSButtonMD();
        fSButtonMD5 = new LIB.FSButtonMD();
        jPanel2 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        txtfecha = new javax.swing.JLabel();
        panelVenta = new LIB.JPanelTransparente();
        btncerrarVenta = new javax.swing.JButton();
        txtaforo = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtnombrepeli = new javax.swing.JTextField();
        cboCatPeli = new javax.swing.JComboBox<>();
        cboCatPersona = new javax.swing.JComboBox<>();
        btnFactrua_Registrar = new LIB.FSButtonMD();
        jPanel1 = new javax.swing.JPanel();
        txtVuelto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPago = new javax.swing.JTextField();
        txttp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnPeliculas = new LIB.FSButtonMD();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtApe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtIngreso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtotalpagar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbocanPersona = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btnAceptar1 = new LIB.FSButtonMD();
        btnNuveo = new LIB.FSButtonMD();
        txtpreU = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtprecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/principal.jpg"))); // NOI18N
        jEImagePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelSlider.setBackground(new java.awt.Color(0, 0, 153));
        PanelSlider.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelSlider.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fSButtonMD1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fSButtonMD1.setText("Horario de Peliculas");
        fSButtonMD1.setColorHover(new java.awt.Color(255, 153, 0));
        fSButtonMD1.setColorNormal(new java.awt.Color(255, 102, 0));
        fSButtonMD1.setColorPressed(new java.awt.Color(255, 102, 0));
        fSButtonMD1.setColorTextHover(new java.awt.Color(255, 255, 255));
        PanelSlider.add(fSButtonMD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 170, -1));

        btnVenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVenta.setText("Venta de Entrada");
        btnVenta.setColorHover(new java.awt.Color(255, 153, 0));
        btnVenta.setColorNormal(new java.awt.Color(255, 102, 0));
        btnVenta.setColorPressed(new java.awt.Color(255, 102, 0));
        btnVenta.setColorTextHover(new java.awt.Color(255, 255, 255));
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        PanelSlider.add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 170, -1));

        fSButtonMD3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fSButtonMD3.setText("Cartelera");
        fSButtonMD3.setColorHover(new java.awt.Color(255, 153, 0));
        fSButtonMD3.setColorNormal(new java.awt.Color(255, 102, 0));
        fSButtonMD3.setColorPressed(new java.awt.Color(255, 102, 0));
        fSButtonMD3.setColorTextHover(new java.awt.Color(255, 255, 255));
        PanelSlider.add(fSButtonMD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 170, -1));

        fSButtonMD4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fSButtonMD4.setText("---------");
        fSButtonMD4.setColorHover(new java.awt.Color(255, 153, 0));
        fSButtonMD4.setColorNormal(new java.awt.Color(255, 102, 0));
        fSButtonMD4.setColorPressed(new java.awt.Color(255, 102, 0));
        fSButtonMD4.setColorTextHover(new java.awt.Color(255, 255, 255));
        PanelSlider.add(fSButtonMD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 170, -1));

        fSButtonMD5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fSButtonMD5.setText("Empleados");
        fSButtonMD5.setColorHover(new java.awt.Color(255, 153, 0));
        fSButtonMD5.setColorNormal(new java.awt.Color(255, 102, 0));
        fSButtonMD5.setColorPressed(new java.awt.Color(255, 102, 0));
        fSButtonMD5.setColorTextHover(new java.awt.Color(255, 255, 255));
        PanelSlider.add(fSButtonMD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 170, -1));

        jEImagePanel1.add(PanelSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 300, 680));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu.png"))); // NOI18N
        btnMenu.setText("MENU");
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel2.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 50));

        txtfecha.setBackground(new java.awt.Color(0, 0, 102));
        txtfecha.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtfecha.setForeground(new java.awt.Color(255, 255, 255));
        txtfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtfecha.setText("00 - 00 - 0000");
        jPanel2.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 250, 30));

        jEImagePanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 70));

        panelVenta.setColorPrimario(new java.awt.Color(0, 0, 204));
        panelVenta.setColorSecundario(new java.awt.Color(255, 102, 0));
        panelVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncerrarVenta.setBackground(new java.awt.Color(204, 204, 204));
        btncerrarVenta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btncerrarVenta.setForeground(new java.awt.Color(0, 0, 0));
        btncerrarVenta.setText("Cerrar");
        btncerrarVenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncerrarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarVentaActionPerformed(evt);
            }
        });
        panelVenta.add(btncerrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, 80, 40));

        txtaforo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtaforo.setForeground(new java.awt.Color(255, 255, 255));
        txtaforo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtaforo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        panelVenta.add(txtaforo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 150, 40));

        txtNom.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNom.setForeground(new java.awt.Color(255, 255, 255));
        txtNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNom.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        panelVenta.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 220, 40));

        txtnombrepeli.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtnombrepeli.setForeground(new java.awt.Color(255, 255, 255));
        txtnombrepeli.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombrepeli.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        panelVenta.add(txtnombrepeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 120, 250, 40));

        cboCatPeli.setBackground(new java.awt.Color(0, 0, 153));
        cboCatPeli.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        cboCatPeli.setForeground(new java.awt.Color(255, 255, 255));
        cboCatPeli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE CATEGORIA DE PELICULA", "Terror", "Accion", " " }));
        panelVenta.add(cboCatPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 250, 40));

        cboCatPersona.setBackground(new java.awt.Color(0, 0, 153));
        cboCatPersona.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        cboCatPersona.setForeground(new java.awt.Color(255, 255, 255));
        cboCatPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE CATEGORIA PARA PERSONA", "Adulto", "Niño(a)", " " }));
        cboCatPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCatPersonaActionPerformed(evt);
            }
        });
        panelVenta.add(cboCatPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 250, 40));

        btnFactrua_Registrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFactrua_Registrar.setText("Imprimir");
        btnFactrua_Registrar.setColorHover(new java.awt.Color(255, 0, 51));
        btnFactrua_Registrar.setColorNormal(new java.awt.Color(255, 0, 102));
        btnFactrua_Registrar.setColorPressed(new java.awt.Color(255, 0, 102));
        btnFactrua_Registrar.setColorTextHover(new java.awt.Color(255, 255, 255));
        btnFactrua_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactrua_RegistrarActionPerformed(evt);
            }
        });
        panelVenta.add(btnFactrua_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 330, 230, 70));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtVuelto.setEditable(false);
        txtVuelto.setBackground(new java.awt.Color(0, 51, 204));
        txtVuelto.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        txtVuelto.setForeground(new java.awt.Color(255, 255, 255));
        txtVuelto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVuelto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        jPanel1.add(txtVuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 220, 60));

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("T.COBRO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, -1));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("VUELTO ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 220, -1));

        txtPago.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPago.setForeground(new java.awt.Color(255, 255, 255));
        txtPago.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPago.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        txtPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 110, 50));

        txttp.setEditable(false);
        txttp.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        txttp.setForeground(new java.awt.Color(255, 255, 255));
        txttp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 204)));
        jPanel1.add(txttp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 50));

        jLabel15.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("PAGO :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 80, -1));

        panelVenta.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 290, 200));

        btnPeliculas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPeliculas.setText("PELICULA");
        btnPeliculas.setColorHover(new java.awt.Color(0, 102, 255));
        btnPeliculas.setColorNormal(new java.awt.Color(0, 0, 255));
        btnPeliculas.setColorPressed(new java.awt.Color(0, 0, 255));
        btnPeliculas.setColorTextHover(new java.awt.Color(255, 255, 255));
        btnPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeliculasActionPerformed(evt);
            }
        });
        panelVenta.add(btnPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 120, 110, 40));

        tabla.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CAT-PERSONA", "NUM-PEROSNA", "N-PELICULA", "PRECIO-U", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        panelVenta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 1020, 140));

        txtApe.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtApe.setForeground(new java.awt.Color(255, 255, 255));
        txtApe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApe.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        panelVenta.add(txtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 260, 230, 40));

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("APELLIDOS:");
        panelVenta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("S/.");
        panelVenta.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 600, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("NOMBRES :");
        panelVenta.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("N - INGRESOS");
        panelVenta.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        txtDni.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDni.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        panelVenta.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 120, 40));

        txtIngreso.setEditable(false);
        txtIngreso.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtIngreso.setForeground(new java.awt.Color(255, 255, 255));
        txtIngreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIngreso.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 0)));
        panelVenta.add(txtIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 140, 40));

        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setText("Aforo");
        panelVenta.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Personas");
        panelVenta.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 90, -1));

        txtotalpagar.setEditable(false);
        txtotalpagar.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtotalpagar.setForeground(new java.awt.Color(255, 255, 255));
        txtotalpagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtotalpagar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        panelVenta.add(txtotalpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 580, 200, 80));

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setText("P.PERSONA");
        panelVenta.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, -1, -1));

        cbocanPersona.setBackground(new java.awt.Color(0, 0, 204));
        cbocanPersona.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cbocanPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Numero ", "    1", "    2", "    3", "    4", "    5", "    6", "    7", "    8" }));
        cbocanPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocanPersonaActionPerformed(evt);
            }
        });
        panelVenta.add(cbocanPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 90, 40));

        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 255));
        jLabel12.setText("DNI :");
        panelVenta.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        btnAceptar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptar1.setText("Eliminar");
        btnAceptar1.setColorHover(new java.awt.Color(204, 0, 0));
        btnAceptar1.setColorNormal(new java.awt.Color(204, 0, 0));
        btnAceptar1.setColorPressed(new java.awt.Color(204, 0, 0));
        btnAceptar1.setColorTextHover(new java.awt.Color(255, 255, 255));
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });
        panelVenta.add(btnAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 220, 70));

        btnNuveo.setBackground(new java.awt.Color(0, 204, 204));
        btnNuveo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuveo.setText("Nuevo");
        btnNuveo.setColorHover(new java.awt.Color(0, 153, 255));
        btnNuveo.setColorNormal(new java.awt.Color(0, 153, 255));
        btnNuveo.setColorPressed(new java.awt.Color(0, 153, 255));
        btnNuveo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuveoActionPerformed(evt);
            }
        });
        panelVenta.add(btnNuveo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 120, 70));

        txtpreU.setBackground(new java.awt.Color(255, 204, 0));
        txtpreU.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txtpreU.setForeground(new java.awt.Color(0, 0, 0));
        txtpreU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpreU.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        txtpreU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpreUActionPerformed(evt);
            }
        });
        panelVenta.add(txtpreU, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 100, 40));

        jLabel13.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 255));
        jLabel13.setText("NOMBRE DE PELICULA");
        panelVenta.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 204, 204)));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelVenta.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 640, 30));

        txtprecio.setEditable(false);
        txtprecio.setBackground(new java.awt.Color(0, 51, 204));
        txtprecio.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtprecio.setForeground(new java.awt.Color(255, 255, 255));
        txtprecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtprecio.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        panelVenta.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 40, 90, 40));

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TOTAL");
        panelVenta.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 80, -1));

        jLabel14.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 255, 255));
        jLabel14.setText("TOTAL DE PAGO");
        panelVenta.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 597, -1, 60));

        jEImagePanel1.add(panelVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1370, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed

  int posicion =this.PanelSlider.getX();
  if(posicion >-2){
 
      Animacion.Animacion.mover_izquierda(0, -307, 1, 2, PanelSlider);
  }else{
       Animacion.Animacion.mover_derecha(-307, 0, 1, 2,PanelSlider);
  }
    }//GEN-LAST:event_btnMenuActionPerformed
    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
    
        int posicion =this.panelVenta.getX();
         panelVenta.setVisible(true);
  if(posicion >-2){
      
      Animacion.Animacion.mover_derecha(-2000, 0, 15, 15, panelVenta);
  }else{
    
  }
    }//GEN-LAST:event_btnVentaActionPerformed
    private void btncerrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarVentaActionPerformed
     panelVenta.setVisible(false);
    }//GEN-LAST:event_btncerrarVentaActionPerformed
    private void btnPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeliculasActionPerformed
      Cartelera c= new Cartelera();
      c.setVisible(true);
    }//GEN-LAST:event_btnPeliculasActionPerformed
    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
      
    }//GEN-LAST:event_txtDniActionPerformed
    private void cboCatPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCatPersonaActionPerformed
     funcion();
    
    }//GEN-LAST:event_cboCatPersonaActionPerformed
    private void txtPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagoActionPerformed
     vuelto();
    }//GEN-LAST:event_txtPagoActionPerformed
    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
    
    }//GEN-LAST:event_txtprecioActionPerformed
    private void cbocanPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocanPersonaActionPerformed
      funcion2();
    }//GEN-LAST:event_cbocanPersonaActionPerformed
    private void txtpreUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpreUActionPerformed
int item;
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
  
        if (!"".equals(txtpreU.getText())) {
            String cateper = cboCatPersona.getSelectedItem().toString();
            String canper = cbocanPersona.getSelectedItem().toString();
            String nompeli = txtnombrepeli.getText();
            int pU = Integer.parseInt(txtpreU.getText());
            int tpgar = Integer.parseInt(txtprecio.getText());
            item = item + 1;
            modelo = (DefaultTableModel) tabla.getModel();
            ArrayList lista = new ArrayList();
            lista.add(item);
            lista.add(cateper);
            lista.add(canper);
            lista.add(nompeli);
            lista.add(pU);
            lista.add(tpgar);

            Object[] o = new Object[5];
            o[0] = lista.get(1);
            o[1] = lista.get(2);
            o[2] = lista.get(3);
            o[3] = lista.get(4);
            o[4] = lista.get(5);
            modelo.addRow(o);
            tabla.setModel(modelo);
            totalpagar();
            int canI = Integer.parseInt(txtIngreso.getText());
            int ingreso = canI + can;
            txtIngreso.setText("" + ingreso);
            
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar los datos de la pelicula");
        }
    
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnNuveoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuveoActionPerformed
      cbocanPersona.setSelectedIndex(0);txttp.setText("");txtpreU.setText("");txtotalpagar.setText("");txtNom.setText("");
      cboCatPersona.setSelectedIndex(0);txtPago.setText("");txtprecio.setText("");txtApe.setText("");
      cboCatPeli.setSelectedIndex(0);txtVuelto.setText("");txtnombrepeli.setText("");txtDni.setText("");
      
    }//GEN-LAST:event_btnNuveoActionPerformed
    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        modelo = (DefaultTableModel) tabla.getModel();
        modelo.removeRow(tabla.getSelectedRow());
        totalpagar();
       
    }//GEN-LAST:event_btnAceptar1ActionPerformed
    private void btnFactrua_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactrua_RegistrarActionPerformed
        RegistrarVenta();
        JOptionPane.showMessageDialog(null,"Boleta Generada");
       pdf();
       Limpiar();
    }//GEN-LAST:event_btnFactrua_RegistrarActionPerformed
   public void Limpiar(){
       cbocanPersona.setSelectedIndex(0);txttp.setText("");txtpreU.setText("");txtotalpagar.setText("");
      cboCatPersona.setSelectedIndex(0);txtPago.setText("");txtprecio.setText("");txtDni.setText("");
      cboCatPeli.setSelectedIndex(0);txtVuelto.setText("");txtnombrepeli.setText(""); txtNom.setText("");txtApe.setText("");
   }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelSlider;
    private LIB.FSButtonMD btnAceptar1;
    private javax.swing.JButton btnAgregar;
    private LIB.FSButtonMD btnFactrua_Registrar;
    private javax.swing.JButton btnMenu;
    private LIB.FSButtonMD btnNuveo;
    private LIB.FSButtonMD btnPeliculas;
    private LIB.FSButtonMD btnVenta;
    private javax.swing.JButton btncerrarVenta;
    private javax.swing.JComboBox<String> cboCatPeli;
    private javax.swing.JComboBox<String> cboCatPersona;
    private javax.swing.JComboBox<String> cbocanPersona;
    private LIB.FSButtonMD fSButtonMD1;
    private LIB.FSButtonMD fSButtonMD3;
    private LIB.FSButtonMD fSButtonMD4;
    private LIB.FSButtonMD fSButtonMD5;
    private LIB.JEImagePanel jEImagePanel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private LIB.JPanelTransparente panelVenta;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtVuelto;
    private javax.swing.JTextField txtaforo;
    private javax.swing.JLabel txtfecha;
    public static javax.swing.JTextField txtnombrepeli;
    private javax.swing.JTextField txtotalpagar;
    private javax.swing.JTextField txtpreU;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txttp;
    // End of variables declaration//GEN-END:variables
 Conexion con= new Conexion();
 Connection cn=con.getConnection();
 
 public void RegistrarVenta(){
     int dni=Integer.parseInt(txtDni.getText());String cat=cboCatPeli.getSelectedItem().toString();
     String nombre= txtNom.getText();String apellido= txtApe.getText();
     String nompeli=txtnombrepeli.getText(); String fecha=txtfecha.getText();
     int monto=tpagar;
     v.setDni(dni);
     v.setApellido(apellido); v.setCliente(nombre);
     v.setCategoriapeli(cat);v.setNompeli(nompeli);
     v.setFecha(fecha);v.setTpago(monto);
     vdo.RigistrarVenta(v);
 }
 public void funcion(){
      int opcion=cboCatPersona.getSelectedIndex();
      switch(opcion){
          case 1:{
              precio=20;
              pr=precio*can;
             txtprecio.setText(""+pr);
              txtpreU.setText(""+precio);
          }break;
             
          case 2:{
              precio=10;
              pr=precio*can;
             txtprecio.setText(""+pr);
             txtpreU.setText(""+precio);
             
          }break;
          
          default:{
               precio=0;
           }         
        }
  }
public void funcion2(){
      int opcion=cbocanPersona.getSelectedIndex();
      switch(opcion){
          case 1:{
              can=1;
              
              pr=can*precio;
             txtprecio.setText(""+pr);
            
            
          }break;
             
          case 2:{
               can=2;
             
              pr=can*precio;
             txtprecio.setText(""+pr);
            
         
          }break;
          
          default:{
               can=0;
           }         
        }
  }
public void vuelto(){
    int pago=Integer.parseInt(txtPago.getText()) ;
    int p=Integer.parseInt(txttp.getText()) ;
    mantenimiento m= new mantenimiento();
     vuelto=m.vuelto(pago, p);
     txtVuelto.setText(""+vuelto);
}
private void totalpagar(){
    tpagar=0;
    int nfila = tabla.getRowCount();
    for(int i=0;i< nfila;i++){
      int cal = Integer.parseInt(String.valueOf(tabla.getModel().getValueAt(i, 4)));
      tpagar=tpagar+cal;
    }
    txtotalpagar.setText(""+tpagar);
    txttp.setText(""+tpagar);

}
public static String fecha(){
          Date fecha = new Date ();
          SimpleDateFormat formatofecha=new  SimpleDateFormat("dd-MM-YYYY");
          return formatofecha.format(fecha);
      }
 private void pdf() {
        try {
            int id =vdo.IdVenta();
            FileOutputStream archivo;
            File file = new File("src/pdf/venta" + id + ".pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            Image img = Image.getInstance("src/Iconos/450_1000.jpg");

            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("Factura:" + id + "\n" + "Fecha: " + new SimpleDateFormat("\"dd/MM/YYYY\"").format(date) + "\n\n");

            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

            Encabezado.addCell(img);

            String ruc ="201234244565";
            String nom = "CINE GALLETA";
            String tel = "5123457";
            String dir = "AV.Lomo Largo 123";
          

            Encabezado.addCell("");
            Encabezado.addCell("Ruc: " + ruc + "\nNombre: " + nom + "\nTelefono: " + tel + "\nDireccion: " + dir );
            Encabezado.addCell(fecha);
            doc.add(Encabezado);

            Paragraph cli = new Paragraph();
            cli.add(Chunk.NEWLINE);
            cli.add("Datos del cliente" + "\n\n");
            doc.add(cli);

            PdfPTable tablacli = new PdfPTable(3);
            tablacli.setWidthPercentage(100);
            tablacli.getDefaultCell().setBorder(0);
            float[] Columnacli = new float[]{10f, 10f,10f};
            tablacli.setWidths(Columnacli);
            tablacli.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cl1 = new PdfPCell(new Phrase("DNI", negrita));
            PdfPCell cl2 = new PdfPCell(new Phrase("NOMBRES", negrita));
            PdfPCell cl3 = new PdfPCell(new Phrase("APELLIDOS", negrita));
         
            cl1.setBorder(0);
            cl2.setBorder(0);
            cl3.setBorder(0);
         
     
            tablacli.addCell(cl1);
            tablacli.addCell(cl2);
            tablacli.addCell(cl3);
      
          
            tablacli.addCell(txtDni.getText());
            tablacli.addCell(txtNom.getText());
            tablacli.addCell(txtApe.getText());
         

            doc.add(tablacli);

           //productos
            PdfPTable tablapro = new PdfPTable(5);
            tablapro.setWidthPercentage(100);
            tablapro.getDefaultCell().setBorder(0);
            float[] Columnapro = new float[]{10f, 20f, 10f, 10f,15F};
            tablapro.setWidths(Columnapro);
            tablapro.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell pro1 = new PdfPCell(new Phrase("Cat Persona", negrita));
            PdfPCell pro2 = new PdfPCell(new Phrase("N Personas", negrita));
            PdfPCell pro3 = new PdfPCell(new Phrase("Pelicula", negrita));
            PdfPCell pro4 = new PdfPCell(new Phrase("Precio U", negrita));
            PdfPCell pro5 = new PdfPCell(new Phrase("Total Pagar", negrita));
            pro1.setBorder(0);
            pro2.setBorder(0);
            pro3.setBorder(0);
            pro4.setBorder(0);
            pro5.setBorder(0);
            pro1.setBackgroundColor(BaseColor.CYAN);
            pro2.setBackgroundColor(BaseColor.CYAN);
            pro3.setBackgroundColor(BaseColor.CYAN);
            pro4.setBackgroundColor(BaseColor.CYAN);
            pro5.setBackgroundColor(BaseColor.CYAN);
            tablapro.addCell(pro1);
            tablapro.addCell(pro2);
            tablapro.addCell(pro3);
            tablapro.addCell(pro4);
            tablapro.addCell(pro5);
            for (int i = 0; i < tabla.getRowCount(); i++) {
                String catpeli = tabla.getValueAt(i, 0).toString();
                String nper = tabla.getValueAt(i, 1).toString();
                String npeli = tabla.getValueAt(i, 2).toString();
                String precioU = tabla.getValueAt(i, 3).toString();
                String totpagar = tabla.getValueAt(i, 4).toString();
                tablapro.addCell(catpeli);
                tablapro.addCell(nper);
                tablapro.addCell(npeli);
                tablapro.addCell(precioU);
                tablapro.addCell(totpagar);
            }
            doc.add(tablapro);

           Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Recibido: " + tpagar);
            info.setAlignment(Element.ALIGN_RIGHT);
            doc.add(info);

            Paragraph firma = new Paragraph();
            firma.add(Chunk.NEWLINE);
            firma.add("Disfrute la Pelicula\n\n");
            firma.setAlignment(Element.ALIGN_CENTER);
            doc.add(firma);

            Paragraph mensaje = new Paragraph();
            mensaje.add(Chunk.NEWLINE);
            mensaje.add("Gracias por su Preferencia");
            mensaje.setAlignment(Element.ALIGN_CENTER);
            doc.add(mensaje);
            doc.close();
            archivo.close();
            Desktop.getDesktop().open(file);
        } catch (DocumentException | IOException e) {
            System.out.println(e.toString());
        }
    }

}