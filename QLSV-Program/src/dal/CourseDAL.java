/**
 * 
 */
package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Course;
import utils.DBconnection;

public class CourseDAL implements BaseDAL<Course>{

 
    @Override
    public List<Course> getAll() {
        Connection connect =DBconnection.getConnection();
        ArrayList<Course> courses =new ArrayList<Course>();
        //khaibao//khoitao
        try {
            //statement creation
            Statement statement = connect.createStatement();
            //for retrieve data
            ResultSet resultSet = statement.executeQuery(arg0);
            while(resultSet.next()) {
                Con
            }
        }
        
        
        return courses;
    }


    @Override
    public Course getByCode(String code) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public int insert(Course object) {
        // TODO Auto-generated method stub
        return 0;
    }

   
    @Override
    public int update(Course object) {
        // TODO Auto-generated method stub
        return 0;
    }

  
    @Override
    public int delete(String code) {
        // TODO Auto-generated method stub
        return 0;
    }

   
    @Override
    public List<Course> fillter(String sequenceFillter) {
        // TODO Auto-generated method stub
        return null;
    }
        
}
