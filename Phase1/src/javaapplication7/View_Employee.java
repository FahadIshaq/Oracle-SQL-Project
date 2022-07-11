/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author FAHAD_ISHAQ
 */
public class View_Employee extends javax.swing.JFrame {

    /**
     * Creates new form View_Employee
     */
    public View_Employee() {
        initComponents();
    }
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        find = new javax.swing.JButton();
        view_All = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        cancel1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Search by CNIC: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, 20));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 150, -1));

        find.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        find.setText("Find");
        find.setSelected(true);
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        getContentPane().add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, -1, -1));

        view_All.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        view_All.setText("View All");
        view_All.setSelected(true);
        view_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_AllActionPerformed(evt);
            }
        });
        getContentPane().add(view_All, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 160, 50));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "CNIC", "Address", "Gender", "Phone", "Salary", "Job"
            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 670, 340));

        clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clear.setText("Clear");
        clear.setSelected(true);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, -1, -1));

        cancel1.setBackground(new java.awt.Color(255, 255, 255));
        cancel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancel1.setText("BACK");
        cancel1.setSelected(true);
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });
        getContentPane().add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 160, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/SEARCH_EMPL.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
       
        table.setModel(new DefaultTableModel(null,new String[]{"ID","Name","CNIC","Address","Gender","Phone","Salary","Job"}));
 
        
        String CNIC=id.getText();
        int check=0;
        
         try
        {
            Class.forName("oracle.jdbc.OracleDriver");

	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");

            String[][] row=new String[4][6];
            Statement s=con.createStatement();
            
            
            java.sql.ResultSet rs=s.executeQuery("select * from staff where emp_cnic='"+CNIC+"'");

            while (rs.next())
            {
                  String k=String.valueOf(rs.getString("emp_id"));
                String CNIC_n=String.valueOf(rs.getString("emp_name"));
                String Name=String.valueOf(rs.getString("emp_cnic"));
                String Address=String.valueOf(rs.getString("emp_Address"));
                String Gender=String.valueOf(rs.getString("emp_Gender"));
                String Phone_No=String.valueOf(rs.getString("emp_contact"));
                String salary=String.valueOf(rs.getString("emp_salary"));
                String job=String.valueOf(rs.getString("emp_job"));
                
                check++;
                
                String tbdata[]={k,CNIC_n,Name,Address,Gender,Phone_No,salary,job};
                
                
                DefaultTableModel table3=(DefaultTableModel)table.getModel();

                table3.addRow(tbdata);

            }
            con.close();
            
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
         
         if (check==0){
                         JOptionPane.showMessageDialog(null, "NO RECORD FOUND");

             
         }
       
        
    }//GEN-LAST:event_findActionPerformed

    private void view_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_AllActionPerformed
           view_All.setSelected(false);
        view_All.setEnabled(false);
                table.setModel(new DefaultTableModel(null,new String[]{"ID","Name","CNIC","Address","Gender","Phone","Salary","Job"}));

        try
        {
                     
             Class.forName("oracle.jdbc.OracleDriver");
			  
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:TWITTER/twitter@//localhost:1521/orclpdb");

            String[][] row=new String[4][6];
            Statement s=con.createStatement();

            java.sql.ResultSet rs=s.executeQuery("select * from staff order by emp_id");

            while (rs.next())
            {
                 String k=String.valueOf(rs.getString("emp_id"));
                String CNIC_n=String.valueOf(rs.getString("emp_name"));
                String Name=String.valueOf(rs.getString("emp_cnic"));
                String Address=String.valueOf(rs.getString("emp_Address"));
                String Gender=String.valueOf(rs.getString("emp_Gender"));
                String Phone_No=String.valueOf(rs.getString("emp_contact"));
                String salary=String.valueOf(rs.getString("emp_salary"));
                String job=String.valueOf(rs.getString("emp_job"));

                String tbdata[]={k,CNIC_n,Name,Address,Gender,Phone_No,salary,job};
                
                
                DefaultTableModel table3=(DefaultTableModel)table.getModel();

                table3.addRow(tbdata);

            }
            con.close();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
        
    }//GEN-LAST:event_view_AllActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
         view_All.setSelected(true);
        view_All.setEnabled(true);
        table.setModel(new DefaultTableModel(null,new String[]{"ID","Name","CNIC","Address","Gender","Phone","Salary","Job"}));
 
        
        
        
        
    }//GEN-LAST:event_clearActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        dispose();
        admin_employee cust=new admin_employee();
         cust.setLocationRelativeTo(null);
        cust.setVisible(true);
    }//GEN-LAST:event_cancel1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel1;
    private javax.swing.JButton clear;
    private javax.swing.JButton find;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JButton view_All;
    // End of variables declaration//GEN-END:variables
}
