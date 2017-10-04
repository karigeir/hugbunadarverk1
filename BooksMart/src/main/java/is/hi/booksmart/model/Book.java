package is.hi.booksmart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Sævar Ingi Sigurðsson <sis108@hi.is>
 * @date 19. september 2017
 * HBV501G Software Development 1
 * 
 * Stores information on books (title, author, edition, associated course, department and school).
 * 
 */


@Entity
@Table (name="book")
public class Book {
	
	@Id
	@Column (name = "bookId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String title;
	private String author;
	private int edition;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "courseId")
	private Course course;
	
	
	public Book(String title, String author, int edition, Course course) {
		super();
		this.title = title;
		this.author = author;
		this.edition = edition;
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
