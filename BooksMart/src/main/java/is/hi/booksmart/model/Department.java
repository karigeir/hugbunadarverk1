package is.hi.booksmart.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Sævar Ingi Sigurðsson	<sis108@hi.is>
 * @date 19.september 2017
 * HBV501G Software Development 1
 * 
 * Stores information on Departments (name and associated school).
 * 
 */
@Entity
@Table (name="department")
public class Department {
	
	@Id
	@Column (name = "departmentId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "schoolId")
	private School school;
	
	@OneToMany(mappedBy="department", fetch=FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private Set<Course> courses = new HashSet<Course>();

	/**
	 * Default constructor.
	 */
	public Department() {
	}
	
	public Department(String name, School school) {
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
