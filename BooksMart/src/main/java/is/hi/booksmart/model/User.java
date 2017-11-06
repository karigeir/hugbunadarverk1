package is.hi.booksmart.model;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="users")
public class User {
	
	@Id
	private String username;
	private String email;
	private String pw;
	
	@OneToMany(mappedBy="user", fetch=FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private Set<Book> books = new HashSet<Book>();
	
	/**
	 * Default constructor.
	 */
	public User() {
	}

	/**
	 * Constructor for User.
	 * 
	 * @param username - Name of the user.
	 * @param email - Email of the user.
	 * @param pw - Password for the user.
	 */
	public User(String username, String email, String pw) {
		super();
		
		this.username = username;
		this.email = email;
		this.pw = pw;
	}

	/**
	 * Getter for username attribute.
	 * 
	 * @return username - User username.
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * Setter for username attribute.
	 * 
	 * @param username - User username.
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * Getter for email attribute.
	 * 
	 * @return email - User email.
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Setter for email attribute.
	 * 
	 * @return email - User email.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Getter for title attribute.
	 * 
	 * @return pw - User pw.
	 */
	public String getPw() {
		return pw;
	}
	
	/**
	 * Setter for email attribute.
	 * 
	 * @return email - User email.
	 */
	public void setPw(String pw) {
		this.pw = pw;
	}

	
	/**
	 * A simple toString implementation.
	 * 
	 * @return - User as a string of "username, email, pw".
	 */
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", pw=" + pw + "]";
	}
	
	
	
	
	
	

}
