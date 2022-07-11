/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;
import java.sql.*; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;


public class Reservations extends javax.swing.JFrame {

    /**
     * Creates new form Reservations
     */
    public Reservations() {
        initComponents();
        details();
    }
   public void details(){
        String namee="", res_id="", cnicc="", phonee="", room_bill="", food_bill="",  laundry_bill="", event_bill="", check_inn="", check_outt="";
     
        try{
            
        Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
		 String[][] row=new String[8][8];
          
              java.sql.ResultSet rr=s.executeQuery("select customer.cust_id, customer.cust_name,customer.cust_cnic,customer.cust_phone_number,COALESCE(book.check_in,'NULL') as \"checkin\", COALESCE(invoice.check_out,'NULL') as \"checkout\" , COALESCE(sumoffood.\"Food_price\", 0) as \"foodsum\",COALESCE(sumoflaundry.\"Laundry_Sum\", 0) as \"laundrysum\", COALESCE(sumofrooms.\"Room_Sum\", 0) as \"roomsum\", COALESCE(sumofevents.\"Event_price\", 0) as \"eventsum\", book.check_in from (((((customer left outer join SumOffood on customer.cust_id=sumoffood.cust_id) left outer join sumoflaundry on customer.cust_id=sumoflaundry.cust_id)left outer join sumofrooms on customer.cust_id=sumofrooms.cust_id) left outer join book on customer.cust_id=book.customer_cust_id) left outer join Invoice on customer.cust_id=invoice.customer_cust_id) left outer join sumofevents on customer.cust_id=sumofevents.cust_id");
              
              while (rr.next())
            {
            
               res_id=String.valueOf(rr.getString("cust_id"));
                               System.out.println("here");

             namee=String.valueOf(rr.getString("cust_name"));
             cnicc=String.valueOf(rr.getString("cust_CNIC"));
             phonee=String.valueOf(rr.getString("cust_phone_number"));
             room_bill=String.valueOf(rr.getString("roomsum"));
             laundry_bill=String.valueOf(rr.getString("laundrysum"));
             event_bill=String.valueOf(rr.getString("eventSum"));
             food_bill=String.valueOf(rr.getString("foodsum"));
               
             check_inn=String.valueOf(rr.getString("checkin"));
             check_outt=String.valueOf(rr.getString("checkout"));
             
        
                
                System.out.println("gfd");
                
            String tbdata[]={res_id,namee,cnicc,phonee,room_bill,food_bill,laundry_bill,event_bill,check_inn,check_outt};
               
                
      DefaultTableModel table3=(DefaultTableModel)table.getModel();
               
               table3.addRow(tbdata);
               
            
            }
            con.close();
    
        
               
            
                       
        }
        catch (Exception e){
            
        
        
        System.out.println(e);
        
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
        done = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Res_ID", "Name", "CNIC", "Phone", "Room Bill", "Food Bill", "Laundry Bill", "Event Bill", "Chech In", "Check Out"
            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 980, 320));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Delete By Res_ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 150, -1));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setText("Delete");
        delete.setSelected(true);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 110, 30));

        done.setBackground(new java.awt.Color(255, 255, 255));
        done.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });
        getContentPane().add(done, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 160, 50));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back.setText("BACK");
        back.setSelected(true);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 160, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/reservations.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
   
    }//GEN-LAST:event_idActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
      
        String CNIC=id.getText();
        
        try
        {
           
            Class.forName("oracle.jdbc.OracleDriver");

	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");

            Statement s=con.createStatement();

            ResultSet rs=s.executeQuery("delete from CUSTOMER where cust_id='"+CNIC+"'");
                        JOptionPane.showMessageDialog(null, "RESERVATION DELETED SUCCESSFULLY");

            con.close();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
        
        //making room free
        
        
          
//        try{
//            
//            
//              
//            Class.forName("oracle.jdbc.OracleDriver");
//
//            Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
//            Statement s=con.createStatement();
//             String l= "update room \n" +
//"set is_booked='false'\n" +
//"where \n" +
//"room_id in \n" +
//"(select unique room.room_id from \n" +
//"(room inner join book \n" +
//"on room.room_id=book.room_room_id) inner join customer\n" +
//"on book.customer_cust_id=customer.cust_id and customer.cust_id='"+CNIC+"')";
//            s.executeUpdate(l);
//            System.out.println("INVOCIE");
////            JOptionPane.showMessageDialog(null, "Invoice Generated Successfully");
//
//            
            
//        }
//        catch(Exception e){
//            
//            
//            System.out.println("Exception "+ e);
        
//    }

  try{
                 Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
            
            
               java.sql.ResultSet rs=s.executeQuery("update room set is_booked='false' where room_id in (SELECT book.room_room_id FROM book natural join room natural join customer  WHERE book.room_room_id = room.room_id and book.customer_cust_id='"+CNIC+"')");
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
           	      
        
      
        
        
        
    }//GEN-LAST:event_deleteActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doneActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        Admin_Options cust=new Admin_Options();
        cust.setLocationRelativeTo(null);
        cust.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JButton done;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
