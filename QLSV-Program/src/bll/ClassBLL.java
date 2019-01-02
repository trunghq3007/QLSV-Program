package bll;

import java.util.List;
import dal.ClassDAL;
import entity.Class;

public class ClassBLL implements BaseBLL<Class> {
    ClassDAL classDAL;
    static String inputCode = null;

    public ClassBLL() {
	classDAL = new ClassDAL();
    }

    @Override
    public List<Class> getAll() throws Exception {
	// TODO Auto-generated method stub
	return classDAL.getAll();
    }

    @Override
    public Class getByCode(String code) throws Exception {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public int insert(Class t) throws Exception {
	// TODO Auto-generated method stub
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
