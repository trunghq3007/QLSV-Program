/**
 * YenTTH
 */

package bll;

import dal.CourseDal;
import entity.Course;
import java.util.List;
import java.util.Scanner;

/**
 * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
 * date: Dec 28, 2018 Description: Version 1.0
 */
public class CourseBll implements BaseBll<Course> {

  // courseDAL
  private CourseDal courseDal;
  private static Scanner scanner = new Scanner(System.in);

  /**
   * Create by: HQTrung - CMC Create date: Dec 28, 2018 Modifier: HQTrung Modified
   * date: Dec 28, 2018 Description: .... Version 1.0
   * 
   *
   */
  public CourseBll() {
    courseDal = new CourseDal();
  }

  @Override
  public List<Course> getAll() {
    return courseDal.getAll();

  }

  @Override
  public List<Course> Add() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Course getByCode() {
    System.out.println("insert course code");
    String code = scanner.next();
    return courseDal.getByCode(code);
  }

  @Override
  public int insert() {
    System.out.println("insert course code");
    String code = scanner.nextLine();
    System.out.println("insert cpurse name");
    String name = scanner.nextLine();

    Course course = new Course(code, name);
    return courseDal.insert(course);
  }

  @Override
  public int update() {
    System.out.println("insert course code");
    String code = scanner.nextLine();
    System.out.println("insert course name");
    String name = scanner.nextLine();

    Course course = new Course(code, name);
    return courseDal.update(course);
  }

  @Override
  public int delete() {
    System.out.println("insert course code");
    String code = scanner.next();
    return courseDal.delete(code);
  }

  @Override
  public List<Course> fillter() {
    System.out.println("insert string need search");
    String sequenceFilter = scanner.nextLine();
    return courseDal.fillter(sequenceFilter);
  }

  @Override
  public void display(List<Course> list) {
    if (list == null || list.isEmpty()) {
      System.out.println("array null");
    } else {
      for (Course course : list) {
        System.out.println(course);
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

    return null;
  }

}
