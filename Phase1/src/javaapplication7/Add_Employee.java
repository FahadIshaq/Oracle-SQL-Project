    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author FAHAD_ISHAQ
 */
public class Add_Employee extends javax.swing.JFrame {

    /**
     * Creates new form Add_Employee
     */
    public Add_Employee() {
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
       
       private boolean isValidSalary(String salary) {
        // condition to check whether CNIC contains any alphabets and CNIC has length of 13
        
        if (salary.length()!=0) {
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cnic = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        add_employee = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        cancel1 = new javax.swing.JButton();
        manager = new javax.swing.JRadioButton();
        cook = new javax.swing.JRadioButton();
        security = new javax.swing.JRadioButton();
        management = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(960, 717));
        setMinimumSize(new java.awt.Dimension(960, 717));
        setPreferredSize(new java.awt.Dimension(960, 717));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Employee Name: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 125, -1, 30));

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 300, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Employee CNIC: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 165, -1, 40));

        cnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnicActionPerformed(evt);
            }
        });
        getContentPane().add(cnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 300, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Employee Address: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, 30));

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 300, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Employee Gender: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, 30));

        add_employee.setBackground(new java.awt.Color(255, 255, 255));
        add_employee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add_employee.setText("ADD EMPLOYEE");
        add_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employeeActionPerformed(evt);
            }
        });
        getContentPane().add(add_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 160, 50));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Employee Phone: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, 40));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 300, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Employee Salary: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, 30));

        salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryActionPerformed(evt);
            }
        });
        getContentPane().add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 300, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Employee Job: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, 30));

        buttonGroup1.add(male);
        male.setText("Male");
        getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, -1));

        buttonGroup1.add(female);
        female.setText("Female");
        getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, -1, -1));

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

        buttonGroup2.add(manager);
        manager.setText("Manager");
        getContentPane().add(manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        buttonGroup2.add(cook);
        cook.setText("Cook");
        cook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookActionPerformed(evt);
            }
        });
        getContentPane().add(cook, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        buttonGroup2.add(security);
        security.setText("Security");
        getContentPane().add(security, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, -1, -1));

        buttonGroup2.add(management);
        management.setText("Management");
        getContentPane().add(management, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/ADD_EMP.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void cnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnicActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void add_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employeeActionPerformed
        
          int emp_id=0; 
          String CNIC=cnic.getText();
        
        String emp_name=Name.getText();
        String emp_address=address.getText();
        String emp_gender="";
        if (male.isSelected()){
            emp_gender+="M";
          }
          else if (female.isSelected()){
          emp_gender+="F";

          }
        
        
        String emp_phone=phone.getText();
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
        
        String emp_salary=salary.getText();
      
       
        String admin_emp="8120105249293";
   
         if (isValidCNIC(CNIC)==false){
             JOptionPane.showMessageDialog(null, "INVALID CNIC, CNIC MUST BE A 13 DIGIT NUMBER");

        }
        else if (isValidName(emp_name)==false){
                         JOptionPane.showMessageDialog(null, "INVALID NAME");

        }
        else if (isValidAddress(emp_address)==false){
                         JOptionPane.showMessageDialog(null, "INVALID ADDRESS");

        }
        else if (isValidPhone(emp_phone)==false){
                         JOptionPane.showMessageDialog(null, "INVALID PHONE");

            
        }else if (isValidSalary(emp_salary)==false){
                                 JOptionPane.showMessageDialog(null, "INVALID SALARY");

        }
        else{
            
        
        int b=101;
        try{
            
          Class.forName("oracle.jdbc.OracleDriver");
			  
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");

            Statement s=con.createStatement();  
            
            java.sql.ResultSet rs=s.executeQuery("SELECT emp_id from staff");
           
        
   
        
         while (rs.next())
            {
               String a=String.valueOf(rs.getLong("emp_id"));
                 b=Integer.parseInt(a);
                if (b==emp_id){
                    continue; 
                }else{

               b++; 
                }
            
            }
            emp_id=b;
            con.close();
            System.out.println("Cst: "+emp_id);
        }  
			  
	catch(Exception e){ 
				JOptionPane.showMessageDialog(null, e);
                                
			}  
        
        
          try 
        {
           
            Class.forName("oracle.jdbc.OracleDriver");
			  
		
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
             

            String l= "INSERT into Staff(emp_id,emp_name,emp_address,emp_salary,emp_gender,emp_contact,emp_job,emp_cnic,admin_cnic) values('"+emp_id+"','"+emp_name+"','"+emp_address+"','"+emp_salary+"','"+emp_gender+"','"+emp_phone+"','"+emp_job+"','"+CNIC+"','"+admin_emp+"')";
            s.executeUpdate(l);
            JOptionPane.showMessageDialog(null,"Employee Added Successfully");
        
        }
        catch(Exception e){
            	JOptionPane.showMessageDialog(null, e);
            }
          
          
          
        }
        
       
        
    }//GEN-LAST:event_add_employeeActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
       
    }//GEN-LAST:event_phoneActionPerformed

    private void salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryActionPerformed
     
    }//GEN-LAST:event_salaryActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        dispose();
        admin_employee cust=new admin_employee();
         cust.setLocationRelativeTo(null);
        cust.setVisible(true);
    }//GEN-LAST:event_cancel1ActionPerformed

    private void cookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JButton add_employee;
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cancel1;
    private javax.swing.JTextField cnic;
    private javax.swing.JRadioButton cook;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton management;
    private javax.swing.JRadioButton manager;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField salary;
    private javax.swing.JRadioButton security;
    // End of variables declaration//GEN-END:variables
}
