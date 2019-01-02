package bll;

import dal.LopDal;
import entity.Lop;
import java.util.List;
import java.util.Scanner;

public class LopBll implements BaseBll<Lop> {

  private LopDal lopDal;
  private static Scanner scanner = new Scanner(System.in);

  public LopBll() {
    lopDal = new LopDal();
  }

  @Override
  public List<Lop> Add() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Lop> getAll() {
    // TODO Auto-generated method stub
    return lopDal.getAll();
  }

  @Override
  public Lop getByCode() {
    System.out.println("insert class code");
    String code = scanner.next();
    return lopDal.getByCode(code);
  }

  @Override
  public int insert() {
    System.out.println("insert class code");
    String classCode = scanner.nextLine();
    System.out.println("insert class name");
    String className = scanner.nextLine();
    System.out.println("insert faculty code");
    String facultyCode = scanner.nextLine();
    System.out.println("insert type of tranning code");
    String totCode = scanner.nextLine();
    System.out.println("insert subject code");
    String subjectCode = scanner.nextLine();

    Lop lop = new Lop(classCode, className, facultyCode, totCode, subjectCode);

    return lopDal.insert(lop);
  }

  @Override
  public int update() {
    System.out.println("insert class code");
    String classCode = scanner.nextLine();
    System.out.println("insert class name");
    String className = scanner.nextLine();
    System.out.println("insert faculty code");
    String facultyCode = scanner.nextLine();
    System.out.println("insert type of tranning code");
    String totCode = scanner.nextLine();
    System.out.println("insert subject code");
    String subjectCode = scanner.nextLine();

    Lop lop = new Lop(classCode, className, facultyCode, totCode, subjectCode);

    return lopDal.update(lop);
  }

  @Override
  public int delete() {
    System.out.println("insert class code");
    String code = scanner.next();
    return lopDal.delete(code);
  }

  @Override
  public List<Lop> fillter() {
    System.out.println("insert string need search");
    String sequenceFilter = scanner.nextLine();
    return lopDal.fillter(sequenceFilter);
  }

  @Override
  public void display(List<Lop> list) {
    if (list == null || list.isEmpty()) {
      System.out.println("array null");
    } else {
      for (Lop lop : list) {
        System.out.println(lop);
      }
    }

  }

  @Override
  public StringBuilder showBuilder() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public StringBuffer showBuffer() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String show() {
    // TODO Auto-generated method stub
    return null;
  }

}
