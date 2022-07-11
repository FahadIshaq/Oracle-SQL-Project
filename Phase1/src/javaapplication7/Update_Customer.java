/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author FAHAD_ISHAQ
 */
public class Update_Customer extends javax.swing.JFrame {

    /**
     * Creates new form Update_Customer
     */
    public Update_Customer() {
        initComponents();
    }
    public void set_text(String num){
              try 
        {
            Class.forName("oracle.jdbc.OracleDriver");
	 
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
             java.sql.Statement s=con.createStatement();

            
            java.sql.ResultSet rs=s.executeQuery("select * from customer where cust_cnic='"+num+"'");
            
            while (rs.next())
            {
              
               String nm=String.valueOf(rs.getString("cust_name"));
               String ad=String.valueOf(rs.getString("cust_address"));
               String ph=String.valueOf(rs.getString("cust_phone_number"));
               String mail=String.valueOf(rs.getString("email"));
               String pss=String.valueOf(rs.getString("pasword"));
               
               
         name.setText(nm);
         address.setText(ad);
         phone.setText(ph);
         emaill.setText(mail);
         password.setText(pss);
      
            
            }
            
            
        }
        catch(Exception e){ 
				JOptionPane.showMessageDialog(null, e);
                                
			}  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emaill = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        password = new javax.swing.JTextField();
        find = new javax.swing.JButton();
        cancel1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Search By Customer CNIC: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, 40));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 300, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Customer Name: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 300, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Customer Password: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, 20));

        emaill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emaillActionPerformed(evt);
            }
        });
        getContentPane().add(emaill, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 300, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Customer Address: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 275, -1, 30));

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 300, 20));

        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setText("Customer Email : ");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Customer Phone: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 300, -1));

        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setText("UPDATE CUSTOMER");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 160, 50));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 300, -1));

        find.setBackground(new java.awt.Color(255, 255, 255));
        find.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        find.setText("Find");
        find.setSelected(true);
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        getContentPane().add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 60, -1));

        cancel1.setBackground(new java.awt.Color(255, 255, 255));
        cancel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancel1.setText("BACK");
        cancel1.setSelected(true);
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });
        getContentPane().add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/CUSTTT.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void emaillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emaillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emaillActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        
         String n=name.getText();
         String a=address.getText();
         String p=phone.getText();
         String e=emaill.getText();
         String pass=password.getText();
         
        
             try 
        {
            Class.forName("oracle.jdbc.OracleDriver");
			  
	      Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
             java.sql.Statement s=con.createStatement();
            String l= "UPDATE customer set cust_name='"+n+"',cust_phone_number='"+p+"',cust_address='"+a+"',email='"+e+"',pasword='"+pass+"' where cust_cnic='"+id.getText()+ "'";

            s.executeUpdate(l);
            JOptionPane.showMessageDialog(null,"CUSTOMER RECORD UPDATED SUCCESSFULY");
        
        }
             catch (Exception ex){
              JOptionPane.showMessageDialog(null,ex);

             }
        
        
        
    }//GEN-LAST:event_updateActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        set_text(id.getText());

    }//GEN-LAST:event_findActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        dispose();
        admin_customer cust=new admin_customer();
        cust.setLocationRelativeTo(null);
        cust.setVisible(true);
    }//GEN-LAST:event_cancel1ActionPerformed

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
            java.util.logging.Logger.getLogger(Update_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton cancel1;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emaill;
    private javax.swing.JButton find;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phone;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
