/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.Excel;

import backend.QLSinhVien.SinhVien;
import connectDB.ConnectionDB;
import java.sql.Connection;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class testExportPDF {

    Connection con = null;
    PreparedStatement pstm = null;

    public SinhVien getSinhVien(String MaSV) {
        con = ConnectionDB.getConnection();
        SinhVien sv = null;
        try {
            String query = "SELECT * FROM SinhVien WHERE MaSV like '%" + MaSV + "%'";
            pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                int trangThai = rs.getInt("TrangThai");
                String maSV = rs.getString("MaSV");
                String cmnd = rs.getString("Cmnd");
                String soDienThoai = rs.getString("SoDienThoai");
                String maLop = rs.getString("MaLop");
                String hoTen = rs.getString("HoTen");
                Date ngaySinh = rs.getDate("NgaySinh");
                String gioiTinh = rs.getString("GioiTinh");
                String diaChi = rs.getString("DiaChi");
                String danToc = rs.getString("DanToc");
                String tonGiao = rs.getString("TonGiao");
                String nienKhoa = rs.getString("NienKhoa");
                String maNganh = rs.getString("MaNganh");
                int maTK = rs.getInt("MaTK");
                sv = new SinhVien(trangThai, maSV, cmnd, soDienThoai, maLop, hoTen, ngaySinh, gioiTinh, diaChi, danToc, tonGiao, nienKhoa, maNganh, maTK);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con, pstm);
        }
        return sv;
    }

    public static void main(String[] args) throws DocumentException, IOException {
        testExportPDF exportPDF = new testExportPDF();
        String mssv = "3121410379";
        SinhVien sv = exportPDF.getSinhVien(mssv);
        System.out.println(sv.getHoTen());
        BaseFont vietnameseFont = BaseFont.createFont("arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
//        Do something with the dssv ArrayList
        Font vn = new Font(vietnameseFont, 12);
        String fileName = "res/" + mssv + ".pdf";
        try {
            Document document = new Document();

            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();

            // Add image to the title
            Image image = Image.getInstance("src\\images\\logologinsmaller.png");
            image.scaleAbsolute(70f, 70f);
            image.setAlignment(Element.ALIGN_CENTER);
            Paragraph title = new Paragraph();
            title.setFont(vn);
            title.add(image);
            title.add("\nGiấy xác nhận hoãn nghĩa vụ quân sự");
            title.setAlignment(Element.ALIGN_CENTER);
            title.setSpacingAfter(20f);
            document.add(title);

            // Add table
            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);
            table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
            table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.getDefaultCell().setBorderWidth(0);

//            Font font = FontFactory.getFont("DejaVu Sans", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            table.addCell(new Phrase("Họ và tên:", vn));
            table.addCell(new Phrase(sv.getHoTen(), vn));
            table.addCell(new Phrase("MSSV:", vn));
            table.addCell(new Phrase(sv.getMaSV(), vn));
            table.addCell(new Phrase("CCCD", vn));
            table.addCell(new Phrase(sv.getCmnd(), vn));
            table.addCell(new Phrase("SoDienThoai", vn));
            table.addCell(new Phrase(sv.getSoDienThoai(), vn));

            document.add(table);
            document.close();
            System.out.println("Created PDF file test");
        } catch (FileNotFoundException e) {
            System.err.println("File not found error: " + e.getMessage());
        } catch (DocumentException e) {
            System.err.println("Document error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }

    }

}