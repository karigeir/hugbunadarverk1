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
 * @author Sævar Ingi Sigurðsson <sis108@hi.is>
 * @date 19. september 2017
 * HBV501G Software Development 1
 * 
 * Stores information on courses (name, identification number and associated department).
 * 
 */
@Entity
@Table (name="course")
public class Course {
	
	@Id
	@Column (name = "courseId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String courseNo;
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "departmentId")
	private Department department;

	@OneToMany(mappedBy="course", fetch=FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private Set<Book> books = new HashSet<Book>();
	
	/**
	 * Default constructor.
	 */
	public Course() {
	}
	
	public Course(String courseNo, String name, Department department) {
		super();
		this.courseNo = courseNo;
		this.name = name;
		this.department = department;
	}
	
	public String getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return name + ", " + courseNo + ", " + department.getName();
	}
	
}
