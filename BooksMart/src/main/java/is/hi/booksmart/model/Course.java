package is.hi.booksmart.model;

/**
 * 
 * @author Sævar Ingi Sigurðsson <sis108@hi.is>
 * @date 19. september 2017
 * HBV501G Software Development 1
 * 
 * Stores information on courses (name, identification number and associated department).
 * 
 */

public class Course {
	
	private String name;
	private String idNo;
	private Department department;
	
	
	public Course(String name, String idNo, Department department) {
		super();
		this.name = name;
		this.idNo = idNo;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return name + ", " + idNo + ", " + department.getName();
	}
	
}
