//package is.hi.booksmart.model;
//
//import java.util.ArrayList;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
///**
// * 
// * @author Sævar Ingi Sigurðsson <sis108@hi.is>
// * @date 19. september 2017
// * HBV501G Software Development 1
// * 
// * Stores information on user accounts (name, email, password, id number and associated books).
// *
// */
//@Entity
//@Table (name="user")
//public class User {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private String name;
//	private String email;
//	private String password;
//	private int idNo;
//	private ArrayList<Book> books;
//	
//	public User(String name, String email, String password, int idNo, ArrayList<Book> books) {
//		super();
//		this.name = name;
//		this.email = email;
//		this.password = password;
//		this.idNo = idNo;
//		this.books = books;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public int getIdNo() {
//		return idNo;
//	}
//
//	public void setIdNo(int idNo) {
//		this.idNo = idNo;
//	}
//
//	public ArrayList<Book> getBooks() {
//		return books;
//	}
//
//	public void setBooks(ArrayList<Book> books) {
//		this.books = books;
//	}
//	
//	@Override
//	public String toString() {
//		return name + ", " + email + ", " + idNo;
//	}
//	
//}
