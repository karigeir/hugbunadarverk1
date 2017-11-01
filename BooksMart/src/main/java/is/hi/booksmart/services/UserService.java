package is.hi.booksmart.services;

import java.util.List;

import is.hi.booksmart.model.Book;
import is.hi.booksmart.model.User;

/**
 * 
 * @author Kári Geir Gunnarsson 	<kgg5@hi.is>
 * @date 4.október 2017
 * HBV501G Software Development 1
 *  
 */

public interface UserService {

	/**
	 * Returns a list of all Users in UserRepository
	 * 
	 * @return list of Users
	 */
	public List<User> allUsers();
	
	/**
	 * Save a book into the repository
	 * 
	 * @param book
	 * @return
	 */
	public User save(User book);
	
	public User getUserbyUsername(String username);
}
