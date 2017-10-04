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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Sævar Ingi Sigurðsson <sis108@hi.is>
 * @date 19. september 2017
 * HBV501G Software Development 1
 * 
 * Stores information on user accounts (name, email, password, id number and associated books).
 *
 */
@Entity
@Table (name="user")
public class User {
	
	@Id
	@Column (name = "userId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String uName;
	private String email;
	private String password;
	
	@OneToMany(mappedBy="user", fetch=FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	private Set<Book> books = new HashSet<Book>();

	public User(String uName, String email, String password) {
		this.uName = uName;
		this.email = email;
		this.password = password;
	}
	
	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
