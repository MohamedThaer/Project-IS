package project;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Team 7
 */
public class Sign_up extends javax.swing.JFrame {

    public Sign_up() {
        initComponents();
        this.setLocationRelativeTo(null);
        Sign_up();
    }

    public void Sign_up() {
        ImageIcon icon = new ImageIcon("D:\\Project-IS-main\\Project\\src\\images\\Login_img.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(Label.getWidth(), Label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleIcon = new ImageIcon(imgScale);
        Label.setIcon(scaleIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jpanel2 = new javax.swing.JPanel();
        lbl_username = new javax.swing.JLabel();
        text_phone = new javax.swing.JTextField();
        lbl_id = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        text_userName = new javax.swing.JTextField();
        lbl_age = new javax.swing.JLabel();
        text_age = new javax.swing.JTextField();
        lbl_gender = new javax.swing.JLabel();
        lbl_pass2 = new javax.swing.JLabel();
        lbl_number = new javax.swing.JLabel();
        text_id = new javax.swing.JTextField();
        text_pass = new javax.swing.JPasswordField();
        btn_SignUp = new javax.swing.JButton();
        rbtn_male = new javax.swing.JRadioButton();
        rbtn_female = new javax.swing.JRadioButton();
        btn_Back = new javax.swing.JButton();
        text_ConPass = new javax.swing.JPasswordField();
        Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SignUp");
        setMinimumSize(new java.awt.Dimension(742, 510));
        setResizable(false);

        jPanel1.setLayout(null);

        jpanel2.setBackground(new java.awt.Color(0, 0, 0,20));
        jpanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SignUp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(204, 89, 0))); // NOI18N
        jpanel2.setToolTipText("");

        lbl_username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_username.setText("Username : ");

        text_phone.setBackground(new java.awt.Color(250, 250, 250));

        lbl_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_id.setText("National ID :");

        lbl_pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_pass.setText("Password :");

        text_userName.setBackground(new java.awt.Color(250, 250, 250));

        lbl_age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_age.setText("Age :");

        text_age.setBackground(new java.awt.Color(250, 250, 250));

        lbl_gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_gender.setText("Gender :");

        lbl_pass2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_pass2.setText("Confirm Password :");

        lbl_number.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_number.setText("Phone Number :");

        text_id.setBackground(new java.awt.Color(250, 250, 250));

        text_pass.setBackground(new java.awt.Color(250, 250, 250));

        btn_SignUp.setBackground(new java.awt.Color(204, 204, 204));
        btn_SignUp.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_SignUp.setText("SignUp");
        btn_SignUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SignUpMouseExited(evt);
            }
        });

        rbtn_male.setBackground(null);
        buttonGroup1.add(rbtn_male);
        rbtn_male.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtn_male.setSelected(true);
        rbtn_male.setText("Male");

        rbtn_female.setBackground(null);
        buttonGroup1.add(rbtn_female);
        rbtn_female.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtn_female.setText("Female");

        btn_Back.setBackground(new java.awt.Color(204, 204, 204));
        btn_Back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Back.setText("Back");
        btn_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BackMouseClicked(evt);
            }
        });

        text_ConPass.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout jpanel2Layout = new javax.swing.GroupLayout(jpanel2);
        jpanel2.setLayout(jpanel2Layout);
        jpanel2Layout.setHorizontalGroup(
            jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(jpanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel2Layout.createSequentialGroup()
                        .addComponent(lbl_number, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(text_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanel2Layout.createSequentialGroup()
                        .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                        .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(text_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpanel2Layout.createSequentialGroup()
                        .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_pass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_pass2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_ConPass, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(text_age, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtn_male, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtn_female, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Back)
                .addGap(175, 175, 175))
        );
        jpanel2Layout.setVerticalGroup(
            jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id)
                    .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_number)
                    .addComponent(text_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_ConPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_age)
                    .addComponent(text_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_male)
                    .addComponent(rbtn_female))
                .addGap(18, 18, 18)
                .addComponent(btn_SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Back)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel1.add(jpanel2);
        jpanel2.setBounds(170, 10, 435, 490);
        jpanel2.getAccessibleContext().setAccessibleName("");

        Label.setBackground(java.awt.SystemColor.window);
        Label.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(Label);
        Label.setBounds(0, 0, 790, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("SignUp");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SignUpMouseExited
        btn_SignUp.setBackground(Color.lightGray);
    }//GEN-LAST:event_btn_SignUpMouseExited

    private void btn_SignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SignUpMouseEntered
        btn_SignUp.setBackground(Color.green);
    }//GEN-LAST:event_btn_SignUpMouseEntered

    private void btn_SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SignUpMouseClicked
        // TODO add your handling code here:
         if ((rbtn_male.isSelected() || rbtn_female.isSelected()) && !text_userName.getText().isEmpty() && !text_ConPass.getText().isEmpty() && !text_age.getText().isEmpty() && !text_id.getText().isEmpty() && !text_pass.getText().isEmpty() && !text_phone.getText().isEmpty() && text_pass.getText() == text_ConPass.getText()) {
            JOptionPane.showMessageDialog(this, "SignUp Success", "confirmation", 1);//where , message ,title

        } else {
            JOptionPane.showMessageDialog(this, "SignUp Failed", "confirmation", 0);
        }
    }//GEN-LAST:event_btn_SignUpMouseClicked

    private void btn_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BackMouseClicked
        // TODO add your handling code here:
          dispose(); 
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_BackMouseClicked

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_SignUp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpanel2;
    private javax.swing.JLabel lbl_age;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_number;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_pass2;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JRadioButton rbtn_female;
    private javax.swing.JRadioButton rbtn_male;
    private javax.swing.JPasswordField text_ConPass;
    private javax.swing.JTextField text_age;
    private javax.swing.JTextField text_id;
    private javax.swing.JPasswordField text_pass;
    private javax.swing.JTextField text_phone;
    private javax.swing.JTextField text_userName;
    // End of variables declaration//GEN-END:variables
}
