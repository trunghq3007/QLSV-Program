package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Faculty;
import entity.Subjects;
import utils.Constants;
import utils.DbConnection;

public class SubjectsDAL implements BaseDAL<Subjects>{

	@Override
	public List<Subjects> getAll() {
		Connection connect = DbConnection.connect();
        List<Subjects> subjectss = new ArrayList<Subjects>();

        try {
                // Statement creation
                Statement statement = connect.createStatement();
                // for retrieve data
                ResultSet resultSet = statement.executeQuery(Constants.Subjects.SELECT_ALLMonHoc);
                while (resultSet.next()) {
                	Subjects subjects = new Subjects();
                	subjects.setSubjectsCode(resultSet.getString(Constants.Subjects.subjectsCode));
                	subjects.setSubjectsName(resultSet.getString(Constants.Subjects.subjectsName));
                	subjects.setNumberOfPeriods(resultSet.getInt(Constants.Subjects.numberOfPeriods));
               	subjectss.add(subjects);
                }
                statement.close();
                connect.close();
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return subjectss;	
	}

	@Override
	public Subjects getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Subjects object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Subjects object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Subjects> fillter(String sequenceFillter) {
		// TODO Auto-generated method stub
		return null;
	}

}
