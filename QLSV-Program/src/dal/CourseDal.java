package dal;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.sun.corba.se.impl.orbutil.closure.Constant;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import entity.Batch;
import utils.Constants;
import utils.Dbconnection;

public class CourseDal implements BaseDAL {

    List<String> list = new ArrayList<>();

    @Override
    public List getAll() {

        java.sql.Connection connect = Dbconnection.connect();

        List<Batch> batch = new ArrayList<>();
        try {
            java.sql.Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery(Constants.Batch.SELECT_ALL);

            while (resultSet.next()) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return batch;

    }

    @Override
    public Object getByCode(String code) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insert(Object object) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(Object object) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(String code) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List filter(String sequencefilter) {
        // TODO Auto-generated method stub
        return null;
    }

}
