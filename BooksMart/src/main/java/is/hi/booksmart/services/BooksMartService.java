package is.hi.booksmart.services;

import java.util.ArrayList;

import is.hi.booksmart.model.Book;

public interface BooksMartService {
	
	public boolean isUsernameGood(String username);
	
	public boolean isEmailGood(String email);
	
	public boolean isPasswordGood(String password);
	
	public ArrayList<Book> getBookByTitle(String title);
	
	public ArrayList<Book> getBookByAuthor(String author);
	
	public ArrayList<Book> getBookByCourse(String courseName, String courseId);
	
	public ArrayList<Book> getBookByDepartment(String deptName);
	
	public ArrayList<Book> getBookBySchool(String schoolName);
	
}
