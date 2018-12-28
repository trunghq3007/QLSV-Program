package entity;

public class Class {
    private String ClassId;
    private String ClassName;
    private String FacultyId;
    private String TypeOfTrainingId;
    private String BatchId;

    public String getClassId() {
        return ClassId;
    }

    public void setClassId(String classId) {
        ClassId = classId;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getFacultyId() {
        return FacultyId;
    }

    public void setFacultyId(String facultyId) {
        FacultyId = facultyId;
    }

    public String getTypeOfTrainingId() {
        return TypeOfTrainingId;
    }

    public void setTypeOfTrainingId(String typeOfTrainingId) {
        TypeOfTrainingId = typeOfTrainingId;
    }

    public String getBatchId() {
        return BatchId;
    }

    public void setBatchId(String batchId) {
        BatchId = batchId;
    }

    public Class(String classId, String className, String facultyId, String typeOfTrainingId, String batchId) {
        super();
        ClassId = classId;
        ClassName = className;
        FacultyId = facultyId;
        TypeOfTrainingId = typeOfTrainingId;
        BatchId = batchId;
    }

    @Override
    public String toString() {
        return "Class [ClassId=" + ClassId + ", ClassName=" + ClassName + ", FacultyId=" + FacultyId
                + ", TypeOfTrainingId=" + TypeOfTrainingId + ", BatchId=" + BatchId + "]";
    }

}
