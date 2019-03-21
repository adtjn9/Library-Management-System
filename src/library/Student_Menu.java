/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Student_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Student_Menu
     */
    String reg="";
    public Toolkit t2;
    public Student_Menu(String t) 
    {
        reg=t;
        t2=Toolkit.getDefaultToolkit();
        initComponents();
        
        Image i = t2.getImage("Issue-Book.jpg").getScaledInstance(60,60, Image.SCALE_SMOOTH);
        ImageIcon im = new ImageIcon(i);
        issue_lab.setIcon(im);
        i=t2.getImage("book_return.jpg").getScaledInstance(60,60, Image.SCALE_SMOOTH);
        im=new ImageIcon(i);
        book_return_lab.setIcon(im);
        i=t2.getImage("back.png").getScaledInstance(30 , 30,Image.SCALE_SMOOTH);
        im=new ImageIcon(i);
        bac.setIcon(im);
         i=t2.getImage("renew.png").getScaledInstance(60 , 60,Image.SCALE_SMOOTH);
        im=new ImageIcon(i);
        renew_lab.setIcon(im);
         i=t2.getImage("account.png").getScaledInstance(60 , 60,Image.SCALE_SMOOTH);
        im=new ImageIcon(i);
        account_lab.setIcon(im);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        issue = new javax.swing.JButton();
        leave = new javax.swing.JButton();
        renew = new javax.swing.JButton();
        account = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        issue_lab = new javax.swing.JLabel();
        book_return_lab = new javax.swing.JLabel();
        bac = new javax.swing.JLabel();
        renew_lab = new javax.swing.JLabel();
        account_lab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("library.png").getImage());

        issue.setText("Issue");
        issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueActionPerformed(evt);
            }
        });
        issue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                issueKeyPressed(evt);
            }
        });

        leave.setText("Return");
        leave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveActionPerformed(evt);
            }
        });
        leave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                leaveKeyPressed(evt);
            }
        });

        renew.setText("Renew");
        renew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renewActionPerformed(evt);
            }
        });
        renew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                renewKeyPressed(evt);
            }
        });

        account.setText("Accounts");
        account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountActionPerformed(evt);
            }
        });
        account.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                accountKeyPressed(evt);
            }
        });

        jButton1.setText("Back");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(bac, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(issue_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(issue, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(renew_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(renew, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(book_return_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(leave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(account_lab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(issue))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(leave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(issue_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(book_return_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(renew))
                                    .addComponent(renew_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(account_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(account)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public  void account() throws SQLException
    {
        
        Account obj=new Account(reg);
        obj.setTitle("Account_Details");
        obj.setVisible(true);
        //obj.setLocation(300,300);
        this.setVisible(false);
        dispose();
    }
    public boolean issue() throws SQLException
    {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select BOOK_COUNT from students where reg = '"+reg+"'");
        rs.next();
        if(rs.getInt(1)==3)
        {
           return false;
        }
        else
        {
            return true;
        }
    }
    private void issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueActionPerformed
        // TODO add your handling code here:
        boolean res=false;
        try 
        {
            res = issue();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Student_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(res==true)
        {
            Search_Menu obj=new Search_Menu("issue",reg);
            obj.setTitle("Search Menu ");
            //obj.setLocation(400,400);
            obj.setVisible(true);
            dispose();
        }
        else
        {
            try {
                JOptionPane.showMessageDialog(null, "You have already issued three books");
                Startup obj=new Startup();
                obj.setTitle("Start up");
                //obj.setLocation(400,400);
                obj.setVisible(true);
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(Student_Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_issueActionPerformed

    private void accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountActionPerformed
        try 
        {
            account();
        } catch (SQLException ex) 
        {
            Logger.getLogger(Student_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_accountActionPerformed

    private void renewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renewActionPerformed
        try {
            // TODO add your handling code here:
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from students where reg='" + reg + "'");
            rs.next();
            if(rs.getInt("BOOK_COUNT")==0)
                JOptionPane.showMessageDialog(null, "You have not issued any books:");
            else
                renew();
        } catch (SQLException ex) {
            Logger.getLogger(Student_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_renewActionPerformed

    private void leaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveActionPerformed
        try {
            // TODO add your handling code here:
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from students where reg='" + reg + "'");
            rs.next();
            if(rs.getInt("BOOK_COUNT")==0)
                JOptionPane.showMessageDialog(null, "You have not issued any books:");
            else
                leave();
        } catch (SQLException ex) {
            Logger.getLogger(Student_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_leaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginS obj=new LoginS();
        obj.setTitle("Enter details:");
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void issueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_issueKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            boolean res=false;
        try 
        {
            res = issue();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Student_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(res==true)
        {
            Search_Menu obj=new Search_Menu("issue",reg);
            obj.setTitle("Search Menu ");
            //obj.setLocation(400,400);
            obj.setVisible(true);
            dispose();
        }
        else
        {
                try {
                    JOptionPane.showMessageDialog(null, "You have already issued three books");
                    Startup obj=new Startup();
                    obj.setTitle("Start up");
                    //obj.setLocation(400,400);
                    obj.setVisible(true);
                    dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(Student_Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        }
    }//GEN-LAST:event_issueKeyPressed

    private void leaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leaveKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try {
            // TODO add your handling code here:
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from students where reg='" + reg + "'");
            rs.next();
            if(rs.getInt("BOOK_COUNT")==0)
                JOptionPane.showMessageDialog(null, "You have not issued any books:");
            else
                leave();
        } catch (SQLException ex) {
            Logger.getLogger(Student_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_leaveKeyPressed

    private void renewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_renewKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try {
            // TODO add your handling code here:
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from students where reg='" + reg + "'");
            rs.next();
            if(rs.getInt("BOOK_COUNT")==0)
                JOptionPane.showMessageDialog(null, "You have not issued any books:");
            else
                renew();
        } catch (SQLException ex) {
            Logger.getLogger(Student_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_renewKeyPressed

    private void accountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try 
        {
            account();
        } catch (SQLException ex) 
        {
            Logger.getLogger(Student_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_accountKeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            LoginS obj=new LoginS();
        obj.setTitle("Enter details:");
        obj.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_jButton1KeyPressed
    public void leave() throws SQLException
    {
        Return obj=new Return(reg);
        obj.setTitle("Account_Details");
        obj.setVisible(true);
        //obj.setLocation(300,300);
        dispose();
    }

    public void renew() throws SQLException {
        Renew obj = new Renew(reg);
        obj.setTitle("Account_Details");
        obj.setVisible(true);
        //obj.setLocation(300,300);
        dispose();
    }
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
//            java.util.logging.Logger.getLogger(Student_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Student_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Student_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Student_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        /*java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Student_Menu().setVisible(true);
//            }
//        });*/
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account;
    private javax.swing.JLabel account_lab;
    private javax.swing.JLabel bac;
    private javax.swing.JLabel book_return_lab;
    private javax.swing.JButton issue;
    private javax.swing.JLabel issue_lab;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton leave;
    private javax.swing.JButton renew;
    private javax.swing.JLabel renew_lab;
    // End of variables declaration//GEN-END:variables
}