/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author FAHAD_ISHAQ
 */
public class admin_events extends javax.swing.JFrame {

    /**
     * Creates new form admin_events
     */
    public admin_events() {
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

        DELETE = new javax.swing.JButton();
        FIND = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        CANCELL = new javax.swing.JButton();
        DONE = new javax.swing.JButton();
        FIND1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DELETE.setBackground(new java.awt.Color(0, 0, 0));
        DELETE.setForeground(new java.awt.Color(255, 255, 255));
        DELETE.setText("DELETE EVENT");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        getContentPane().add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 160, -1));

        FIND.setBackground(new java.awt.Color(0, 0, 0));
        FIND.setForeground(new java.awt.Color(255, 255, 255));
        FIND.setText("SEARCH EVENT");
        FIND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FINDActionPerformed(evt);
            }
        });
        getContentPane().add(FIND, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 150, -1));

        ADD.setBackground(new java.awt.Color(0, 0, 0));
        ADD.setForeground(new java.awt.Color(255, 255, 255));
        ADD.setText("ADD EVENT");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        getContentPane().add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 150, -1));

        CANCELL.setBackground(new java.awt.Color(255, 255, 255));
        CANCELL.setText(" CANCEL");
        CANCELL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELLActionPerformed(evt);
            }
        });
        getContentPane().add(CANCELL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 130, 40));

        DONE.setBackground(new java.awt.Color(255, 255, 255));
        DONE.setText("DONE");
        DONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DONEActionPerformed(evt);
            }
        });
        getContentPane().add(DONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 130, 40));

        FIND1.setBackground(new java.awt.Color(0, 0, 0));
        FIND1.setForeground(new java.awt.Color(255, 255, 255));
        FIND1.setText("UPDATE EVENT");
        FIND1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIND1ActionPerformed(evt);
            }
        });
        getContentPane().add(FIND1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/events_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        dispose();

        Delete_Event delete=new Delete_Event();
        delete.setLocationRelativeTo(null);
        delete.setVisible(true);
    }//GEN-LAST:event_DELETEActionPerformed

    private void FINDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FINDActionPerformed
        // TODO add your handling code here:
        dispose();

        View_Event delete=new View_Event();
        delete.setLocationRelativeTo(null);
        delete.setVisible(true);
    }//GEN-LAST:event_FINDActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed

        dispose();
        Add_Event cust=new Add_Event();
        cust.setSize(1191, 632);
        cust.setLocationRelativeTo(null);

        cust.setVisible(true);
    }//GEN-LAST:event_ADDActionPerformed

    private void CANCELLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELLActionPerformed
        // TODO add your handling code here:
        dispose();
        Admin_Options option = new Admin_Options();
        option.setLocationRelativeTo(null);
        option.setVisible(true);
    }//GEN-LAST:event_CANCELLActionPerformed

    private void DONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DONEActionPerformed
        // TODO add your handling code here:
        dispose();
        Admin_Options option = new Admin_Options();
        option.setLocationRelativeTo(null);
        option.setVisible(true);
    }//GEN-LAST:event_DONEActionPerformed

    private void FIND1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIND1ActionPerformed
dispose();
Update_Event e=new Update_Event();
e.setLocationRelativeTo(null);
e.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_FIND1ActionPerformed

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
            java.util.logging.Logger.getLogger(admin_events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_events.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_events().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton CANCELL;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton DONE;
    private javax.swing.JButton FIND;
    private javax.swing.JButton FIND1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
