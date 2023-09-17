
package Jframe;

import javax.swing.JOptionPane;

public class Cartelera extends javax.swing.JFrame {

    public Cartelera() {
        initComponents();
        this.setLocationRelativeTo(null);
        opaque();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menu1 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        menu2 = new javax.swing.JMenuItem();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        menu3 = new javax.swing.JMenuItem();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        menu4 = new javax.swing.JMenuItem();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        menu5 = new javax.swing.JMenuItem();
        jPopupMenu6 = new javax.swing.JPopupMenu();
        menu6 = new javax.swing.JMenuItem();
        jPopupMenu7 = new javax.swing.JPopupMenu();
        menu7 = new javax.swing.JMenuItem();
        jPopupMenu8 = new javax.swing.JPopupMenu();
        menu8 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        peli4 = new javax.swing.JTextField();
        peli8 = new javax.swing.JTextField();
        peli2 = new javax.swing.JTextField();
        peli3 = new javax.swing.JTextField();
        peli1 = new javax.swing.JTextField();
        peli5 = new javax.swing.JTextField();
        peli6 = new javax.swing.JTextField();
        peli7 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();

        menu1.setText("Enviar");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menu1);

        menu2.setText("Enviar");
        jPopupMenu2.add(menu2);

        menu3.setText("Enviar");
        jPopupMenu3.add(menu3);

        menu4.setText("Enviar");
        jPopupMenu4.add(menu4);

        menu5.setText("Enviar");
        jPopupMenu5.add(menu5);

        menu6.setText("Enviar");
        jPopupMenu6.add(menu6);

        menu7.setText("Enviar");
        jPopupMenu7.add(menu7);

        menu8.setText("Enviar");
        jPopupMenu8.add(menu8);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(0, 0, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        peli4.setBackground(new java.awt.Color(0, 0, 204));
        peli4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        peli4.setForeground(new java.awt.Color(204, 204, 204));
        peli4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peli4.setText("PELICULA 4");
        peli4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        peli4.setComponentPopupMenu(jPopupMenu4);
        peli4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(peli4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 210, 240));

        peli8.setBackground(new java.awt.Color(0, 0, 204));
        peli8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        peli8.setForeground(new java.awt.Color(204, 204, 204));
        peli8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peli8.setText("PELICULA 8");
        peli8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        peli8.setComponentPopupMenu(jPopupMenu8);
        peli8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(peli8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 210, 240));

        peli2.setBackground(new java.awt.Color(0, 0, 204));
        peli2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        peli2.setForeground(new java.awt.Color(204, 204, 204));
        peli2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peli2.setText("PELICULA 2");
        peli2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        peli2.setComponentPopupMenu(jPopupMenu2);
        peli2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(peli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 210, 240));

        peli3.setBackground(new java.awt.Color(0, 0, 204));
        peli3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        peli3.setForeground(new java.awt.Color(204, 204, 204));
        peli3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peli3.setText("PELICULA 3");
        peli3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        peli3.setComponentPopupMenu(jPopupMenu3);
        peli3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(peli3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 210, 240));

        peli1.setBackground(new java.awt.Color(0, 0, 204));
        peli1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        peli1.setForeground(new java.awt.Color(204, 204, 204));
        peli1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peli1.setText("PELICULA 1");
        peli1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        peli1.setComponentPopupMenu(jPopupMenu1);
        peli1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(peli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 210, 240));

        peli5.setBackground(new java.awt.Color(0, 0, 204));
        peli5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        peli5.setForeground(new java.awt.Color(204, 204, 204));
        peli5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peli5.setText("PELICULA 5");
        peli5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        peli5.setComponentPopupMenu(jPopupMenu5);
        peli5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(peli5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 210, 240));

        peli6.setBackground(new java.awt.Color(0, 0, 204));
        peli6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        peli6.setForeground(new java.awt.Color(204, 204, 204));
        peli6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peli6.setText("PELICULA 6");
        peli6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        peli6.setComponentPopupMenu(jPopupMenu6);
        peli6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(peli6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 210, 240));

        peli7.setBackground(new java.awt.Color(0, 0, 204));
        peli7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        peli7.setForeground(new java.awt.Color(204, 204, 204));
        peli7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        peli7.setText("PELICULA 7");
        peli7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        peli7.setComponentPopupMenu(jPopupMenu7);
        peli7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(peli7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 210, 240));

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/450_1000.jpg"))); // NOI18N
        btn1.setText("jButton1");
        btn1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 210, 240));

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/sa_Coma_SB_BB-copy_430-thumb-860x860-79295.jpg"))); // NOI18N
        btn2.setText("jButton1");
        btn2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 210, 240));

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/avenger.jpg"))); // NOI18N
        btn4.setText("jButton1");
        btn4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 210, 240));

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/450_1000.jpg"))); // NOI18N
        btn3.setText("jButton1");
        btn3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 210, 240));

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/avenger.jpg"))); // NOI18N
        btn5.setText("jButton1");
        btn5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 210, 240));

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/terror.jpg"))); // NOI18N
        btn6.setText("jButton1");
        btn6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 210, 240));

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/450_1000.jpg"))); // NOI18N
        btn7.setText("jButton1");
        btn7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 210, 240));

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/dibujo.jpg"))); // NOI18N
        btn8.setText("jButton1");
        btn8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 210, 240));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENU DE PELICULAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 680, 30));

        cerrar.setBackground(new java.awt.Color(153, 153, 153));
        cerrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cerrar.setForeground(new java.awt.Color(0, 0, 0));
        cerrar.setText("Cerrar");
        cerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       peli1.setVisible(true);
    }//GEN-LAST:event_btn1ActionPerformed
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       peli2.setVisible(true);
    }//GEN-LAST:event_btn2ActionPerformed
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       peli3.setVisible(true);
    }//GEN-LAST:event_btn3ActionPerformed
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       peli4.setVisible(true);
    }//GEN-LAST:event_btn4ActionPerformed
    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       peli5.setVisible(true);
    }//GEN-LAST:event_btn5ActionPerformed
    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       peli6.setVisible(true);
    }//GEN-LAST:event_btn6ActionPerformed
    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       peli7.setVisible(true);
    }//GEN-LAST:event_btn7ActionPerformed
    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
      peli8.setVisible(true);
    }//GEN-LAST:event_btn8ActionPerformed
    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
   String info= peli1.getText();
   Principal.txtnombrepeli.setText(info);

   JOptionPane.showMessageDialog(null,"Enviado");
   peli1.setVisible(false);
 
    
    }//GEN-LAST:event_menu1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cartelera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    private javax.swing.JPopupMenu jPopupMenu6;
    private javax.swing.JPopupMenu jPopupMenu7;
    private javax.swing.JPopupMenu jPopupMenu8;
    private javax.swing.JMenuItem menu1;
    private javax.swing.JMenuItem menu2;
    private javax.swing.JMenuItem menu3;
    private javax.swing.JMenuItem menu4;
    private javax.swing.JMenuItem menu5;
    private javax.swing.JMenuItem menu6;
    private javax.swing.JMenuItem menu7;
    private javax.swing.JMenuItem menu8;
    public static javax.swing.JTextField peli1;
    private javax.swing.JTextField peli2;
    private javax.swing.JTextField peli3;
    private javax.swing.JTextField peli4;
    private javax.swing.JTextField peli5;
    private javax.swing.JTextField peli6;
    private javax.swing.JTextField peli7;
    private javax.swing.JTextField peli8;
    // End of variables declaration//GEN-END:variables

    
    public void opaque(){
        peli1.setVisible(false);
        peli2.setVisible(false);
        peli3.setVisible(false);
        peli4.setVisible(false);
        peli5.setVisible(false);
        peli6.setVisible(false);
        peli7.setVisible(false);
        peli8.setVisible(false);
    }
}
