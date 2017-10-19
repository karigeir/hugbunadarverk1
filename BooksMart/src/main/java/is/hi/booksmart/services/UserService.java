package is.hi.booksmart.services;

import java.util.List;
import is.hi.booksmart.model.User;

public interface UserService {

	/**
	 * Returns a list of all Users in UserRepository
	 * 
	 * @return list of Users
	 */
	public List<User> allUsers();
}
