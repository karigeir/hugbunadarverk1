package is.hi.booksmart.model;

/**
 * 
 * @author Sævar Ingi Sigurðsson <sis108@hi.is>
 * @date 19. september 2017
 * HBV501G Software Development 1
 * 
 * Stores information on books (title, author, edition, associated course, department and school).
 * 
 */

public class Book {
	
	private String title;
	private String author;
	private int edition;
	private School school;
	private Department department;
	private Course course;
	
	
	public Book(String title, String author, int edition, School school, Department department, Course course) {
		super();
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.school = school;
		this.department = department;
		this.course = course;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getEdition() {
		return edition;
	}
	
	public void setEdition(int edition) {
		this.edition = edition;
	}
	
	public School getSchool() {
		return school;
	}
	
	public void setSchool(School school) {
		this.school = school;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return title + ", " + edition + ", " + author;
	}
}
