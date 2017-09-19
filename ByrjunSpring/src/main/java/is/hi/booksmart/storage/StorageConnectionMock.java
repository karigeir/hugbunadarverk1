package is.hi.booksmart.storage;

import java.util.ArrayList;

import is.hi.booksmart.model.*;

public class StorageConnectionMock {

	private ArrayList<Book> books;
	
	private School uniOfIceland;
	private School uniOfRvk;
	
	private Department iceEleEng;
	private Department iceCompSci;
	private Department icePhil;
	private Department rvkPsy;
	private Department rvkLaw;
	
	private Course iceCompOrg;
	private Course iceCompSciC;
	private Course icePhilC;
	private Course rvkPsyC;
	private Course rvkLawC;
	
	/**
	 * Create a mock list of several Book objects for testing.
	 */
	public StorageConnectionMock() {
		
		// some variables to make the list
		books = new ArrayList<Book>();
		
		uniOfIceland = new School("Háskóli Íslands", "HÍ");
		uniOfRvk = new School("Háskólinn í Reykjavík", "HR");
		
		iceEleEng = new Department("Rafmagnsverkfræði", uniOfIceland);
		iceCompSci = new Department("Tölvunarfræði", uniOfIceland);
		icePhil = new Department("Heimsspeki", uniOfIceland);
		rvkPsy = new Department("Sálfræði", uniOfRvk);
		rvkLaw = new Department("Lögfræði", uniOfRvk);
		
		iceCompOrg = new Course("Tölvuhögun", "TÖV301G", iceEleEng);
		iceCompSciC = new Course("Tölvunarfræði 1", "TÖL101G", iceCompSci);
		icePhilC = new Course("Heimsspeki 1", "HEI101G", icePhil);
		rvkPsyC = new Course("Sálfræði 1", "SAL101G", rvkPsy);
		rvkLawC = new Course("Almenn lögfræði", "LÖG101G", rvkLaw);
		
		
		// add 10 books to the list books.
		Book book = new Book("Computer Organization and Embedded Systems", "C. Hamacher et. al.", 6, iceCompOrg.getDepartment().getSchool() , iceCompOrg.getDepartment(), iceCompOrg);
		books.add(book);
		
		book = new Book("Computer Science for Dummies", "Not a dummy anymore", 3, iceCompSciC.getDepartment().getSchool(), iceCompSciC.getDepartment(), iceCompSciC);
		books.add(book);
		
		book = new Book("Philosophy 101", "A Great Mind", 1, icePhilC.getDepartment().getSchool(), icePhilC.getDepartment(), icePhilC);
		books.add(book);
		
		book = new Book("Java for Not Dummies, But Not Smart People Either", "Not a dummy anymore", 1, iceCompSciC.getDepartment().getSchool(), iceCompSciC.getDepartment(), iceCompSciC);
		books.add(book);
		
		book = new Book ("Philosophy 101.1: All the Shit I Forgot the First Time", "A Great Mind", 1, icePhilC.getDepartment().getSchool(), icePhilC.getDepartment(), icePhilC);
		books.add(book);
		
		book = new Book("Can Dogs Read Minds?", "Dog Dogson", 24, rvkPsyC.getDepartment().getSchool(), rvkPsyC.getDepartment(), rvkPsyC);
		books.add(book);
		
		book = new Book("Can Cats Read Dogs Minds Who Can Read Minds?", "Dog Dogson", 12, rvkPsyC.getDepartment().getSchool(), rvkPsyC.getDepartment(), rvkPsyC);
		books.add(book);
		
		book = new Book("What even is Crime?", "A Convicted Criminal", 2, rvkLawC.getDepartment().getSchool(), rvkLawC.getDepartment(), rvkLawC);
		books.add(book);
		
		book = new Book("How To Get Out Of Jail Free", "A Monopoly Master", 1, rvkLawC.getDepartment().getSchool(), rvkLawC.getDepartment(), rvkLawC);
		books.add(book);
		
		book = new Book("Why bother?", "J.P. Bother", 4, icePhilC.getDepartment().getSchool(), icePhilC.getDepartment(), icePhilC);
		books.add(book);
	}
	
	public ArrayList<Book> getBookByTitle(String title) {
		ArrayList<Book> titleBooks = new ArrayList<Book>();
		
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getTitle() == title) {
				titleBooks.add(books.get(i));
			}
		}
		if (titleBooks.isEmpty()) {
			return null;
		} else {
			return titleBooks;
		}
	}
	
	public ArrayList<Book> getBookByAuthor(String author) {
		ArrayList<Book> authorBooks = new ArrayList<Book>();
		
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getAuthor() == author) {
				authorBooks.add(books.get(i));
			}
		}
		if (authorBooks.isEmpty()) {
			return null;
		} else {
			return authorBooks;
		}
	}
	
	public ArrayList<Book> getBooksByCourse(String courseName, String courseId) {
		ArrayList<Book> courseBooks = new ArrayList<Book>();
		
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getCourse().getName() == courseName) {
				courseBooks.add(books.get(i));
			} else if (books.get(i).getCourse().getIdNo() == courseId) {
				courseBooks.add(books.get(i));
			}
		}
		if (courseBooks.isEmpty()) {
			return null;
		} else {
			return courseBooks;
		}
	}
	
	public ArrayList<Book> getBooksByDepartment(String deptName) {
		ArrayList<Book> deptBooks = new ArrayList<Book>();
		
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getDepartment().getName() == deptName) {
				deptBooks.add(books.get(i));
			}
		}
		if (deptBooks.isEmpty()) {
			return null;
		} else {
			return deptBooks;
		}
	}
	
	public ArrayList<Book> getBooksBySchool(String schoolName) {
		ArrayList<Book> schoolBooks = new ArrayList<Book>();
		
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getSchool().getName() == schoolName) {
				schoolBooks.add(books.get(i));
			}
		}
		if (schoolBooks.isEmpty()) {
			return null;
		} else {
			return schoolBooks;
		}
		
	}
}
