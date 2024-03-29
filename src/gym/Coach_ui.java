package gym;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 
 */
public class Coach_ui extends javax.swing.JFrame {

    dbConnect dbCon = new dbConnect();

    /**
     * Creates new form Coach
     */
    public Coach_ui() {
        initComponents();
        fillLables();
        
    }

    private void fillLables() {
        try {
            dbCon.dbConnector();
            String sql = "SELECT coach_id,coach_name,coach_username,coach_password,coach_mobile,coach_address from coaches";
            ResultSet rss = dbCon.st.executeQuery(sql);
            while (rss.next()) {
                JLabel label = new JLabel("<html> <b><br> Coach_Id: " + rss.getInt("coach_id") + "<br><br> Name: " + rss.getString("coach_name")
                        + " </b><br><br> Mobile: " + rss.getString("coach_mobile") + " <br><br> Address: " + rss.getString("coach_address") + "  </html>");
                label.setPreferredSize(new Dimension(250, 200));
                label.setOpaque(true);
                label.setFont(new Font("Tahoma", Font.PLAIN, 14));
                label.setBackground(new Color(0, 153, 153));
                label.setForeground(Color.WHITE);
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setVerticalAlignment(JLabel.TOP);
                coachPanel.add(label);
            }
            dbCon.dbClose();
        } catch (Exception e) {
            e.printStackTrace();
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

        jLabel26 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        coachId = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coachPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        jLabel26.setText("jLabel26");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coach ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("COACH");

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addGap(310, 310, 310)
                .addComponent(jLabel2)
                .addContainerGap(374, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton4))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 6, 891, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Choose Your Coach");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 150, -1, -1));

        jPanel4.setBackground(new java.awt.Color(52, 73, 94));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 191, -1, -1));

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 105, 30));

        jPanel7.setBackground(new java.awt.Color(52, 73, 94));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 191, -1, -1));
        getContentPane().add(coachId, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 532, 234, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Enter Coach ID: ");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 534, 140, -1));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        coachPanel.setBackground(new java.awt.Color(255, 255, 255));
        coachPanel.setLayout(new java.awt.GridLayout(0, 3, 3, 3));
        jScrollPane1.setViewportView(coachPanel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 197, 895, 317));

        jButton2.setText("Coach +");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 532, -1, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            dbCon.dbConnector();
            String mem_id = "";
            String mem_name = "";
            String mem_user = "";
            String mem_mobile = "";
            String mem_address = "";

            String sql0 = "SELECT * FROM `members` WHERE member_username = '" + MEMBER_LOGIN.user.getText() + "'";
            ResultSet rss0 = dbCon.st.executeQuery(sql0);
            if (rss0.next()) {
                mem_id = rss0.getString("member_id");
                mem_name = rss0.getString("member_name");
                mem_user = rss0.getString("member_username");
                mem_mobile = rss0.getString("member_mobile");
                mem_address = rss0.getString("member_address");
            }
            String sql = "SELECT coach_id,member_id FROM `AssignedCoaches` WHERE coach_id ='" + coachId.getText() + "' and member_username ='" + MEMBER_LOGIN.user.getText() + "'";
            ResultSet rss = dbCon.st.executeQuery(sql);
            if (rss.next()) {
                JOptionPane.showMessageDialog(null, "This Coach  Already Exists With Member '"+mem_user+"'!!!", "WARNING !!", JOptionPane.WARNING_MESSAGE);
                dbCon.dbClose();
                rss.close();
            } else {
                String sql3 = "INSERT INTO `AssignedCoaches`(`coach_id`,`member_id`,`member_name`, `member_username`, `member_mobile`,`member_address`) "
                + "VALUES ('" + coachId.getText() + "','"+mem_id+"','"+mem_name+"','"+mem_user+"','"+mem_mobile+"','"+mem_address+"')";
                dbCon.st.executeUpdate(sql3);
                JOptionPane.showMessageDialog(null, "Information Has Been Saved Successfully", "INFORMATION!", JOptionPane.INFORMATION_MESSAGE);
            }
            dbCon.dbClose();
            rss0.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Dashboard obj = new Dashboard();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new COACH_ADD_VIEW().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Coach_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coach_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coach_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coach_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coach_ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField coachId;
    private javax.swing.JPanel coachPanel;
    private javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
