package entity;

public class TypeOfTraining {
    private String typeOfTrainingID;
    private String typeOfTrainingName;

    public TypeOfTraining() {
    }

    public TypeOfTraining(String typeOfTrainingID, String typeOfTrainingName) {
        this.typeOfTrainingID = typeOfTrainingID;
        this.typeOfTrainingName = typeOfTrainingName;
    }

    public String getTypeOfTrainingID() {
        return typeOfTrainingID;
    }

    public void setTypeOfTrainingID(String typeOfTrainingID) {
        this.typeOfTrainingID = typeOfTrainingID;
    }

    public String getTypeOfTrainingName() {
        return typeOfTrainingName;
    }

    public void setTypeOfTrainingName(String typeOfTrainingName) {
        this.typeOfTrainingName = typeOfTrainingName;
    }
}
