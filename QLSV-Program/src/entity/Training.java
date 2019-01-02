package entity;

/**
 * Create by: thanh - CMC
 * Create date: Jan 2, 2019
 * Modifier: thanh
 * Modified date: Jan 2, 2019
 * Description: 
 * Version 1.0
 */
public class Training {
	
	private String trainingCode;
	private String trainingName;

	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Training(String trainingCode, String trainingName) {
		super();
		this.trainingCode = trainingCode;
		this.trainingName = trainingName;
	}

	public String getTrainingCode() {
		return trainingCode;
	}

	public void setTrainingCode(String trainingCode) {
		this.trainingCode = trainingCode;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	@Override
	public String toString() {
		return "Training [trainingCode=" + trainingCode + ", trainingName=" + trainingName + "]";
	}

}
