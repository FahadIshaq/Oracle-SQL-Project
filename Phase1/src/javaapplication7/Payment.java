/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FAHAD_ISHAQ
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
        all_details();
        
    }

    public void all_details(){
        Customer_Login i=new Customer_Login();
       String id=""+ i.id();
        
        
          String namee="", res_id="", cnicc="", phonee="",total="", room_bill="", food_bill="",  laundry_bill="", event_bill="", check_inn="", check_outt="";
        try{
            
            
//                JOptionPane.showMessageDialog(null,"Account Created Successfully");

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
"left outer join sumofevents on customer.cust_id=sumofevents.cust_id where customer.cust_id='"+id+"'");
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
    
        
               
            
                       
        }
        catch (Exception e){
            
        
        
        System.out.println(e);
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        acc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        bank = new javax.swing.JRadioButton();
        jazz = new javax.swing.JRadioButton();
        easy = new javax.swing.JRadioButton();
        pay = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Payment Method: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Account Number: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accActionPerformed(evt);
            }
        });
        getContentPane().add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 300, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Amount: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        getContentPane().add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 300, 30));

        buttonGroup1.add(bank);
        bank.setText("Bank ");
        getContentPane().add(bank, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, -1, -1));

        buttonGroup1.add(jazz);
        jazz.setText("Jazz Cash");
        getContentPane().add(jazz, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        buttonGroup1.add(easy);
        easy.setText("Easypaisa");
        getContentPane().add(easy, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, -1));

        pay.setBackground(new java.awt.Color(255, 255, 255));
        pay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pay.setText("PAY");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        getContentPane().add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 160, 50));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back.setText("BACK");
        back.setSelected(true);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 160, 50));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "CNIC", "Phone", "Check In", "Food Bill", "Laundry Bill", "Total Rooms Bill", "Events Price", "Total Bill"
            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 1030, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/payment.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        
        
        
        
        Customer_Login c=new Customer_Login();
        int cust_id= c.id();
        System.out.println("id:"+ c.id());
       String method="";
        if (easy.isSelected()){
            method+="Easypaisa";
        }else if (jazz.isSelected()){
            method+="Jazzcash";
            
        }else if(bank.isSelected()){
            method+="Bank";
            
        }
        
        
        
       float k= Invoice.pricee;
       
        System.out.println("fekvjf"+ k);
       if (k!=Integer.parseInt(amount.getText())){
           				JOptionPane.showMessageDialog(null, "PLEASE ENTER CORRECT AMOUNT");

       }else{
           
       
 
           int s_id=0;
          try 
        {
            
            Class.forName("oracle.jdbc.OracleDriver");
			  
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");

            Statement s=con.createStatement();  
            
            java.sql.ResultSet rs=s.executeQuery("SELECT pay_id from payment");
            int b=0;
            while (rs.next())
            {
               String a=String.valueOf(rs.getLong("pay_id"));
                 b=Integer.parseInt(a);
                if (b==s_id){
                    continue; 
                }else{

               b++; 
                }
            
            }
            s_id=b;
            con.close();
           
        }  
			  
	catch(Exception e){ 
				JOptionPane.showMessageDialog(null, e);
                                
			}  
        
        try
        {
            

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();

            String l= "INSERT into payment(pay_id,pay_method,pay_price_paid,customer_cust_id) values('"+(s_id+1)+"','"+method+"','"+amount.getText()+"','"+cust_id+"')";
            s.executeUpdate(l);
         
            
            JOptionPane.showMessageDialog(null, "Successful");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        
        }
        
        
        
       }
        


        
        
    }//GEN-LAST:event_payActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        Customer_Frame cust=new Customer_Frame();
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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acc;
    private javax.swing.JTextField amount;
    private javax.swing.JButton back;
    private javax.swing.JRadioButton bank;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton easy;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton jazz;
    private javax.swing.JButton pay;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
