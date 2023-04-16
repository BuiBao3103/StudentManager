/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.QLSinhVien;

import backend.Nganh.*;
import backend.QLGiangVien.GiangVien;
import backend.QLGiangVien.GiangVienBUS;
import backend.QLLop.*;
import backend.QLTaiKhoan.*;
import frontend.PersonalInfo;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import frontend.StudentInfor;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class SinhVienBUS {
    
    private static SinhVienDAO svDAO = new SinhVienDAO();
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // cái này để chuyển qua lại kiểu date với String
    static ArrayList<SinhVien> dssv = new SinhVienDAO().get();
    static ArrayList<Nganh> dsNganh = new NganhDAO().get();
    public static ArrayList<String> dsTenNganh = new ArrayList();
    public static int soLuongSinhVien = new SinhVienDAO().getNumberOfStudent();
    public static int soLuongSinhVienBiXoa = new SinhVienDAO().getNumberOfDeletedStudent();
    public static double soLuongSinhVienMotTrang = 20.0; // cái này để double để chia có số dư rồi làm tròn lên

    public SinhVienBUS() {
    }
    
    public static void getDsTenNganh() { // hàm này sẽ thay đổi ds lấy tất cả các ngành
        dsTenNganh.add(""); // cái này cho cái trường hợp chưa chọn
        for (Nganh i : dsNganh) {
            dsTenNganh.add(maNganhToTenNganh(i.getMaNganh()));
        }
        
    }
    
    public static void getDsTenNganhByKhoa(String maKhoa) {  // hàm này sẽ lấy được ds các ngành thuộc về khoa '...'
        dsTenNganh.add(""); // cái này cho cái trường hợp chưa chọn
        for (Nganh i : dsNganh) {
            if (i.getMaKhoa().equals(maKhoa)) {
                dsTenNganh.add(maNganhToTenNganh(i.getMaNganh()));
            }
        }
    }
    
    public static void formatTable(JTable table) {
        table.getColumn("MSSV").setMinWidth(150);
        table.getColumn("MSSV").setMaxWidth(150);
        table.getColumn("Ngành").setMaxWidth(350);
        table.getColumn("Ngành").setMinWidth(350);
        table.getColumn("Niên Khóa").setMaxWidth(100);
        table.getColumn("Niên Khóa").setMinWidth(100);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer(); // Căn Giữa cho các cột kiểu String
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumn("Niên Khóa").setCellRenderer(centerRenderer);
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
        table.setAutoCreateRowSorter(true);
    }
    
    public static void showStudentList(StudentInfor studentInfor, int page) {
        getDsTenNganh(); // cái hàm này sẽ thay đổi cái dstennganh cho cái combobox ten nganh
        ArrayList<SinhVien> dssv = new SinhVienDAO().getByNumberOfPage(page); // cái này lấy 100 svien ở số trang tương ứng
        JTable table = studentInfor.getTblStudentList();
        DefaultTableModel tblSinhVien = (DefaultTableModel) table.getModel();
        tblSinhVien.setRowCount(0);
        for (SinhVien i : dssv) {
            tblSinhVien.addRow(new Object[]{
                i.getMaSV(), i.getHoTen(), maNganhToTenNganh(i.getMaNganh()), i.getNienKhoa()
            });
        }
        formatTable(table);
        table.setModel(tblSinhVien); // cái này để thiết lập mô hình dữ liệu
    }
    
    public static void showDeletedStudent(StudentInfor studentInfor, int page) {
        JTable table = studentInfor.getTblStudentList();
        DefaultTableModel tblSinhVien = (DefaultTableModel) table.getModel();
        tblSinhVien.setRowCount(0);
        ArrayList<SinhVien> dssv = new SinhVienDAO().getDeletedStudentByNumberOfPage(page); // cái này lấy 100 svien ở số trang tương ứng
        for (SinhVien i : dssv) {
            tblSinhVien.addRow(new Object[]{
                i.getMaSV(), i.getHoTen(), maNganhToTenNganh(i.getMaNganh()), i.getNienKhoa()
            });
        }
        formatTable(table);
        table.setModel(tblSinhVien); // cái này để thiết lập mô hình dữ liệu
    }

//    public static void resetDssvWhenChangeTrangThai(StudentInfor table) { // cái hàm này thay đổi dssv khi chọn giá trị cho cbTrangThai
//        ArrayList<SinhVien> dssvNew = new ArrayList();
//        dssv = svDAO.get();
//        if (table.getCbTrangThaiSinhVien().getSelectedIndex() == 0) { // đang hoạt động
//            for (SinhVien i : dssv) {
//                if (i.getTrangThai() == 1) {
//                    dssvNew.add(i);
//                }
//            }
//        } else {
//            for (SinhVien i : dssv) {
//                if (i.getTrangThai() == 0) {
//                    dssvNew.add(i);
//                }
//            }
//        }
//        dssv = dssvNew;
////       System.out.println(dssv.size());
//    }
    public static void showStudentListWithCondition(StudentInfor studentInfor, String condition, String conditionName) {
        JTable table = studentInfor.getTblStudentList();
        DefaultTableModel tblSinhVien = (DefaultTableModel) table.getModel();
        tblSinhVien.setRowCount(0);
        int trangThai = 0;
        if (studentInfor.getCbTrangThaiSinhVien().getSelectedIndex() == 0) {
            trangThai = 1;
        }
//        System.out.println(conditionName);
        ArrayList<SinhVien> dssvNew = svDAO.getByCondition(condition, conditionName);
//        if (conditionName.equals("MSSV")) {
//            for (SinhVien i : dssv) {
//                if (i.getMaSV().contains(condition) && i.getTrangThai() == trangThai) {
//                    dssvNew.add(i);
//                }
//            }
//        }
//        if (conditionName.equals("Tên")) {
//            for (SinhVien i : dssv) {
//                if (i.getHoTen().contains(condition)&& i.getTrangThai() == trangThai) {
//                    dssvNew.add(i);
//                }
//            }
//        }
//        if (conditionName.equals("Ngành")) {
//            for (SinhVien i : dssv) {
//                if (maNganhToTenNganh(i.getMaNganh()).contains(condition)&& i.getTrangThai() == trangThai) {
//                    dssvNew.add(i);
//                }
//            }
//        }
        int flag = 0; // cái biến này xem coi có svien nào tìm được không
        for (SinhVien i : dssvNew) {
            if (i.getTrangThai() == trangThai) {
                tblSinhVien.addRow(new Object[]{
                    i.getMaSV(), i.getHoTen(), maNganhToTenNganh(i.getMaNganh()), i.getNienKhoa()
                });
                flag = 1;
            }
        }
        if (flag == 0) { // không dùng dssvNew.isEmty() được vì có thể tìm được svien nhưng không thỏa trạng thái
            JOptionPane.showMessageDialog(null, "Không tìm thấy sinh viên nào\n");
            return;
        }
    }
    
    public static SinhVien StudentinTable(JTable table, int row) { //hàm này trả về sinh viên ở dòng được chọn trong bảng
        String mssv = table.getValueAt(row, 0) + ""; // cái dòng này sẽ từ cái dòng được chọn trong bảng lấy ra giá trị trong ô mssv
        for (SinhVien sv : dssv) {
            if (sv.getMaSV().equals(mssv)) {
                return sv;
            }
        }
        return null;
    }
    
    public static void showMoreInfoStudent(StudentInfor table, SinhVien sv) {
        table.setTxtHoTenSinhVien(sv.getHoTen());
        table.setTxtMSSinhVien(sv.getMaSV());
        table.setTxtCMNDSinhVien(sv.getCmnd());
        table.setTxtSoDTSinhVien(sv.getSoDienThoai());
        table.setTxtLopSinhVien(sv.getMaLop());
        table.setTxtNgaySinhSinhVien(dateFormat.format(sv.getNgaySinh()));
        table.setTxtGioiTinhSinhVien(sv.getGioiTinh());
        table.setTxtDiaChiSinhVien(sv.getDiaChi());
        table.setTxtDanTocSinhVien(sv.getDanToc());
        table.setTxtTonGiaoSinhVien(sv.getTonGiao());
        table.setTxtNienKhoaSinhVien(sv.getNienKhoa());
//        table.setTxtNganhSinhVien(maNganhToTenNganh(sv.getMaNganh()));
        table.getCbNganhSinhVien().setSelectedItem(maNganhToTenNganh(sv.getMaNganh()));
        table.setTxtMaTKSinhVien(sv.getMaTK() + "");
        
    }
    
    public static String maNganhToTenNganh(String maNganh) { // // cái hàm này trả về tên ngành từ mã ngành DCT -> Công Nghệ Thông Tin (DCT)

        for (Nganh nganh : dsNganh) {
            if (nganh.getMaNganh().equals(maNganh)) {
                return nganh.getTenNganh() + " (" + maNganh + ")";
            }
        }
        return "";
    }
    
    public static String tenNganhToMaNganh(String tenNganh) { // hàm này sẽ từ 'Công Nghệ Thông Tin (DCT)' trả về 'DCT'
        if (tenNganh.equals("")) {
            return "";
        }
        String maNganh = tenNganh.split("[()]")[1]; // cái "[()]" là cắt chuỗi khi gặp 2 dấu hiệu là ')' và '('
        return maNganh;
    }
    
    public static String checkUpdateInfo(SinhVien svCu, SinhVien svMoi) { // hàm này trả về các lỗi đã tồn tại của các thuộc tính khóa
        String errorMessage = "";
        if (!svCu.getCmnd().equals(svMoi.getCmnd())) {  // nếu sửa CMND thì 2 cái cmnd cũ mới khác nhau
            if (checkExistCMND(svMoi.getCmnd())) { //cmnd đã tồn tại
                errorMessage += "- Chứng Minh Nhân Dân\n";
            }
        }
        if (!svCu.getMaSV().equals(svMoi.getMaSV())) {
            if (checkExistMSSV(svMoi.getMaSV())) {  // mssv đã tồn tại
                errorMessage += "- Mã Số Sinh Viên\n";
            }
        }
        if (svCu.getMaTK() != svMoi.getMaTK()) {
            if (checkExistMaTaiKhoan(svMoi.getMaTK() + "")) {
                errorMessage += "- Mã Tài Khoản";
            }
        }
        return errorMessage;
    }
    
    public static String checkAddInfo(SinhVien svMoi) { // hàm này trả về các lỗi đã tồn tại của các thuộc tính khóa
        String errorMessage = "";
        
        if (checkExistCMND(svMoi.getCmnd())) { //cmnd đã tồn tại
            errorMessage += "- Chứng Minh Nhân Dân\n";
        }
        
        if (checkExistMSSV(svMoi.getMaSV())) {  // mssv đã tồn tại
            errorMessage += "- Mã Số Sinh Viên\n";
        }
        
        if (checkExistMaTaiKhoan(svMoi.getMaTK() + "")) { // mã tk tồn tại rồi
            errorMessage += "- Mã Tài Khoản";
        }
        
        return errorMessage;
    }
    
    public static void resetJPanelMoreInfo(StudentInfor table) {
        if (table.getCbTrangThaiSinhVien().getSelectedIndex() != 1) {   // cái này nó bật lại mấy cái nút nên chỉ bật cho bên trạng thái chưa xóa thôi
            table.getBtnSuaSinhVien().setEnabled(true);
        }
//        table.getBtnKhoiPhucSinhVien().setVisible(false); // tắt cái nút khôi phục đi
        table.getBtnLuuSinhVien().setEnabled(false);
        table.getBtnSuaSinhVien().setVisible(true);
        table.getBtnXoaSinhVien().setVisible(true);
        table.getTxtMSSinhVien().setEnabled(false);
        table.getTxtHoTenSinhVien().setEnabled(false);
        table.getTxtCMNDSinhVien().setEnabled(false);
        table.getTxtDanTocSinhVien().setEnabled(false);
        table.getTxtDiaChiSinhVien().setEnabled(false);
        table.getTxtGioiTinhSinhVien().setEnabled(false);
//        table.getTxtNganhSinhVien().setEnabled(false);

        table.getCbNganhSinhVien().setEnabled(false);
        
        table.getTxtNgaySinhSinhVien().setEnabled(false);
        table.getTxtSoDTSinhVien().setEnabled(false);
        table.getTxtNienKhoaSinhVien().setEnabled(false);
        table.getTxtTonGiaoSinhVien().setEnabled(false);
        table.getTxtMaTKSinhVien().setEnabled(false);
        String blank = "";
        table.setTxtCMNDSinhVien(blank);
        table.setTxtDanTocSinhVien(blank);
        table.setTxtDiaChiSinhVien(blank);
        table.setTxtGioiTinhSinhVien(blank);
        table.setTxtHoTenSinhVien(blank);
        table.setTxtMSSinhVien(blank);
        table.setTxtMaTKSinhVien(blank);
//        table.setTxtNganhSinhVien(blank);
        table.getCbNganhSinhVien().setSelectedIndex(0); // cái này để cái combobox ngành sinh viên nó không chứa ngành nào
        table.setTxtLopSinhVien(blank);
        table.setTxtNgaySinhSinhVien(blank);
        table.setTxtNienKhoaSinhVien(blank);
        table.setTxtSoDTSinhVien(blank);
        table.setTxtTonGiaoSinhVien(blank);
        table.getPnMoreInfo().setVisible(false);
    }
    
    public static void changeBtnForTrangThai(StudentInfor table) {
        table.getBtnThemSinhVien().setEnabled(false);
        table.getBtnSuaSinhVien().setEnabled(false);
        table.getBtnXoaSinhVien().setEnabled(false);
        table.getBtnKhoiPhucSinhVien().setVisible(true);
    }
    
    public static void resetBtnForTrangThai(StudentInfor table) {
        table.getBtnThemSinhVien().setEnabled(true);
        table.getBtnSuaSinhVien().setEnabled(true);
        table.getBtnXoaSinhVien().setEnabled(true);
        table.getBtnKhoiPhucSinhVien().setVisible(false);
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
    
    public static SinhVien getSinhVienFromMoreInfo(StudentInfor table) {   // cái hàm này lấy thông tin từ panel Moreinfo tạo ra svien mới
        String HoTen = table.getTxtHoTenSinhVien().getText();
        String MSSV = table.getTxtMSSinhVien().getText();
        String CMND = table.getTxtCMNDSinhVien().getText();
        String SoDT = table.getTxtSoDTSinhVien().getText();
        String MaLop = table.getTxtLopSinhVien().getText();
        Date NgaySinh = new Date();
        String Nganh;
        try {
            NgaySinh = dateFormat.parse(table.getTxtNgaySinhSinhVien().getText());
            Nganh = SinhVienBUS.tenNganhToMaNganh(table.getCbNganhSinhVien().getSelectedItem().toString()); // dòng này nó lấy cái phần tử đang được chọn của combobox ngành rồi chuyển về thành mã ngành

        } catch (ParseException ex) {
            // có ngoại lệ nên return về 1 sinh viên bị lỗi
            return new SinhVien(1, "", "", "", "", "", NgaySinh, "", "", "", "", "", "", -1);
        }
        String GioiTinh = table.getTxtGioiTinhSinhVien().getText();
        String DiaChi = table.getTxtDiaChiSinhVien().getText();
        String DanToc = table.getTxtDanTocSinhVien().getText();
        String TonGiao = table.getTxtTonGiaoSinhVien().getText();
        String NienKhoa = table.getTxtNienKhoaSinhVien().getText();
//        String Nganh = SinhVienBUS.tenNganhToMaNganh(table.getTxtNganhSinhVien().getText());
        int MaTK = Integer.parseInt(table.getTxtMaTKSinhVien().getText());
        SinhVien sv = new SinhVien(1, MSSV, CMND, SoDT, MaLop, HoTen, NgaySinh, GioiTinh, DiaChi, DanToc, TonGiao, NienKhoa, Nganh, MaTK);
        return sv;
    }
    
    public static void updateSinhVien(StudentInfor table) { // cái hàm nàỳ sẽ bật những component cho mình sửa sinh viên
        table.getBtnSuaSinhVien().setEnabled(false);
        table.getBtnLuuSinhVien().setEnabled(true);
        table.getTxtHoTenSinhVien().setEnabled(true);
        table.getTxtCMNDSinhVien().setEnabled(true);
        table.getTxtDanTocSinhVien().setEnabled(true);
        table.getTxtDiaChiSinhVien().setEnabled(true);
        table.getTxtGioiTinhSinhVien().setEnabled(true);
//        JTextField txtNganh = table.getTxtNganhSinhVien();
//        table.getCbNganhSinhVien().setEnabled(true);
        table.getTxtNgaySinhSinhVien().setEnabled(true);
        table.getTxtSoDTSinhVien().setEnabled(true);
//        table.getTxtNienKhoaSinhVien().setEnabled(true);
        table.getTxtTonGiaoSinhVien().setEnabled(true);
        
    }

    public static void btnXoaLocOnClick(StudentInfor studentInfor) {
        setCbNganhSinhVien(studentInfor); // cái này nó thêm mấy cái lựa chọn cho cái ngành sinh viên
        studentInfor.btnDongSinhVienActionPerformed(null);        
        studentInfor.getBtnKhoiPhucSinhVien().setVisible(false); // ẩn cái nút khôi phục sinh viên
        studentInfor.getBtnNextPage().setVisible(true);
        studentInfor.getBtnPrevPage().setVisible(true);
        studentInfor.getObTxtPresentPage().setVisible(true);
        studentInfor.getTxtTimKiemSinhVien().setText("vd: 312141, Anh, Sư Phạm, ...");
        studentInfor.getCbTimKiemSinhVien().setSelectedIndex(0);
    }

    public static void updateSinhVienToServer(StudentInfor table, SinhVien svCu, SinhVien svMoi) {
        String errorMessage = "Một số thông tin đã tồn tại rồi: \n";
        int a = JOptionPane.showConfirmDialog(table, "Bạn Muốn Lưu Sinh Viên Này ?\n" + SinhVienBUS.compare2SinhVien(svCu, svMoi));
        if (a == JOptionPane.YES_OPTION) {
            if (SinhVienBUS.checkUpdateInfo(svCu, svMoi).equals("")) {  // khi thông tin nhập vào dúng thì kiểm tra trùng
//                SinhVienDAO svDAO = new SinhVienDAO();
                svDAO.update(svCu.getMaSV(), svMoi);
                JOptionPane.showMessageDialog(table, "Sửa Thành Công");
                resetJPanelMoreInfo(table);
                btnXoaLocOnClick(table);
                dssv = svDAO.get();
            } else {    // có thông tin khóa bị trùng
                JOptionPane.showMessageDialog(table, errorMessage + checkUpdateInfo(svCu, svMoi)); // cái này phát thông báo thông tin trùng
            }
        }
    }
    
    public static void addSinhVien(StudentInfor table) { // Cái hàm này chạy mỗi khi ấn nút thêm
        resetJPanelMoreInfo(table); // cái này xóa hết thông tin trong pnMoreInfo
        table.getPnMoreInfo().setVisible(true);
        table.getBtnSuaSinhVien().setVisible(false);
        table.getBtnLuuSinhVien().setVisible(true);
        table.getBtnLuuSinhVien().setEnabled(true);
        table.getBtnXoaSinhVien().setVisible(false);

//      table.getTxtMSSinhVien().setEnabled(true);
        table.getTxtHoTenSinhVien().setEnabled(true);
        table.getTxtCMNDSinhVien().setEnabled(true);
        table.getTxtDanTocSinhVien().setEnabled(true);
        table.getTxtDiaChiSinhVien().setEnabled(true);
        table.getTxtGioiTinhSinhVien().setEnabled(true);
//        table.getTxtNganhSinhVien().setEnabled(true);
        table.getCbNganhSinhVien().setEnabled(true);
        table.getTxtNgaySinhSinhVien().setEnabled(true);
        table.getTxtSoDTSinhVien().setEnabled(true);
//        table.getTxtNienKhoaSinhVien().setEnabled(true);
        table.getTxtTonGiaoSinhVien().setEnabled(true);
//        table.getTxtMaTKSinhVien().setEnabled(true);

        // ------------- khúc này tự động điền mấy cái ô dữ liệu ---------------
        table.getTxtMSSinhVien().setText(autoCompleteMSSV());
        table.getTxtMaTKSinhVien().setText(autoCompleteMaTK() + "");
        table.getTxtNienKhoaSinhVien().setText(autoCompleteNienKhoa());
    }
    
    public static String autoCompleteMSSV() {
        String mssv = "31"; // 2 số đầu là cố định
//        int year = new Date().getYear(); cái này trả về năm hiện tại trừ đi 1900 vd: hiện tại là 2023 nó sẽ ra 123
        int year = LocalDate.now().getYear() % 100; // hàm này trả về năm hiện tại rồi chia dư 100 lấy 2 số cuối
        mssv += year + ""; // mssv được 4 số rồi nè
        String maxMaSV = svDAO.maxMaSV(year + "");
        if (maxMaSV == null) { // chưa có sinh viên nào trong năm đó
            return mssv + "000001";
        }
       // int newMSSV = Integer.parseInt(maxMaSV) + 1; // nếu có sinh viên cùng năm rồi
        long newMSSV = Long.parseLong(maxMaSV)+1;
        return newMSSV + "";
    }
    
    public static int autoCompleteMaTK() { // hàm này trả về mã tài khoản cho sv cần tạo nè
        return svDAO.maxMaTK() + 1;
    }
    
    public static String autoCompleteNienKhoa() {
        int entryYear = LocalDate.now().getYear(); // năm vào trường
        int graduateYear = entryYear + 4; // năm tốt nghiệp sau 4 năm
        return entryYear + "-" + graduateYear;
    }
    
    public static String autoCompleteLop(String maNganh) {
        if (maNganh.equals("")) {
            return ""; // cái này chưa chọn ngành 
        }
        int year = LocalDate.now().getYear() % 100;                             // hàm này trả về năm hiện tại rồi chia dư 100 lấy 2 số cuối
        String maLop = svDAO.maxLopWithMaNganh(maNganh, year + "");
        Lop lop = new LopDAO().getLopByMaLop(maLop);
        if (lop == null) {                                                      // chưa có lớp nào của ngành đó trong năm hiện tại
            String maCoVanMoi = new LopDAO().GiangVienForNewLop();
            String maLopMoi = maNganh + "1" + year + "1";                       // vd tạo lớp đầu của 1 khóa là DCT1231 hoặc DKP1211
            lop = new Lop(maLopMoi, maNganh, maCoVanMoi, 0);
            new LopDAO().add(lop); // tạo lớp mới
            return lop.getMaLop();
        } else if (lop.getSoLuong() < 20) {                                     // số lượng svien của lớp chưa đầy 20 bạn
            return maLop;
        } else if (lop.getMaLop().endsWith("9")) {                        // đã đầy 9 lớp của 1 ngành của 1 khóa hiện tại
            return "Đã Đầy";
        } else {                                                                // trường hợp các lớp cùng ngành cùng khóa đã đầy cần tạo lớp tiếp theo
            int LopMoi = Integer.parseInt(maLop.substring(3)) + 1;  // hàm này sẽ ra được cái mã lớp tiếp theo nếu chưa đầy 9 lớp
            String maCoVanMoi = new LopDAO().GiangVienForNewLop();
            String maLopMoi = maNganh + LopMoi;
            lop = new Lop(maLopMoi, maNganh, maCoVanMoi, 0);    // số lượng sẽ tăng khi add sinh viên thành công
            new LopDAO().add(lop);
            return maLopMoi;
        }
    }
    
    public static void addSinhVienToServer(StudentInfor table, SinhVien svMoi) {
        String errorMessage = "Một số thông tin đã tồn tại rồi: \n";
        int a = JOptionPane.showConfirmDialog(table, "Bạn muốn thêm sinh viên này ?");
        if (a == JOptionPane.YES_OPTION) {
            if (SinhVienBUS.checkAddInfo(svMoi).equals("")) { // kiểm tra xem có bị trùng thông tin không
                createTaiKhoanForSinhVien(svMoi);
                svDAO.add(svMoi);
                new LopDAO().updateSoLuong(svMoi.getMaLop()); // tăng số sinh viên trong lớp lên
                JOptionPane.showMessageDialog(table, "Thêm Thành Công");
                resetJPanelMoreInfo(table);
                btnXoaLocOnClick(table);
                dssv = svDAO.get();
            } else {   // thông tin khóa bị trùng
                JOptionPane.showMessageDialog(table, errorMessage + checkAddInfo(svMoi));
            }
        }
    }
    
    public static void createTaiKhoanForSinhVien(SinhVien sv) { // hàm này tạo tài khoản cho sinh viên
        int maTK = sv.getMaTK();
        String tenTK = sv.getMaSV();
        SimpleDateFormat dateForMatKhau = new SimpleDateFormat("yyyyMMdd"); // Cái này chuyển ngày sinh (2003-07-21) về chuỗi mật khẩu phù hợp (20030721)
        String matKhau = dateForMatKhau.format(sv.getNgaySinh());
        String maNhomQuyen = "Q4"; // tạo tài khoản cho sinh viên nên Q4

        TaiKhoan tk = new TaiKhoan(maTK, tenTK, matKhau, maNhomQuyen);
        new TaiKhoanDAO().add(tk);
    }
    
    public int getTrangThai(int MaTK) {
        return svDAO.getTrangThaiByMaTk(MaTK);
    }
    
    public static void setCbNganhSinhVien(StudentInfor studentInfor) {
        studentInfor.getCbNganhSinhVien().removeAllItems();
        for (String i : dsTenNganh) {
            studentInfor.getCbNganhSinhVien().addItem(i);
        }
    }
//---------------------------------------------------- Khúc này toàn hàm kiểm tra thông tin thôi ---------------------------------------------------

    public static boolean checkHoTen(String hoTen) { // Kiểm tra tên hợp lệ không
        if (hoTen.equals("") || hoTen.length() > 50) {
            return false;
        }
        
        for (int i = 0; i < hoTen.length(); i++) {
            char kiTu = hoTen.charAt(i);
            if ((kiTu < 'a' || kiTu > 'z') && (kiTu < 'A' || kiTu > 'Z') && kiTu != ' ' && !checkNguyenAm(kiTu)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkNguyenAm(char kiTu) { // cái hàm check các kí tự trong tên có dấu
        char dsNguyenAm[] = {'à', 'á', 'ả', 'ã', 'ạ', 'Á', 'À', 'Ả', 'Ã', 'Ạ',
            'ă', 'Ă', 'â', 'Â', 'ằ', 'ắ', 'ẳ', 'ẵ', 'ặ', 'Ấ', 'Ầ', 'Ẩ', 'Ẫ', 'Ậ',
            'ầ', 'ấ', 'ẩ', 'ẫ', 'ậ', 'Ắ', 'Ằ', 'Ẳ', 'Ẵ', 'Ặ',
            'ê', 'è', 'é', 'ẻ', 'ẽ', 'ẹ', 'ề', 'ế', 'ể', 'ễ', 'ệ',
            'Ê', 'È', 'É', 'Ẻ', 'Ẽ', 'Ẹ', 'Ề', 'Ế', 'Ể', 'Ễ', 'Ệ',
            'ô', 'ơ', 'ò', 'ó', 'ỏ', 'õ', 'ọ', 'ồ', 'ố', 'ổ', 'ỗ', 'ộ', 'ờ', 'ớ', 'ở', 'ỡ', 'ợ',
            'Ô', 'Ơ', 'Ò', 'Ó', 'Ỏ', 'Õ', 'Ọ', 'Ồ', 'Ố', 'Ổ', 'Ỗ', 'Ộ', 'Ờ', 'Ớ', 'Ở', 'Ỡ', 'Ợ',
            'ư', 'Ư', 'ù', 'ú', 'ủ', 'ũ', 'ụ', 'ừ', 'ứ', 'ử', 'ữ', 'ự',
            'Ù', 'Ú', 'Ủ', 'Ũ', 'Ụ', 'Ừ', 'Ứ', 'Ử', 'Ữ', 'Ự',
            'ì', 'í', 'ỉ', 'ĩ', 'ị',
            'Ì', 'Í', 'Ỉ', 'Ĩ', 'Ị',
            'đ', 'Đ',
            'ỳ', 'ý', 'ỷ', 'ỹ', 'ỵ',
            'Ỳ', 'Ý', 'Ỷ', 'Ỹ', 'Ỵ'};
        for (char nguyenAm : dsNguyenAm) {
            if (kiTu == nguyenAm) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean checkMSSV(String MSSV) {
        if (MSSV.length() != 10) {
            return false;
        }
        for (int i = 0; i < MSSV.length(); i++) {
            char so = MSSV.charAt(i);
            if (so < '0' || so > '9') {
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkExistMSSV(String MSSV) { // nếu mssv tồn tại rồi trả về true
//        ArrayList<SinhVien> dssv = new ArrayList(); // Kiểm tra MSSV có tồn tại chưa
//        dssv = svDAO.get();
        for (SinhVien i : dssv) {
            if (i.getMaSV().equals(MSSV)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean checkCMND(String CMND) {
        if (CMND.length() != 12) {
            return false;
        }
        for (int i = 0; i < CMND.length(); i++) {
            char so = CMND.charAt(i);
            if (so < '0' || so > '9') {
                return false;
            }
        }
//        ArrayList<SinhVien> dssv = new ArrayList(); // Kiểm tra CMND có tồn tại chưa
//        dssv = svDAO.get();
        return true;
    }
    
    public static boolean checkExistCMND(String CMND) {
        for (SinhVien i : dssv) {
            if (i.getCmnd().equals(CMND)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean checkMaLop(String maLop) {
        if (maLop.equals("")) {
            return false;
        }
        int flag = 0;
        String maNganh = maLop.substring(0, 3); // lấy 3 chữ đầu trong mã lớp
        for (Nganh n : dsNganh) {
            if (n.getMaNganh().equals(maNganh)) {
                flag = 1;
            }
        }
        if (flag == 0) { // mã ngành k có trong danh sách ngành
            return false;
        }
        int year = LocalDate.now().getYear() % 100;
        int nam = Integer.parseInt(maLop.substring(4, 6));
        if (nam != year) { // năm k trùng năm hiện tại
            return false;
        }
        return true;
    }
    
    public static boolean checkGioiTinh(String gioiTinh) {
        if (!gioiTinh.equals("Nữ") && !gioiTinh.equals("Nam")) {
            return false;
        }
        return true;
    }
    
    public static boolean checkDanToc(String danToc) {
        String[] dsDanToc = {"Kinh", "Tày", "Thái", "Mường", "Nùng", "H'Mông", "Dao", "Gia Rai", "Ê Đê", "Ba Na", "Chăm",
            "Sán Chay", "Cơ Ho", "Xơ Đăng", "Khơ Mú", "Giáy", "Lào", "La Chí", "La Ha", "Pu Péo", "Ro Măm",
            "Mạ", "Co", "Ta Ôi", "Chu Ru", "Lô Lô", "Kháng", "Xinh Mun", "Hrê", "Ra Glai", "Mnông", "Thổ",
            "Brâu", "Ơ Đu", "Khmer", "Chuông", "Mạ Pờ Lồ", "Rơ Măm", "Khơ Me", "Khơ Mạ", "Bru - Vân Kiều",
            "Thái Đen", "Cơ Tu", "Giẻ Triêng", "Tà Ôi", "Mạ Đức", "Cống", "Bố Y", "Si La", "Pu Thê", "Rơ Ngao",
            "La Hủ", "Lự", "Phù Lá", "Ngái", "Si Đăng", "Pu Ko", "Ba Na", "Xuống", "Krông", "Lự", "Lô Lô",
            "Chứt", "Mảng", "Cờ Lao", "Bố Y", "Lô Lô Si La", "Pà Thẻn", "Cống", "Si La", "La Hủ", "Lự", "Phù Lá",
            "Ngái", "Si Đăng", "Pu Ko", "Ba Na", "Xuống", "Krông", "Lự", "Lô Lô", "Chứt", "Mảng", "Cờ Lao",
            "Bố Y", "Lô Lô Si La", "Pà Thẻn"};
        for (String dsDanToc1 : dsDanToc) {
            if (danToc.equals(dsDanToc1)) {
                return true;
            }
        }
        return false;
        
    }
    
    public static boolean checkTonGiao(String tonGiao) {
        // 10 tôn giáo phổ biến nhất Việt Nam
        String[] dsTonGiao = {"Không", "Phật giáo", "Thiên chúa giáo", "Hòa hảo", "Cao Đài", "Đạo Bửu Sơn Kỳ Hương",
            "Đạo Tứ Ân Hiếu Nghĩa", "Đạo Tam Kỳ Khổng Tử", "Đạo Tứ Thánh Tâm Minh", "Đạo Đức Thanh Minh",
            "Đạo Minh Lý Phật"};
        for (String dsTonGiao1 : dsTonGiao) {
            if (tonGiao.equals(dsTonGiao1)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean checkSoDienThoai(String soDienThoai) {
        if (soDienThoai.length() != 10) {
            return false;
        }
        for (int i = 0; i < soDienThoai.length(); i++) {
            char so = soDienThoai.charAt(i);
            if (so < '0' || so > '9') {
                return false;
            }
        }
        // Khúc này kiểm tra đầu số có tồn tại trong 30 đầu số phổ biến nhất không
        String[] dsDauSoDienThoai = {"086", "096", "097", "098", "032", "033", "034", "035", "036", "037",
            "038", "039", "088", "091", "094", "083", "084", "085", "081", "082", "089",
            "090", "093", "070", "079", "077", "076", "078", "092", "056", "058", "012", "011", "013", "014", "015", "010", "016", "017"};
        String dauSoDienThoai = soDienThoai.substring(0, 3); // lấy 3 số đầu
        int flag = 0;
        for (String i : dsDauSoDienThoai) {
            if (dauSoDienThoai.equals(i)) {
                flag = 1;
            }
        }
        if (flag == 0) {
            return false;
        }
        // ---------------------------------------------------------
        return true;
    }
    
    public static boolean checkDiaChi(String diaChi) {
        if (diaChi.length() <= 0 || diaChi.length() > 50) {
            return false;
        }
        for (int i = 0; i < diaChi.length(); i++) {
            char kitu = diaChi.charAt(i);
            // các kí tự là chữ hoặc số hoặc dấu '/' thôi
            if (!checkNguyenAm(kitu) && kitu != '/' && kitu != ' ' && kitu != '.' && (kitu < '0' || kitu > '9') && (kitu < 'a' || kitu > 'z') && (kitu < 'A' || kitu > 'Z')) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkNienKhoa(String nienKhoa) {
        int namVaoTruong, namRaTruong;
        try {
            namVaoTruong = Integer.parseInt(nienKhoa.split("-")[0]);
            namRaTruong = Integer.parseInt(nienKhoa.split("-")[1]);
        } catch (Exception e) {
            return false;
        }
        if (namRaTruong - namVaoTruong < 4 || namRaTruong - namVaoTruong > 10) {
            return false;
        }
        Date today = new Date();
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        int namHienTai = Integer.parseInt(yearFormat.format(today));
        if (namVaoTruong > namHienTai) {
            return false;
        }
        return true;
    }
    
    public static boolean checkNgaySinh(String ngaySinh) {
        if (ngaySinh.length() != 10) { // 1999-07-08 -> true 1999-7-8 -> false
            return false;
        }
        try {
            dateFormat.parse(ngaySinh);
        } catch (Exception e) {
            return false;
        }
        if (!checkValidNgay(ngaySinh)) {
            return false;
        }
        return true;
    }
    
    public static boolean checkNganh(String nganh) { // tham số truyền vao kiểu 'Công Nghệ Thông Tin (DCT)'
//        String dsMaNganh[] = {"DAN","DCT","DHO","DKE","DKH","DKP","DKQ","DLI","DQK","DSA","DSI","DTN"};
        ArrayList<Nganh> dsNganh = new ArrayList();
        dsNganh = new NganhDAO().get();
        String maNganh;
        String tenNganh;
        try {
            maNganh = tenNganhToMaNganh(nganh); // cái ngành truyền vào là kiểu "Sư Phạm Hóa (DHO)"
            tenNganh = maNganhToTenNganh(maNganh); // nên phải chuyển từ cái ngành sang mã ngành rồi chuyển lại thành tên ngành
        } catch (Exception e) {
            return false;
        }
        if (!tenNganh.equals(nganh)) { // cái này kiểm tra mã ngành với tên ngành k khớp nhau vd: Kế Toán (DKE) -> true mà nhập Kế Toán (DCT)
            return false;
        }
        for (Nganh i : dsNganh) {
            if (i.getMaNganh().equals(maNganh)) { // so sánh mã ngành nếu tồn tại thì so sánh luôn tên ngành
                if (maNganhToTenNganh(i.getMaNganh()).equals(nganh)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean checkMaTaiKhoan(String maTaiKhoan) {
        int intMaTaiKhoan;
        try {
            intMaTaiKhoan = Integer.parseInt(maTaiKhoan);
        } catch (Exception e) {
            return false;
        }
        if (intMaTaiKhoan < 0) {
            return false;
        }
        
        return true;
    }
    
    public static boolean checkExistMaTaiKhoan(String maTaiKhoan) {
        int intMaTaiKhoan;
        try {
            intMaTaiKhoan = Integer.parseInt(maTaiKhoan);
        } catch (Exception e) {
            return false;
        }
        ArrayList<TaiKhoan> dsTaiKhoan = new TaiKhoanDAO().get();
        for (TaiKhoan tk : dsTaiKhoan) {
            if (tk.getMaTK() == intMaTaiKhoan) { // mã tài khoản đã tồn tại
                return true;
            }
        }
        return false;
    }
    //--------------------------- Các hàm dưới đây để kiểm tra ngày sinh của sinh viên-------------------------------------------

    public static boolean checkValidNgay(String ngay) {  //kiem tra xem ngay dang xet co hop le khong
        String ngaythangnam[] = ngay.split("-"); // Tách cái chuỗi ngày ra để lấy từng phần tử
        int soNgay = Integer.parseInt(ngaythangnam[2]);
        int soThang = Integer.parseInt(ngaythangnam[1]);
        int soNam = Integer.parseInt(ngaythangnam[0]);
        Date today = new Date();
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        int namHienTai = Integer.parseInt(yearFormat.format(today));
        if (namHienTai - soNam > 100 || namHienTai - soNam < 18) {
            return false;
        }
        if (soThang < 1 || soThang > 12) {
            return false;
        }
        if (soNgay < 1 || soNgay > soNgayTrongThang(soThang, soNam)) {
            return false;
        }
        return true;
        
    }
    
    public static boolean checkNamNhuan(int nam) {  // kiem tra xem nam dang xet co phai nam nhuan khong 
        if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
            return true;
        }
        return false;
    }
    
    public static int soNgayTrongThang(int thang, int nam) { // tim so ngay trong thang tuong ung
        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            case 2 -> {
                if (checkNamNhuan(nam)) {
                    return 29;
                }
                return 28;
            }
        }
        return 0;
    }
// ---------------------------------------------------------------------------------------------------------------

    public static boolean checkAllInfo(SinhVien sv) {
        if (!checkCMND(sv.getCmnd()) || !checkDanToc(sv.getDanToc()) || !checkDiaChi(sv.getDiaChi()) || !checkMaLop(sv.getMaLop())
                || !checkGioiTinh(sv.getGioiTinh()) || !checkHoTen(sv.getHoTen()) || !checkMSSV(sv.getMaSV())
                || !checkMaTaiKhoan(sv.getMaTK() + "") || !checkNganh(maNganhToTenNganh(sv.getMaNganh())) || !checkNgaySinh(dateFormat.format(sv.getNgaySinh()))
                || !checkNienKhoa(sv.getNienKhoa()) || !checkSoDienThoai(sv.getSoDienThoai()) || !checkTonGiao(sv.getTonGiao())) {
            
            return false;
        }
        return true;
    }

    // Viết cho file péonnallnfo
    public void pesronnalInfor(PersonalInfo p) {
        SinhVien sv = (new SinhVienDAO()).getByMaSV(TaiKhoanBUS.curentLogin.getTenTaiKhoan()).get(0);
        Nganh n = NganhBUS.getNganhByID(sv.getMaNganh());
        Lop lop = LopBUS.getLopByLopid(sv.getMaLop());
        GiangVien gv = GiangVienBUS.getGVnameByGVid(lop.getMaCoVan());
        p.getTxtID().setText(sv.getMaSV());
        p.getTxtName().setText(sv.getHoTen());
        p.getTxtCCCD().setText(sv.getCmnd());
        p.getTxtGioiTinh().setText(sv.getGioiTinh());
        p.getTxtTonGiao().setText(sv.getTonGiao());
        p.getTxtLop().setText(sv.getMaLop());
        p.getTxtNgaySinh().setText(String.valueOf(sv.getNgaySinh()));
        p.getTxtNienKhoa().setText(sv.getDiaChi());
//        p.getTxtDanToc().setText(sv.getDanToc());
        p.getTxtSDT().setText(sv.getSoDienThoai());
        p.getTxtNienKhoa().setText(sv.getNienKhoa());
        p.getTxtNganh().setText(n.getTenNganh());
        p.getTxtCoVan().setText(gv.getTenGV());
    }

    //----------------------------------------Kết thúc phần kiểm tra thông tin-------------------------------------------------------------------------------------------
    public static void main(String[] args) {
//        svDAO.get().forEach(sv -> {
//            System.out.println(sv.toString());
//        });
//                SimpleDateFormat dateForMatKhau = new SimpleDateFormat("yyyyMMdd");
//        for (SinhVien sv : svDAO.get()) {
//            System.out.println(dateForMatKhau.format(sv.getNgaySinh()));
//        }
////        svDAO.get();
//    String x = "DCT1234";
//    System.out.println(x.substring(4, 6));
//        System.out.println(x.endsWith("9"));
//        System.out.println(new LopDAO().GiangVienForNewLop());

    }
    
}
