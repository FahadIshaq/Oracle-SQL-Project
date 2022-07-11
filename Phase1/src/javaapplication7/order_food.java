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
public class order_food extends javax.swing.JFrame {

    /**
     * Creates new form order_food
     */
    public order_food() {
        initComponents();
        all_info();
        
    }
    
    
    private void all_info(){
        try 
        {
            //JavaConnection j1=new JavaConnection();
            Class.forName("oracle.jdbc.OracleDriver");
			  
			//step2 create  the connection object  jdbc:oracle:thin:tiger/scott@localhost:1521:productDB
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");

			
            String[ ][ ] row=new String[8][8];
            Statement s=con.createStatement();  
            
            java.sql.ResultSet rs=s.executeQuery("SELECT * from Admin_food");
           
            while (rs.next())
            {
               String a=String.valueOf(rs.getLong("food_id"));
               String aF=String.valueOf(rs.getString("food_name"));
               String Ns=String.valueOf(rs.getString("food_type"));
               
               String Nsfa=String.valueOf(rs.getLong("food_price"));
               
               String tbdata[]={a,aF,Ns,Nsfa};
               DefaultTableModel table3=(DefaultTableModel)table.getModel();
               table3.addRow(tbdata);
               
            }
            con.close();
//            JOptionPane.showMessageDialog(null, "Search Found");
        }  
			  
	catch(Exception e){ 
				JOptionPane.showMessageDialog(null, e);
                                
			}  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        cancel1 = new javax.swing.JButton();
        order = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        food_num = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Number", "Food Name", "Room Type", "Price"
            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 850, 270));

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

        order.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        order.setText("ORDER FOOD");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });
        getContentPane().add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 160, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Enter Food Number: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, 50));

        food_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                food_numActionPerformed(evt);
            }
        });
        getContentPane().add(food_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/foodddd.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        dispose();
        Customer_Frame cust=new Customer_Frame();
        cust.setLocationRelativeTo(null);
        cust.setVisible(true);
    }//GEN-LAST:event_cancel1ActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed

        Customer_Login c=new Customer_Login();
        int cust_id= c.id();
        System.out.println("id:"+ c.id());
        
 
        int check=0;
        
         try
        {
            Class.forName("oracle.jdbc.OracleDriver");

	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");

            String[][] row=new String[4][6];
            Statement s=con.createStatement();
            
            
            java.sql.ResultSet rs=s.executeQuery("select food_id,food_name,food_type,food_price from admin_food where food_id='"+food_num.getText()+"'");

            while (rs.next())
            {
              
                check++;
               
            }
            con.close();
            
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
         
         if (check==0){
                         JOptionPane.showMessageDialog(null, "NO RECORD FOUND");

             
         }
         
         else{
             
        
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

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();

            String l= "INSERT into services(service_id,customer_cust_id,services_type) values('"+(s_id+1)+"','"+cust_id+"','"+"Food"+"')";
            s.executeUpdate(l);
         String k= "INSERT into food(service_id,food_id,s_no) values('"+(s_id+1)+"','"+(food_num.getText())+"','"+(s_id+1)+"')";
            s.executeUpdate(k);
            
            JOptionPane.showMessageDialog(null, "Food Ordered Successfully");

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
        
         }


    }//GEN-LAST:event_orderActionPerformed

    private void food_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_food_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_food_numActionPerformed

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
            java.util.logging.Logger.getLogger(order_food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(order_food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(order_food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(order_food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new order_food().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel1;
    private javax.swing.JTextField food_num;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton order;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
