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
 * @author Sævar Ingi Sigurðsson <sis108@hi.is>
 * @author Kári Geir Gunnarsson <kgg5@hi.is>
 * @date September 2017
 * HBV501G Software Project 1
 * 
 * Implements the Book type.
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
	@JoinColumn(name = "username")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "courseId")
	private Course course;
	
	/**
	 * Default constructor.
	 */
	public Book() {
	}
	
	/**
	 * Constructor for Book.
	 * 
	 * @param title - Title of Book.
	 * @param author - Author of Book.
	 * @param edition - Edition of Book.
	 * @param course - Course that Book is associated with.
	 * @param user - User who posted Book up for sale.
	 */
	public Book(String title, String author, int edition, Course course, User user) {
		super();
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.course = course;
		this.user = user;
	}
	
	public long getId() {
		return id;
	}
	
	/**
	 * Getter for title attribute.
	 * 
	 * @return title - Book title.
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Setter for title attribute.
	 * 
	 * @param title - Book title.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Getter for author attribute.
	 * @return author - Book's author.
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * Setter for author attribute.
	 * @param author - Book's author.
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * Getter for edition attribute.
	 * 
	 * @return edition - Book's edition.
	 */
	public int getEdition() {
		return edition;
	}
	
	/**
	 * Setter for edition attribute.
	 * 
	 * @param edition - Book's edition.
	 */
	public void setEdition(int edition) {
		this.edition = edition;
	}
	
	/**
	 * Getter for course attribute.
	 * 
	 * @return course - Course associated with book.
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * Setter for course attribute.
	 * 
	 * @param course - Course associated with book.
	 */
	public void setCourse(Course course) {
		this.course = course;
	}
	/**
	 * Getter for userContact attribute.
	 * 
	 * @return user - The user selling the book.
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Setter for userContact.
	 * 
	 * @param user - The user selling the book.
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * A simple toString implementation.
	 * 
	 * @return - Book as a string of "title, edition, author".
	 */
	@Override
	public String toString() {
		return title + ", " + edition + ", " + author;
	}
}
