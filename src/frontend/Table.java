/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.QLSinhVien.SinhVienBUS;
//import java.awt.;
import java.text.SimpleDateFormat;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
<<<<<<< HEAD
=======
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
>>>>>>> 99fe3dad0ab4eba75328e85a71320caba9c5db5f

/**
 *
 * @author ASUS
 */
public class Table extends javax.swing.JFrame implements Runnable {

    public Table() {
        initComponents();
<<<<<<< HEAD
        Thread t = new Thread(this);
        t.start();
=======
        
>>>>>>> 99fe3dad0ab4eba75328e85a71320caba9c5db5f
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftBar = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
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
        clock = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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
        filterSubject = new javax.swing.JPanel();
        textFilter = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello");

        leftBar.setBackground(new java.awt.Color(204, 153, 255));
        leftBar.setOpaque(false);
        leftBar.setPreferredSize(new java.awt.Dimension(220, 487));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logologinsmaller.png"))); // NOI18N
        jLabel10.setText("Xin chào,Nguyễn Tiến Phát");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton2.setBackground(new java.awt.Color(242, 242, 242));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-25.png"))); // NOI18N
        jButton2.setToolTipText("Đăng xuất");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
                .addGap(0, 39, Short.MAX_VALUE))
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftBarLayout.setVerticalGroup(
            leftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftBarLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
        );

        getContentPane().add(leftBar, java.awt.BorderLayout.LINE_START);

        header.setBackground(new java.awt.Color(204, 204, 204));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setPreferredSize(new java.awt.Dimension(1025, 60));
        header.setRequestFocusEnabled(false);
        header.setLayout(new java.awt.BorderLayout(10, 0));

        clock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clock.setForeground(new java.awt.Color(255, 0, 51));
        clock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clock.setPreferredSize(new java.awt.Dimension(100, 60));
        header.add(clock, java.awt.BorderLayout.CENTER);
        header.add(jLabel11, java.awt.BorderLayout.LINE_START);

        jButton1.setText("Thay đổi mật khẩu");
        header.add(jButton1, java.awt.BorderLayout.LINE_END);

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
<<<<<<< HEAD
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
=======
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scheduleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                .addContainerGap())
>>>>>>> 99fe3dad0ab4eba75328e85a71320caba9c5db5f
        );
        scheduleLayout.setVerticalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );

        mainPanel.add(schedule, "card4");

        score.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1),  new Integer(866123), "Lập Trình Java",  new Integer(4),  new Integer(50),  new Integer(50),  new Float(10.0),  new Float(10.0), "A",  new Float(4.0)},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
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
            jTable2.getColumnModel().getColumn(1).setMinWidth(40);
            jTable2.getColumnModel().getColumn(2).setMinWidth(300);
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
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );
        scoreLayout.setVerticalGroup(
            scoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
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
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
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
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
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
                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
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
                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
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
                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
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
                .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
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
                .addComponent(detailInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );
        personalInfoLayout.setVerticalGroup(
            personalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalInfoLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(personalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        mainPanel.add(personalInfo, "card2");

        subjectRegistration.setBackground(new java.awt.Color(255, 255, 255));

        filterSubject.setOpaque(false);

        textFilter.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textFilter.setText("Lọc theo môn học:");

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField7.setText("jTextField7");

        javax.swing.GroupLayout filterSubjectLayout = new javax.swing.GroupLayout(filterSubject);
        filterSubject.setLayout(filterSubjectLayout);
        filterSubjectLayout.setHorizontalGroup(
            filterSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterSubjectLayout.createSequentialGroup()
                .addComponent(textFilter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
        );
        filterSubjectLayout.setVerticalGroup(
            filterSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(textFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.setMaximumSize(new java.awt.Dimension(2147483647, 350));
        jScrollPane4.setViewportView(jTable3);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Danh sách môn học đã chọn");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        javax.swing.GroupLayout subjectRegistrationLayout = new javax.swing.GroupLayout(subjectRegistration);
        subjectRegistration.setLayout(subjectRegistrationLayout);
        subjectRegistrationLayout.setHorizontalGroup(
            subjectRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addComponent(jScrollPane5)
            .addGroup(subjectRegistrationLayout.createSequentialGroup()
                .addGroup(subjectRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filterSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 309, Short.MAX_VALUE))
        );
        subjectRegistrationLayout.setVerticalGroup(
            subjectRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectRegistrationLayout.createSequentialGroup()
                .addComponent(filterSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(subjectRegistration, "card3");

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformationActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(personalInfo);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnInformationActionPerformed

//    mainPanel.removeAll();
//        mainPanel.add(personalInfo);
//        mainPanel.repaint();
//        mainPanel.revalidate();

    private void btnSubjectRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubjectRegistrationActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(subjectRegistration);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnSubjectRegistrationActionPerformed

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(schedule);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnScheduleActionPerformed

    private void btnScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreActionPerformed
        // TODO add your handling code here:
        //        Loại bỏ tất cả components trong container mainPanel
        mainPanel.removeAll();
        //Thêm component liên quan đến btnScore button
        mainPanel.add(score);
        //Không thể bị Override
        //Đơn giản là nó yêu cầu một thành phần (ở đây nó là component score) vẽ đi vẽ lại như 1 chu trình vòng lặp
        mainPanel.repaint();
        //Thông thường hàm revalidate sẽ được sử dụng trên 1 container nào đó khi mà m thêm 1 component mới hoặc xóa component cũ
        //và nó sẽ gọi thèn layout parent tính toán lại kích thước
        //Có lẽ sẽ phù hợp cho responsive
        mainPanel.revalidate();
    }//GEN-LAST:event_btnScoreActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

<<<<<<< HEAD
=======
    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn đăng xuất không");
        if (choice == 0) {
            dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_signOutActionPerformed

>>>>>>> 99fe3dad0ab4eba75328e85a71320caba9c5db5f
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void studentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentListActionPerformed
<<<<<<< HEAD
//        remove(jTable1);
//        tblStudentInfor.setBounds(250, 50, 890, 500);
//        add(tblStudentInfor);
        SinhVienBUS.showStudentList(jTable1);

    }//GEN-LAST:event_studentListActionPerformed
=======
>>>>>>> 99fe3dad0ab4eba75328e85a71320caba9c5db5f

        mainPanel.removeAll(); // xóa hết nội dung vùng content
        mainPanel.repaint();
        mainPanel.revalidate();
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() { // thêm sự kiện click chuột vào mỗi dòng
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        SinhVienBUS.showStudentList(studentTable);
        JScrollPane scrollPane = new JScrollPane(studentTable);// Bảng được đặt trong 1 khung có thể cuộn
        mainPanel.add(scrollPane);
        mainPanel.repaint();
        mainPanel.revalidate();

    }//GEN-LAST:event_studentListActionPerformed
    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {
        
        SinhVienBUS.showMoreInfoStudent(info, SinhVienBUS.StudentinTable(studentTable, studentTable.getSelectedRow()));
        
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ignored) {
        }
        new Table().setVisible(true);
    }
<<<<<<< HEAD

//    private javax.swing.JTable tblStudentInfor = new JTable();
=======
    
    JTable studentTable = new JTable();
    StudentInfo info = new StudentInfo();
>>>>>>> 99fe3dad0ab4eba75328e85a71320caba9c5db5f
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountList;
    private javax.swing.JPanel address;
    private javax.swing.JButton btnInformation;
    private javax.swing.JButton btnSchedule;
    private javax.swing.JButton btnScore;
    private javax.swing.JButton btnSubjectRegistration;
    private javax.swing.JPanel classID;
    private javax.swing.JLabel clock;
    private javax.swing.JPanel detailInformation;
    private javax.swing.JPanel filterSubject;
    private javax.swing.JPanel fullName;
    private javax.swing.JButton group;
    private javax.swing.JPanel header;
    private javax.swing.JPanel idUniversity;
    private javax.swing.JButton inputPoint;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel leftBar;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel major;
    private javax.swing.JPanel major1;
    private javax.swing.JPanel personalInfo;
    private javax.swing.JPanel schedule;
    private javax.swing.JButton scholastic;
    private javax.swing.JPanel score;
    private javax.swing.JButton setting;
    private javax.swing.JButton studentList;
    private javax.swing.JPanel subjectRegistration;
    private javax.swing.JLabel textFilter;
    private javax.swing.JButton tool1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        int hour, minutes, second;
        while (true) {
            Calendar cal = Calendar.getInstance();
            hour = cal.get(Calendar.HOUR_OF_DAY);
            minutes = cal.get(Calendar.MINUTE);
            second = cal.get(Calendar.SECOND);

            SimpleDateFormat timeRun = new SimpleDateFormat("HH:mm:ss aa");
            Date date = cal.getTime();
            String time12 = timeRun.format(date);
            clock.setText(time12);

        }
    }

}
