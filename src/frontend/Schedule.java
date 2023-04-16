/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frontend;

import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.*;
import javax.swing.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ASUS
 */
public class Schedule extends javax.swing.JPanel {

    /**
     * Creates new form Schedule
     */
    public Schedule() {
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

        schedule = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 204));

        schedule.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(841107), "Lập Trình Java", "09",  new Integer(4),  new Integer(4), "Hai",  new Integer(1),  new Integer(3), "C.A105", "DSSV"},
                { new Integer(841048), "	P/tích thiết kế hệ thống thông tin", "04",  new Integer(4),  new Integer(4), "Sáu",  new Integer(1),  new Integer(5), "C.A106", "DSSV"},
                { new Integer(841058), "	Hệ điều hành mã nguồn mở", "02",  new Integer(3),  new Integer(3), "Tư",  new Integer(3),  new Integer(4), "C.E403", "DSSV"},
                { new Integer(861303), "Chủ nghĩa xã hội khoa học", "07",  new Integer(2),  new Integer(2), "Tư",  new Integer(1),  new Integer(2), "C.B107", "DSSV"}
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

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Chọn học kỳ xem thời khóa biểu");

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton1.setText("Sắp xếp theo môn");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton2.setText("Sắp xếp theo thứ tiết");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("In TKB");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout scheduleLayout = new javax.swing.GroupLayout(schedule);
        schedule.setLayout(scheduleLayout);
        scheduleLayout.setHorizontalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scheduleLayout.createSequentialGroup()
                .addGap(606, 606, 606)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(238, 238, 238))
            .addGroup(scheduleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        scheduleLayout.setVerticalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scheduleLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(8, 8, 8)
                .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addGap(194, 194, 194))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1133, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(schedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(schedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File savefile = jFileChooser.getSelectedFile();
            if (savefile != null) {
                savefile = new File(savefile.toString() + ".xlsx");
                XSSFWorkbook wb = new XSSFWorkbook();
                XSSFSheet sheet = wb.createSheet("dssv");
                Row rowCol = sheet.createRow(0);

                // Set title
                CellStyle titleStyle = wb.createCellStyle();
                titleStyle.setAlignment(HorizontalAlignment.CENTER);
                XSSFFont font = wb.createFont();
                font.setBold(true);
                font.setFontHeightInPoints((short) 16);
                titleStyle.setFont(font);
                Cell titleCell = rowCol.createCell(0);
                titleCell.setCellValue("Schedule");
                titleCell.setCellStyle(titleStyle);
                sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, jTable1.getColumnCount() - 1));

                // Set header
                CellStyle headerStyle = wb.createCellStyle();
                headerStyle.setAlignment(HorizontalAlignment.CENTER);
                Row rowHeader = sheet.createRow(1);
                for (int i = 0; i < jTable1.getColumnCount(); i++) {
                    Cell cell = rowHeader.createCell(i);
                    cell.setCellValue(jTable1.getColumnName(i));
                    cell.setCellStyle(headerStyle);
                    if (i == 1) {
                        sheet.setColumnWidth(i, 9000);
                    } else {
                        sheet.setColumnWidth(i, 3000);

                    }
                }

                // Set data
                CellStyle dataStyle = wb.createCellStyle();
                dataStyle.setAlignment(HorizontalAlignment.CENTER);
                for (int j = 0; j < jTable1.getRowCount(); j++) {
                    Row row = sheet.createRow(j + 2);
                    for (int k = 0; k < jTable1.getColumnCount(); k++) {
                        Cell cell = row.createCell(k);
                        if (jTable1.getValueAt(j, k) != null) {
                            cell.setCellValue(jTable1.getValueAt(j, k).toString());
                        }
                        cell.setCellStyle(dataStyle);
                    }
                }
                FileOutputStream out = new FileOutputStream(new File(savefile.toString()));
                wb.write(out);
                out.close();
            } else {
                JOptionPane.showMessageDialog(jComboBox1, "Error");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ex) {
            Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel schedule;
    // End of variables declaration//GEN-END:variables
}
