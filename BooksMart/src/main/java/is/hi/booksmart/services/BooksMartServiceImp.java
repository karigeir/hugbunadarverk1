package is.hi.booksmart.services;

import java.util.ArrayList;

import is.hi.booksmart.model.Book;

public class BooksMartServiceImp implements BooksMartService {

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> getBookByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> getBookByCourse(String courseName, String courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> getBookByDepartment(String deptName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> getBookBySchool(String schoolName) {
		// TODO Auto-generated method stub
		return null;
	}

}

//jsp sér um útfærslur?
