/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author FAHAD_ISHAQ
 */
public class admin_customer extends javax.swing.JFrame {

    /**
     * Creates new form admin_customer
     */
    public admin_customer() {
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

        ADD = new javax.swing.JButton();
        FIND = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        BACK = new javax.swing.JButton();
        DONE = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ADD.setBackground(new java.awt.Color(0, 0, 0));
        ADD.setForeground(new java.awt.Color(255, 255, 255));
        ADD.setText("ADD CUSTOMER");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        getContentPane().add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 150, -1));

        FIND.setBackground(new java.awt.Color(0, 0, 0));
        FIND.setForeground(new java.awt.Color(255, 255, 255));
        FIND.setText("SEARCH CUSTOMER");
        FIND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FINDActionPerformed(evt);
            }
        });
        getContentPane().add(FIND, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 150, -1));

        DELETE.setBackground(new java.awt.Color(0, 0, 0));
        DELETE.setForeground(new java.awt.Color(255, 255, 255));
        DELETE.setText("DELETE CUSTOMER");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        getContentPane().add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 150, -1));

        BACK.setBackground(new java.awt.Color(255, 255, 255));
        BACK.setText("DONE");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        getContentPane().add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 130, 40));

        DONE.setBackground(new java.awt.Color(255, 255, 255));
        DONE.setText(" CANCEL");
        DONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DONEActionPerformed(evt);
            }
        });
        getContentPane().add(DONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 130, 40));

        update.setBackground(new java.awt.Color(0, 0, 0));
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE  CUSTOMER");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, 170, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/CUST.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed

        dispose();
        Add_Customer cust=new Add_Customer();
          cust.setSize(1191,632);
        cust.setLocationRelativeTo(null);
      
        cust.setVisible(true);
    }//GEN-LAST:event_ADDActionPerformed

    private void FINDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FINDActionPerformed
        // TODO add your handling code here:
           dispose();
       
        View_Customer delete=new View_Customer();
         delete.setLocationRelativeTo(null);
             
        delete.setVisible(true);
    }//GEN-LAST:event_FINDActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
       dispose();
       
        Delete_Customer delete=new Delete_Customer();
         delete.setLocationRelativeTo(null);
             
        delete.setVisible(true);
    }//GEN-LAST:event_DELETEActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
        dispose();
        Admin_Options option = new Admin_Options();
         option.setLocationRelativeTo(null);
        option.setVisible(true);
        
    }//GEN-LAST:event_BACKActionPerformed

    private void DONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DONEActionPerformed
        // TODO add your handling code here:
             dispose();
        Admin_Options option = new Admin_Options();
         option.setLocationRelativeTo(null);
        option.setVisible(true);
    }//GEN-LAST:event_DONEActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        dispose(); 
        Update_Customer cust=new Update_Customer();
         cust.setSize(1191,632);
        cust.setLocationRelativeTo(null);
      
        cust.setVisible(true);
        
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(admin_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton BACK;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton DONE;
    private javax.swing.JButton FIND;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
