/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.MainPanel;

import BUS.SinhVienBUS;
import DAO.SinhVienDAO;
import DTO.SinhVienDTO;
import backend.Excel.IOExcel;
import java.awt.Dimension;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleContext;
import javax.swing.*;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 *
 * @author PC
 */
public class StudentInfor extends javax.swing.JPanel {

    private SinhVienDTO svCu = new SinhVienDTO();
    private int numberOfSinhVienPage = (int) Math.ceil(SinhVienBUS.soLuongSinhVien / SinhVienBUS.soLuongSinhVienMotTrang); // làm tròn lên để có số trang cần
    private int numberOfDeletedSinhVienPage = (int) Math.ceil(SinhVienBUS.soLuongSinhVienBiXoa / SinhVienBUS.soLuongSinhVienMotTrang); // làm tròn lên để có số trang cần

    // mấy cái biến này lưu thông tin lọc khi chuyển qua lại của cái cbTimKiemSinhVien
    private String thuocTinhTimKiem = "Tên"; // cái này là tên của giá trị cần tìm, mặc định là Tên
    private String timKiemTen = "";   // cái này là giá trị
    private String timKiemMSSV = "";
    private String timKiemNganh = "";
    private String timKiemLop = "";
    private String timKiemGioiTinh = "";
    private String timKiemNamSinh = "";
    private String timKiemKhoa = "";

    //----------------------------------------------
    public StudentInfor() {
        initComponents();
    }

    public JButton getBtnNextPage() {
        return btnNextPage;
    }

    public void setBtnNextPage(JButton btnNextPage) {
        this.btnNextPage = btnNextPage;
    }

    public JButton getBtnPrevPage() {
        return btnPrevPage;
    }

    public void setBtnPrevPage(JButton btnPrevPage) {
        this.btnPrevPage = btnPrevPage;
    }

    public JButton getBtnXoaLoc() {
        return btnXoaLoc;
    }

    public void setBtnXoaLoc(JButton btnXoaLoc) {
        this.btnXoaLoc = btnXoaLoc;
    }

    public int getNumberOfSinhVienPage() {
        return numberOfSinhVienPage;
    }

    public void setNumberOfSinhVienPage(int numberOfSinhVienPage) {
        this.numberOfSinhVienPage = numberOfSinhVienPage;
    }

    public int getNumberOfDeletedSinhVienPage() {
        return numberOfDeletedSinhVienPage;
    }

    public void setNumberOfDeletedSinhVienPage(int numberOfDeletedSinhVienPage) {
        this.numberOfDeletedSinhVienPage = numberOfDeletedSinhVienPage;
    }

    public String getTxtPresentPage() {
        return txtPresentPage.getText();
    }

    public JTextField getObTxtPresentPage() {
        return txtPresentPage;
    }

    public void setTxtPresentPage(JTextField txtPresentPage) {
        this.txtPresentPage = txtPresentPage;
    }

    public String getThuocTinhTimKiem() {
        return thuocTinhTimKiem;
    }

    public void setThuocTinhTimKiem(String thuocTinhTimKiem) {
        this.thuocTinhTimKiem = thuocTinhTimKiem;
    }

    public String getTimKiemTen() {
        return timKiemTen;
    }

    public void setTimKiemTen(String timKiemTen) {
        this.timKiemTen = timKiemTen;
    }

    public String getTimKiemMSSV() {
        return timKiemMSSV;
    }

    public void setTimKiemMSSV(String timKiemMSSV) {
        this.timKiemMSSV = timKiemMSSV;
    }

    public String getTimKiemNganh() {
        return timKiemNganh;
    }

    public void setTimKiemNganh(String timKiemNganh) {
        this.timKiemNganh = timKiemNganh;
    }

    public String getTimKiemLop() {
        return timKiemLop;
    }

    public void setTimKiemLop(String timKiemLop) {
        this.timKiemLop = timKiemLop;
    }

    public String getTimKiemGioiTinh() {
        return timKiemGioiTinh;
    }

    public void setTimKiemGioiTinh(String timKiemGioiTinh) {
        this.timKiemGioiTinh = timKiemGioiTinh;
    }

    public String getTimKiemNamSinh() {
        return timKiemNamSinh;
    }

    public void setTimKiemNamSinh(String timKiemNamSinh) {
        this.timKiemNamSinh = timKiemNamSinh;
    }

    public String getTimKiemKhoa() {
        return timKiemKhoa;
    }

    public void setTimKiemKhoa(String timKiemKhoa) {
        this.timKiemKhoa = timKiemKhoa;
    }

    public SinhVienDTO getSvCu() {
        return svCu;
    }

    public void setSvCu(SinhVienDTO svCu) {
        this.svCu = svCu;
    }

    public JButton getBtnDongSinhVien() {
        return btnDongSinhVien;
    }

    public JTextField getTxtLopSinhVien() {
        return txtLopSinhVien;
    }

    public void setTxtLopSinhVien(String txtLopSinhVien) {
        this.txtLopSinhVien.setText(txtLopSinhVien);
    }

    public void setBtnDongSinhVien(JButton btnDongSinhVien) {
        this.btnDongSinhVien = btnDongSinhVien;
    }

    public JButton getBtnKhoiPhucSinhVien() {
        return btnKhoiPhucSinhVien;
    }

    public void setBtnKhoiPhucSinhVien(JButton btnKhoiPhucSinhVien) {
        this.btnKhoiPhucSinhVien = btnKhoiPhucSinhVien;
    }

    public JButton getBtnLuuSinhVien() {
        return btnLuuSinhVien;
    }

    public void setBtnLuuSinhVien(JButton btnLuuSinhVien) {
        this.btnLuuSinhVien = btnLuuSinhVien;
    }

    public JButton getBtnSuaSinhVien() {
        return btnSuaSinhVien;
    }

    public void setBtnSuaSinhVien(JButton btnSuaSinhVien) {
        this.btnSuaSinhVien = btnSuaSinhVien;
    }

    public JButton getBtnThemSinhVien() {
        return btnThemSinhVien;
    }

    public void setBtnThemSinhVien(JButton btnThemSinhVien) {
        this.btnThemSinhVien = btnThemSinhVien;
    }

    public JButton getBtnTimKiemSinhVien() {
        return btnTimKiemSinhVien;
    }

    public void setBtnTimKiemSinhVien(JButton btnTimKiemSinhVien) {
        this.btnTimKiemSinhVien = btnTimKiemSinhVien;
    }

    public JButton getBtnXoaSinhVien() {
        return btnXoaSinhVien;
    }

    public void setBtnXoaSinhVien(JButton btnXoaSinhVien) {
        this.btnXoaSinhVien = btnXoaSinhVien;
    }

    public JComboBox<String> getCbNganhSinhVien() {
        return cbNganhSinhVien;
    }

    public void setCbNganhSinhVien(JComboBox<String> cbNganhSinhVien) {
        this.cbNganhSinhVien = cbNganhSinhVien;
    }

    public JComboBox<String> getCbTimKiemSinhVien() {
        return cbTimKiemSinhVien;
    }

    public void setCbTimKiemSinhVien(JComboBox<String> cbTimKiemSinhVien) {
        this.cbTimKiemSinhVien = cbTimKiemSinhVien;
    }

    public JComboBox<String> getCbTrangThaiSinhVien() {
        return cbTrangThaiSinhVien;
    }

    public void setCbTrangThaiSinhVien(JComboBox<String> cbTrangThaiSinhVien) {
        this.cbTrangThaiSinhVien = cbTrangThaiSinhVien;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public void setjLabel20(JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    public JPanel getPnMoreInfo() {
        return pnMoreInfo;
    }

    public void setPnMoreInfo(JPanel pnMoreInfo) {
        this.pnMoreInfo = pnMoreInfo;
    }

    public JPanel getPninfo() {
        return pninfo;
    }

    public void setPninfo(JPanel pninfo) {
        this.pninfo = pninfo;
    }

    public JScrollPane getScpStudentList() {
        return scpStudentList;
    }

    public void setScpStudentList(JScrollPane scpStudentList) {
        this.scpStudentList = scpStudentList;
    }

    public JPanel getStudentinfo() {
        return studentinfo;
    }

    public void setStudentinfo(JPanel studentinfo) {
        this.studentinfo = studentinfo;
    }

    public JTable getTblStudentList() {
        return tblStudentList;
    }

    public void setTblStudentList(JTable tblStudentList) {
        this.tblStudentList = tblStudentList;
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

    public JTextField getTxtNgaySinhSinhVien() {
        return txtNgaySinhSinhVien;
    }

    public void setTxtNgaySinhSinhVien(String txtNgaySinhSinhVien) {
        this.txtNgaySinhSinhVien.setText(txtNgaySinhSinhVien);
    }

    public JTextField getTxtNienKhoaSinhVien() {
        return txtNienKhoaSinhVien;
    }

    public void setTxtNienKhoaSinhVien(String txtNienKhoaSinhVien) {
        this.txtNienKhoaSinhVien.setText(txtNienKhoaSinhVien);
    }

    public JTextField getTxtSoDTSinhVien() {
        return txtSoDTSinhVien;
    }

    public void setTxtSoDTSinhVien(String txtSoDTSinhVien) {
        this.txtSoDTSinhVien.setText(txtSoDTSinhVien);
    }

    public JTextField getTxtTimKiemSinhVien() {
        return txtTimKiemSinhVien;
    }

    public void setTxtTimKiemSinhVien(String txtTimKiemSinhVien) {
        this.txtTimKiemSinhVien.setText(txtTimKiemSinhVien);
    }

    public JTextField getTxtTonGiaoSinhVien() {
        return txtTonGiaoSinhVien;
    }

    public void setTxtTonGiaoSinhVien(String txtTonGiaoSinhVien) {
        this.txtTonGiaoSinhVien.setText(txtTonGiaoSinhVien);
    }

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentinfo = new javax.swing.JPanel();
        pninfo = new javax.swing.JPanel();
        scpStudentList = new javax.swing.JScrollPane();
        tblStudentList = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        pnMoreInfo = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtHoTenSinhVien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMSSinhVien = new javax.swing.JTextField();
        txtCMNDSinhVien = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMaTKSinhVien = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTonGiaoSinhVien = new javax.swing.JTextField();
        txtDanTocSinhVien = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtGioiTinhSinhVien = new javax.swing.JTextField();
        btnSuaSinhVien = new javax.swing.JButton();
        btnLuuSinhVien = new javax.swing.JButton();
        btnXoaSinhVien = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtNienKhoaSinhVien = new javax.swing.JTextField();
        btnDongSinhVien = new javax.swing.JButton();
        cbNganhSinhVien = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtNgaySinhSinhVien = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSoDTSinhVien = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDiaChiSinhVien = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtLopSinhVien = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnPrevPage = new javax.swing.JButton();
        txtPresentPage = new javax.swing.JTextField();
        btnNextPage = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cbTrangThaiSinhVien = new javax.swing.JComboBox<>();
        btnKhoiPhucSinhVien = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnThemSinhVien = new javax.swing.JButton();
        cbTimKiemSinhVien = new javax.swing.JComboBox<>();
        txtTimKiemSinhVien = new javax.swing.JTextField();
        btnTimKiemSinhVien = new javax.swing.JButton();
        btnXoaLoc = new javax.swing.JButton();

        studentinfo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                studentinfoComponentResized(evt);
            }
        });

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
        tblStudentList.getTableHeader().setReorderingAllowed(false);
        tblStudentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentListMouseClicked(evt);
            }
        });
        scpStudentList.setViewportView(tblStudentList);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Mã Tài Khoản:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Họ Tên:");

        txtHoTenSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHoTenSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoTenSinhVien.setEnabled(false);
        txtHoTenSinhVien.setNextFocusableComponent(txtCMNDSinhVien);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Mã Số Sinh Viên:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Chứng Minh Nhân Dân:");

        txtMSSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMSSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMSSinhVien.setEnabled(false);

        txtCMNDSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCMNDSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCMNDSinhVien.setEnabled(false);
        txtCMNDSinhVien.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCMNDSinhVienCaretUpdate(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Giới Tính: ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Tôn Giáo:");

        txtMaTKSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaTKSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaTKSinhVien.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ngành:");

        txtTonGiaoSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTonGiaoSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTonGiaoSinhVien.setEnabled(false);
        txtTonGiaoSinhVien.setNextFocusableComponent(cbNganhSinhVien);

        txtDanTocSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDanTocSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDanTocSinhVien.setEnabled(false);
        txtDanTocSinhVien.setMaximumSize(new java.awt.Dimension(64, 26));
        txtDanTocSinhVien.setNextFocusableComponent(txtTonGiaoSinhVien);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Dân Tộc:");

        txtGioiTinhSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGioiTinhSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGioiTinhSinhVien.setToolTipText("Nam/Nữ");
        txtGioiTinhSinhVien.setEnabled(false);
        txtGioiTinhSinhVien.setNextFocusableComponent(txtDanTocSinhVien);

        btnSuaSinhVien.setBackground(new java.awt.Color(0, 158, 248));
        btnSuaSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuaSinhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-pen-25.png"))); // NOI18N
        btnSuaSinhVien.setText("Sửa");
        btnSuaSinhVien.setContentAreaFilled(false);
        btnSuaSinhVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuaSinhVien.setDefaultCapable(false);
        btnSuaSinhVien.setOpaque(true);
        btnSuaSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSinhVienActionPerformed(evt);
            }
        });

        btnLuuSinhVien.setBackground(new java.awt.Color(0, 158, 248));
        btnLuuSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLuuSinhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnLuuSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-save-25.png"))); // NOI18N
        btnLuuSinhVien.setText("Lưu");
        btnLuuSinhVien.setContentAreaFilled(false);
        btnLuuSinhVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLuuSinhVien.setDefaultCapable(false);
        btnLuuSinhVien.setEnabled(false);
        btnLuuSinhVien.setNextFocusableComponent(txtHoTenSinhVien);
        btnLuuSinhVien.setOpaque(true);
        btnLuuSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuSinhVienActionPerformed(evt);
            }
        });

        btnXoaSinhVien.setBackground(new java.awt.Color(0, 158, 248));
        btnXoaSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaSinhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-delete-25.png"))); // NOI18N
        btnXoaSinhVien.setText("Xóa");
        btnXoaSinhVien.setContentAreaFilled(false);
        btnXoaSinhVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaSinhVien.setDefaultCapable(false);
        btnXoaSinhVien.setOpaque(true);
        btnXoaSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSinhVienActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Niên Khóa:");

        txtNienKhoaSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNienKhoaSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNienKhoaSinhVien.setEnabled(false);

        btnDongSinhVien.setBackground(new java.awt.Color(0, 158, 248));
        btnDongSinhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnDongSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-close-30.png"))); // NOI18N
        btnDongSinhVien.setContentAreaFilled(false);
        btnDongSinhVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDongSinhVien.setOpaque(true);
        btnDongSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongSinhVienActionPerformed(evt);
            }
        });

        cbNganhSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbNganhSinhVien.setEnabled(false);
        cbNganhSinhVien.setNextFocusableComponent(btnLuuSinhVien);
        cbNganhSinhVien.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNganhSinhVienItemStateChanged(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Ngày Sinh:");

        txtNgaySinhSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgaySinhSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNgaySinhSinhVien.setToolTipText("yyyy-mm-dd");
        txtNgaySinhSinhVien.setEnabled(false);
        txtNgaySinhSinhVien.setNextFocusableComponent(txtGioiTinhSinhVien);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Số Điện Thoại:");

        txtSoDTSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoDTSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoDTSinhVien.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Địa Chỉ:");

        txtDiaChiSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDiaChiSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiaChiSinhVien.setEnabled(false);
        txtDiaChiSinhVien.setNextFocusableComponent(txtNgaySinhSinhVien);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Lớp");

        txtLopSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLopSinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLopSinhVien.setEnabled(false);

        javax.swing.GroupLayout pnMoreInfoLayout = new javax.swing.GroupLayout(pnMoreInfo);
        pnMoreInfo.setLayout(pnMoreInfoLayout);
        pnMoreInfoLayout.setHorizontalGroup(
            pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMoreInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDongSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                        .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(txtHoTenSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtCMNDSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                            .addComponent(txtMSSinhVien)))))
                            .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSoDTSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiaChiSinhVien)))
                        .addGap(18, 18, 18)
                        .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNienKhoaSinhVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txtDanTocSinhVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNgaySinhSinhVien, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGioiTinhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTonGiaoSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLopSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnXoaSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLuuSinhVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSuaSinhVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnMoreInfoLayout.createSequentialGroup()
                                .addComponent(cbNganhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaTKSinhVien)))))
                .addContainerGap())
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
                    .addComponent(btnSuaSinhVien)
                    .addComponent(jLabel14)
                    .addComponent(txtGioiTinhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTonGiaoSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtMSSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)
                        .addComponent(txtDanTocSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(btnLuuSinhVien)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCMNDSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtNienKhoaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtLopSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaSinhVien))
                .addGap(18, 18, 18)
                .addGroup(pnMoreInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel12)
                    .addComponent(txtSoDTSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtDiaChiSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNganhSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtMaTKSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnPrevPage.setText("<<");
        btnPrevPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrevPage.setPreferredSize(new java.awt.Dimension(72, 27));
        btnPrevPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevPageActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrevPage);

        txtPresentPage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPresentPage.setText("1");
        txtPresentPage.setEnabled(false);
        txtPresentPage.setPreferredSize(new java.awt.Dimension(64, 27));
        txtPresentPage.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPresentPageCaretUpdate(evt);
            }
        });
        txtPresentPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPresentPageActionPerformed(evt);
            }
        });
        jPanel1.add(txtPresentPage);

        btnNextPage.setText(">>");
        btnNextPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNextPage.setPreferredSize(new java.awt.Dimension(72, 27));
        btnNextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextPageActionPerformed(evt);
            }
        });
        jPanel1.add(btnNextPage);

        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentResized(evt);
            }
        });

        cbTrangThaiSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbTrangThaiSinhVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang Hoạt Động", "Đang Khóa" }));
        cbTrangThaiSinhVien.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTrangThaiSinhVienItemStateChanged(evt);
            }
        });
        jPanel2.add(cbTrangThaiSinhVien);

        btnKhoiPhucSinhVien.setBackground(new java.awt.Color(0, 158, 248));
        btnKhoiPhucSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnKhoiPhucSinhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnKhoiPhucSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-restore-25.png"))); // NOI18N
        btnKhoiPhucSinhVien.setText("Khôi Phục");
        btnKhoiPhucSinhVien.setContentAreaFilled(false);
        btnKhoiPhucSinhVien.setOpaque(true);
        btnKhoiPhucSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoiPhucSinhVienActionPerformed(evt);
            }
        });
        jPanel2.add(btnKhoiPhucSinhVien);

        btnImport.setBackground(new java.awt.Color(0, 158, 248));
        btnImport.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnImport.setForeground(new java.awt.Color(255, 255, 255));
        btnImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-microsoft-excel-25.png"))); // NOI18N
        btnImport.setText("Import");
        btnImport.setContentAreaFilled(false);
        btnImport.setOpaque(true);
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });
        jPanel2.add(btnImport);

        btnExport.setBackground(new java.awt.Color(0, 158, 248));
        btnExport.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-export-excel-25.png"))); // NOI18N
        btnExport.setText("Export");
        btnExport.setContentAreaFilled(false);
        btnExport.setOpaque(true);
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });
        jPanel2.add(btnExport);

        btnThemSinhVien.setBackground(new java.awt.Color(0, 158, 248));
        btnThemSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemSinhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnThemSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-add-25.png"))); // NOI18N
        btnThemSinhVien.setText("Thêm");
        btnThemSinhVien.setContentAreaFilled(false);
        btnThemSinhVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemSinhVien.setOpaque(true);
        btnThemSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSinhVienActionPerformed(evt);
            }
        });
        jPanel2.add(btnThemSinhVien);

        cbTimKiemSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbTimKiemSinhVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên", "MSSV", "Ngành", "Lớp", "Giới Tính", "Năm Sinh", "Khóa" }));
        cbTimKiemSinhVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbTimKiemSinhVien.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTimKiemSinhVienItemStateChanged(evt);
            }
        });
        jPanel2.add(cbTimKiemSinhVien);

        //PromptSupport.setPrompt("Gợi ý ngắn", txtTimKiemSinhVien);
        txtTimKiemSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtTimKiemSinhVien.setPreferredSize(new java.awt.Dimension(120, 28));
        txtTimKiemSinhVien.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimKiemSinhVienCaretUpdate(evt);
            }
        });
        txtTimKiemSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimKiemSinhVienMouseClicked(evt);
            }
        });
        jPanel2.add(txtTimKiemSinhVien);

        btnTimKiemSinhVien.setBackground(new java.awt.Color(0, 158, 248));
        btnTimKiemSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimKiemSinhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiemSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-search-25.png"))); // NOI18N
        btnTimKiemSinhVien.setText("Tìm");
        btnTimKiemSinhVien.setContentAreaFilled(false);
        btnTimKiemSinhVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimKiemSinhVien.setDefaultCapable(false);
        btnTimKiemSinhVien.setOpaque(true);
        btnTimKiemSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemSinhVienActionPerformed(evt);
            }
        });
        jPanel2.add(btnTimKiemSinhVien);

        btnXoaLoc.setBackground(new java.awt.Color(0, 158, 248));
        btnXoaLoc.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnXoaLoc.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaLoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/icons8-restart-25.png"))); // NOI18N
        btnXoaLoc.setText("Xóa");
        btnXoaLoc.setContentAreaFilled(false);
        btnXoaLoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaLoc.setOpaque(true);
        btnXoaLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaLocActionPerformed(evt);
            }
        });
        jPanel2.add(btnXoaLoc);

        javax.swing.GroupLayout pninfoLayout = new javax.swing.GroupLayout(pninfo);
        pninfo.setLayout(pninfoLayout);
        pninfoLayout.setHorizontalGroup(
            pninfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pninfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pninfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pninfoLayout.createSequentialGroup()
                        .addComponent(scpStudentList)
                        .addContainerGap())))
            .addGroup(pninfoLayout.createSequentialGroup()
                .addComponent(pnMoreInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pninfoLayout.setVerticalGroup(
            pninfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pninfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpStudentList, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnMoreInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout studentinfoLayout = new javax.swing.GroupLayout(studentinfo);
        studentinfo.setLayout(studentinfoLayout);
        studentinfoLayout.setHorizontalGroup(
            studentinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pninfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        studentinfoLayout.setVerticalGroup(
            studentinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentinfoLayout.createSequentialGroup()
                .addComponent(pninfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSinhVienActionPerformed
        SinhVienBUS.addSinhVien(this);
    }//GEN-LAST:event_btnThemSinhVienActionPerformed

    private void btnTimKiemSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemSinhVienActionPerformed

        if (SinhVienBUS.chuaNhapGiaTriTimKiem(this)) {
            JOptionPane.showMessageDialog(null, "Nhập nội dung cần tìm hoặc lọc");
            return;
        }
        SinhVienBUS.showStudentListWithCondition(this);
        btnNextPage.setVisible(false);
        btnPrevPage.setVisible(false);
        txtPresentPage.setVisible(false);
    }//GEN-LAST:event_btnTimKiemSinhVienActionPerformed

    private void tblStudentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentListMouseClicked
        btnDongSinhVienActionPerformed(null);
        pnMoreInfo.setVisible(true);
        SinhVienBUS.showMoreInfoStudent(this, SinhVienBUS.StudentinTable(tblStudentList, tblStudentList.getSelectedRow()));
    }//GEN-LAST:event_tblStudentListMouseClicked

    private void txtCMNDSinhVienCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCMNDSinhVienCaretUpdate
//        if (!SinhVienBUS.checkCMND(txtCMNDSinhVien.getText())) {
//            txtCMNDSinhVien.setBorder(new LineBorder(Color.red, 2)); // tạo màu cho khung độ rộng 2
//        } else {
//            txtCMNDSinhVien.setBorder(new LineBorder(Color.gray, 1));
//        }
    }//GEN-LAST:event_txtCMNDSinhVienCaretUpdate

    private void btnSuaSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSinhVienActionPerformed
        if (tblStudentList.getSelectedRow() != -1) {
            svCu = SinhVienBUS.getSinhVienFromMoreInfo(this);
            SinhVienBUS.updateSinhVien(this);
        }
    }//GEN-LAST:event_btnSuaSinhVienActionPerformed

    private void btnLuuSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuSinhVienActionPerformed
        SinhVienDTO svMoi = SinhVienBUS.getSinhVienFromMoreInfo(this);
        if (SinhVienBUS.checkStudentInfor(this, svMoi).equals("")) {
            if (btnSuaSinhVien.isVisible()) {   // cái này là lưu khi sinh viên được sửa
                SinhVienBUS.updateSinhVienToServer(this, svCu, svMoi);

            } else {           // cái này lưu khi sinh viên được thêm
                SinhVienBUS.addSinhVienToServer(this, svMoi);
            }
        } else {
            JOptionPane.showMessageDialog(null, SinhVienBUS.checkStudentInfor(this, svMoi));
        }
    }//GEN-LAST:event_btnLuuSinhVienActionPerformed

    private void btnXoaSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSinhVienActionPerformed

        int a = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa sinh viên này ?", "Xóa Sinh Viên", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            SinhVienBUS.deleteSinhVien(SinhVienBUS.StudentinTable(tblStudentList, tblStudentList.getSelectedRow()).getMaSV());
            if (txtPresentPage.isVisible()) { // load lại table khi đang xem từ trang
                txtPresentPageCaretUpdate(null);
            } else {
                btnTimKiemSinhVienActionPerformed(null);
            }
            btnDongSinhVienActionPerformed(null);
        }
    }//GEN-LAST:event_btnXoaSinhVienActionPerformed

    public void btnDongSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongSinhVienActionPerformed
        SinhVienBUS.resetJPanelMoreInfo(this);
    }//GEN-LAST:event_btnDongSinhVienActionPerformed

    private void txtTimKiemSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemSinhVienMouseClicked
        txtTimKiemSinhVien.setText("");
    }//GEN-LAST:event_txtTimKiemSinhVienMouseClicked

    private void cbTrangThaiSinhVienItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTrangThaiSinhVienItemStateChanged
        if (cbTrangThaiSinhVien.getSelectedIndex() == 1) { // trạng thái bị khóa
            txtPresentPage.setText("1");
            SinhVienBUS.showDeletedStudent(this, 1); // hiện lại dssv từ đầu
            SinhVienBUS.changeBtnForTrangThai(this);
//            SinhVienBUS.resetDssvWhenChangeTrangThai(this);
            btnDongSinhVienActionPerformed(null);

        } else { // đang hoạt động
            txtPresentPage.setText("1");
            SinhVienBUS.showStudentList(this, 1); // hiện lại dssv từ đầu
            SinhVienBUS.resetBtnForTrangThai(this);
//            SinhVienBUS.resetDssvWhenChangeTrangThai(this);
            btnDongSinhVienActionPerformed(null);
        }
    }//GEN-LAST:event_cbTrangThaiSinhVienItemStateChanged

    private void btnKhoiPhucSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoiPhucSinhVienActionPerformed
        if (tblStudentList.getSelectedRow() != -1) { // chọn vào 1 dòng rồi mới khôi phục được
            int a = JOptionPane.showConfirmDialog(null, "Khôi Phục Sinh Viên Này ?");
            if (a == JOptionPane.YES_OPTION) { // lấy mã sinh viên của dòng đang chọn rồi khôi phục nó
                SinhVienBUS.restoreSinhVien(SinhVienBUS.StudentinTable(tblStudentList, tblStudentList.getSelectedRow()).getMaSV());
                JOptionPane.showMessageDialog(null, "Khôi phục thành công");
                btnDongSinhVienActionPerformed(null);
                SinhVienBUS.showDeletedStudent(this, Integer.parseInt(txtPresentPage.getText())); // khôi phục xong refresh cái table
            }
        } else {
            JOptionPane.showMessageDialog(null, "Chọn Sinh Viên Muốn Khôi Phục !");
        }
    }//GEN-LAST:event_btnKhoiPhucSinhVienActionPerformed

    private void txtPresentPageCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPresentPageCaretUpdate
        try {
            Integer.valueOf(txtPresentPage.getText());
        } catch (Exception e) {
            return;
        }
        if (cbTrangThaiSinhVien.getSelectedIndex() == 0) { // trạng thái hoạt động
            SinhVienBUS.showStudentList(this, Integer.parseInt(txtPresentPage.getText()));
        } else { // trạng thái khóa
            SinhVienBUS.showDeletedStudent(this, Integer.parseInt(txtPresentPage.getText()));
        }
    }//GEN-LAST:event_txtPresentPageCaretUpdate
    public void loadPage() {
        txtPresentPageCaretUpdate(null);
    }
    private void btnPrevPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevPageActionPerformed
        int presentPage = Integer.parseInt(txtPresentPage.getText()); // lấy trang hiện tại là bao nhiêu
        if (presentPage == 1) {
            return; // trang số 1 là trang đầu tiên nên không giảm nữa
        }
        int prevPage = presentPage - 1;
        txtPresentPage.setText(prevPage + "");
        btnDongSinhVienActionPerformed(null);
    }//GEN-LAST:event_btnPrevPageActionPerformed

    private void btnNextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextPageActionPerformed
        int presentPage = Integer.parseInt(txtPresentPage.getText());// lấy trang hiện tại là bao nhiêu
        if (presentPage == numberOfSinhVienPage && cbTrangThaiSinhVien.getSelectedIndex() == 0) { // đang xem trang cuối của sinh viên đang hoạt động
            return;
        }
        if (presentPage == numberOfDeletedSinhVienPage && cbTrangThaiSinhVien.getSelectedIndex() == 1) { // đang xem trang cuối của sinh viên bị xóa
            return;
        }
        int nextPage = presentPage + 1;
        txtPresentPage.setText(nextPage + "");
        btnDongSinhVienActionPerformed(null);
    }//GEN-LAST:event_btnNextPageActionPerformed

    private void btnXoaLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaLocActionPerformed
        SinhVienBUS.showStudentList(this, 1); //hiện 20 sinh viên trang 1
        txtPresentPage.setText("1");
        SinhVienBUS.btnXoaLocOnClick(this);
    }//GEN-LAST:event_btnXoaLocActionPerformed

    private void txtPresentPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPresentPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPresentPageActionPerformed

    private void cbNganhSinhVienItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNganhSinhVienItemStateChanged
        if (cbNganhSinhVien.getSelectedIndex() < 0) {
            return;
        }
        if (!SinhVienBUS.checkNganh(cbNganhSinhVien.getSelectedItem().toString())) {
            String maLop = SinhVienBUS.autoCompleteLop(SinhVienBUS.tenNganhToMaNganh(cbNganhSinhVien.getSelectedItem().toString())); // cái này sẽ cập nhật lại lớp mỗi lần thay đổi ngành
            txtLopSinhVien.setText(maLop);
        } else {
            String maLop = SinhVienBUS.autoCompleteLop(SinhVienBUS.tenNganhToMaNganh(cbNganhSinhVien.getSelectedItem().toString())); // cái này sẽ cập nhật lại lớp mỗi lần thay đổi ngành
            txtLopSinhVien.setText(maLop);
        }
    }//GEN-LAST:event_cbNganhSinhVienItemStateChanged

    private void cbTimKiemSinhVienItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTimKiemSinhVienItemStateChanged
        thuocTinhTimKiem = cbTimKiemSinhVien.getSelectedItem().toString();
        SinhVienBUS.giaTriTimKiemCuaThuocTinh(this);

    }//GEN-LAST:event_cbTimKiemSinhVienItemStateChanged

    private void txtTimKiemSinhVienCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiemSinhVienCaretUpdate
        SinhVienBUS.doiGiaTriTimKiem(this, txtTimKiemSinhVien.getText());
    }//GEN-LAST:event_txtTimKiemSinhVienCaretUpdate

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        IOExcel.writeExcel(tblStudentList, "Danh sách sinh viên", "qlsv");
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        ArrayList<ArrayList<Object>> data = null;
        try {
            data = IOExcel.readExcel(0);
            SinhVienBUS.importByExcel(data, this);
        } catch (IOException ex) {
            Logger.getLogger(StudentInfor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidFormatException ex) {
            Logger.getLogger(StudentInfor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(StudentInfor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImportActionPerformed

    private void studentinfoComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_studentinfoComponentResized

    }//GEN-LAST:event_studentinfoComponentResized

    private void jPanel2ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentResized
        int width = evt.getComponent().getWidth();
        int height = evt.getComponent().getHeight();
        if (width <= 1250) {
            txtTimKiemSinhVien.setPreferredSize(new Dimension(90, 28));
        } else {
            txtTimKiemSinhVien.setPreferredSize(new Dimension(200, 28));
        }
    }//GEN-LAST:event_jPanel2ComponentResized
//    public void setCbNganhSinhVien(ArrayList<String> dsTenNganh) {
    //        cbNganhSinhVien.removeAllItems();
    //        for (String i : dsTenNganh) {
    //            cbNganhSinhVien.addItem(i);
    //        }
    //    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDongSinhVien;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnKhoiPhucSinhVien;
    private javax.swing.JButton btnLuuSinhVien;
    private javax.swing.JButton btnNextPage;
    private javax.swing.JButton btnPrevPage;
    private javax.swing.JButton btnSuaSinhVien;
    private javax.swing.JButton btnThemSinhVien;
    private javax.swing.JButton btnTimKiemSinhVien;
    private javax.swing.JButton btnXoaLoc;
    private javax.swing.JButton btnXoaSinhVien;
    private javax.swing.JComboBox<String> cbNganhSinhVien;
    private javax.swing.JComboBox<String> cbTimKiemSinhVien;
    private javax.swing.JComboBox<String> cbTrangThaiSinhVien;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnMoreInfo;
    private javax.swing.JPanel pninfo;
    private javax.swing.JScrollPane scpStudentList;
    private javax.swing.JPanel studentinfo;
    private javax.swing.JTable tblStudentList;
    private javax.swing.JTextField txtCMNDSinhVien;
    private javax.swing.JTextField txtDanTocSinhVien;
    private javax.swing.JTextField txtDiaChiSinhVien;
    private javax.swing.JTextField txtGioiTinhSinhVien;
    private javax.swing.JTextField txtHoTenSinhVien;
    private javax.swing.JTextField txtLopSinhVien;
    private javax.swing.JTextField txtMSSinhVien;
    private javax.swing.JTextField txtMaTKSinhVien;
    private javax.swing.JTextField txtNgaySinhSinhVien;
    private javax.swing.JTextField txtNienKhoaSinhVien;
    private javax.swing.JTextField txtPresentPage;
    private javax.swing.JTextField txtSoDTSinhVien;
    private javax.swing.JTextField txtTimKiemSinhVien;
    private javax.swing.JTextField txtTonGiaoSinhVien;
    // End of variables declaration//GEN-END:variables
}
