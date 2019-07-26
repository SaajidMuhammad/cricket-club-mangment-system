/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cricketclub;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Saajid Muhammad
 */
public class ViewMembers extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form ViewMembers
     */
    public ViewMembers() {
        initComponents();
        this.setLocationRelativeTo(null);
        con = DBconnect.connect();
        tableload();
    }
    
    public void tableload()
    {
         try {
        
        String sql = "SELECT Member_ID,First_Name,Last_Name,District,DOB,Gender,Phone_No,E_Mail FROM member_details";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
 

        
        
        }catch (Exception e)
      {
           JOptionPane.showMessageDialog(null, e.toString(), "InfoBox", JOptionPane.INFORMATION_MESSAGE);
 
          
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

        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox_Dis = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_Sfn = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField_Sln = new javax.swing.JTextField();
        jTextField_Sd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Members - Cricket Club Management System");
        setMinimumSize(new java.awt.Dimension(1200, 580));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cricketclub/012_power-512.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(10, 510, 40, 35);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3), "Member Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name");

        jTextField1.setFont(new java.awt.Font("Agency FB", 1, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name");

        jTextField5.setFont(new java.awt.Font("Agency FB", 1, 13)); // NOI18N
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("District");

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone No");

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-Mail");

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date Of Birth");

        jTextField6.setFont(new java.awt.Font("Agency FB", 1, 13)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Agency FB", 1, 13)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Agency FB", 1, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female" }));

        jComboBox_Dis.setFont(new java.awt.Font("Agency FB", 1, 13)); // NOI18N
        jComboBox_Dis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select District", "Ampara", "Anuradhapura", "Batticaloa", "Badulla", "Colombo", "Galle", "Gampaha", "Hambantota", "Jaffna", "Kandy", "Kegalle", "Mannar", "Moneragala", "Matale", "Matara", "Mullaitivu", "Nuwara Eliya", "Polannaruwa", "Trincomalee", "Vavuniya" }));

        jTextField3.setFont(new java.awt.Font("Agency FB", 1, 13)); // NOI18N
        jTextField3.setText("DD/MM/YYYY");

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Index : ");

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox_Dis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField6)
                        .addComponent(jTextField5)
                        .addComponent(jTextField2)
                        .addComponent(jTextField1)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_Dis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(26, 29, 305, 431);

        jTable1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "District", "Date Of Birth", "Gender", "Phone No", "E-Mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFillsViewportHeight(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(349, 134, 832, 336);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3), "Search Members", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(240, 240, 240));

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Last Name ");

        jTextField_Sfn.setFont(new java.awt.Font("Agency FB", 1, 13)); // NOI18N

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cricketclub/16492(1).png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cricketclub/16492(1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField_Sln.setFont(new java.awt.Font("Agency FB", 1, 13)); // NOI18N

        jTextField_Sd.setFont(new java.awt.Font("Agency FB", 1, 13)); // NOI18N
        jTextField_Sd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SdActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("First Name");

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Member ID");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cricketclub/16492(1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_Sfn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_Sln, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_Sd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jTextField_Sd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Sln, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jTextField_Sfn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(349, 29, 850, 87);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cricketclub/BGP-2.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 1260, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int r = jTable1.getSelectedRow();

        String id = jTable1.getValueAt(r, 0).toString();
        String fname = jTable1.getValueAt(r, 1).toString();
        String lname = jTable1.getValueAt(r, 2).toString();
        String district = jTable1.getValueAt(r, 3).toString();
        String dob = jTable1.getValueAt(r, 4).toString();
        String gender = jTable1.getValueAt(r, 5).toString();
        String pno = jTable1.getValueAt(r, 6).toString();
        String email = jTable1.getValueAt(r, 7).toString();

        jLabel10.setText(id);
        jTextField1.setText(fname);
        jTextField2.setText(lname);
        jComboBox_Dis.setSelectedItem(district);
        jTextField3.setText(dob);
        jComboBox1.setSelectedItem(gender);
        jTextField5.setText(pno);
        jTextField6.setText(email);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String fname = jTextField_Sfn.getText();
        
        String sql = "SELECT Member_ID,First_Name,Last_Name,District,DOB,Gender,Phone_No,E_Mail FROM member_details WHERE First_Name LIKE '%"+ fname +"%'";
        
        {
         try {
        
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
 

        
        
        }catch (Exception e)
      {
           JOptionPane.showMessageDialog(null, e.toString(), "InfoBox", JOptionPane.INFORMATION_MESSAGE);
 
          
      }
    
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String lname = jTextField_Sln.getText();
        
        String sql = "SELECT Member_ID,First_Name,Last_Name,District,DOB,Gender,Phone_No,E_Mail FROM member_details WHERE Last_Name LIKE '%"+ lname +"%'";
        
        {
         try {
        
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
 

        
        
        }catch (Exception e)
      {
           JOptionPane.showMessageDialog(null, e.toString(), "InfoBox", JOptionPane.INFORMATION_MESSAGE);
 
          
      }
    
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        String id = jTextField_Sd.getText();
        
        String sql = "SELECT Member_ID,First_Name,Last_Name,District,DOB,Gender,Phone_No,E_Mail FROM member_details WHERE Member_ID = '"+ id +"'";
        
        {
         try {
        
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
 

        
        
        }catch (Exception e)
      {
           JOptionPane.showMessageDialog(null, e.toString(), "InfoBox", JOptionPane.INFORMATION_MESSAGE);
 
          
      }
    
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField_SdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SdActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMembers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox_Dis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField_Sd;
    private javax.swing.JTextField jTextField_Sfn;
    private javax.swing.JTextField jTextField_Sln;
    // End of variables declaration//GEN-END:variables
}