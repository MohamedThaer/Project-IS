/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RTX
 */
public class book extends javax.swing.JFrame {

    /**
     * Creates new form book
     */
    Connection con;
    DefaultTableModel dtm;
    ArrayList<Integer> bookIds = new ArrayList<>();

    public book() {
        initComponents();
        this.setLocationRelativeTo(null);
        dtm = new DefaultTableModel();
        dtm.addColumn("Book Name");
        dtm.addColumn("Book Section");
        dtm.addColumn("Book Author");
        dtm.addColumn("Num_Pages ");
        dtm.addColumn("Price");

        book();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "mo992004");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed");
        }
        modelTable();
    }

    public void book() {
        ImageIcon icon = new ImageIcon("D:\\Project\\src\\images\\Login_img.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleIcon = new ImageIcon(imgScale);
        background.setIcon(scaleIcon);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtedition = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_show = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        text_sec = new javax.swing.JTextField();
        text_num = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Upadate = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        text_price = new javax.swing.JTextField();
        text_name = new javax.swing.JTextField();
        Cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        text_author = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtedition.setBackground(new java.awt.Color(255, 255, 255));
        txtedition.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Book");
        txtedition.add(jLabel1);
        jLabel1.setBounds(120, 0, 102, 40);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tbl_show.setForeground(new java.awt.Color(0, 51, 255));
        tbl_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Book Name", "Section", "Author", " No of Pages"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_showMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_show);

        txtedition.add(jScrollPane1);
        jScrollPane1.setBounds(360, 0, 499, 490);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Book Name :");
        txtedition.add(jLabel2);
        jLabel2.setBounds(10, 130, 88, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Section :");
        txtedition.add(jLabel3);
        jLabel3.setBounds(10, 70, 78, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Price :");
        txtedition.add(jLabel4);
        jLabel4.setBounds(10, 290, 50, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("No Of Pages :");
        txtedition.add(jLabel7);
        jLabel7.setBounds(10, 180, 94, 20);

        text_sec.setText(" ");
        txtedition.add(text_sec);
        text_sec.setBounds(110, 70, 230, 30);
        txtedition.add(text_num);
        text_num.setBounds(110, 180, 230, 30);

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        txtedition.add(Add);
        Add.setBounds(40, 340, 93, 38);

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        txtedition.add(Delete);
        Delete.setBounds(200, 340, 99, 38);

        Upadate.setText("Update");
        Upadate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpadateActionPerformed(evt);
            }
        });
        txtedition.add(Upadate);
        Upadate.setBounds(40, 410, 100, 37);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        txtedition.add(jSeparator1);
        jSeparator1.setBounds(110, 40, 110, 10);

        text_price.setText(" ");
        text_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_priceActionPerformed(evt);
            }
        });
        txtedition.add(text_price);
        text_price.setBounds(110, 280, 230, 30);

        text_name.setText(" ");
        text_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nameActionPerformed(evt);
            }
        });
        txtedition.add(text_name);
        text_name.setBounds(110, 120, 230, 30);

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        txtedition.add(Cancel);
        Cancel.setBounds(198, 410, 100, 37);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Author :");
        txtedition.add(jLabel5);
        jLabel5.setBounds(10, 240, 70, 20);

        text_author.setText(" ");
        text_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_authorActionPerformed(evt);
            }
        });
        txtedition.add(text_author);
        text_author.setBounds(110, 230, 230, 30);
        txtedition.add(background);
        background.setBounds(0, 0, 360, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtedition, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtedition, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UpadateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpadateActionPerformed
        // TODO add your handling code here: features obj = new features();
        if (!text_name.getText().isEmpty() && !text_sec.getText().isEmpty() && !text_author.getText().isEmpty() && !text_num.getText().isEmpty() && !text_price.getText().isEmpty()) {
            try {

                String bookName = text_name.getText();
                String bookSec = text_sec.getText();
                String bookAuthor = text_author.getText();
                String bookNPages = text_num.getText();
                double bookPrice = Double.parseDouble(text_price.getText());

                PreparedStatement stmt = con.prepareStatement("update book set book_name=?,book_section=?,book_author=?,book_num_pages=?,price=? where book_id=? ");
                stmt.setString(1, bookName);
                stmt.setString(2, bookSec);
                stmt.setString(3, bookAuthor);
                stmt.setString(4, bookNPages);
                stmt.setDouble(5, bookPrice);
                stmt.setInt(6, bookIds.get(tbl_show.getSelectedRow()));
                stmt.executeUpdate();
                modelTable();
                JOptionPane.showMessageDialog(this, "Update Succeded");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error adding book: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_UpadateActionPerformed
    private void modelTable() {
        try {
            dtm.setRowCount(0);//for empty default model
            PreparedStatement stmt = con.prepareStatement("select book_id,book_name,book_section,book_author,book_num_pages,price from book");
            ResultSet rs = stmt.executeQuery();
            while (rs.next() && !rs.wasNull()) {

                bookIds.add(rs.getInt(1));
                dtm.addRow(new Object[]{rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDouble(6)});
            }
            tbl_show.setModel(dtm);

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        if (!text_name.getText().isEmpty() && !text_sec.getText().isEmpty() && !text_author.getText().isEmpty() && !text_num.getText().isEmpty() && !text_price.getText().isEmpty()) {
            try {

                String bookName = text_name.getText();
                String bookSec = text_sec.getText();
                String bookAuthor = text_author.getText();
                String bookNPages = text_num.getText();
                double bookPrice = Double.parseDouble(text_price.getText());

                PreparedStatement stmt = con.prepareStatement("insert into book(book_name,book_section,book_author,book_num_pages,price) values(?,?,?,?,?)");
                stmt.setString(1, bookName);
                stmt.setString(2, bookSec);
                stmt.setString(3, bookAuthor);
                stmt.setString(4, bookNPages);
                stmt.setDouble(5, bookPrice);

                stmt.executeUpdate();
                select();
                modelTable();
                JOptionPane.showMessageDialog(this, "Added Succeded");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error adding book: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_AddActionPerformed

    private void text_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_priceActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        new features().setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelActionPerformed
    private void select() {
        try {
            int i = 1;
            PreparedStatement stmt = con.prepareStatement("select book_id from book");
            ResultSet rs = stmt.executeQuery();
            while (rs.next() && !rs.wasNull()) {
                update(rs.getInt(1), i);
                i++;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void update(int x, int i) {
        try {
            PreparedStatement stmt = con.prepareStatement("update book set book_id=? where book_id=?");
            stmt.setInt(1, i);
            stmt.setInt(2, x);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void text_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nameActionPerformed

    private void text_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_authorActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        select();
        try {
            PreparedStatement stmt = con.prepareStatement("delete from book  where book_id=?");
            stmt.setInt(1, tbl_show.getSelectedRow() + 1);
            text_name.setText("");
            text_author.setText("");
            text_num.setText("");
            text_sec.setText("");
            text_price.setText("");

            stmt.executeUpdate();
            modelTable();
            JOptionPane.showMessageDialog(this, "Deleted Succeded");
        } catch (SQLException ex) {
            Logger.getLogger(book.class.getName()).log(Level.SEVERE, null, ex);
        }
        select();
    }//GEN-LAST:event_DeleteActionPerformed

    private void tbl_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_showMouseClicked
        // TODO add your handling code here:
        text_name.setText(tbl_show.getValueAt(tbl_show.getSelectedRow(), 0).toString());
        text_sec.setText(tbl_show.getValueAt(tbl_show.getSelectedRow(), 1).toString());
        text_author.setText(tbl_show.getValueAt(tbl_show.getSelectedRow(), 2).toString());
        text_num.setText(tbl_show.getValueAt(tbl_show.getSelectedRow(), 3).toString());
        text_price.setText(tbl_show.getValueAt(tbl_show.getSelectedRow(), 4).toString());


    }//GEN-LAST:event_tbl_showMouseClicked

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
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Upadate;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_show;
    private javax.swing.JTextField text_author;
    private javax.swing.JTextField text_name;
    private javax.swing.JTextField text_num;
    private javax.swing.JTextField text_price;
    private javax.swing.JTextField text_sec;
    private javax.swing.JPanel txtedition;
    // End of variables declaration//GEN-END:variables
}