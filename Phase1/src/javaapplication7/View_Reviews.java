/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*; 


/**
 *
 * @author FAHAD_ISHAQ
 */
public class View_Reviews extends javax.swing.JFrame {

    /**
     * Creates new form View_Reviews
     */
    public View_Reviews() {
        initComponents();
    }
    
   
    
        
    public void all_reviews(){
        int count=0;
        
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
               count++;
               
                System.out.println("here");
                
      DefaultTableModel table3=(DefaultTableModel)table.getModel();
               
               table3.addRow(tbdata);
               
            
               
            }
            con.close();
        }  
			  
	catch(Exception e){ 
				System.out.println(e);
			}  
             
             if (count==0){
               JOptionPane.showMessageDialog(null, "NO RECORD FOUND");

             }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        find = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        view_all = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        cancel1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Search by Name: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, 20));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 150, -1));

        find.setText("Find");
        find.setSelected(true);
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        getContentPane().add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, -1));

        clear.setText("Clear");
        clear.setSelected(true);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, -1, -1));

        view_all.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        view_all.setText("VIEW ALL");
        view_all.setSelected(true);
        view_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_allActionPerformed(evt);
            }
        });
        getContentPane().add(view_all, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 160, 50));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S#", "Name", "Gender", "Review", "Date"
            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 880, 310));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/REVIEWS.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        
    }//GEN-LAST:event_idActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
       
                table.setModel(new DefaultTableModel(null,new String[]{"S#","Name","Gender","Review","Date"}));
 view_all.setEnabled(true);
        
        String name=id.getText();
        
        
             int count=0;
        
             try 
        {
           	       
             Class.forName("oracle.jdbc.OracleDriver");
			  
	    java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
			
            String[][] row=new String[10][10];
          
            //Natural Join
            java.sql.ResultSet rs=s.executeQuery("select review_id,review,review_date,cust_name,cust_gender from reviews natural join customer where customer_cust_id=cust_id and cust_name='"+name+"' ORDER BY review_id");
            
            while (rs.next())
            {
                
               String C=String.valueOf(rs.getLong("review_id"));

               String N=String.valueOf(rs.getString("cust_name"));
               String Ns=String.valueOf(rs.getString("cust_gender"));
                                          
               String Nsfa=String.valueOf(rs.getString("review"));
                              String Nsfaa=String.valueOf(rs.getString("review_date"));

               

               String tbdata[]={C,N,Ns,Nsfa,Nsfaa};
               count++;
               
                System.out.println("here");
                
      DefaultTableModel table3=(DefaultTableModel)table.getModel();
               
               table3.addRow(tbdata);
               
            
               
            }
            con.close();
        }  
			  
	catch(Exception e){ 
				System.out.println(e);
			}  
             
             if (count==0){
               JOptionPane.showMessageDialog(null, "NO RECORD FOUND");

             }
        
        
        
       
        
    }//GEN-LAST:event_findActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
      
        
         view_all.setSelected(true);
        view_all.setEnabled(true);
        table.setModel(new DefaultTableModel(null,new String[]{"S#","Name","Gender","Review","Date"}));
    }//GEN-LAST:event_clearActionPerformed

    private void view_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_allActionPerformed
       view_all.setEnabled(false);
       
       table.setModel(new DefaultTableModel(null,new String[]{"S#","Name","Gender","Review","Date"}));
       
       all_reviews();
       

        
        
    }//GEN-LAST:event_view_allActionPerformed

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
            java.util.logging.Logger.getLogger(View_Reviews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Reviews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Reviews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Reviews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Reviews().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel1;
    private javax.swing.JButton clear;
    private javax.swing.JButton find;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JButton view_all;
    // End of variables declaration//GEN-END:variables
}
