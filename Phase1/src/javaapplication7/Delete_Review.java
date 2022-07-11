/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FAHAD_ISHAQ
 */
public class Delete_Review extends javax.swing.JFrame {

    /**
     * Creates new form Delete_Review
     */
    public Delete_Review() {
        initComponents();
      
        
    }
    
    
        
    public void all_reviews(){
        
             try 
        {
           	       
             Class.forName("oracle.jdbc.OracleDriver");
			  
	    java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
			
            String[][] row=new String[10][10];
          
            
            java.sql.ResultSet rs=s.executeQuery("select review_id,review,review_date,cust_name,cust_gender from reviews natural join customer where customer_cust_id=cust_id ORDER BY review_id");
            
            while (rs.next())
            {
                
               String C=String.valueOf(rs.getLong("review_id"));

               String N=String.valueOf(rs.getString("cust_name"));
               String Ns=String.valueOf(rs.getString("cust_gender"));
                                          
               String Nsfa=String.valueOf(rs.getString("review"));
                              String Nsfaa=String.valueOf(rs.getString("review_date"));

               

               String tbdata[]={C,N,Ns,Nsfa,Nsfaa};
                System.out.println("here");
                
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

        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        id1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cancel1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S#", "Name", "Gender", "Review", "Date"
            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 770, 270));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("DELETE REVIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 160, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Enter Review ID: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, -1));

        id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id1ActionPerformed(evt);
            }
        });
        getContentPane().add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 150, -1));

        jLabel11.setText("Search by ID");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/REVIEWS.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
             try 
        {
           	       
             Class.forName("oracle.jdbc.OracleDriver");
			  
	    java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
            
             
            String l= "DELETE FROM reviews WHERE review_id='"+id1.getText()+"'";
            
            s.executeUpdate(l);
            
            JOptionPane.showMessageDialog(null,"Review RECORD DELETED SUCCESSFULLY");
            
            
			
            
          
            
           
        }  
			  
	catch(Exception e){ 
				System.out.println(e);
			}  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id1ActionPerformed
        
    }//GEN-LAST:event_id1ActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        dispose();
        admin_reviews cust=new admin_reviews();
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
            java.util.logging.Logger.getLogger(Delete_Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Review().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel1;
    private javax.swing.JTextField id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
