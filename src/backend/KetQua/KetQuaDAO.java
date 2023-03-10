
package KetQua;

import Khoa.Khoa;
import connectDB.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class KetQuaDAO {
       public ArrayList<KetQua> get() {
         Connection con = ConnectionDB.getConnection();
        ArrayList<KetQua> dskq = new ArrayList<>();
        try {
            String query = "select * from KetQua";
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String maSV = rs.getString("MaSV");
                String maHP = rs.getString("MaHP");
                int soNhom = rs.getInt("SoNhom");
                int hocKy=rs.getInt("HocKy");
                int nam=rs.getInt("Nam");
                double DiemQuaTrinh = rs.getDouble("DiemQuaTrinh");
                double DiemCuoiKy = rs.getDouble("DiemCuoiKy");
                KetQua k = new KetQua(maSV,maHP,soNhom,hocKy,nam,DiemQuaTrinh,DiemCuoiKy);
                dskq.add(k);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(con);
        }
        return dskq;
    }
     public void add(KetQua k){
     Connection con = ConnectionDB.getConnection();
         try {
             String query = "Insert into KetQua values(?,?,?,?,?,?,?)";
             PreparedStatement pstm = con.prepareStatement(query);
             pstm.setString(1, k.getMaSV());
             pstm.setString(2,k.getMaHP());
             pstm.setInt(3,k.getSoNhom());
             pstm.setInt(4,k.getHocKy());
             pstm.setInt(5,k.getNam());
             pstm.setDouble(6,k.getDiemQT());
             pstm.setDouble(7,k.getDiemCK());
             pstm.executeUpdate();
         } catch (SQLException e) {
             e.printStackTrace();
         } finally {
             ConnectionDB.closeConnection(con);
         }
     }
     public void delete(String maSV,String maHP,int soNhom,int hocKy,int nam){
          Connection con = ConnectionDB.getConnection();
         try {
             String query = "Delete From KetQua where MaSV = ? and MaHP = ? and SoNhom = ? and HocKy = ? and Nam = ? ";
             PreparedStatement pstm = con.prepareStatement(query);
             pstm.setString(1, maSV);
             pstm.setString(2, maHP);            
             pstm.setInt(3,soNhom);
             pstm.setInt(4,hocKy);
             pstm.setInt(5,nam);
             pstm.executeUpdate();
         } catch (SQLException e) {
             e.printStackTrace();
         } finally {
             ConnectionDB.getConnection();
         }
     }
     public void update(String maSV,String maHP,int soNhom,int hocKy,int nam,KetQua kq){
         Connection con = ConnectionDB.getConnection();
         try {
             String query = "Update KeTQua set MaSV = ?, MaHP = ?,SoNhom = ?, "
                     + "HocKy = ?, Nam = ?,DiemQuaTrinh = ?,DiemCuoiKy = ?"
                     + " where MaSV = ? and MaHP = ? and SoNhom = ? and HocKy = ? and Nam = ? ";
             PreparedStatement pstm = con.prepareStatement(query);
             pstm.setString(1, kq.getMaSV());
             pstm.setString(2, kq.getMaHP());
             pstm.setInt(3, kq.getSoNhom());
             pstm.setInt(4, kq.getHocKy());
             pstm.setInt(5, kq.getNam());
             pstm.setDouble(6,kq.getDiemQT());
             pstm.setDouble(7,kq.getDiemCK());
             pstm.setString(8, maSV);
             pstm.setString(9, maHP);
             pstm.setInt(10, soNhom);
             pstm.setInt(11, hocKy);
             pstm.setInt(12, nam);
             pstm.executeUpdate();
         } catch (Exception e) {
         } finally {
             ConnectionDB.getConnection();
         } 
}
     public static void main(String[] args) {
        KetQuaDAO kqd = new KetQuaDAO();
//        ArrayList<KetQua> dskq = kqd.get();
//        dskq.forEach(kq->System.out.println(kq.toString()));
//KetQua kq = new KetQua("3121410483","861303",1,2,2022,9.5,10);
//        kqd.add(kq);
    //    kqd.update("3121410482","861302", 1, 2, 2021, kq);
//    kqd.delete("3121410483","861303", 1,2,2022);
    }
}
