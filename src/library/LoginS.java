/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class LoginS extends javax.swing.JFrame 
{
    /**
     * Creates new form LoginS
     */
    private Toolkit t;
    public LoginS() {
        t=Toolkit.getDefaultToolkit();
        initComponents();
        Image i = t.getImage("tick.png").getScaledInstance(40,40, Image.SCALE_SMOOTH);
        ImageIcon im = new ImageIcon(i);
        sub.setIcon(im);
        i=t.getImage("back.png").getScaledInstance(40 , 40,Image.SCALE_SMOOTH);
        im=new ImageIcon(i);
        bac.setIcon(im);
        i=t.getImage("cus_login.png").getScaledInstance(180 , 40,Image.SCALE_SMOOTH);
        im=new ImageIcon(i);
        cus.setIcon(im);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        sbutton = new javax.swing.JButton();
        regtext = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        sub = new javax.swing.JLabel();
        bac = new javax.swing.JLabel();
        cus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("library.png").getImage());

        sbutton.setText("Submit");
        sbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbuttonActionPerformed(evt);
            }
        });
        sbutton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sbuttonKeyPressed(evt);
            }
        });

        jLabel1.setText("Registartion no.");

        jButton1.setText("Back");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Change Password");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cus, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sbutton)
                        .addGap(25, 25, 25)
                        .addComponent(bac, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 139, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(regtext)
                                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regtext))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bac, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(sbutton))
                            .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void show(String t) throws SQLException
    {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select reg from students where reg='"+t+"'");
        if(rs.next())
        {
            String enter_pass=Notif_Time.hash(new String(pass.getPassword()));
            System.out.println("Hash: "+enter_pass);
            rs=st.executeQuery("select password from students where reg='"+t+"'");
            rs.next();
            if(enter_pass.equals(rs.getString(1)))
            {
                Student_Menu obj2 = new Student_Menu(t);
                //obj2.setLocation(400,400);
                obj2.setTitle("Student Menu");
                obj2.setVisible(true);
                dispose();
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "Wrong Password");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid Registration Number");
            Startup obj3=new Startup();
            //obj3.setLocation(400,400);
            obj3.setTitle("StartUp Page");
            obj3.setVisible(true);
            dispose();
        }
    }
    private void sbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbuttonActionPerformed
        // TODO add your handling code here:
        String t=regtext.getText();
        t=t.toUpperCase();
        if(t.length()==9)
        {
            try 
            {
                show(t);
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(LoginS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            try {
                Startup obj=new Startup();
                //obj.setLocation(400,400);
                obj.setTitle("Start up Page");
                obj.setVisible(true);
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(LoginS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_sbuttonActionPerformed

    private void sbuttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sbuttonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String t=regtext.getText();
            t=t.toUpperCase();
        if(t.length()==9)
        {
            try 
            {
                show(t);
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(LoginS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
                try {
                    Startup obj=new Startup();
                    //obj.setLocation(400,400);
                    obj.setTitle("Start up Page");
                    obj.setVisible(true);
                    dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginS.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        }
    }//GEN-LAST:event_sbuttonKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            Startup obj=new Startup();
            obj.setTitle("Startup Page");
            obj.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(LoginS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==com.sun.glass.events.KeyEvent.VK_ENTER)
        {
            try {
                Startup obj = new Startup();
                obj.setTitle("Startup Page");
                obj.setVisible(true);
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(LoginS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            // TODO add your handling code here:
            ChangePassword obj=new ChangePassword(regtext.getText());
            obj.setTitle("Change Password");
            obj.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(LoginS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LoginS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        /*java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoginS().setVisible(true);
//            }
//        });*/
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bac;
    private javax.swing.JLabel cus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField regtext;
    private javax.swing.JButton sbutton;
    private javax.swing.JLabel sub;
    // End of variables declaration//GEN-END:variables
}