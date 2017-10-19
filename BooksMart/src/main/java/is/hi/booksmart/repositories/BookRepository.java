package is.hi.booksmart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import is.hi.booksmart.model.Book;

/**
 *
 * @author Kári Geir Gunnarsson 	<kgg5@hi.is>
 * @date 4.október 2017
 * HBV501G Software Development 1
 * 
 * Repository for the Book model
 * 
 */


public interface BookRepository extends JpaRepository<Book,Long>{
	
	/**
	 * Gets all books
	 * 
	 * @return List of all books
	 */
	List<Book> findAll();
	
	/**
	 * Add book to repository
	 * @param book
	 */
	Book save (Book book);
	
	/**
	 * Find Book by title
	 * @param title
	 * @return List of Books with title "title"
	 */
	List<Book> findByTitle(String title);
}
