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
public class Delete_Customer extends javax.swing.JFrame {
    
    public Delete_Customer() {
        initComponents();
        all_customers_info();
    }
    
     private void all_customers_info(){
             try 
        {     
             Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
			
            String[][] row=new String[8][8];
          
            
            java.sql.ResultSet rs=s.executeQuery("select cust_id,cust_cnic,cust_name,cust_address,cust_phone_number,cust_gender from customer ORDER BY cust_id");
            
            while (rs.next())
            {
            
               String C=String.valueOf(rs.getLong("cust_ID"));

               String N=String.valueOf(rs.getString("cust_cnic"));
               String Ns=String.valueOf(rs.getString("cust_name"));
                                          
               String Nsfa=String.valueOf(rs.getString("cust_address"));
               String des=String.valueOf(rs.getString("cust_phone_number"));
               String gen=String.valueOf(rs.getString("cust_gender"));

               String tbdata[]={C,N,Ns,Nsfa,des,gen};
               
                
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

        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        DELETE = new javax.swing.JButton();
        cancel1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 270, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Customer ID: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, 20));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Number", "Customer CNIC", "Customer Name", "Customer Address", "Customer Ph", "Customer Gender"
            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 760, 290));

        DELETE.setBackground(new java.awt.Color(255, 255, 255));
        DELETE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DELETE.setText("DELETE CUSTOMER");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        getContentPane().add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, 150, 50));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/delete_cust.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
       
        
        
    }//GEN-LAST:event_idActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        
        
        String idd=id.getText();
           int counter=0; 
        
          try
        {
            Class.forName("oracle.jdbc.OracleDriver");

	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");

           
            Statement s=con.createStatement();

            java.sql.ResultSet rs=s.executeQuery("select * from CUSTOMER where cust_id='"+idd+"'");
         
            
                
            while (rs.next())
            {
                String k=String.valueOf(rs.getString("cust_id"));
                if (k.equals(idd)){
                    counter++; 
                    
                }
                
            }
            con.close();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
          
          if (counter!=0){
              
          
           try 
        {
            
            try{
                 Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
            
            
               java.sql.ResultSet rs=s.executeQuery("update room set is_booked='false' where room_id in (SELECT book.room_room_id FROM book natural join room natural join customer  WHERE book.room_room_id = room.room_id and book.customer_cust_id='"+idd+"')");
//            s.executeUpdate(update_room);
                while (rs.next()){
//                            String update_room="update room  r set r.is_booked='false' where (SELECT book.room_room_id FROM book natural join room natural join customer  WHERE book.room_room_id = room.room_id and book.customer_cust_id=customer.cust_id and cust_id='"+(idd)+"')=r.room_id";
//            s.executeUpdate(update_room);
//                    System.out.println("here");
                }
                
                
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
           	       
             Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
//              String update_room="update room  r set r.is_booked='false' where (SELECT book.room_room_id FROM book natural join room natural join customer  WHERE book.room_room_id = room.room_id and book.customer_cust_id=customer.cust_id and cust_id='"+(idd)+"')=r.room_id";
//            s.executeUpdate(update_room);
            String l= "DELETE FROM CUSTOMER WHERE cust_id='"+idd+"'";
          
            s.executeUpdate(l);
            
       
            JOptionPane.showMessageDialog(null,"CUSTOEMR RECORD DELETED SUCCESSFULLY");
            
            System.out.println("updated ");
            
            
            
            Delete_Customer d=new Delete_Customer(); 
             d.setLocationRelativeTo(null);
            d.setVisible(true);
            
            
        }
           catch(Exception e) {
               
              	System.out.println(e);

           }
          }else{
       JOptionPane.showMessageDialog(null,"CUSTOEMR RECORD NOT FOUND!");

          }
    }//GEN-LAST:event_DELETEActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETE;
    private javax.swing.JButton cancel1;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
