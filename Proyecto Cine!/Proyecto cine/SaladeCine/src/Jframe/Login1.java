
package Jframe;

import Alertas.Alerta;
import Alertas.Informacion;
import Alertas.Warnin;
import Clases.Conexion;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Login1 extends javax.swing.JFrame {
 int timer=0;  
 String user = "";
 String pass = ""; 
       public Login1() {
        initComponents();
        panelLoginContraseña.setVisible(false);
        txtusu.setBackground(new java.awt.Color(0,0,0,1));
        txtcon.setBackground(new java.awt.Color(0,0,0,1));
        txtdnir.setBackground(new java.awt.Color(0,0,0,1));
        txtcorreo.setBackground(new java.awt.Color(0,0,0,1));
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelLoginContraseña = new javax.swing.JPanel();
        jPanelTransparente2 = new LIB.JPanelTransparente();
        txtcorreo = new javax.swing.JTextField();
        txtdnir = new javax.swing.JTextField();
        fSButtonMD1 = new LIB.FSButtonMD();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCerrarLogin2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanelTransparente1 = new LIB.JPanelTransparente();
        txtusu = new LIB.JTexfieldPH_FielTex();
        txtcon = new LIB.JTexfieldPH_Password();
        btnIngresar = new rsbuttongradiente.RSButtonGradiente();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnolvidasteContraseña = new javax.swing.JButton();
        btnFacebook = new javax.swing.JButton();
        btnInstagran = new javax.swing.JButton();
        btnYoutube = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLoginContraseña.setBackground(new java.awt.Color(0, 0, 51));
        panelLoginContraseña.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTransparente2.setColorPrimario(new java.awt.Color(0, 102, 255));
        jPanelTransparente2.setColorSecundario(new java.awt.Color(0, 0, 51));
        jPanelTransparente2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcorreo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtcorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtcorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        jPanelTransparente2.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 170, 30));

        txtdnir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtdnir.setForeground(new java.awt.Color(255, 255, 255));
        txtdnir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdnir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        jPanelTransparente2.add(txtdnir, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 67, 170, 30));

        fSButtonMD1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fSButtonMD1.setText("Enviar");
        fSButtonMD1.setColorHover(new java.awt.Color(0, 0, 102));
        fSButtonMD1.setColorNormal(new java.awt.Color(0, 0, 102));
        fSButtonMD1.setColorPressed(new java.awt.Color(0, 0, 51));
        fSButtonMD1.setColorTextHover(new java.awt.Color(255, 255, 255));
        fSButtonMD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSButtonMD1ActionPerformed(evt);
            }
        });
        jPanelTransparente2.add(fSButtonMD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("CORREO:");
        jPanelTransparente2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("DNI :");
        jPanelTransparente2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 45, 50, 20));

        panelLoginContraseña.add(jPanelTransparente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 260, 290));

        btnCerrarLogin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/x-button.png"))); // NOI18N
        btnCerrarLogin2.setBorder(null);
        btnCerrarLogin2.setContentAreaFilled(false);
        btnCerrarLogin2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarLogin2ActionPerformed(evt);
            }
        });
        panelLoginContraseña.add(btnCerrarLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LOGIN2.gif"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 153, 204)));
        panelLoginContraseña.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 630, 390));

        jPanel1.add(panelLoginContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 430));

        jPanelTransparente1.setColorPrimario(new java.awt.Color(0, 0, 0));
        jPanelTransparente1.setColorSecundario(new java.awt.Color(0, 0, 51));
        jPanelTransparente1.setTran(0.5F);
        jPanelTransparente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtusu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 153)));
        txtusu.setForeground(new java.awt.Color(255, 0, 0));
        txtusu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusu.setOpaque(false);
        jPanelTransparente1.add(txtusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtcon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 153)));
        txtcon.setForeground(new java.awt.Color(255, 0, 0));
        txtcon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcon.setOpaque(false);
        jPanelTransparente1.add(txtcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(0, 0, 51));
        btnIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresar.setText("Aceptar");
        btnIngresar.setColorPrimario(new java.awt.Color(0, 0, 102));
        btnIngresar.setColorPrimarioHover(new java.awt.Color(0, 0, 153));
        btnIngresar.setColorSecundario(new java.awt.Color(0, 0, 51));
        btnIngresar.setColorSecundarioHover(new java.awt.Color(0, 0, 102));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanelTransparente1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 160, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USUARIO :");
        jPanelTransparente1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONTRASEÑA :");
        jPanelTransparente1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        btnolvidasteContraseña.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnolvidasteContraseña.setForeground(new java.awt.Color(255, 255, 255));
        btnolvidasteContraseña.setText("Olvidaste tu Contraseña");
        btnolvidasteContraseña.setBorder(null);
        btnolvidasteContraseña.setBorderPainted(false);
        btnolvidasteContraseña.setContentAreaFilled(false);
        btnolvidasteContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnolvidasteContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnolvidasteContraseñaActionPerformed(evt);
            }
        });
        jPanelTransparente1.add(btnolvidasteContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 160, -1));

        jPanel1.add(jPanelTransparente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 240, 290));

        btnFacebook.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFacebook.setForeground(new java.awt.Color(255, 255, 255));
        btnFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/facebook.png"))); // NOI18N
        btnFacebook.setText("Facebook");
        btnFacebook.setBorder(null);
        btnFacebook.setContentAreaFilled(false);
        btnFacebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacebookActionPerformed(evt);
            }
        });
        jPanel1.add(btnFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        btnInstagran.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInstagran.setForeground(new java.awt.Color(255, 255, 255));
        btnInstagran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/instagram.png"))); // NOI18N
        btnInstagran.setText("Instagram");
        btnInstagran.setBorder(null);
        btnInstagran.setContentAreaFilled(false);
        btnInstagran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInstagran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstagranActionPerformed(evt);
            }
        });
        jPanel1.add(btnInstagran, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        btnYoutube.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnYoutube.setForeground(new java.awt.Color(255, 255, 255));
        btnYoutube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/youtube.png"))); // NOI18N
        btnYoutube.setText("Youtube");
        btnYoutube.setBorder(null);
        btnYoutube.setContentAreaFilled(false);
        btnYoutube.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnYoutube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYoutubeActionPerformed(evt);
            }
        });
        jPanel1.add(btnYoutube, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/capi.gif"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 153)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 640, 310));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Iniciar Sesión");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 260, 40));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/x-button.png"))); // NOI18N
        btncerrar.setBorder(null);
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 50, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
      dispose();
    }//GEN-LAST:event_btncerrarActionPerformed
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       user=txtusu.getText();
       pass=txtcon.getText();
     if(!user.equals("")||!pass.equals("")){
            try{
                PreparedStatement ps=cn.prepareStatement("SELECT * FROM usuarios WHERE usuario='"+user
                        +"' AND contraseña='"+pass+"'");
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                  dispose();
                  Principal p= new Principal();
                  p.show();
                             
             }
             else  if(timer==2){
                   Warnin w= new Warnin();w.setVisible(true);
                     dispose();
               }
               else{
                    Alerta a= new Alerta();a.setVisible(true);
                    int r=0;
                    r=2-timer;
                    a.xk.setText(""+r);
                                       txtusu.setText("");
                    txtcon.setText("");
                    timer=timer+1;
                }
             
            }catch(SQLException e){
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Error al iniciar el sistema...Contacte  a Maykol Alvarez");  
            }
            
        }
  
        else{
            Informacion i= new Informacion();i.setVisible(true);
        }
       
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacebookActionPerformed
        try{
        Desktop.getDesktop().browse(URI.create("https://www.facebook.com/"));
    }catch(IOException ex){
        System.err.println("Error:"+ex);
    } 
    }//GEN-LAST:event_btnFacebookActionPerformed
    private void btnYoutubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYoutubeActionPerformed
         try{
        Desktop.getDesktop().browse(URI.create("https://www.youtube.com/channel/UCMdBKJU5i-1TJEfIRBJcStg"));
    }catch(IOException ex){
        System.err.println("Error:"+ex);
    } 
    }//GEN-LAST:event_btnYoutubeActionPerformed
    private void btnInstagranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstagranActionPerformed
          try{
        Desktop.getDesktop().browse(URI.create("https://www.instagram.com/accounts/login/?hl=es-la"));
    }catch(IOException ex){
        System.err.println("Error:"+ex);
    } 
    }//GEN-LAST:event_btnInstagranActionPerformed
    private void btnolvidasteContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnolvidasteContraseñaActionPerformed
        panelLoginContraseña.setVisible(true);
        int posicion =this.panelLoginContraseña.getY();
  if(posicion >-2){
      
      Animacion.Animacion.mover_derecha(-700, 0, 1, 2,panelLoginContraseña);
     
  }else{
    
  }
    }//GEN-LAST:event_btnolvidasteContraseñaActionPerformed

    private void btnCerrarLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarLogin2ActionPerformed
      panelLoginContraseña.setVisible(false);
    }//GEN-LAST:event_btnCerrarLogin2ActionPerformed

    private void fSButtonMD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSButtonMD1ActionPerformed
          try {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);

            String correoRemitente = "maykolalvarez372@gmail.com";
            String passwordRemitente = "maykol2294esc";
            String correoReceptor = txtcorreo.getText();
            String asunto = "Solicitud de Recuperacion de Contraseña";
            String mensaje =txtdnir.getText()+" ...Olvido su Contraseña";

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setText(mensaje, "ISO-8859-1", "html");

            Transport t = session.getTransport("smtp");
            t.connect(correoRemitente, passwordRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();

            JOptionPane.showMessageDialog(null, "Solicitud Enviada al Administrador");

        } catch (AddressException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fSButtonMD1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarLogin2;
    private javax.swing.JButton btnFacebook;
    private rsbuttongradiente.RSButtonGradiente btnIngresar;
    private javax.swing.JButton btnInstagran;
    private javax.swing.JButton btnYoutube;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btnolvidasteContraseña;
    private LIB.FSButtonMD fSButtonMD1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private LIB.JPanelTransparente jPanelTransparente1;
    private LIB.JPanelTransparente jPanelTransparente2;
    private javax.swing.JPanel panelLoginContraseña;
    private LIB.JTexfieldPH_Password txtcon;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdnir;
    private LIB.JTexfieldPH_FielTex txtusu;
    // End of variables declaration//GEN-END:variables
Conexion con= new Conexion();
Connection cn=con.getConnection();
}