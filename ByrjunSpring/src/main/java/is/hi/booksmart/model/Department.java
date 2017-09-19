package is.hi.booksmart.model;

/**
 * 
 * @author Sævar Ingi Sigurðsson	<sis108@hi.is>
 * @date 19.september 2017
 * HBV501G Software Development 1
 * 
 * Stores information on Departments (name and associated school).
 * 
 */

public class Department {

	private String name;
	private School school;
	
	
	public Department(String name, School school) {
		super();
		this.name = name;
		this.school = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
	
	@Override
	public String toString() {
		return name + ", " + school.getName();
	}
	
}
