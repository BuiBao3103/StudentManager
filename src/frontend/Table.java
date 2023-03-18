/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.KetQua.KetQuaBUS;
import backend.QLSinhVien.SinhVien;
import backend.QLSinhVien.SinhVienBUS;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.*;

import java.awt.Dimension;
import java.awt.Font;
import java.text.ParseException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author ASUS
 */
public class Table extends javax.swing.JFrame implements Runnable {

    private int widthBar = 221;
    private int heightBar = this.getHeight();

    /**
     * Creates new form TableInside
     */
    public Table(ArrayList<String> dsq) {
        Thread t = new Thread(this);
        t.start();
        initComponents();
//        btnInformation.setVisible(false);
//        btnSubjectRegistration.setVisible(false);
//        btnSchedule.setVisible(false);
//        btnScore.setVisible(false);
//        inputPoint.setVisible(false);
//        btnInformation.setVisible(false);
//        jButton7.setVisible(false);
//        jButton8.setVisible(false);
//        jButton9.setVisible(false);
//        studentList.setVisible(false);
//        jButton12.setVisible(false);
//        jButton13.setVisible(false);
//        group.setVisible(false);
//        accountList.setVisible(false);
//        tool1.setVisible(false);
//        setting.setVisible(false);
//        scholastic.setVisible(false);
//
//        for (String q : dsq) {
//            switch (q) {
//                case "CTQ1" -> {
//                    btnInformation.setVisible(true);
//                }
//                case "CTQ2" -> {
//                    btnSubjectRegistration.setVisible(true);
//                }
//                case "CTQ3" -> {
//                    btnSchedule.setVisible(true);
//                }
//                case "CTQ4" -> {
//                    btnScore.setVisible(true);
//                }
//                case "CTQ5" -> {
//                    inputPoint.setVisible(true);
//                }
//                case "CTQ6" -> {
//                    btnInformation.setVisible(true);
//                }
//                case "CTQ7" -> {
//                    jButton7.setVisible(true);
//                }
//                case "CTQ8" -> {
//                    jButton8.setVisible(true);
//                }
//                case "CTQ9" -> {
//                    jButton9.setVisible(true);
//                }
//                case "CTQ10" -> {
//                    accountList.setVisible(true);
//                    scholastic.setVisible(true);
//                }
//            }
//        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftBar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        btnInformation = new javax.swing.JButton();
        btnSubjectRegistration = new javax.swing.JButton();
        btnSchedule = new javax.swing.JButton();
        btnScore = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        inputPoint = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        studentList = new javax.swing.JButton();
        group = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        accountList = new javax.swing.JButton();
        scholastic = new javax.swing.JButton();
        tool1 = new javax.swing.JButton();
        setting = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        btnChangePassword = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnHeader = new javax.swing.JPanel();
        openMenu = new javax.swing.JButton();
        closeMenu = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        schedule = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        score = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        personalInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        detailInformation = new javax.swing.JPanel();
        fullName = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        idUniversity = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        address = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        classID = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        major = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        major1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        subjectRegistration = new javax.swing.JPanel();
        studentinfo = new javax.swing.JPanel();
        pninfo = new javax.swing.JPanel();
        btnThemSinhVien = new javax.swing.JButton();
        btnTimSinhVien = new javax.swing.JButton();
        scpStudentList = new javax.swing.JScrollPane();
        tblStudentList = new javax.swing.JTable();
        pnMoreInfo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtDiaChiSinhVien = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNganhSinhVien = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtHoTenSinhVien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMSSinhVien = new javax.swing.JTextField();
        txtCMNDSinhVien = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNgaySinhSinhVien = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMaTKSinhVien = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTonGiaoSinhVien = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDanTocSinhVien = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtSoDTSinhVien = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtGioiTinhSinhVien = new javax.swing.JTextField();
        btnSuaSinhVien = new javax.swing.JButton();
        btnLuuSinhVien = new javax.swing.JButton();
        btnXoaSinhVien = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtNienKhoaSinhVien = new javax.swing.JTextField();
        btnDongSinhVien = new javax.swing.JButton();
        txtTimKiemSinhVien = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello");

        leftBar.setBackground(new java.awt.Color(204, 153, 255));
        leftBar.setOpaque(false);
        leftBar.setPreferredSize(new java.awt.Dimension(0, 487));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setColumnHeaderView(null);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        btnInformation.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInformation.setText("Thông tin cá nhân");
        btnInformation.setPreferredSize(new java.awt.Dimension(190, 50));
        btnInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformationActionPerformed(evt);
            }
        });

        btnSubjectRegistration.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSubjectRegistration.setText("Đăng kí môn học");
        btnSubjectRegistration.setPreferredSize(new java.awt.Dimension(190, 50));
        btnSubjectRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubjectRegistrationActionPerformed(evt);
            }
        });

        btnSchedule.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSchedule.setText("Xem TKB");
        btnSchedule.setPreferredSize(new java.awt.Dimension(190, 50));
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });

        btnScore.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnScore.setText("Xem Điểm");
        btnScore.setPreferredSize(new java.awt.Dimension(190, 50));
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreActionPerformed(evt);
            }
        });

        jPanel4.setOpaque(false);

        inputPoint.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputPoint.setText("Nhập điểm");
        inputPoint.setPreferredSize(new java.awt.Dimension(200, 50));

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton7.setText("jButton7");
        jButton7.setPreferredSize(new java.awt.Dimension(190, 50));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton8.setText("jButton8");
        jButton8.setPreferredSize(new java.awt.Dimension(190, 50));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton9.setText("jButton9");
        jButton9.setPreferredSize(new java.awt.Dimension(190, 50));

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator3)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(inputPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(255, 204, 0));
        jSeparator1.setOpaque(true);

        studentList.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        studentList.setText("Danh sách sinh viên");
        studentList.setPreferredSize(new java.awt.Dimension(190, 50));
        studentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentListActionPerformed(evt);
            }
        });

        group.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        group.setText("Nhóm môn học");
        group.setPreferredSize(new java.awt.Dimension(190, 50));

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton12.setText("jButton12");
        jButton12.setPreferredSize(new java.awt.Dimension(190, 50));

        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton13.setText("jButton13");
        jButton13.setPreferredSize(new java.awt.Dimension(190, 50));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(group, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(studentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(group, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setOpaque(true);

        jPanel6.setOpaque(false);

        accountList.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        accountList.setText("Công cụ");
        accountList.setPreferredSize(new java.awt.Dimension(202, 50));

        scholastic.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        scholastic.setText("Quản lí năm học");
        scholastic.setPreferredSize(new java.awt.Dimension(202, 50));

        tool1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tool1.setText("Cài đặt");
        tool1.setPreferredSize(new java.awt.Dimension(202, 50));

        setting.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        setting.setText("Quản lí tài khoản");
        setting.setToolTipText("");
        setting.setPreferredSize(new java.awt.Dimension(202, 50));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(scholastic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tool1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setting, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scholastic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(accountList, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tool1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 609, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInformation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(btnSubjectRegistration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSchedule, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnScore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSubjectRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout leftBarLayout = new javax.swing.GroupLayout(leftBar);
        leftBar.setLayout(leftBarLayout);
        leftBarLayout.setHorizontalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
        );
        leftBarLayout.setVerticalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftBarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE))
        );

        getContentPane().add(leftBar, java.awt.BorderLayout.LINE_START);

        header.setBackground(new java.awt.Color(204, 204, 204));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setPreferredSize(new java.awt.Dimension(1025, 60));
        header.setRequestFocusEnabled(false);
        header.setLayout(new java.awt.BorderLayout(10, 0));

        btnChangePassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnChangePassword.setText("Thay đổi mật khẩu");
        btnChangePassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChangePassword.setMaximumSize(new java.awt.Dimension(150, 40));
        btnChangePassword.setMinimumSize(new java.awt.Dimension(80, 60));
        btnChangePassword.setName(""); // NOI18N
        btnChangePassword.setPreferredSize(new java.awt.Dimension(170, 50));
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });
        header.add(btnChangePassword, java.awt.BorderLayout.LINE_END);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        header.add(jLabel9, java.awt.BorderLayout.CENTER);

        btnHeader.setOpaque(false);
        btnHeader.setPreferredSize(new java.awt.Dimension(60, 60));
        btnHeader.setLayout(new java.awt.CardLayout());

        openMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-menu-30.png"))); // NOI18N
        openMenu.setPreferredSize(new java.awt.Dimension(60, 60));
        openMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuActionPerformed(evt);
            }
        });
        btnHeader.add(openMenu, "card2");

        closeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close-30.png"))); // NOI18N
        closeMenu.setPreferredSize(new java.awt.Dimension(60, 60));
        closeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeMenuActionPerformed(evt);
            }
        });
        btnHeader.add(closeMenu, "card2");

        header.add(btnHeader, java.awt.BorderLayout.LINE_START);

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        mainPanel.setPreferredSize(new java.awt.Dimension(873, 606));
        mainPanel.setLayout(new java.awt.CardLayout());

        schedule.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(841107), "Lập Trình Java", "09",  new Integer(4),  new Integer(4), "Hai",  new Integer(1),  new Integer(3), "C.A105", "DSSV"},
                { new Integer(841048), "	P/tích thiết kế hệ thống thông tin", "04",  new Integer(4),  new Integer(4), "Sáu",  new Integer(1),  new Integer(5), "C.A106", "DSSV"},
                { new Integer(841058), "	Hệ điều hành mã nguồn mở", "02",  new Integer(3),  new Integer(3), "Tư",  new Integer(3),  new Integer(4), "C.E403", "DSSV"},
                { new Integer(861303), "Chủ nghĩa xã hội khoa học", "07",  new Integer(2),  new Integer(2), "Tư",  new Integer(1),  new Integer(2), "C.B107", "DSSV"},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã MH", "Tên Môn Học", "NMH", "STC", "STCHP", "Thứ", "Tiết BĐ", "Tiết KT", "Phòng", "DSSV"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setRowHeight(35);
        jTable1.setRowMargin(10);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", 0, 16));
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(JLabel.CENTER);
        ((DefaultTableCellRenderer)jTable1.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < jTable1.getColumnCount(); i++)
        {

            if(i != 1){
                jTable1.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
            }else{
                continue;
            }
        }
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(1).setMinWidth(300);
            jTable1.getColumnModel().getColumn(2).setMinWidth(30);
            jTable1.getColumnModel().getColumn(3).setMinWidth(30);
            jTable1.getColumnModel().getColumn(4).setMinWidth(30);
            jTable1.getColumnModel().getColumn(5).setMinWidth(40);
            jTable1.getColumnModel().getColumn(6).setMinWidth(30);
            jTable1.getColumnModel().getColumn(7).setMinWidth(30);
            jTable1.getColumnModel().getColumn(8).setMinWidth(50);
            jTable1.getColumnModel().getColumn(9).setMinWidth(50);
        }

        javax.swing.GroupLayout scheduleLayout = new javax.swing.GroupLayout(schedule);
        schedule.setLayout(scheduleLayout);
        scheduleLayout.setHorizontalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
        );
        scheduleLayout.setVerticalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );

        mainPanel.add(schedule, "card4");

        score.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Môn", "Tên Môn", "TC", "% KT", "% Thi", "Kiểm Tra", "Điểm thi", "Điểm TK", "ĐTK(4)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setRowHeight(35);
        jTable2.setRowMargin(10);
        jTable2.getTableHeader().setFont(new Font("Segoe UI", 0, 16));
        leftRenderer.setHorizontalAlignment(JLabel.CENTER);
        ((DefaultTableCellRenderer)jTable2.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < jTable2.getColumnCount(); i++)
        {

            if(i != 2){
                jTable2.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
            }else{
                continue;
            }
        }
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(3);
            jTable2.getColumnModel().getColumn(1).setMinWidth(40);
            jTable2.getColumnModel().getColumn(2).setMinWidth(250);
            jTable2.getColumnModel().getColumn(3).setMinWidth(30);
            jTable2.getColumnModel().getColumn(4).setMinWidth(30);
            jTable2.getColumnModel().getColumn(5).setMinWidth(30);
            jTable2.getColumnModel().getColumn(6).setMinWidth(30);
            jTable2.getColumnModel().getColumn(7).setMinWidth(30);
            jTable2.getColumnModel().getColumn(8).setMinWidth(30);
        }

        javax.swing.GroupLayout scoreLayout = new javax.swing.GroupLayout(score);
        score.setLayout(scoreLayout);
        scoreLayout.setHorizontalGroup(
            scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
        );
        scoreLayout.setVerticalGroup(
            scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );

        mainPanel.add(score, "card5");

        personalInfo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 204, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logologinsmaller.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);

        detailInformation.setOpaque(false);
        detailInformation.setPreferredSize(new java.awt.Dimension(600, 417));
        detailInformation.setRequestFocusEnabled(false);
        detailInformation.setLayout(new javax.swing.BoxLayout(detailInformation, javax.swing.BoxLayout.Y_AXIS));

        fullName.setOpaque(false);
        fullName.setPreferredSize(new java.awt.Dimension(700, 69));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Họ và tên:");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField1.setText("Họ và tên");

        javax.swing.GroupLayout fullNameLayout = new javax.swing.GroupLayout(fullName);
        fullName.setLayout(fullNameLayout);
        fullNameLayout.setHorizontalGroup(
            fullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullNameLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        );
        fullNameLayout.setVerticalGroup(
            fullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullNameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(fullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        detailInformation.add(fullName);

        idUniversity.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("MSSV:");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField2.setText("Mã số sinh viên");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout idUniversityLayout = new javax.swing.GroupLayout(idUniversity);
        idUniversity.setLayout(idUniversityLayout);
        idUniversityLayout.setHorizontalGroup(
            idUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idUniversityLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        );
        idUniversityLayout.setVerticalGroup(
            idUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idUniversityLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(idUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        detailInformation.add(idUniversity);

        address.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Lớp:");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField3.setText("DCT12111");

        javax.swing.GroupLayout addressLayout = new javax.swing.GroupLayout(address);
        address.setLayout(addressLayout);
        addressLayout.setHorizontalGroup(
            addressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        );
        addressLayout.setVerticalGroup(
            addressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(addressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        detailInformation.add(address);

        classID.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Nơi sinh:");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField4.setText("Sài Gòn");

        javax.swing.GroupLayout classIDLayout = new javax.swing.GroupLayout(classID);
        classID.setLayout(classIDLayout);
        classIDLayout.setHorizontalGroup(
            classIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classIDLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        );
        classIDLayout.setVerticalGroup(
            classIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classIDLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(classIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        detailInformation.add(classID);

        major.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Ngành:");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField5.setText("Công nghệ thông tin");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout majorLayout = new javax.swing.GroupLayout(major);
        major.setLayout(majorLayout);
        majorLayout.setHorizontalGroup(
            majorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(majorLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        );
        majorLayout.setVerticalGroup(
            majorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(majorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(majorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        detailInformation.add(major);

        major1.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Khóa học:");

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField6.setText("2022-2026");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout major1Layout = new javax.swing.GroupLayout(major1);
        major1.setLayout(major1Layout);
        major1Layout.setHorizontalGroup(
            major1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(major1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        );
        major1Layout.setVerticalGroup(
            major1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(major1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(major1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        detailInformation.add(major1);

        javax.swing.GroupLayout personalInfoLayout = new javax.swing.GroupLayout(personalInfo);
        personalInfo.setLayout(personalInfoLayout);
        personalInfoLayout.setHorizontalGroup(
            personalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalInfoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(detailInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addGap(284, 284, 284))
        );
        personalInfoLayout.setVerticalGroup(
            personalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalInfoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(personalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        mainPanel.add(personalInfo, "card2");

        subjectRegistration.setBackground(new java.awt.Color(204, 102, 255));

        javax.swing.GroupLayout subjectRegistrationLayout = new javax.swing.GroupLayout(subjectRegistration);
        subjectRegistration.setLayout(subjectRegistrationLayout);
        subjectRegistrationLayout.setHorizontalGroup(
            subjectRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1037, Short.MAX_VALUE)
        );
        subjectRegistrationLayout.setVerticalGroup(
            subjectRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        mainPanel.add(subjectRegistration, "card3");

        btnThemSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemSinhVien.setText("Thêm");

        btnTimSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimSinhVien.setText("Tìm");

        tblStudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MSSV", "Họ Tên", "Ngành", "Niên Khóa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentListMouseClicked(evt);
            }
        });
        scpStudentList.setViewportView(tblStudentList);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Số Điện Thoại:");

        txtDiaChiSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDiaChiSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiaChiSinhVien.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Mã Tài Khoản:");

        txtNganhSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNganhSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNganhSinhVien.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Họ Tên:");

        txtHoTenSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHoTenSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoTenSinhVien.setEnabled(false);
        txtHoTenSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenSinhVienActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Mã Số Sinh Viên:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Chứng Minh Nhân Dân:");

        txtMSSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMSSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMSSinhVien.setEnabled(false);
        txtMSSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSSinhVienActionPerformed(evt);
            }
        });

        txtCMNDSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCMNDSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCMNDSinhVien.setEnabled(false);
        txtCMNDSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCMNDSinhVienActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Giới Tính: ");

        txtNgaySinhSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgaySinhSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNgaySinhSinhVien.setEnabled(false);
        txtNgaySinhSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySinhSinhVienActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Tôn Giáo:");

        txtMaTKSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaTKSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaTKSinhVien.setEnabled(false);
        txtMaTKSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaTKSinhVienActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Ngành:");

        txtTonGiaoSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTonGiaoSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTonGiaoSinhVien.setEnabled(false);
        txtTonGiaoSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTonGiaoSinhVienActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Địa Chỉ:");

        txtDanTocSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDanTocSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDanTocSinhVien.setEnabled(false);
        txtDanTocSinhVien.setMaximumSize(new java.awt.Dimension(64, 26));
        txtDanTocSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDanTocSinhVienActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Dân Tộc:");

        txtSoDTSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoDTSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoDTSinhVien.setEnabled(false);
        txtSoDTSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoDTSinhVienActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Ngày Sinh:");

        txtGioiTinhSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGioiTinhSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGioiTinhSinhVien.setEnabled(false);
        txtGioiTinhSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGioiTinhSinhVienActionPerformed(evt);
            }
        });

        btnSuaSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuaSinhVien.setText("Sửa");
        btnSuaSinhVien.setDefaultCapable(false);
        btnSuaSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSinhVienActionPerformed(evt);
            }
        });

        btnLuuSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLuuSinhVien.setText("Lưu");
        btnLuuSinhVien.setDefaultCapable(false);
        btnLuuSinhVien.setEnabled(false);
        btnLuuSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuSinhVienActionPerformed(evt);
            }
        });

        btnXoaSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaSinhVien.setText("Xóa");
        btnXoaSinhVien.setDefaultCapable(false);
        btnXoaSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSinhVienActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Niên Khóa:");

        txtNienKhoaSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNienKhoaSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNienKhoaSinhVien.setEnabled(false);
        txtNienKhoaSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNienKhoaSinhVienActionPerformed(evt);
            }
        });

        btnDongSinhVien.setText("X");
        btnDongSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongSinhVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMoreInfoLayout = new javax.swing.GroupLayout(pnMoreInfo);
        pnMoreInfo.setLayout(pnMoreInfoLayout);
        pnMoreInfoLayout.setHorizontalGroup(
            pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMoreInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtNganhSinhVien))
                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMSSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCMNDSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMoreInfoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHoTenSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                        .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgaySinhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                .addComponent(txtGioiTinhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18))
                            .addComponent(txtSoDTSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNienKhoaSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(txtDiaChiSinhVien)))
                            .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                        .addComponent(txtDanTocSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15))
                                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                        .addComponent(btnSuaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLuuSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(txtTonGiaoSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnXoaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnDongSinhVien, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(txtMaTKSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        pnMoreInfoLayout.setVerticalGroup(
            pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMoreInfoLayout.createSequentialGroup()
                .addComponent(btnDongSinhVien)
                .addGap(7, 7, 7)
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHoTenSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtNgaySinhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtDiaChiSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMSSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoDTSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel20)
                    .addComponent(txtNienKhoaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCMNDSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtDanTocSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtTonGiaoSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtGioiTinhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNganhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtMaTKSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLuuSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaSinhVien))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pninfoLayout = new javax.swing.GroupLayout(pninfo);
        pninfo.setLayout(pninfoLayout);
        pninfoLayout.setHorizontalGroup(
            pninfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pninfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pninfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pninfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThemSinhVien)
                        .addGap(28, 28, 28)
                        .addComponent(btnTimSinhVien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiemSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(pnMoreInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(scpStudentList)
        );
        pninfoLayout.setVerticalGroup(
            pninfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pninfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pninfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemSinhVien)
                    .addComponent(btnTimSinhVien)
                    .addComponent(txtTimKiemSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpStudentList, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnMoreInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout studentinfoLayout = new javax.swing.GroupLayout(studentinfo);
        studentinfo.setLayout(studentinfoLayout);
        studentinfoLayout.setHorizontalGroup(
            studentinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pninfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        studentinfoLayout.setVerticalGroup(
            studentinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pninfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(studentinfo, "card6");

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnInformationActionPerformed
        mainPanel.removeAll();
        mainPanel.add(personalInfo);
        mainPanel.repaint();
        mainPanel.revalidate();
    }// GEN-LAST:event_btnInformationActionPerformed

    private void btnSubjectRegistrationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSubjectRegistrationActionPerformed
        mainPanel.removeAll();
        mainPanel.add(subjectRegistration);
        mainPanel.repaint();
        mainPanel.revalidate();
    }// GEN-LAST:event_btnSubjectRegistrationActionPerformed

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnScheduleActionPerformed
        mainPanel.removeAll();
        mainPanel.add(schedule);
        mainPanel.repaint();
        mainPanel.revalidate();
    }// GEN-LAST:event_btnScheduleActionPerformed

    private void btnScoreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnScoreActionPerformed
        // TODO add your handling code here:
        // Loại bỏ tất cả components trong container mainPanel
        mainPanel.removeAll();
        // Thêm component liên quan đến btnScore button
        mainPanel.add(score);
        // Không thể bị Override
        // Đơn giản là nó yêu cầu một thành phần (ở đây nó là component score) vẽ đi vẽ
        // lại như 1 chu trình vòng lặp
        mainPanel.repaint();
        // Thông thường hàm revalidate sẽ được sử dụng trên 1 container nào đó khi mà m
        // thêm 1 component mới hoặc xóa component cũ
        // và nó sẽ gọi thèn layout parent tính toán lại kích thước
        // Có lẽ sẽ phù hợp cho responsive
         
        mainPanel.revalidate();
        new KetQuaBUS().addRowData(jTable2);
       
    }// GEN-LAST:event_btnScoreActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton7ActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn đăng xuất không");
        if (choice == 0) {
            dispose();
            new Login().setVisible(true);
        }
    }// GEN-LAST:event_btnChangePasswordActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField6ActionPerformed


    private void studentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentListActionPerformed

        mainPanel.removeAll(); // xóa hết nội dung vùng content
        mainPanel.repaint();
        mainPanel.revalidate();
        SinhVienBUS.showStudentList(tblStudentList);
        closeMenuActionPerformed(null); //tắt cái menu khu bấm zo nút
        mainPanel.add(studentinfo);
        mainPanel.repaint();
        mainPanel.revalidate();

    }//GEN-LAST:event_studentListActionPerformed

    private void txtHoTenSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenSinhVienActionPerformed

    private void txtMSSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMSSinhVienActionPerformed

    private void txtCMNDSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCMNDSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCMNDSinhVienActionPerformed

    private void txtDanTocSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDanTocSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDanTocSinhVienActionPerformed

    private void txtNgaySinhSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySinhSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhSinhVienActionPerformed

    private void txtMaTKSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaTKSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaTKSinhVienActionPerformed

    private void txtTonGiaoSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTonGiaoSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTonGiaoSinhVienActionPerformed

    private void btnSuaSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSinhVienActionPerformed
    
        svCu = SinhVienBUS.getSinhVienFromMoreInfo(this);
        
        SinhVienBUS.updateSinhVien(this);
    }//GEN-LAST:event_btnSuaSinhVienActionPerformed

    private void btnLuuSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuSinhVienActionPerformed
        SinhVien svMoi = new SinhVien();
        svMoi = SinhVienBUS.getSinhVienFromMoreInfo(this);
        int a = JOptionPane.showConfirmDialog(rootPane, "Bạn Muốn Lưu Sinh Viên Này ?\n" + SinhVienBUS.compare2SinhVien(svCu, svMoi));
        if (a == JOptionPane.YES_OPTION){
            System.out.println("đa Sửa");
            SinhVienBUS.resetJPanelMoreInfo(this);
        }
    }//GEN-LAST:event_btnLuuSinhVienActionPerformed

    private void btnXoaSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSinhVienActionPerformed

       int a = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa sinh viên này ?", "Xóa Sinh Viên", JOptionPane.YES_NO_OPTION);
       if (a == JOptionPane.YES_OPTION){
           System.out.println("Đã Xóa");
       }
       
    }//GEN-LAST:event_btnXoaSinhVienActionPerformed

    private void tblStudentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentListMouseClicked
        SinhVienBUS.resetJPanelMoreInfo(this);
        SinhVienBUS.showMoreInfoStudent(this, SinhVienBUS.StudentinTable(tblStudentList, tblStudentList.getSelectedRow()));
    }//GEN-LAST:event_tblStudentListMouseClicked

    private void btnDongSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDongSinhVienActionPerformed

    private void txtNienKhoaSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNienKhoaSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNienKhoaSinhVienActionPerformed

    private void txtGioiTinhSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGioiTinhSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGioiTinhSinhVienActionPerformed

    private void txtSoDTSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoDTSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoDTSinhVienActionPerformed


    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable1MouseClicked

    }// GEN-LAST:event_jTable1MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton8ActionPerformed

    private void openMenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_openMenuActionPerformed
        btnHeader.removeAll();
        btnHeader.add(closeMenu);
        btnHeader.repaint();
        btnHeader.revalidate();
        leftBar.setPreferredSize(new Dimension(widthBar, heightBar));

    }// GEN-LAST:event_openMenuActionPerformed

    private void closeMenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_closeMenuActionPerformed
        btnHeader.removeAll();
        btnHeader.add(openMenu);
        btnHeader.repaint();
        btnHeader.revalidate();
        leftBar.setPreferredSize(new Dimension(0, heightBar));
//        leftBar.removeAll();

    }// GEN-LAST:event_closeMenuActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException
                | UnsupportedLookAndFeelException ignored) {
        }
        new Table(new ArrayList<>()).setVisible(true);
    }

    public JButton getBtnDongSinhVien() {
        return btnDongSinhVien;
    }

    public JButton getBtnLuuSinhVien() {
        return btnLuuSinhVien;
    }

    public JButton getBtnSuaSinhVien() {
        return btnSuaSinhVien;
    }

    public JButton getBtnThemSinhVien() {
        return btnThemSinhVien;
    }

    public JButton getBtnTimSinhVien() {
        return btnTimSinhVien;
    }

    public JButton getBtnXoaSinhVien() {
        return btnXoaSinhVien;
    }
    
    
    public JTextField getTxtNienKhoaSinhVien() {
        return txtNienKhoaSinhVien;
    }

//    JTable studentTable = new JTable();
    public void setTxtNienKhoaSinhVien(String txtNienKhoaSinhVien) {    
        this.txtNienKhoaSinhVien.setText(txtNienKhoaSinhVien);
    }

    public JTextField getTxtCMNDSinhVien() {
        return txtCMNDSinhVien;
    }

    public void setTxtCMNDSinhVien(String txtCMNDSinhVien) {
        this.txtCMNDSinhVien.setText(txtCMNDSinhVien);
    }

    public JTextField getTxtDanTocSinhVien() {
        return txtDanTocSinhVien;
    }

    public void setTxtDanTocSinhVien(String txtDanTocSinhVien) {
        this.txtDanTocSinhVien.setText(txtDanTocSinhVien);
    }

    public JTextField getTxtDiaChiSinhVien() {
        return txtDiaChiSinhVien;
    }

    public void setTxtDiaChiSinhVien(String txtDiaChiSinhVien) {
        this.txtDiaChiSinhVien.setText(txtDiaChiSinhVien);
    }

    public JTextField getTxtGioiTinhSinhVien() {
        return txtGioiTinhSinhVien;
    }

    public void setTxtGioiTinhSinhVien(String txtGioiTinhSinhVien) {
        this.txtGioiTinhSinhVien.setText(txtGioiTinhSinhVien);
    }

    public JTextField getTxtHoTenSinhVien() {
        return txtHoTenSinhVien;
    }

    public void setTxtHoTenSinhVien(String txtHoTenSinhVien) {
        this.txtHoTenSinhVien.setText(txtHoTenSinhVien);
    }

    public JTextField getTxtMSSinhVien() {
        return txtMSSinhVien;
    }

    public void setTxtMSSinhVien(String txtMSSinhVien) {
        this.txtMSSinhVien.setText(txtMSSinhVien);
    }

    public JTextField getTxtMaTKSinhVien() {
        return txtMaTKSinhVien;
    }

    public void setTxtMaTKSinhVien(String txtMaTKSinhVien) {
        this.txtMaTKSinhVien.setText(txtMaTKSinhVien);
    }

    public JTextField getTxtNganhSinhVien() {
        return txtNganhSinhVien;
    }

    public void setTxtNganhSinhVien(String txtNganhSinhVien) {
        this.txtNganhSinhVien.setText(txtNganhSinhVien);
    }

    public JTextField getTxtNgaySinhSinhVien() {
        return txtNgaySinhSinhVien;
    }

    public void setTxtNgaySinhSinhVien(String txtNgaySinhSinhVien) {
        this.txtNgaySinhSinhVien.setText(txtNgaySinhSinhVien);
    }

    public JTextField getTxtSoDTSinhVien() {
        return txtSoDTSinhVien;
    }

    public void setTxtSoDTSinhVien(String txtSoDTSinhVien) {
        this.txtSoDTSinhVien.setText(txtSoDTSinhVien);
    }

    public JTextField getTxtTonGiaoSinhVien() {
        return txtTonGiaoSinhVien;
    }

    public void setTxtTonGiaoSinhVien(String txtTonGiaoSinhVien) {
        this.txtTonGiaoSinhVien.setText(txtTonGiaoSinhVien);
    }
    SinhVien svCu = new SinhVien();
    //    StudentInfo info = new StudentInfo();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountList;
    private javax.swing.JPanel address;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnDongSinhVien;
    private javax.swing.JPanel btnHeader;
    private javax.swing.JButton btnInformation;
    private javax.swing.JButton btnLuuSinhVien;
    private javax.swing.JButton btnSchedule;
    private javax.swing.JButton btnScore;
    private javax.swing.JButton btnSuaSinhVien;
    private javax.swing.JButton btnSubjectRegistration;
    private javax.swing.JButton btnThemSinhVien;
    private javax.swing.JButton btnTimSinhVien;
    private javax.swing.JButton btnXoaSinhVien;
    private javax.swing.JPanel classID;
    private javax.swing.JButton closeMenu;
    private javax.swing.JPanel detailInformation;
    private javax.swing.JPanel fullName;
    private javax.swing.JButton group;
    private javax.swing.JPanel header;
    private javax.swing.JPanel idUniversity;
    private javax.swing.JButton inputPoint;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel leftBar;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel major;
    private javax.swing.JPanel major1;
    private javax.swing.JButton openMenu;
    private javax.swing.JPanel personalInfo;
    private javax.swing.JPanel pnMoreInfo;
    private javax.swing.JPanel pninfo;
    private javax.swing.JPanel schedule;
    private javax.swing.JButton scholastic;
    private javax.swing.JPanel score;
    private javax.swing.JScrollPane scpStudentList;
    private javax.swing.JButton setting;
    private javax.swing.JButton studentList;
    private javax.swing.JPanel studentinfo;
    private javax.swing.JPanel subjectRegistration;
    private javax.swing.JTable tblStudentList;
    private javax.swing.JButton tool1;
    private javax.swing.JTextField txtCMNDSinhVien;
    private javax.swing.JTextField txtDanTocSinhVien;
    private javax.swing.JTextField txtDiaChiSinhVien;
    private javax.swing.JTextField txtGioiTinhSinhVien;
    private javax.swing.JTextField txtHoTenSinhVien;
    private javax.swing.JTextField txtMSSinhVien;
    private javax.swing.JTextField txtMaTKSinhVien;
    private javax.swing.JTextField txtNganhSinhVien;
    private javax.swing.JTextField txtNgaySinhSinhVien;
    private javax.swing.JTextField txtNienKhoaSinhVien;
    private javax.swing.JTextField txtSoDTSinhVien;
    private javax.swing.JTextField txtTimKiemSinhVien;
    private javax.swing.JTextField txtTonGiaoSinhVien;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            try {
                int hour, minutes, second;
                Calendar cal = Calendar.getInstance();
                hour = cal.get(Calendar.HOUR_OF_DAY);
                minutes = cal.get(Calendar.MINUTE);
                second = cal.get(Calendar.SECOND);
                SimpleDateFormat timeRun = new SimpleDateFormat("HH:mm:ss aa");
                Date date = cal.getTime();
                String text = timeRun.format(date);
                jLabel9.setText(text);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
