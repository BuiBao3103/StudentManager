/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class StudentInfo extends javax.swing.JFrame {

    /**
     * Creates new form StudentInfo
     */
    public StudentInfo() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHoTenSinhVien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        txtCMNDSinhVien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNgaySinhSinhVien = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGioiTinhSinhVien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTonGiaoSinhVien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNganhSinhVien = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNienKhoaSinhVien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDiaChiSinhVien = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDanTocSinhVien = new javax.swing.JTextField();
        btnSuaSinhVien = new javax.swing.JButton();
        btnXoaSinhVien = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtSoDienThoaiSinhVien = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtMaTKSinhVien = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(900, 320, 0, 0));

        jLabel1.setText("H??? T??n:");

        txtHoTenSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoTenSinhVien.setEnabled(false);
        txtHoTenSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenSinhVienActionPerformed(evt);
            }
        });

        jLabel2.setText("M?? S??? Sinh Vi??n:");

        jLabel3.setText("Ch???ng Minh Nh??n D??n:");

        txtMSSV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMSSV.setEnabled(false);
        txtMSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSSVActionPerformed(evt);
            }
        });

        txtCMNDSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCMNDSinhVien.setEnabled(false);
        txtCMNDSinhVien.setFocusable(false);
        txtCMNDSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCMNDSinhVienActionPerformed(evt);
            }
        });

        jLabel4.setText("Ng??y Sinh:");

        txtNgaySinhSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNgaySinhSinhVien.setEnabled(false);
        txtNgaySinhSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySinhSinhVienActionPerformed(evt);
            }
        });

        jLabel5.setText("Gi???i T??nh: ");

        txtGioiTinhSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGioiTinhSinhVien.setEnabled(false);
        txtGioiTinhSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGioiTinhSinhVienActionPerformed(evt);
            }
        });

        jLabel8.setText("T??n Gi??o:");

        txtTonGiaoSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTonGiaoSinhVien.setEnabled(false);
        txtTonGiaoSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTonGiaoSinhVienActionPerformed(evt);
            }
        });

        jLabel10.setText("Ng??nh:");

        txtNganhSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNganhSinhVien.setEnabled(false);
        txtNganhSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNganhSinhVienActionPerformed(evt);
            }
        });

        jLabel9.setText("Ni??n Kh??a: ");

        txtNienKhoaSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNienKhoaSinhVien.setEnabled(false);
        txtNienKhoaSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNienKhoaSinhVienActionPerformed(evt);
            }
        });

        jLabel6.setText("?????a Ch???:");

        txtDiaChiSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiaChiSinhVien.setEnabled(false);
        txtDiaChiSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiSinhVienActionPerformed(evt);
            }
        });

        jLabel7.setText("D??n T???c");

        txtDanTocSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDanTocSinhVien.setEnabled(false);
        txtDanTocSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDanTocSinhVienActionPerformed(evt);
            }
        });

        btnSuaSinhVien.setText("S???a");
        btnSuaSinhVien.setDefaultCapable(false);

        btnXoaSinhVien.setText("X??a");
        btnXoaSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSinhVienActionPerformed(evt);
            }
        });

        jLabel12.setText("S??? ??i???n Tho???i:");

        txtSoDienThoaiSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoDienThoaiSinhVien.setEnabled(false);

        jLabel13.setText("M?? T??i Kho???n:");

        txtMaTKSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaTKSinhVien.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChiSinhVien)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNienKhoaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(btnSuaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(btnXoaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNganhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoTenSinhVien))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMSSV))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCMNDSinhVien)))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSoDienThoaiSinhVien)
                            .addComponent(txtDanTocSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(txtNgaySinhSinhVien))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTonGiaoSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGioiTinhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaTKSinhVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHoTenSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCMNDSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtSoDienThoaiSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtMaTKSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNgaySinhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtGioiTinhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTonGiaoSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtDanTocSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDiaChiSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNganhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoaSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnSuaSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNienKhoaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Th??ng Tin Sinh Vi??n");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoTenSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenSinhVienActionPerformed

    private void txtMSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMSSVActionPerformed

    private void txtCMNDSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCMNDSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCMNDSinhVienActionPerformed

    private void txtNgaySinhSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySinhSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhSinhVienActionPerformed

    private void txtTonGiaoSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTonGiaoSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTonGiaoSinhVienActionPerformed

    private void txtNienKhoaSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNienKhoaSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNienKhoaSinhVienActionPerformed

    private void txtGioiTinhSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGioiTinhSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGioiTinhSinhVienActionPerformed

    private void txtDiaChiSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiSinhVienActionPerformed

    private void txtDanTocSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDanTocSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDanTocSinhVienActionPerformed

    private void txtNganhSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNganhSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNganhSinhVienActionPerformed

    private void btnXoaSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSinhVienActionPerformed
        int a = JOptionPane.showConfirmDialog(rootPane, "X??a Sinh Vi??n", "B???n C?? Ch???c Mu???n X??a ?", JOptionPane.YES_NO_OPTION);
        
    }//GEN-LAST:event_btnXoaSinhVienActionPerformed

    

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
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInfo().setVisible(true);
            }
        });
    }

    public void setTxtMaTKSinhVien(int maTK) {
        this.txtMaTKSinhVien.setText(maTK+ "");
    }

    public void setTxtSoDienThoaiSinhVien(String soDienThoai) {
        this.txtSoDienThoaiSinhVien.setText(soDienThoai);
    }

    public void setTxtHoTenSinhVien(String HoTen) {
        this.txtHoTenSinhVien.setText(HoTen);
    }

    public void setTxtCMNDSinhVien(String CMND) {
        this.txtCMNDSinhVien.setText(CMND);
    }

    public void setTxtDanTocSinhVien(String danToc) {
        this.txtDanTocSinhVien.setText(danToc);
    }

    public void setTxtDiaChiSinhVien(String diaChi) {
        this.txtDiaChiSinhVien.setText(diaChi);
    }

    public void setTxtGioiTinhSinhVien(String gioiTinh) {
        this.txtGioiTinhSinhVien.setText(gioiTinh);
    }

    public void setTxtMSSV(String MSSV) {
        this.txtMSSV.setText(MSSV);
    }

    public void setTxtNganhSinhVien(String Nganh) {
        this.txtNganhSinhVien.setText(Nganh);
    }

    public void setTxtNgaySinhSinhVien(Date ngay) {
        this.txtNgaySinhSinhVien.setText(ngay + "");
    }

    public void setTxtNienKhoaSinhVien(String nienKhoa) {
        this.txtNienKhoaSinhVien.setText(nienKhoa);
    }

    public void setTxtTonGiaoSinhVien(String tonGiao) {
        this.txtTonGiaoSinhVien.setText(tonGiao);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaSinhVien;
    private javax.swing.JButton btnXoaSinhVien;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextField txtCMNDSinhVien;
    private javax.swing.JTextField txtDanTocSinhVien;
    private javax.swing.JTextField txtDiaChiSinhVien;
    private javax.swing.JTextField txtGioiTinhSinhVien;
    private javax.swing.JTextField txtHoTenSinhVien;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtMaTKSinhVien;
    private javax.swing.JTextField txtNganhSinhVien;
    private javax.swing.JTextField txtNgaySinhSinhVien;
    private javax.swing.JTextField txtNienKhoaSinhVien;
    private javax.swing.JTextField txtSoDienThoaiSinhVien;
    private javax.swing.JTextField txtTonGiaoSinhVien;
    // End of variables declaration//GEN-END:variables
}
