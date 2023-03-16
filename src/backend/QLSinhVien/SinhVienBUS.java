/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLSinhVien;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import frontend.StudentInfo;
import java.awt.Font;
import java.text.SimpleDateFormat;

/**
 *
 * @author ASUS
 */
public class SinhVienBUS {

    static SinhVienDAO svDAO = new SinhVienDAO();
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // cái này để chuyển qua lại kiểu date với String

    public SinhVienBUS() {
    }

    public static void showStudentList(JTable table) {

        DefaultTableModel tblSinhVien = (DefaultTableModel) table.getModel();
        tblSinhVien.setRowCount(0);
        tblSinhVien.setColumnCount(0); // xóa hết để cái bảng trống rồi mới thêm dữ liệu zo
        tblSinhVien.setColumnIdentifiers(new Object[]{ // đặt tên các cột
            "MSSV", "Họ Tên", "Ngành", "Niên Khóa"
        });

        table.getColumn("MSSV").setMinWidth(150);
        table.getColumn("MSSV").setMaxWidth(150);
        table.getColumn("Ngành").setMaxWidth(350);
        table.getColumn("Ngành").setMinWidth(350);
        table.getColumn("Niên Khóa").setMaxWidth(100);
        table.getColumn("Niên Khóa").setMinWidth(100);

        ArrayList<SinhVien> dssv = new ArrayList();
        dssv = svDAO.get();
        for (SinhVien i : dssv) {
            tblSinhVien.addRow(new Object[]{
                i.getMaSV(), i.getHoTen(), maNganhToTenNganh(i.getMaNganh()), i.getNienKhoa()
            });
        }

        //--------------------Khúc này chỉnh các thuộc tính cho cái bảng -----------------------------------------------------
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer(); // Căn Giữa cho các cột kiểu String
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(String.class, centerRenderer);
        table.getColumn("MSSV").setCellRenderer(centerRenderer);
        table.getColumn("Niên Khóa").setCellRenderer(centerRenderer);
        table.getColumn("Họ Tên").setCellRenderer(centerRenderer);
        table.getColumn("Ngành").setCellRenderer(centerRenderer);
        table.getTableHeader().setDefaultRenderer(centerRenderer);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setRowHeight(35);
        table.setRowMargin(10);
        table.setFont(new java.awt.Font("Segoe UI", 0, 16));
        table.getTableHeader().setFont(new Font("Segoe UI", 0, 16));
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    public static SinhVien StudentinTable(JTable table, int row) { //hàm này trả về sinh viên ở dòng được chọn trong bảng
        ArrayList<SinhVien> dssv = new ArrayList();
        dssv = svDAO.get();
        String mssv = table.getValueAt(row, 0) + ""; // cái dòng này sẽ từ cái dòng được chọn trong bảng lấy ra giá trị trong ô mssv
        for (SinhVien sv : dssv) {
            if (sv.getMaSV().equals(mssv)) {
                return sv;
            }
        }
        return null;
    }

    public static void showMoreInfoStudent(StudentInfo info, SinhVien sv) {
        if (!info.isVisible()) { // cái này kiểm tra xem có mở cửa sổ thông tin sinh viên chưa
            info.setVisible(true); // mở rồi thì chỉ cần thay đổi giá trị trong bảng thôi
        }
        info.setTxtHoTenSinhVien(sv.getHoTen());
        info.setTxtMSSV(sv.getMaSV());
        info.setTxtCMNDSinhVien(sv.getCmnd());
        info.setTxtSoDienThoaiSinhVien(sv.getSoDienThoai());
        info.setTxtNgaySinhSinhVien(sv.getNgaySinh());
        info.setTxtGioiTinhSinhVien(sv.getGioiTinh());
        info.setTxtDiaChiSinhVien(sv.getDiaChi());
        info.setTxtDanTocSinhVien(sv.getDanToc());
        info.setTxtTonGiaoSinhVien(sv.getTonGiao());
        info.setTxtNienKhoaSinhVien(sv.getNienKhoa());
        info.setTxtNganhSinhVien(maNganhToTenNganh(sv.getMaNganh()));
        info.setTxtMaTKSinhVien(sv.getMaTK());

    }

    public static String maNganhToTenNganh(String maNganh) { // cái hàm này trả về tên ngành từ mã ngành
        if (maNganh.equals("DCT")) {
            return "Công Nghệ Thông Tin (DCT)";
        }
        if (maNganh.equals("DKP")) {
            return "Kĩ Thuật Phần Mềm (DKP)";
        }
        if (maNganh.equals("DAN")) {
            return "Ngôn Ngữ Anh (DAN)";
        }
        if (maNganh.equals("DSA")) {
            return "Sư Phạm Tiếng Anh (DSA)";
        }
        if (maNganh.equals("DQK")) {
            return "Quản Trị Kinh Doanh (DQK)";
        }
        if (maNganh.equals("DKQ")) {
            return "Kinh Doanh Quốc Tế (DKQ)";
        }
        if (maNganh.equals("DSI")) {
            return "Sư Phạm Sinh Học (DSI)";
        }
        if (maNganh.equals("DKH")) {
            return "Sư Phạm Khoa Học Tự Nhiên (DKH)";
        }
        if (maNganh.equals("DLI")) {
            return "Sư Phạm Vật Lý (DLI)";
        }
        if (maNganh.equals("DHO")) {
            return "Sư Phạm Hóa Học (DHO)";
        }
        if (maNganh.equals("DTN")) {
            return "Tài Chính Ngân Hàng (DTN)";
        }
        if (maNganh.equals("DKE")) {
            return "Kế Toán (DKE)";
        } else {
            return "";
        }
    }

    public static String tenNganhToMaNganh(String tenNganh) {
        String maNganh = tenNganh.split("[()]")[1]; // cái "[()]" là cắt chuỗi khi gặp 2 dấu hiệu là ')' và '('
        return maNganh;
    }

    public static void updateSinhVien(StudentInfo stu) {
        stu.getBtnSuaSinhVien().setEnabled(false);
        JTextField txtHoTen = stu.getTxtHoTenSinhVien();
        JTextField txtCMND = stu.getTxtCMNDSinhVien();
        JTextField txtDanToc = stu.getTxtDanTocSinhVien();
        JTextField txtDiaChi = stu.getTxtDiaChiSinhVien();
        JTextField txtGioiTinh = stu.getTxtGioiTinhSinhVien();
        JTextField txtNganh = stu.getTxtNganhSinhVien();
        JTextField txtNgaySinh = stu.getTxtNgaySinhSinhVien();
        JTextField txtSoDienThoai = stu.getTxtSoDienThoaiSinhVien();
        JTextField txtNienKhoa = stu.getTxtNienKhoaSinhVien();
        JTextField txtTonGiao = stu.getTxtTonGiaoSinhVien();
        txtHoTen.setEnabled(true);
        txtCMND.setEnabled(true);
        txtDanToc.setEnabled(true);
        txtDiaChi.setEnabled(true);
        txtGioiTinh.setEnabled(true);
        txtNganh.setEnabled(true);
        txtNgaySinh.setEnabled(true);
        txtSoDienThoai.setEnabled(true);
        txtNienKhoa.setEnabled(true);
        txtTonGiao.setEnabled(true);

    }

    public static String compare2SinhVien(SinhVien svCu, SinhVien svMoi) {
        String result = "";
        if (!svCu.getMaSV().equals(svMoi.getMaSV())) {
            result += "Mã Sinh Vien: " + svCu.getMaSV() + "-->" + svMoi.getMaSV() + "\n";
        }
        if (!svCu.getCmnd().equals(svMoi.getCmnd())) {
            result += "CMND: " + svCu.getCmnd() + "-->" + svMoi.getCmnd() + "\n";
        }
        if (!svCu.getSoDienThoai().equals(svMoi.getSoDienThoai())) {
            result += "Số Điện Thoại: " + svCu.getSoDienThoai() + "-->" + svMoi.getSoDienThoai() + "\n";
        }
        if (!svCu.getHoTen().equals(svMoi.getHoTen())) {
            result += "Họ Tên: " + svCu.getHoTen() + "-->" + svMoi.getHoTen() + "\n";
        }
        if (!svCu.getNgaySinh().equals(svMoi.getNgaySinh())) {
            result += "Ngày Sinh: " + dateFormat.format(svCu.getNgaySinh()) + "-->" + dateFormat.format(svMoi.getNgaySinh()) + "\n";
        }
        if (!svCu.getGioiTinh().equals(svMoi.getGioiTinh())) {
            result += "Giới Tính: " + svCu.getGioiTinh() + "-->" + svMoi.getGioiTinh() + "\n";
        }
        if (!svCu.getDiaChi().equals(svMoi.getDiaChi())) {
            result += "Địa Chỉ: " + svCu.getDiaChi() + "-->" + svMoi.getDiaChi() + "\n";
        }
        if (!svCu.getDanToc().equals(svMoi.getDanToc())) {
            result += "Dân Tộc: " + svCu.getDanToc() + "-->" + svMoi.getDanToc() + "\n";
        }
        if (!svCu.getTonGiao().equals(svMoi.getTonGiao())) {
            result += "Niên Khóa: " + svCu.getNienKhoa() + "-->" + svMoi.getNienKhoa() + "\n";
        }
        if (!svCu.getMaNganh().equals(svMoi.getMaNganh())) {
            result += "Ngành: " + maNganhToTenNganh(svCu.getMaNganh()) + "-->" + maNganhToTenNganh(svMoi.getMaNganh()) + "\n";
        }
        if (result.equals("")) {
            return "Không có gì thay đổi\n";
        }
        return result;
    }

    public static void main(String[] args) {
        svDAO.get().forEach(sv -> {
            System.out.println(sv.toString());
        });
        for (SinhVien sv : svDAO.get()) {

        }
//        svDAO.get();
    }
}
