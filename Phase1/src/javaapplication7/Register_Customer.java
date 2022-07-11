/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.ResultSet; 


/**
 *
 * @author FAHAD_ISHAQ
 */
public class Register_Customer extends javax.swing.JFrame {

    /**
     * Creates new form Register_Customer
     */
    public Register_Customer() {
        initComponents();
    }

       static boolean isValidEmail(String email) {
      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return email.matches(regex);
   }
     
       private boolean isValidCNIC(String cnic) {
        // condition to check whether CNIC contains any alphabets and CNIC has length of 13
        
        if (Pattern.matches("[a-zA-Z]+", cnic) == false && cnic.length() == 13) {
                   return true;
        } else
        return false;
    }
       
         private boolean isValidName(String name) {
        // condition to check whether CNIC contains any alphabets and CNIC has length of 13
        
        if (Pattern.matches("[a-zA-Z]+", name) == true && name.length() !=0) {
                   return true;
        } else
        return false;
    }
         
          private boolean isValidAddress(String address) {
        // condition to check whether CNIC contains any alphabets and CNIC has length of 13
        
        if (address.length()!=0) {
                   return true;
        } else
        return false;
    }
          
          
           private boolean isValidSalary(String salary) {
        // condition to check whether CNIC contains any alphabets and CNIC has length of 13
        
        if (salary.length()!=0) {
                   return true;
        } else
        return false;
    }
          
           private boolean isValidPhone(String phone) {
        // condition to check whether CNIC contains any alphabets and CNIC has length of 13
        
        if (Pattern.matches("[a-zA-Z]+", phone) == false && phone.length() ==11) {
                   return true;
        } else
        return false;
    }
           
            private boolean isValidPassword(String pass) {
        // condition to check whether CNIC contains any alphabets and CNIC has length of 13
        
        if ( pass.length() !=0) {
                   return true;
        } else
        return false;
    }
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        address = new javax.swing.JTextField();
        cnic = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        cancel1 = new javax.swing.JButton();
        add_customer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Customer Name: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 145, -1, 30));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 300, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Customer CNIC: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 185, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Customer Address: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 225, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Customer Gender: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 255, -1, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Customer Phone: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 295, -1, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Customer Email: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 335, -1, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Customer Password: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 375, -1, 50));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 300, -1));

        buttonGroup1.add(male);
        male.setText("Male");
        getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        buttonGroup1.add(female);
        female.setText("Female");
        getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, -1));

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 300, -1));

        cnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnicActionPerformed(evt);
            }
        });
        getContentPane().add(cnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 300, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 300, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 300, -1));

        cancel1.setBackground(new java.awt.Color(255, 255, 255));
        cancel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancel1.setText("BACK");
        cancel1.setSelected(true);
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });
        getContentPane().add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 160, 50));

        add_customer.setBackground(new java.awt.Color(255, 255, 255));
        add_customer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add_customer.setText("ADD CUSTOMER");
        add_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_customerActionPerformed(evt);
            }
        });
        getContentPane().add(add_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, 160, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/ADD_CUST.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void cnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnicActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        dispose();

        Customer_Option cust=new Customer_Option();
        cust.setLocationRelativeTo(null);
        cust.setVisible(true);
    }//GEN-LAST:event_cancel1ActionPerformed

    private void add_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_customerActionPerformed

        int cust_id=1;

        String cust_CNIC=cnic.getText();
        String cust_name=name.getText();
        String cust_address=address.getText();

        String cust_gender="";
        if (male.isSelected()){
            cust_gender+="M";
        }
        else if (female.isSelected()){
            cust_gender+="F";

        }

        String cust_phone=phone.getText();
        String cust_email=email.getText();
        String cust_password=password.getText();

        if (isValidEmail(cust_email)==false){
            JOptionPane.showMessageDialog(null, "INVALID EMAIL ADDRESS");

        }
        else if (isValidCNIC(cust_CNIC)==false){
            JOptionPane.showMessageDialog(null, "INVALID CNIC, CNIC MUST BE A 13 DIGIT NUMBER");

        }
        else if (isValidName(cust_name)==false){
            JOptionPane.showMessageDialog(null, "INVALID NAME");

        }
        else if (isValidAddress(cust_address)==false){
            JOptionPane.showMessageDialog(null, "INVALID ADDRESS");

        }
        else if (isValidPhone(cust_phone)==false){
            JOptionPane.showMessageDialog(null, "INVALID PHONE");

        }
        else if(isValidPassword(cust_password)==false){
            JOptionPane.showMessageDialog(null, "INVALID PASSWORD");

        }
        else{

            try
            {

                Class.forName("oracle.jdbc.OracleDriver");

                Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");

                Statement s=con.createStatement();

                java.sql.ResultSet rs=s.executeQuery("SELECT cust_id from customer");
                int b=0;
                while (rs.next())
                {
                    String a=String.valueOf(rs.getLong("cust_id"));
                    b=Integer.parseInt(a);
                    if (b==cust_id){
                        continue;
                    }else{

                        b++;
                    }

                }
                cust_id=b;
                con.close();
                System.out.println("Cst: "+cust_id);
            }

            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);

            }

            try
            {

                Class.forName("oracle.jdbc.OracleDriver");

                Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
                Statement s=con.createStatement();

                String l= "INSERT into customer(cust_id,cust_cnic,cust_name,cust_address,cust_phone_number,pasword,email,cust_gender) values('"+(cust_id+1)+"','"+cust_CNIC+"','"+cust_name+"','"+cust_address+"','"+cust_phone+"','"+cust_password+"','"+cust_email+"','"+cust_gender+"')";
                s.executeUpdate(l);
                JOptionPane.showMessageDialog(null,"Account Created Successfully");

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }

        }

    }//GEN-LAST:event_add_customerActionPerformed

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
            java.util.logging.Logger.getLogger(Register_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_customer;
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel1;
    private javax.swing.JTextField cnic;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables
}
