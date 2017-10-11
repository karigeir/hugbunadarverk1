package is.hi.booksmart.services;

import java.util.List;
import is.hi.booksmart.model.Book;

public interface BookService {
	/**
	 * Returns a list of all books in BookRpository
	 * 
	 * @return list of Books
	 */
	public List<Book> allBooks();
	
	/**
	 * Save a book into the repository
	 * 
	 * @param book
	 * @return
	 */
	public Book save(Book book);
	
	/**
	 * Return a list of books with a title
	 * 
	 * @param title
	 * @return List of Books with title "title"
	 */
	public List<Book> booksByTitle(String title);
}
