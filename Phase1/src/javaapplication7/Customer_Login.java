/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.ResultSet; 


/**
 *
 * @author FAHAD_ISHAQ
 */
public class Customer_Login extends javax.swing.JFrame {
    public static int id;
    

    /**
     * Creates new form Customer_Login
     */
    public Customer_Login() {
        initComponents();
        
       
        
    }
    
    
    
    public void setid(int new_id){
     this.id=new_id;
     
 }
 public int getid(){
     return id; 
 }
 

  public int id() {
  
      
       String p = String.valueOf(jPasswordField1.getPassword());
        
        
        System.out.println("p ha "+p);
        try 
        {
            //JavaConnection j1=new JavaConnection();
            Class.forName("oracle.jdbc.OracleDriver");
			  
			//step2 create  the connection object  jdbc:oracle:thin:tiger/scott@localhost:1521:productDB
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
            String l= "select cust_id from CUSTOMER where EMAIL='"+jTextField1.getText()+"' and PASWORD='"+p+"'";
            
           
            
            ResultSet rs= s.executeQuery(l);
            if (rs.next())
            {
//                JOptionPane.showMessageDialog(null, "Sucessfully Login"); 
                String customer_id=String.valueOf(rs.getString("cust_id"));
                System.out.print(customer_id);
                 int cust_id;

                 cust_id= Integer.parseInt(customer_id);
                 
                 id= cust_id;
                 setid(cust_id);
                
      
            }
            
        
        }
        catch(Exception e){
            	JOptionPane.showMessageDialog(null, e);
            }
        
       
    
        
        return id;
      
      
      
  }
    
    
    
    
    
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 240, 50));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 240, 50));

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        login.setText("LOGIN");
        login.setSelected(true);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 160, 50));

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancel.setText("CANCEL");
        cancel.setSelected(true);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/customer.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
              String p = String.valueOf(jPasswordField1.getPassword());
        
        try 
        {
            //JavaConnection j1=new JavaConnection();
            Class.forName("oracle.jdbc.OracleDriver");
			  
			//step2 create  the connection object  jdbc:oracle:thin:tiger/scott@localhost:1521:productDB
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
            String l= "select * from CUSTOMER where EMAIL='"+jTextField1.getText()+"' and PASWORD='"+p+"'";
            
           
            
            ResultSet rs= s.executeQuery(l);
            if (rs.next())
            {
                JOptionPane.showMessageDialog(null, "Sucessfully Login"); 
                String customer_id=String.valueOf(rs.getString("cust_id"));
                id=Integer.parseInt(customer_id);
               
                Customer_Frame g =new Customer_Frame();
         g.setLocationRelativeTo(null);
           g.setVisible(true);
     
            }
             else
             {
              JOptionPane.showMessageDialog(null, "Invalid email or password");       
                     }
        
        }
        catch(Exception e){
            	JOptionPane.showMessageDialog(null, e);
            }
        
               
    }//GEN-LAST:event_loginActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
        Customer_Option add_cust =new Customer_Option();
         add_cust.setSize(1191,632);
        add_cust.setLocationRelativeTo(null);
        add_cust.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Customer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
