package entity;

public class Subjects {
	private String subjectsCode;
	private String subjectsName;
	private int numberOfPeriods;
	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subjects(String subjectsCode, String subjectsName, int numberOfPeriods) {
		super();
		this.subjectsCode = subjectsCode;
		this.subjectsName = subjectsName;
		this.numberOfPeriods = numberOfPeriods;
	}
	@Override
	public String toString() {
		return "Subjects [subjectsCode=" + subjectsCode + ", subjectsName=" + subjectsName + ", numberOfPeriods="
				+ numberOfPeriods + "]";
	}
	public String getSubjectsCode() {
		return subjectsCode;
	}
	public void setSubjectsCode(String subjectsCode) {
		this.subjectsCode = subjectsCode;
	}
	public String getSubjectsName() {
		return subjectsName;
	}
	public void setSubjectsName(String subjectsName) {
		this.subjectsName = subjectsName;
	}
	public int getNumberOfPeriods() {
		return numberOfPeriods;
	}
	public void setNumberOfPeriods(int numberOfPeriods) {
		this.numberOfPeriods = numberOfPeriods;
	}
	
}
