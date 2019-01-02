package bll;

import java.util.List;

import dal.HeDTdal;
import entity.HeDT;

public class HeDTbll implements BaseBLL<HeDT> {
    private HeDTdal heDTdal;

    public HeDTbll() {
        heDTdal = new HeDTdal();
    }

    public List<HeDT> getAll() {
        // TODO Auto-generated method stub
        return heDTdal.getAll();
    }

    public HeDT getByCode(String code) {
        // TODO Auto-generated method stub
        return heDTdal.getByCode(code);
    }

    public int insert(HeDT object) {
        // TODO Auto-generated method stub
        return heDTdal.insert(object);
    }

    public int update(HeDT object) {
        // TODO Auto-generated method stub
        return heDTdal.update(object);
    }

    public int delete(String code) {
        // TODO Auto-generated method stub
        return heDTdal.delete(code);
    }

    public List<HeDT> fillter(String sequenceFilter) {
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
