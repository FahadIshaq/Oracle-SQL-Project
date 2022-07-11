/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FAHAD_ISHAQ
 */
public class Delete_Employee extends javax.swing.JFrame {

    /**
     * Creates new form Delete_Employee
     */
    public Delete_Employee() {
        initComponents();
        all_employees_info();
        
    }

       private void all_employees_info(){
        
             try 
        {
           	       
             Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
			
            String[][] row=new String[8][8];
          
            
            java.sql.ResultSet rs=s.executeQuery("select emp_id,emp_name,emp_address,emp_salary,emp_gender,emp_contact,emp_job,emp_cnic from staff ORDER BY emp_id");
            
            while (rs.next())
            {
            
               String C=String.valueOf(rs.getLong("emp_id"));

               String N=String.valueOf(rs.getString("emp_name"));
               String Ns=String.valueOf(rs.getString("emp_address"));
                                          
               String Nsfa=String.valueOf(rs.getFloat("emp_salary"));
               String des=String.valueOf(rs.getString("emp_gender"));
               String gen=String.valueOf(rs.getString("emp_contact"));
               String sss=String.valueOf(rs.getString("emp_job"));
               String q=String.valueOf(rs.getString("emp_cnic"));


               String tbdata[]={C,N,Ns,Nsfa,des,gen,sss,q};
               

                
      DefaultTableModel table3=(DefaultTableModel)table.getModel();
               
               table3.addRow(tbdata);
               
            }
            con.close();
        }  
			  
	catch(Exception e){ 
				System.out.println(e);
			}
             
     }
        
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        delete = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        cancel1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setText("DELETE EMPLOYEE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 160, 50));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Employee ID: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, 40));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "ADDRESS", "SALARY", "GENDER", "CONTACT", "JOB", "CNIC"
            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 720, 310));

        cancel1.setBackground(new java.awt.Color(255, 255, 255));
        cancel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancel1.setText("BACK");
        cancel1.setSelected(true);
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });
        getContentPane().add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 160, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/delete_emp.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
           String idd=id.getText();
           
                int counter=0; 
        
          try
        {
            Class.forName("oracle.jdbc.OracleDriver");

	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");

           
            Statement s=con.createStatement();

            java.sql.ResultSet rs=s.executeQuery("select * from staff where emp_id='"+idd+"'");
         
            
                
            while (rs.next())
            {
                String k=String.valueOf(rs.getString("emp_id"));
                if (k.equals(idd)){
                    counter++; 
                    
                }
                
            }
            con.close();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
          
          if (counter!=0)
          {
           
        
           try 
        {
           	       
             Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
            
            String l= "DELETE FROM staff WHERE emp_id='"+Integer.parseInt(idd)+"'";
            s.executeUpdate(l);
            
           
//            
                 String update="UPDATE manage_customers SET staff_emp_id = (select emp_id from staff where emp_job='MANAGEMENT' order by dbms_random.value FETCH FIRST 1 ROWS ONLY) WHERE staff_emp_id is null";
            s.executeUpdate(update);
            
            
             JOptionPane.showMessageDialog(null,"EMPLOYEE RECORD DELETED SUCCESSFULLY");
            
            
             Delete_Employee d=new Delete_Employee();
             d.setLocationRelativeTo(null);
            d.setVisible(true);
            
            
            
            
            
            
        }
           catch(Exception e) {
               
              	System.out.println(e);

           }
          }
          else{
                          JOptionPane.showMessageDialog(null,"EMPLOYEE RECORD NOT FOUND");

              
          }
    }//GEN-LAST:event_deleteActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        
    }//GEN-LAST:event_idActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        dispose();
        admin_employee cust=new admin_employee();
         cust.setLocationRelativeTo(null);
        cust.setVisible(true);
    }//GEN-LAST:event_cancel1ActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel1;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
