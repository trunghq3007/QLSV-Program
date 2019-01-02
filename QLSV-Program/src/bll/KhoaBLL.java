package bll;

import java.util.List;

import dal.KhoaDAL;
import entity.Khoa;

public class KhoaBLL implements BaseBLL<Khoa> {
    private KhoaDAL khoaDAL;

    public KhoaBLL() {
        khoaDAL = new KhoaDAL();
    }

    public List<Khoa> getAll() {
        return khoaDAL.getAll();
    }

    public Khoa getByCode(String code) {
        return khoaDAL.getByCode(code);
    }

    public int insert(Khoa object) {
        return khoaDAL.insert(object);
    }

    public int update(Khoa object) {
        return khoaDAL.update(object);
    }

    public int delete(String code) {
        return khoaDAL.delete(code);
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
