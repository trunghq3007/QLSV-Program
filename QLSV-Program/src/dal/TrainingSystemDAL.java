/**
 * 
 */
package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Course;
import entity.TrainingSystem;
import utils.Constants;
import utils.DbConnection;

/**
 * @author User
 *
 */
public class TrainingSystemDAL implements BaseDAL<TrainingSystem>{

  
    @Override
    public List<TrainingSystem> getAll() {
        Connection connect = DbConnection.connect();
        List<TrainingSystem> trainingsystems = new ArrayList<TrainingSystem>();

        try {
                // Statement creation
                Statement statement = connect.createStatement();
                // for retrieve data
                ResultSet resultSet = statement.executeQuery(Constants.TrainingSystem.SELECT_ALLHEDT);
                while (resultSet.next()) {
                    TrainingSystem trainingsystem = new TrainingSystem();
                        trainingsystem.setTrainingSystemCode(resultSet.getString(Constants.TrainingSystem.TrainingSystem_CODE));
                        trainingsystem.setTrainingSystemName(resultSet.getString(Constants.TrainingSystem.TrainingSystem_NAME));
                        trainingsystems.add(trainingsystem);
                }
                statement.close();
                connect.close();
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return trainingsystems;
    }


    @Override
    public TrainingSystem getByCode(String code) {
        // TODO Auto-generated method stub
        return null;
    }

   
    @Override
    public int insert(TrainingSystem object) {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public int update(TrainingSystem object) {
        // TODO Auto-generated method stub
        return 0;
    }

 
    @Override
    public int delete(String code) {
        // TODO Auto-generated method stub
        return 0;
    }

  
    @Override
    public List<TrainingSystem> fillter(String sequenceFillter) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
