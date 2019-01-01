package entity;

/**
 * Create by: NVDiem
 * Create date: Jan 1, 2019
 * Modifier: NVDIEM
 * Modified date: Jan 1, 2019
 * Description: ....
 * Version 1.0
 */
public class TypeOfTraining {
	// mã hệ đào tạo
	private char typeOfTrainingID;
	// tên hệ đào tạo
	private String typeOfTrainingName;

	public TypeOfTraining() {
	}

	/**
	 * @param typeOfTrainingID
	 * @param typeOfTrainingName
	 */
	public TypeOfTraining(char typeOfTrainingID, String typeOfTrainingName) {
		this.typeOfTrainingID = typeOfTrainingID;
		this.typeOfTrainingName = typeOfTrainingName;
	}

	public char getTypeOfTrainingID() {
		return typeOfTrainingID;
	}

	public void setTypeOfTrainingID(char typeOfTrainingID) {
		this.typeOfTrainingID = typeOfTrainingID;
	}

	public String getTypeOfTrainingName() {
		return typeOfTrainingName;
	}

	public void setTypeOfTrainingName(String typeOfTrainingName) {
		this.typeOfTrainingName = typeOfTrainingName;
	}

	@Override
	public String toString() {
		return "TypeOfTraining [typeOfTrainingID=" + typeOfTrainingID + ", typeOfTrainingName=" + typeOfTrainingName
				+ "]";
	}

}
