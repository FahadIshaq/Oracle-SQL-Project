/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author FAHAD_ISHAQ
 */
public class Admin_Options extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Options
     */
    public Admin_Options() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        event = new javax.swing.JButton();
        Update1 = new javax.swing.JButton();
        employees = new javax.swing.JButton();
        Add_Room1 = new javax.swing.JButton();
        Add_Food = new javax.swing.JButton();
        customer = new javax.swing.JButton();
        reviews = new javax.swing.JButton();
        LAUNDRY = new javax.swing.JButton();
        reservations = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        done = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        event.setBackground(new java.awt.Color(0, 0, 0));
        event.setForeground(new java.awt.Color(255, 255, 255));
        event.setText("EVENTS");
        event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventActionPerformed(evt);
            }
        });
        getContentPane().add(event, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        Update1.setBackground(new java.awt.Color(0, 0, 0));
        Update1.setForeground(new java.awt.Color(255, 255, 255));
        Update1.setText("PROFILE");
        Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update1ActionPerformed(evt);
            }
        });
        getContentPane().add(Update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, -1, -1));

        employees.setBackground(new java.awt.Color(0, 0, 0));
        employees.setForeground(new java.awt.Color(255, 255, 255));
        employees.setText("EMPLOYEES");
        employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesActionPerformed(evt);
            }
        });
        getContentPane().add(employees, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        Add_Room1.setBackground(new java.awt.Color(0, 0, 0));
        Add_Room1.setForeground(new java.awt.Color(255, 255, 255));
        Add_Room1.setText("ROOMS");
        Add_Room1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Room1ActionPerformed(evt);
            }
        });
        getContentPane().add(Add_Room1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, -1, -1));

        Add_Food.setBackground(new java.awt.Color(0, 0, 0));
        Add_Food.setForeground(new java.awt.Color(255, 255, 255));
        Add_Food.setText("FOOD");
        Add_Food.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_FoodActionPerformed(evt);
            }
        });
        getContentPane().add(Add_Food, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        customer.setBackground(new java.awt.Color(0, 0, 0));
        customer.setForeground(new java.awt.Color(255, 255, 255));
        customer.setText("CUSTOMERS");
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        getContentPane().add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 120, -1));

        reviews.setBackground(new java.awt.Color(0, 0, 0));
        reviews.setForeground(new java.awt.Color(255, 255, 255));
        reviews.setText("REVIEWS");
        reviews.setSelected(true);
        reviews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewsActionPerformed(evt);
            }
        });
        getContentPane().add(reviews, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        LAUNDRY.setBackground(new java.awt.Color(0, 0, 0));
        LAUNDRY.setForeground(new java.awt.Color(255, 255, 255));
        LAUNDRY.setText("LAUNDRY");
        LAUNDRY.setSelected(true);
        LAUNDRY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAUNDRYActionPerformed(evt);
            }
        });
        getContentPane().add(LAUNDRY, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, -1, -1));

        reservations.setBackground(new java.awt.Color(0, 0, 0));
        reservations.setForeground(new java.awt.Color(255, 255, 255));
        reservations.setText("RESERVATIONS");
        reservations.setSelected(true);
        reservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationsActionPerformed(evt);
            }
        });
        getContentPane().add(reservations, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, -1, -1));

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancel.setText("BACK");
        cancel.setSelected(true);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, 160, 50));

        done.setBackground(new java.awt.Color(255, 255, 255));
        done.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        done.setText("DONE");
        done.setSelected(true);
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });
        getContentPane().add(done, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 160, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/admin_options.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, -1, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventActionPerformed
        // TODO add your handling code here:
            dispose();
             admin_events cust=new admin_events();
        cust.setSize(1191, 632);
        cust.setLocationRelativeTo(null);
        cust.setVisible(true);
     
    }//GEN-LAST:event_eventActionPerformed

    private void Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update1ActionPerformed
        // TODO add your handling code here:
        dispose();
          Edit_Admin admin=new Edit_Admin();
        admin.setLocationRelativeTo(null);
        admin.setVisible(true);
    }//GEN-LAST:event_Update1ActionPerformed

    private void employeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesActionPerformed
        // TODO add your handling code here:
        dispose();
             admin_employee emp=new admin_employee();
         emp.setLocationRelativeTo(null);
        emp.setVisible(true);
    }//GEN-LAST:event_employeesActionPerformed

    private void Add_Room1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Room1ActionPerformed
        // TODO add your handling code here:
           dispose();
             admin_rooms cust=new admin_rooms();
         cust.setLocationRelativeTo(null);
        cust.setVisible(true);
    }//GEN-LAST:event_Add_Room1ActionPerformed

    private void Add_FoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_FoodActionPerformed
        // TODO add your handling code here:
         dispose();
          admin_food admin=new admin_food();
//        admin.setBounds(210, 100, 1020, 523);
admin.setLocationRelativeTo(null);
        admin.setVisible(true);
    }//GEN-LAST:event_Add_FoodActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        
        dispose();
        admin_customer admin=new admin_customer();
         admin.setLocationRelativeTo(null);
        admin.setVisible(true);
        
        
    }//GEN-LAST:event_customerActionPerformed

    private void reviewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewsActionPerformed
                dispose();
        admin_reviews admin=new admin_reviews();
         admin.setLocationRelativeTo(null);
        admin.setVisible(true);
       
    }//GEN-LAST:event_reviewsActionPerformed

    private void LAUNDRYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAUNDRYActionPerformed
          dispose();
        admin_laundry cust=new admin_laundry();
        cust.setLocationRelativeTo(null);
        cust.setVisible(true);
    }//GEN-LAST:event_LAUNDRYActionPerformed

    private void reservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationsActionPerformed
                  dispose();
        Reservations cust=new Reservations();
         cust.setLocationRelativeTo(null);
        cust.setVisible(true);
    }//GEN-LAST:event_reservationsActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
        Home cust=new Home();
        cust.setLocationRelativeTo(null);
        cust.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        // TODO add your handling code here:
        
        dispose();
        Home cust=new Home();
        cust.setLocationRelativeTo(null);
        cust.setVisible(true);
        
    }//GEN-LAST:event_doneActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Food;
    private javax.swing.JButton Add_Room1;
    private javax.swing.JButton LAUNDRY;
    private javax.swing.JButton Update1;
    private javax.swing.JButton cancel;
    private javax.swing.JButton customer;
    private javax.swing.JButton done;
    private javax.swing.JButton employees;
    private javax.swing.JButton event;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton reservations;
    private javax.swing.JButton reviews;
    // End of variables declaration//GEN-END:variables
}
