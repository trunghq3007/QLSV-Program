/*
 *  Project name: StudentManagement
 *  Created by: Sanero
 *  Created Date: 12/27/2018
 *  Created Time: 4:35 PM
 */
package dal;

/**
 * Class: Hệ đào tạo
 */
public class TranningType {
	// Attribute
	private String id; // Mã hệ đào tạo
	private String name; // Tên hệ đào tạo

	// Getter and setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Constructor
	/**
	 * @param id
	 * @param name
	 */
	public TranningType(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public TranningType() {
		super();
	}

	// toString
	@Override
	public String toString() {
		return String.format("%5s %s", id, name);
	}
}
