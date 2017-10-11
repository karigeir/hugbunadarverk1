package is.hi.booksmart.services;

import java.util.List;
import is.hi.booksmart.model.User;

public interface UserService {
	
	/**
	 * Get all users
	 * 
	 * @return list of users
	 */
	public List<User> allUsers();
}
