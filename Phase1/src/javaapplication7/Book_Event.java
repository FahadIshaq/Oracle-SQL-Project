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
public class Book_Event extends javax.swing.JFrame {

    /**
     * Creates new form Book_Event
     */
    public Book_Event() {
   
        initComponents();
             all_events();
    }
    
    
     public void all_events(){
        
             try 
        {
           	       
             Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
			
            String[][] row=new String[10][10];
          
            
            java.sql.ResultSet rs=s.executeQuery("select Event_id,event_name,event_description,event_date,event_price from Admin_Events ORDER BY event_id");
            
            while (rs.next())
            {
                
               String C=String.valueOf(rs.getLong("Event_id"));

               String N=String.valueOf(rs.getString("event_name"));
               String Ns=String.valueOf(rs.getString("event_description"));
                                          
               String Nsfa=String.valueOf(rs.getString("event_price"));
               String des=String.valueOf(rs.getString("event_date"));
               

               String tbdata[]={C,N,Ns,Nsfa,des};
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
        jLabel2 = new javax.swing.JLabel();
        event = new javax.swing.JTextField();
        book = new javax.swing.JButton();
        cancel1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Number", "Event Name", "Event Description", "Ticket Price", "Event Date & Time"
            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 810, 280));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Enter Event Number: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, 40));

        event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventActionPerformed(evt);
            }
        });
        getContentPane().add(event, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 190, -1));

        book.setBackground(new java.awt.Color(255, 255, 255));
        book.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        book.setText("BOOK EVENT");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });
        getContentPane().add(book, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 160, 50));

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/EVENT_BOOKING.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        
        if (event.equals(null)){
         	JOptionPane.showMessageDialog(null, "INVALID EVENT NUMBER");

        }else{
            
        
     Customer_Login c=new Customer_Login();
     int cust_id=c.id();
        
           int s_id=0;
          try 
        {
            
            Class.forName("oracle.jdbc.OracleDriver");
			  
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");

            Statement s=con.createStatement();  
            
            java.sql.ResultSet rs=s.executeQuery("SELECT service_id from services");
            int b=0;
            while (rs.next())
            {
               String a=String.valueOf(rs.getLong("service_id"));
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
            
           	 String book_event=event.getText();
                 
                 
             Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();

            String l= "INSERT into services(service_id,customer_cust_id,services_type) values('"+(s_id+1)+"','"+cust_id+"','"+"Event"+"')";
            s.executeUpdate(l);
            System.out.println(s_id+1);
            
         String k= "INSERT into event(service_id,event_id,s_no) values('"+(s_id+1)+"','"+(book_event)+"','"+(s_id+1)+"')";
            s.executeUpdate(k);
            
            System.out.println("nhi hua");
            
              JOptionPane.showMessageDialog(null, "Event Booked Successfully"); 
             
        }  
        
        catch(Exception e){ 
				JOptionPane.showMessageDialog(null, e);
                                
			}  
           
           
           
        }
    }//GEN-LAST:event_bookActionPerformed

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
            java.util.logging.Logger.getLogger(Book_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_Event().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book;
    private javax.swing.JButton cancel1;
    private javax.swing.JTextField event;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
