/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author FAHAD_ISHAQ
 */
public class Invoice extends javax.swing.JFrame {
public static float pricee;
    /**
     * Creates new form Invoice
     */
    public Invoice() {
        initComponents();
        all();
        all_details();
                
                
        
    }
    
    
    public void all(){
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   date.setText(dtf.format(now));
    date.setEnabled(false);
        date.setBackground(Color.black);
        
        String invoicee=generateRandomChars(
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 19); 
        invoice.setText(invoicee);
          invoice.setEnabled(false);
        invoice.setBackground(Color.black);
        Customer_Login l=new Customer_Login();
        try{
            
            
                Class.forName("oracle.jdbc.OracleDriver");

                Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");

                Statement s=con.createStatement();

                java.sql.ResultSet rs=s.executeQuery("SELECT * from customer where customer.cust_id='"+(l.id())+"'");
               System.out.println("here");
                while (rs.next())
                {
                    String a=String.valueOf(rs.getString("cust_name"));
                    idd.setText(a);
                }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        idd.setEnabled(false);
        idd.setBackground(Color.black);
        
        
    }
    
    public static String generateRandomChars(String candidateChars, int length) {
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < length; i++) {
        sb.append(candidateChars.charAt(random.nextInt(candidateChars
                .length())));
    }

    return sb.toString();
}
    
    public void all_details(){
        Customer_Login i=new Customer_Login();
       String id=""+ i.id();
        
        
          String namee="", res_id="", cnicc="", phonee="",total="", room_bill="", food_bill="",  laundry_bill="", event_bill="", check_inn="", check_outt="";
        try{
            
        Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
		 String[][] row=new String[8][8];
          
              java.sql.ResultSet rr=s.executeQuery("select  customer.cust_id, customer.cust_name,customer.cust_cnic,customer.cust_phone_number,COALESCE(book.check_in,'NULL') as \"checkin\" , COALESCE(invoice.check_out,'NULL') as \"checkout\" , COALESCE(sumoffood.\"Food_price\", 0) as \"foodsum\",\n" +
"COALESCE(sumoflaundry.\"Laundry_Sum\", 0) as \"laundrysum\", COALESCE(sumofrooms.\"Room_Sum\", 0) as \"roomsum\", \n" +
"COALESCE(sumofevents.\"Event_price\", 0) as \"eventsum\", book.check_in\n" +
", COALESCE( coalesce (sumoffood.\"Food_price\", 0)+ coalesce (sumofevents.\"Event_price\",0) + coalesce (sumofrooms.\"Room_Sum\",0) + coalesce (sumoflaundry.\"Laundry_Sum\",0), 0) as \"totalsum\"from\n" +
"(((((customer left outer join SumOffood on customer.cust_id=sumoffood.cust_id) \n" +
"left outer join sumoflaundry on customer.cust_id=sumoflaundry.cust_id)left outer join \n" +
"sumofrooms on customer.cust_id=sumofrooms.cust_id) left outer join book on customer.cust_id=book.customer_cust_id)\n" +
"left outer join Invoice on customer.cust_id=invoice.customer_cust_id) \n" +
"left outer join sumofevents on customer.cust_id=sumofevents.cust_id where customer.cust_id='"+id+"'FETCH FIRST 1 ROWS ONLY");
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
//             check_outt=String.valueOf(rr.getString("checkout"));
             total=String.valueOf(rr.getString("totalsum"));
             
             
                System.out.println("gfd");
                
            String tbdata[]={res_id,namee,cnicc,phonee,check_inn,food_bill,laundry_bill,room_bill,event_bill,total};
               
                
      DefaultTableModel table3=(DefaultTableModel)table.getModel();
               
               table3.addRow(tbdata);
               
            
            }
            con.close();
            
            
            pricee=Float.parseFloat(total);
            
            
            
    
        
               
            
                       
        }
        catch (Exception e){
            
        
        
        System.out.println(e);
        
        }
        
        
        
        //inserting into the payment table
        
        
        try{
            
            
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();

            String l= "INSERT into invoice(invoice_number,invoice_Amount,invoice_date,customer_cust_id,check_out) values('"+(invoice.getText())+"','"+total +"','"+date.getText()+"','"+id+"', '"+date.getText()+"')";
            s.executeUpdate(l);
            
            JOptionPane.showMessageDialog(null, "Invoice Generated Successfully");

            
            
        }catch (Exception e ){
            System.out.println("Exception "+e);
        }
        
        //making room availabla=e for other customers
//        
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
//"on book.customer_cust_id=customer.cust_id and customer.cust_id='"+id+"')";
//            s.executeUpdate(l);
//            System.out.println("INVOCIE");
////            JOptionPane.showMessageDialog(null, "Invoice Generated Successfully");
//
//            
//            
//        }
//        catch(Exception e){
//            
//            
//            System.out.println("Exception "+ e);
//        }
//        
//        
        
        



  try{
                 Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
            
            System.out.println("jdskfdsjkfsdjkfhsdkjf");
               java.sql.ResultSet rs=s.executeQuery("update room set is_booked='false' where room_id in (SELECT book.room_room_id FROM book natural join room natural join customer  WHERE book.room_room_id = room.room_id and book.customer_cust_id='"+id+"')");
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
           	      
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        invoice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        idd = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        pay1 = new javax.swing.JButton();
        cancel1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Bill To:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Date: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceActionPerformed(evt);
            }
        });
        getContentPane().add(invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 210, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("F6, Markaz, Islamabad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("11100");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Pakistan");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("FXR HOTELS,");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Invoice#");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 210, -1));

        idd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iddActionPerformed(evt);
            }
        });
        getContentPane().add(idd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 210, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "CNIC", "Phone", "Check In", "Food Bill", "Laundry Bill", "Total Rooms Bill", "Events Price", "Total Bill"
            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 1030, 250));

        pay1.setText("PAY");
        pay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay1ActionPerformed(evt);
            }
        });
        getContentPane().add(pay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, 160, 50));

        cancel1.setBackground(new java.awt.Color(255, 255, 255));
        cancel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancel1.setText("BACK");
        cancel1.setSelected(true);
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });
        getContentPane().add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 160, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/INVOICE.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
         
   
    }//GEN-LAST:event_dateActionPerformed

    private void iddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iddActionPerformed

    private void pay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay1ActionPerformed
        // TODO add your handling code here:
           dispose();
        Payment cust=new Payment();
         cust.setLocationRelativeTo(null);
        cust.setVisible(true);
    }//GEN-LAST:event_pay1ActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        dispose();
        Customer_Frame cust=new Customer_Frame();
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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel1;
    private javax.swing.JTextField date;
    private javax.swing.JTextField idd;
    private javax.swing.JTextField invoice;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pay1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
