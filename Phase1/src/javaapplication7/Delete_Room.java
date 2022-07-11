/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;
import java.sql.*;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;



/**
 *
 * @author FAHAD_ISHAQ
 */
public class Delete_Room extends javax.swing.JFrame {

    /**
     * Creates new form Delete_Room
     */
    public Delete_Room() {
        initComponents();
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

        jLabel10 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        find = new javax.swing.JButton();
        delete_room = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        all = new javax.swing.JButton();
        id1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cancel1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Enter Room Number:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, 40));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 150, -1));

        find.setText("Find");
        find.setSelected(true);
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        getContentPane().add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        delete_room.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete_room.setText("DELETE ROOM");
        delete_room.setSelected(true);
        delete_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_roomActionPerformed(evt);
            }
        });
        getContentPane().add(delete_room, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 160, 50));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Price", "Booked Status"
            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 800, 280));

        clear.setText("Clear");
        clear.setSelected(true);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, -1));

        all.setText("Show All ");
        all.setSelected(true);
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });
        getContentPane().add(all, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));

        id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id1ActionPerformed(evt);
            }
        });
        getContentPane().add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 150, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Search by Room Number");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 20));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/room.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
     table.setModel(new DefaultTableModel(null,new String[]{"Room Number","Room Type","Price","Booked Status"}));

        String idd=id.getText();

try{
    

              Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
            
            
             ResultSet rs=s.executeQuery("select * from Room where room_id='"+idd+"'");
             
             
                  
            while (rs.next())
            {
                
               String C=String.valueOf(rs.getLong("room_id"));

               String N=String.valueOf(rs.getString("room_type"));
               String Ns=String.valueOf(rs.getString("room_price"));
                                          
               String Nsfa=String.valueOf(rs.getString("is_booked"));
               

               String tbdata[]={C,N,Ns,Nsfa};
                System.out.println("here");
                
      DefaultTableModel table3=(DefaultTableModel)table.getModel();
               
               table3.addRow(tbdata);
               
            
               
            }
            con.close();
          
           
}catch(Exception e){
    System.out.println(e.toString()+" Exception");
        JOptionPane.showMessageDialog(null, e);

}

    }//GEN-LAST:event_findActionPerformed

    private void delete_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_roomActionPerformed
     
        
        
         String idd=id1.getText();
         
           int room=0;
           
                  int counter=0; 
        
          try
        {
            Class.forName("oracle.jdbc.OracleDriver");

	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");

           
            Statement s=con.createStatement();

            java.sql.ResultSet rs=s.executeQuery("select * from room where room_id='"+idd+"'");
         
            
                
            while (rs.next())
            {
                String k=String.valueOf(rs.getLong("room_id"));
                if (k.equals(idd)){
                    counter++; 
                    
                }
                
            }
            con.close();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
          
         
         
         try{
    

              Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
            
            
             ResultSet rs=s.executeQuery("select is_booked from Room where room_id='"+idd+"'");

         
             System.out.println("fahad");

           
         
            while (rs.next())
            {
                
             
                                          
               String Nsfa=String.valueOf(rs.getString("is_booked"));
              
               if (Nsfa.equals("true")){
                JOptionPane.showMessageDialog(null, "Booked Room Cannot be Deleted");
                    room++;
                    
                   break;
          

               }
                else{
                   
                   continue;                   
               }
             
            }
            con.close();
          
           
}catch(Exception e){
    System.out.println(e.toString()+" Exception");
        JOptionPane.showMessageDialog(null, e);
         
         
}
         
         if (room==0 && counter!=0){
         
          try 
        {
           	       
             Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
            Statement s=con.createStatement();
            
            
         
            String l= "DELETE FROM Room WHERE room_id='"+idd+"'order by room_id";
                        JOptionPane.showMessageDialog(null,"Room Record Deleted Successfully");

           
            s.executeUpdate(l);
                        
        }
           catch(Exception e) {
               
              	System.out.println(e);
               


           }
        
          
           
         }
         else{
           JOptionPane.showMessageDialog(null,"Room Doest Not Exists");

         }
        
        
        
        
        
    }//GEN-LAST:event_delete_roomActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
         all.setSelected(true);
        all.setEnabled(true);
        table.setModel(new DefaultTableModel(null,new String[]{"Room Number","Room Type","Price","Booked Status"}));
   
    }//GEN-LAST:event_clearActionPerformed

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        
         table.setModel(new DefaultTableModel(null,new String[]{"Room Number","Room Type","Price","Booked Status"}));

        all.setEnabled(false);
        
        
        all_rooms();
      
    }//GEN-LAST:event_allActionPerformed

    private void id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id1ActionPerformed
        
    }//GEN-LAST:event_id1ActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Room().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton all;
    private javax.swing.JButton cancel1;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete_room;
    private javax.swing.JButton find;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
