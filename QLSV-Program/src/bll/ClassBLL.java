package bll;

import java.util.List;
import dal.ClassDAL;
import entity.Class;
import entity.Course;

public class ClassBLL implements BaseBLL<Class> {
    ClassDAL classDAL;
    static String inputCode = null;
    static List<Class> classes = null;
    public ClassBLL() {
	classDAL = new ClassDAL();
    }

    public void showClassListChoice() throws Exception {
	classes = getAll();
	for (Class x : classes) {
	    System.out.println(x);
	}
    }

    @Override
    public List<Class> getAll() throws Exception {
	return classDAL.getAll();
    }

    @Override
    public Class getByCode(String code) throws Exception {
	return null;
    }

    @Override
    public int insert(Class t) throws Exception {
	return 0;
    }

    @Override
    public int update(Class object) throws Exception {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int delete(Class object) throws Exception {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public List<Class> filter(String sequenceFilter) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String show() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public StringBuilder showBuilder() {
	// TODO Auto-generated method stub
	return null;
    }

}
