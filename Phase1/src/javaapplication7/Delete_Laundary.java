/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author FAHAD_ISHAQ
 */
public class Delete_Laundary extends javax.swing.JFrame {

    
    public Delete_Laundary() {
        initComponents();
        all_laundry();
    }

    
    
     public void all_laundry(){
        
        table.setModel(new DefaultTableModel(null,new String[]{"Name","Customer_ID","Pieces","Bill"}));
          int check=0;
        
         try
        {
            Class.forName("oracle.jdbc.OracleDriver");

	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");

            String[][] row=new String[4][6];
            Statement s=con.createStatement();
            
            
            java.sql.ResultSet rs=s.executeQuery("select sum(laundry.laundry_pieces) as \"Laundry_Pieces\", customer.cust_id, customer.cust_name, sumoflaundry.\"Laundry_Sum\" from customer cross join services cross join laundry cross join sumoflaundry where customer.cust_id=services.customer_cust_id and services.service_id=laundry.service_id and sumoflaundry.cust_id=customer.cust_id group by customer.cust_name, customer.cust_id, sumoflaundry.\"Laundry_Sum\"");

            while (rs.next())
            {
                  String k=String.valueOf(rs.getString("cust_name"));
                String CNIC_n=String.valueOf(rs.getString("cust_id"));
                String Name=String.valueOf(rs.getString("Laundry_Pieces"));
                String pric=String.valueOf(rs.getString("Laundry_Sum"));
                
                check++;
                
                String tbdata[]={k,CNIC_n,Name,pric};
                
                
                DefaultTableModel table3=(DefaultTableModel)table.getModel();

                table3.addRow(tbdata);

            }
            con.close();
            
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
         
         if (check==0){
                         JOptionPane.showMessageDialog(null, "NO RECORD FOUND");

             
         }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        cancel1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Customer ID", "Pieces", "Bill"
            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 730, 310));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("LAUNDRY ID:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 150, 40));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setText("DELETE LAUNDRY");
        delete.setSelected(true);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, 160, 50));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/laundry.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String idd=id.getText();
        try 
        {
           	       
             Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
                java.sql.ResultSet rs= s.executeQuery("DELETE FROM services WHERE service_id=( SELECT laundry.laundry_id FROM customer, services, laundry WHERE customer.cust_id=services.customer_cust_id and services.service_id=laundry.laundry_id AND customer.cust_id ='"+idd+"')"); 
   
            JOptionPane.showMessageDialog(null,"LAUNDRY RECORD DELETED SUCCESSFULLY");       
            
        }
           catch(Exception e) {
               
              	System.out.println(e);

           }
         
        
    }//GEN-LAST:event_deleteActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        dispose();
        admin_laundry cust=new admin_laundry();
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
            java.util.logging.Logger.getLogger(Delete_Laundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Laundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Laundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Laundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Laundary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel1;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
