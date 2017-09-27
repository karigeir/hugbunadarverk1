package is.hi.booksmart.services;

import java.util.ArrayList;

import is.hi.booksmart.model.Book;
import is.hi.booksmart.storage.StorageConnectionMock;

public class BooksMartServiceImp implements BooksMartService {
	
	StorageConnectionMock sc = new StorageConnectionMock();

	@Override
	public boolean isUsernameGood(String username) {
		return true;
	}

	@Override
	public boolean isEmailGood(String email) {
		return true;
	}

	@Override
	public boolean isPasswordGood(String password) {
		return true;
	}

	@Override
	public ArrayList<Book> getBookByTitle(String title) {
		return sc.getBooksByTitle(title);
	}

	@Override
	public ArrayList<Book> getBookByAuthor(String author) {
		return sc.getBooksByAuthor(author);
	}

	@Override
	public ArrayList<Book> getBookByCourse(String courseName, String courseId) {
		return sc.getBooksByCourse(courseName, courseId);
	}

	@Override
	public ArrayList<Book> getBookByDepartment(String deptName) {
		return sc.getBooksByDepartment(deptName);
	}

	@Override
	public ArrayList<Book> getBookBySchool(String schoolName) {
		return sc.getBooksBySchool(schoolName);
	}

}
