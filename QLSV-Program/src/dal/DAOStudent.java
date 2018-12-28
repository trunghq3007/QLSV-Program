/**
 * 
 */
package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import entity.Student;
import utils.DBconnection;

/**
 * @author User
 *
 */
public class DAOStudent {
    // get danh sach Student
    public ArrayList<Student> getListStudent() throws SQLException {
        Connection conn = DBconnection.getConnection();
        String sql = "SELECT * FROM sinhvien";
        PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Student> List = new ArrayList<>();
        while (rs.next()) {
            Student sv = new Student();
            sv.setMaSV(rs.getString("MaSV"));
            sv.setTenSV(rs.getString("TenSV"));
            sv.setGioiTinh(rs.getBoolean("GioiTinh"));
            sv.setNgaySinh(rs.getString("NgaySinh"));
            sv.setQueQuan(rs.getString("QueQuan"));
            List.add(sv);

        }
        return List;
    }

    //them moi du lieu
    public boolean insertStudent(Student s) {
        Connection conn = DBconnection.getConnection();
        String sql="INSERT INTO qlsv.sinhvien (MaSV,TenSV, GioiTinh, NgaySinh, QueQuan, MaLop) VALUES (?,?,?,?,?,?);\r\n" + 
                "";
        try
        {
            PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
            
            ps.setString(1, s.getMaSV());
            ps.setString(2, s.getTenSV());
            ps.setBoolean(3, s.getGioiTinh());
            ps.setString(4, s.getNgaySinh());
            ps.setString(5, s.getQueQuan());
            return ps.executeUpdate()==1;
            
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
        return false;
    } 
    
    public static void main(String[] args) {
            DAOStudent d = new DAOStudent();
            
           try {
            for(Student s : d.getListStudent()) {
                System.out.println(s.getMaSV());  
                System.out.println(s.getTenSV());
                System.out.println(s.getGioiTinh());
                System.out.println(s.getNgaySinh());
                System.out.println(s.getQueQuan());
               }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
           
           
           System.out.println(d.insertStudent(new Student()));
    }
}
