
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

        jPanel1 = new javax.swing.JPanel();
        jpanel2 = new javax.swing.JPanel();
        lbl_username = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        number_field = new javax.swing.JTextField();
        name_field = new javax.swing.JTextField();
        lbl_id = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        lbl_age = new javax.swing.JLabel();
        age_field = new javax.swing.JTextField();
        lbl_gender = new javax.swing.JLabel();
        lbl_pass2 = new javax.swing.JLabel();
        lbl_number = new javax.swing.JLabel();
        id_field = new javax.swing.JTextField();
        pass2_field = new javax.swing.JPasswordField();
        pass_field = new javax.swing.JPasswordField();
        btn_SignUp = new javax.swing.JButton();
        check_male = new javax.swing.JCheckBox();
        check_female = new javax.swing.JCheckBox();
        lbl_signUp1 = new javax.swing.JLabel();
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

        lbl_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name.setText("Name : ");
        lbl_name.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        number_field.setBackground(new java.awt.Color(250, 250, 250));

        name_field.setBackground(new java.awt.Color(250, 250, 250));

        lbl_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_id.setText("National ID :");

        lbl_pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_pass.setText("Password :");

        username_field.setBackground(new java.awt.Color(250, 250, 250));

        lbl_age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_age.setText("Age :");

        age_field.setBackground(new java.awt.Color(250, 250, 250));

        lbl_gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_gender.setText("Gender :");

        lbl_pass2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbl_pass2.setText("Confirm Password :");

        lbl_number.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_number.setText("Phone Number :");

        id_field.setBackground(new java.awt.Color(250, 250, 250));

        pass2_field.setEditable(false);
        pass2_field.setBackground(new java.awt.Color(250, 250, 250));

        pass_field.setBackground(new java.awt.Color(250, 250, 250));

        btn_SignUp.setBackground(new java.awt.Color(204, 204, 204));
        btn_SignUp.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_SignUp.setText("SignUp");
        btn_SignUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SignUpMouseExited(evt);
            }
        });
        btn_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignUpActionPerformed(evt);
            }
        });

        check_male.setBackground(new java.awt.Color(250, 250, 250));
        check_male.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        check_male.setText("Male");

        check_female.setBackground(new java.awt.Color(250, 250, 250));
        check_female.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        check_female.setText("Female");

        lbl_signUp1.setBackground(new java.awt.Color(204, 204, 204));
        lbl_signUp1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbl_signUp1.setForeground(new java.awt.Color(0, 102, 0));
        lbl_signUp1.setText("Log in");
        lbl_signUp1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lbl_signUp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_signUp1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpanel2Layout = new javax.swing.GroupLayout(jpanel2);
        jpanel2.setLayout(jpanel2Layout);
        jpanel2Layout.setHorizontalGroup(
            jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel2Layout.createSequentialGroup()
                        .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl_gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                .addComponent(lbl_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_number, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jpanel2Layout.createSequentialGroup()
                        .addComponent(lbl_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pass2_field)
                        .addComponent(name_field, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(username_field, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(id_field, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(number_field)
                        .addComponent(pass_field, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(age_field, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanel2Layout.createSequentialGroup()
                        .addComponent(check_male, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check_female, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel2Layout.createSequentialGroup()
                        .addComponent(btn_SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel2Layout.createSequentialGroup()
                        .addComponent(lbl_signUp1)
                        .addGap(185, 185, 185))))
        );
        jpanel2Layout.setVerticalGroup(
            jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_name)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id)
                    .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_number))
                .addGap(18, 18, 18)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass2_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_age)
                    .addComponent(age_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_male)
                    .addComponent(check_female))
                .addGap(18, 18, 18)
                .addComponent(btn_SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_signUp1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jpanel2);
        jpanel2.setBounds(170, 10, 435, 490);
        jpanel2.getAccessibleContext().setAccessibleName("");

        Label.setBackground(new java.awt.Color(205, 207, 201));
        Label.setForeground(new java.awt.Color(51, 51, 255));
        Label.setMaximumSize(null);
        Label.setMinimumSize(null);
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

    private void lbl_signUp1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_signUp1MousePressed
        Login obj = new Login();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_lbl_signUp1MousePressed

    private void btn_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignUpActionPerformed
        if (1==1) {
            JOptionPane.showMessageDialog(this, "SignUp Success", "confirmation", 1);//where , message ,title
            Login obj = new Login();
            dispose();
            obj.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "SignUp Failed", "confirmation", 0);
        }
    }//GEN-LAST:event_btn_SignUpActionPerformed

    private void btn_SignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SignUpMouseExited
        btn_SignUp.setBackground(Color.lightGray);
    }//GEN-LAST:event_btn_SignUpMouseExited

    private void btn_SignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SignUpMouseEntered
        btn_SignUp.setBackground(Color.green);
    }//GEN-LAST:event_btn_SignUpMouseEntered
       
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
    private javax.swing.JTextField age_field;
    private javax.swing.JButton btn_SignUp;
    private javax.swing.JCheckBox check_female;
    private javax.swing.JCheckBox check_male;
    private javax.swing.JTextField id_field;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpanel2;
    private javax.swing.JLabel lbl_age;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_number;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_pass2;
    private javax.swing.JLabel lbl_signUp1;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JTextField name_field;
    private javax.swing.JTextField number_field;
    private javax.swing.JPasswordField pass2_field;
    private javax.swing.JPasswordField pass_field;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables
}
