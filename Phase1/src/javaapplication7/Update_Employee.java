/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author FAHAD_ISHAQ
 */
public class Update_Employee extends javax.swing.JFrame {

    /**
     * Creates new form Update_Employee
     */
    public Update_Employee() {
        initComponents();
    }
    
     public void set_text(String num){
        
              try 
        {
            Class.forName("oracle.jdbc.OracleDriver");
	 
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
             java.sql.Statement s=con.createStatement();

            
            java.sql.ResultSet rs=s.executeQuery("select * from staff where emp_id='"+num+"'");
            
            while (rs.next())
            {
              
               String nm=String.valueOf(rs.getString("emp_name"));
               String ad=String.valueOf(rs.getString("emp_address"));
               String ph=String.valueOf(rs.getString("emp_contact"));
               String typee=String.valueOf(rs.getString("emp_job"));
               String sal=String.valueOf(rs.getString("emp_salary"));
               
               
         name.setText(nm);
         address.setText(ad);
         phone.setText(ph);
         
          if (typee.equals("MANAGER")){
                  
                   manager.setSelected(true);
               }
               else if (typee.equals("COOK")){
                  
                   cook.setSelected(true);
                   
               }else if (typee.equals("SECURITY")){
                   security.setSelected(true);
               }else if (typee.equals("MANAGEMENT")){
                   management.setSelected(true);
                   
               }
               
      
         salary.setText(sal);
      
            
            }
            
            
        }
        catch(Exception e){ 
				JOptionPane.showMessageDialog(null, "No Record");
                                
			}  
              
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cancel1 = new javax.swing.JButton();
        find = new javax.swing.JButton();
        manager = new javax.swing.JRadioButton();
        cook = new javax.swing.JRadioButton();
        security = new javax.swing.JRadioButton();
        management = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Employee Salary: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Search By Employee CNIC: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 100, 170, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Employee Name: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Employee Address: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryActionPerformed(evt);
            }
        });
        getContentPane().add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 300, -1));

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 300, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 300, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 300, -1));

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setText("UPDATE EMPLOYEE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, 160, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Employee Job: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 300, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Employee Phone: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

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

        find.setBackground(new java.awt.Color(255, 255, 255));
        find.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        find.setText("Find");
        find.setSelected(true);
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        getContentPane().add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 60, -1));

        buttonGroup1.add(manager);
        manager.setText("Manager");
        getContentPane().add(manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        buttonGroup1.add(cook);
        cook.setText("Cook");
        cook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookActionPerformed(evt);
            }
        });
        getContentPane().add(cook, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

        buttonGroup1.add(security);
        security.setText("Security");
        getContentPane().add(security, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, -1, -1));

        buttonGroup1.add(management);
        management.setText("Management");
        getContentPane().add(management, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/EMP.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        
           String n=name.getText();
         String a=address.getText();
         String p=phone.getText();
         String e=salary.getText();
         String emp_job="";
         
          if (cook.isSelected()){
            emp_job+="COOK";
          }
          else if (manager.isSelected()){
          emp_job+="MANAGER";

          }
        if (security.isSelected()){
            emp_job+="SECURITY";
          }
          else if (management.isSelected()){
          emp_job+="MANAGEMENT";

          }
        
      
         
         
        
             try 
        {
            Class.forName("oracle.jdbc.OracleDriver");
			  
	      Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
             java.sql.Statement s=con.createStatement();
            String l= "UPDATE staff set emp_name='"+n+"',emp_contact='"+p+"',emp_address='"+a+"',emp_salary='"+e+"',emp_job='"+emp_job+"' where emp_cnic='"+id.getText()+ "'";

            s.executeUpdate(l);
            JOptionPane.showMessageDialog(null,"EMPLOYEE RECORD UPDATED SUCCESSFULY");
        
        }
             catch (Exception ex){
              JOptionPane.showMessageDialog(null,ex);

             }
        
    }//GEN-LAST:event_updateActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        dispose();
        admin_employee cust=new admin_employee();
        cust.setLocationRelativeTo(null);
        cust.setVisible(true);
    }//GEN-LAST:event_cancel1ActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        set_text(id.getText());
        
    }//GEN-LAST:event_findActionPerformed

    private void cookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookActionPerformed

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
            java.util.logging.Logger.getLogger(Update_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel1;
    private javax.swing.JRadioButton cook;
    private javax.swing.JButton find;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton management;
    private javax.swing.JRadioButton manager;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField salary;
    private javax.swing.JRadioButton security;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
