/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FAHAD_ISHAQ
 */
public class Add_Rooms extends javax.swing.JFrame {

    /**
     * Creates new form Add_Rooms
     */
    public Add_Rooms() {
        initComponents();
        all_rooms();
    }

    private void all_rooms(){
        try 
        {
            //JavaConnection j1=new JavaConnection();
            Class.forName("oracle.jdbc.OracleDriver");
			  
			//step2 create  the connection object  jdbc:oracle:thin:tiger/scott@localhost:1521:productDB
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");

			
            String[ ][ ] row=new String[8][8];
            Statement s=con.createStatement();  
            
            ResultSet rs=s.executeQuery("SELECT * from ROOM");
             System.out.println("here");
            while (rs.next())
            {
               String a=String.valueOf(rs.getLong("Room_id"));
               String aF=String.valueOf(rs.getString("Room_Type"));
               String Ns=String.valueOf(rs.getString("is_Booked"));
               
               String Nsfa=String.valueOf(rs.getLong("room_price"));
               String desc=String.valueOf(rs.getString("Descriptions"));
               String tbdata[]={a,aF,Ns,Nsfa,desc};
               DefaultTableModel table3=(DefaultTableModel)table2.getModel();
               table3.addRow(tbdata);
               
            }
            con.close();
//            JOptionPane.showMessageDialog(null, "Search Found");
        }  
			  
	catch(Exception e){ 
				JOptionPane.showMessageDialog(null, e);
                                
			}  
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        description = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        room_price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        single = new javax.swing.JRadioButton();
        two = new javax.swing.JRadioButton();
        studio = new javax.swing.JRadioButton();
        triple = new javax.swing.JRadioButton();
        quad = new javax.swing.JRadioButton();
        cancel1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("ADD ROOM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 160, 50));

        description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionActionPerformed(evt);
            }
        });
        getContentPane().add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 210, 50));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Room Price: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Room Type: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        room_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room_priceActionPerformed(evt);
            }
        });
        getContentPane().add(room_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 210, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Description: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room_id", "Room_Type", "Is_Booked", "room_Price", "Description"
            }
        ));
        table2.setEnabled(false);
        jScrollPane2.setViewportView(table2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 950, 220));

        buttonGroup1.add(single);
        single.setText("Single Bed Room");
        getContentPane().add(single, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        buttonGroup1.add(two);
        two.setText("Double Room");
        getContentPane().add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 100, -1));

        buttonGroup1.add(studio);
        studio.setText("Studio Room");
        studio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studioActionPerformed(evt);
            }
        });
        getContentPane().add(studio, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        buttonGroup1.add(triple);
        triple.setText("Triple Room");
        getContentPane().add(triple, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, -1, -1));

        buttonGroup1.add(quad);
        quad.setText("Quad Room");
        getContentPane().add(quad, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, -1, -1));

        cancel1.setBackground(new java.awt.Color(255, 255, 255));
        cancel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancel1.setText("BACK");
        cancel1.setSelected(true);
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });
        getContentPane().add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 160, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/ROOMS.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
           int room_no=0;
           
        //Long cnic=Long.parseLong(CNIC);
        String price=room_price.getText();
        String type="";
        if (single.isSelected()){
            type+="Single Bed Room";
            
        }else if (two.isSelected()){
            type+="Double Bed Room";
            
        }else if (studio.isSelected()){
            type+="Studio Room";
            
        }else if(triple.isSelected()){
            type+="Triple Bed Room";
            
        }else if (quad.isSelected()){
            type+="Quad Bed Room";
            
        }
        
        
        
         try 
        {
            
            Class.forName("oracle.jdbc.OracleDriver");
			  
			
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();  
            
            java.sql.ResultSet rs=s.executeQuery("SELECT room_id from room");
            int b=0;
            while (rs.next())
            {
               String a=String.valueOf(rs.getLong("room_id"));
               b=Integer.parseInt(a);
               if (b==room_no){
                  continue;
               }else{
                   b++;
                   
               }
            
            }
            room_no=b;
            
            con.close();
        }  
			  
	catch(Exception e){ 
				JOptionPane.showMessageDialog(null, e);
                                
			}  
        
        
        
        
        
        
        
        
        String room_description=description.getText();
        String is_booked="false";
 
          
          try 
        {
            //JavaConnection j1=new JavaConnection();
            Class.forName("oracle.jdbc.OracleDriver");
			  
			//step2 create  the connection object  jdbc:oracle:thin:tiger/scott@localhost:1521:productDB
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
             
            String l= "INSERT into Room(room_id,room_type,is_booked,room_price,descriptions) values('"+(room_no+1)+"','"+type+"','"+is_booked+"','"+price+"','"+room_description+"')";
            s.executeUpdate(l);
              JOptionPane.showMessageDialog(null, "Room_Added ADDED"); 
                      all_rooms();

        
        }
        catch(Exception e){
            	JOptionPane.showMessageDialog(null, e);
            }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionActionPerformed

    private void room_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_room_priceActionPerformed

    private void studioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studioActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        dispose();
        admin_rooms cust=new admin_rooms();
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
            java.util.logging.Logger.getLogger(Add_Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Rooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cancel1;
    private javax.swing.JTextField description;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton quad;
    private javax.swing.JTextField room_price;
    private javax.swing.JRadioButton single;
    private javax.swing.JRadioButton studio;
    private javax.swing.JTable table2;
    private javax.swing.JRadioButton triple;
    private javax.swing.JRadioButton two;
    // End of variables declaration//GEN-END:variables
}
