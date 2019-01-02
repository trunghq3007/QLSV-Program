package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Course;
import entity.HeDT;
import entity.Khoa;
import utils.Constants;
import utils.Dbconnection;

public class KhoaDAL implements BaseDAL<Khoa> {

    public List<Khoa> getAll() {
        Connection connect = Dbconnection.connect();
        List<Khoa> dskhoa = new ArrayList<Khoa>();

        try {
            // Statement creation
            Statement statement = connect.createStatement();
            // for retrieve data
            ResultSet resultSet = statement.executeQuery(Constants.Khoa.SELECT_ALL);
            while (resultSet.next()) {
                Khoa khoa = new Khoa();
                khoa.setMaKhoa(resultSet.getString(Constants.Khoa.KHOA_MA));
                khoa.setTenKhoa(resultSet.getString(Constants.Khoa.KHOA_TEN));
                khoa.setDiaChi(resultSet.getString(Constants.Khoa.KHOA_DIACHI));
                khoa.setDienThoai(resultSet.getString(Constants.Khoa.KHOA_DIENTHOAI));
                dskhoa.add(khoa);
            }
            statement.close();
            connect.close();
        } catch (SQLException e) {
            // e.printStackTrace();
        }

        return dskhoa;
    }

    public Khoa getByCode(String code) {
        Connection connect = Dbconnection.connect();
        Khoa khoa = new Khoa();
        try {
            // Statement creation
            PreparedStatement preparedStatement = connect.prepareStatement(Constants.HeDT.SELLECT_BY_CODE);
            preparedStatement.setString(1, code);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                khoa.setMaKhoa(Constants.Khoa.KHOA_MA);
                khoa.setTenKhoa(Constants.Khoa.KHOA_TEN);
                khoa.setDiaChi(Constants.Khoa.KHOA_DIACHI);
                khoa.setDienThoai(Constants.Khoa.KHOA_DIENTHOAI);
                preparedStatement.close();
            }
            connect.close();
        } catch (SQLException e) {
            // e.printStackTrace();
        } finally {
            try {
                connect.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                // e.printStackTrace();
            }
        }
        return khoa;
    }

    public int insert(Khoa object) {
        Connection connect = Dbconnection.connect();
        int resultQuery = 0;
        try {
            // Statement creation
            PreparedStatement preparedStatement = connect.prepareStatement(Constants.Khoa.INSERT);
            preparedStatement.setString(1, object.getMaKhoa());
            preparedStatement.setString(2, object.getTenKhoa());
            preparedStatement.setString(3, object.getDiaChi());
            preparedStatement.setString(2, object.getDienThoai());
            resultQuery = preparedStatement.executeUpdate();
            connect.close();
        } catch (SQLException e) {
            // e.printStackTrace();
        } finally {
            try {
                connect.close();
            } catch (SQLException e2) {
                // TODO Auto-generated catch block
                // e2.printStackTrace();
            }
        }
        return resultQuery;
    }

    public int update(Khoa object) {
        Connection connect = Dbconnection.connect();
        int resultQuery = 0;
        try {
            // Statement creation
            PreparedStatement preparedStatement = connect.prepareStatement(Constants.Khoa.UPDATE);
            preparedStatement.setString(1, object.getTenKhoa());
            preparedStatement.setString(2, object.getDiaChi());
            preparedStatement.setString(3, object.getDienThoai());
            preparedStatement.setString(4, object.getMaKhoa());
            resultQuery = preparedStatement.executeUpdate();
            connect.close();
        } catch (SQLException e) {
            // e.printStackTrace();
        } finally {
            try {
                connect.close();
            } catch (SQLException e2) {
                // TODO Auto-generated catch block
                // e2.printStackTrace();
            }
        }
        return resultQuery;
    }

    public int delete(String code) {
        Connection connect = Dbconnection.connect();
        int resultQuery = 0;
        try {
            // Statement creation
            PreparedStatement preparedStatement = connect.prepareStatement(Constants.Khoa.DELETE);
            preparedStatement.setString(1,code);
            resultQuery = preparedStatement.executeUpdate();
            connect.close();
        } catch (SQLException e) {
            // e.printStackTrace();
        } finally {
            try {
                connect.close();
            } catch (SQLException e2) {
                // TODO Auto-generated catch block
                // e2.printStackTrace();
            }
        }
        return resultQuery;
    }

    public List<Khoa> fillter(String sequenceFilter) {
        // TODO Auto-generated method stub
        return null;
    }

    public String show() {
        // TODO Auto-generated method stub
        return null;
    }

    public StringBuilder showBuilder() {
        // TODO Auto-generated method stub
        return null;
    }

}
