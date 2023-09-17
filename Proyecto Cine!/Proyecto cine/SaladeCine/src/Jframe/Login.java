
package Jframe;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Login extends javax.swing.JFrame {
private final JFXPanel jfxPanel = new JFXPanel();
    public Login() {
        initComponents();
       
        this.setLocationRelativeTo(null);
      
        initComponents();
        initComponents();
        createScene();
         setResizable(false);
        setLocationRelativeTo(null);
        //Añadimos el panel de JavaFX al JPanel Swing
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(jfxPanel,BorderLayout.CENTER);
    }
    private void createScene(){
        Platform.runLater(new Runnable() {
             @Override
             public void run() {                 
                File file = new File("C:\\Users\\armando\\Downloads\\capi.mp4");                                  
                    MediaPlayer oracleVid = new MediaPlayer(                                       
                        new Media(file.toURI().toString())
                    );
                    //se añade video al jfxPanel
                    jfxPanel.setScene(new Scene(new Group(new MediaView(oracleVid))));                    
                    oracleVid.setVolume(0.1);//volumen
                    oracleVid.setCycleCount(MediaPlayer.INDEFINITE);//repite video
                    oracleVid.play();//play video
             }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelTransparente1 = new LIB.JPanelTransparente();
        rSButtonGradiente1 = new rsbuttongradiente.RSButtonGradiente();
        fSTexFieldMD2 = new LIB.FSTexFieldMD();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 102)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTransparente1.setColorPrimario(new java.awt.Color(0, 0, 0));
        jPanelTransparente1.setColorSecundario(new java.awt.Color(0, 0, 51));
        jPanelTransparente1.setTran(0.9F);
        jPanelTransparente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonGradiente1.setBackground(new java.awt.Color(0, 0, 0));
        rSButtonGradiente1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rSButtonGradiente1.setText("Ingresar");
        rSButtonGradiente1.setColorPrimario(new java.awt.Color(0, 0, 102));
        rSButtonGradiente1.setColorPrimarioHover(new java.awt.Color(0, 0, 51));
        rSButtonGradiente1.setColorSecundario(new java.awt.Color(0, 0, 51));
        rSButtonGradiente1.setColorSecundarioHover(new java.awt.Color(0, 0, 204));
        jPanelTransparente1.add(rSButtonGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 200, 164, -1));

        fSTexFieldMD2.setText("fSTexFieldMD2");
        jPanelTransparente1.add(fSTexFieldMD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 157, -1));

        jPanel1.add(jPanelTransparente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 250, 260));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar Sesíon");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSTexFieldMD fSTexFieldMD2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private LIB.JPanelTransparente jPanelTransparente1;
    private rsbuttongradiente.RSButtonGradiente rSButtonGradiente1;
    // End of variables declaration//GEN-END:variables
}
