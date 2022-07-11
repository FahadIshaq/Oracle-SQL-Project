/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author FAHAD_ISHAQ
 */
public class Update_Event extends javax.swing.JFrame {

    /**
     * Creates new form Update_Event
     */
    public Update_Event() {
        initComponents();
    }
    
    
    
    
      public void set_text(String num){
        
              try 
        {
            Class.forName("oracle.jdbc.OracleDriver");
	 
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
             java.sql.Statement s=con.createStatement();

            
            java.sql.ResultSet rs=s.executeQuery("select * from Admin_Events where event_id='"+num+"'");
            
            while (rs.next())
            {
              
               String nm=String.valueOf(rs.getString("event_name"));
               String ad=String.valueOf(rs.getString("event_description"));
               String ph=String.valueOf(rs.getString("event_price"));
               String datee=String.valueOf(rs.getString("even_date"));
               String typee=String.valueOf(rs.getString("even_type"));
            
         name.setText(nm);
         desc.setText(ad);
         price.setText(ph);
         date.setText(datee);
         
         
          if (typee.equals("Seminar")){
                  
                   seminar.setSelected(true);
               }
               else if (typee.equals("Shows and Events")){
                  
                   shows.setSelected(true);
                   
               }else if (typee.equals("Conference")){
                   conference.setSelected(true);
               }else if (typee.equals("Informative")){
                   informative.setSelected(true);
                   
               }
      
            }
            
            
        }
        catch(Exception e){ 
				JOptionPane.showMessageDialog(null, "No Record");
                                
			}  
              
     }


   
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        desc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        find = new javax.swing.JButton();
        seminar = new javax.swing.JRadioButton();
        shows = new javax.swing.JRadioButton();
        conference = new javax.swing.JRadioButton();
        informative = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Search By Event Name: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 150, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 300, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("EVENT NAME: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 210, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("EVENT DATE & TIME: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 160, -1));

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 210, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("EVENT DESCRIPTION: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 170, -1));

        desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descActionPerformed(evt);
            }
        });
        getContentPane().add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 210, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("EVENT TYPE: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 210, -1));

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setText("UPDATE EVENT");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 550, 150, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("TICKET PRICE: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        find.setBackground(new java.awt.Color(255, 255, 255));
        find.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        find.setText("Find");
        find.setSelected(true);
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        getContentPane().add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 60, -1));

        buttonGroup1.add(seminar);
        seminar.setText("SEMINAR");
        getContentPane().add(seminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, -1, -1));

        buttonGroup1.add(shows);
        shows.setText("SHOWS AND EVENTS");
        getContentPane().add(shows, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        buttonGroup1.add(conference);
        conference.setText("CONFERENCE");
        conference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conferenceActionPerformed(evt);
            }
        });
        getContentPane().add(conference, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, -1));

        buttonGroup1.add(informative);
        informative.setText("INFORMATIVE");
        getContentPane().add(informative, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 550, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/eventt.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_dateActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        
            String n=name.getText();
         String descriptionn=desc.getText();
         String p=price.getText();
         String e=date.getText();
         String typeee="";
           
        if (seminar.isSelected()){
            typeee+="Seminar";
            
        }
        else if (shows.isSelected()){
            typeee+="Shows and Events";
        }
        else if (conference.isSelected()){
            typeee+="Conference";
            
        }
        else if (informative.isSelected()){
            typeee+="Informative";
            
        }
        
      
         
         
        
             try 
        {
            Class.forName("oracle.jdbc.OracleDriver");
			  
	      Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");
             java.sql.Statement s=con.createStatement();
            String l= "UPDATE admin_event set event_name='"+n+"',event_description='"+p+"',event_price='"+p+"',event_date='"+e+"',event_type='"+typeee+"' where event_name='"+id.getText()+ "'";

            s.executeUpdate(l);
            JOptionPane.showMessageDialog(null,"EVENT RECORD UPDATED SUCCESSFULY");
        
        }
             catch (Exception ex){
              JOptionPane.showMessageDialog(null,ex);

             }
        
        
    }//GEN-LAST:event_updateActionPerformed

    private void descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        set_text(id.getText());

    }//GEN-LAST:event_findActionPerformed

    private void conferenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conferenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conferenceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               
        dispose();
        
        admin_events e=new admin_events();
                e.setLocationRelativeTo(null);
                e.setVisible(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Update_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Event().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton conference;
    private javax.swing.JTextField date;
    private javax.swing.JTextField desc;
    private javax.swing.JButton find;
    private javax.swing.JTextField id;
    private javax.swing.JRadioButton informative;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JRadioButton seminar;
    private javax.swing.JRadioButton shows;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
