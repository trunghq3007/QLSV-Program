/*
 *  Project name: StudentManagement
 *  Created by: Sanero
 *  Created Date: 12/27/2018
 *  Created Time: 4:35 PM
 */
package entity;

import utils.Constants;

/**
 * Class: Hệ đào tạo
 */
public class TrainingType {
	// Attribute
	private String trainingTypeId; // Mã hệ đào tạo
	private String trainingTypeName; // Tên hệ đào tạo

	// Getter and setter
	public String getTrainingTypeId() {
		return trainingTypeId;
	}

	public void setTrainingTypeId(String id) {
		this.trainingTypeId = id;
	}

	public String getTrainingTypeName() {
		return trainingTypeName;
	}

	public void setTrainingTypeName(String name) {
		this.trainingTypeName = name;
	}

	// Constructor
	/**
	 * @param id
	 * @param name
	 */
	public TrainingType(String id, String name) {
		super();
		this.trainingTypeId = id;
		this.trainingTypeName = name;
	}

	public TrainingType() {
		super();
	}

	// toString
	@Override
	public String toString() {
		return String.format(Constants.ToStringFormatter.TRAININGTYPE, trainingTypeId, trainingTypeName);
	}
}
