package is.hi.booksmart.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import is.hi.booksmart.model.Book;
import is.hi.booksmart.model.User;

/**
 * 
 * @author Kári Geir Gunnarsson 	<kgg5@hi.is>
 * @date 4.október 2017
 * HBV501G Software Development 1
 * 
 * Repository for the User model
 * 
 */
public interface UserRepository extends JpaRepository<User, Long> {
	 
	/**
	 * Gets all Users
	 * 
	 * @return list of users
	 */
	List<User> findAll();
	
	/**
	 * Add user to repository
	 * @param book
	 */
	User save (User user);
	
	/**
	 * Get user by username.
	 * 
	 * @param username
	 * @return
	 */
	@Query(value = "SELECT u FROM User u WHERE u.username=:username)")
	User getUserbyUsername(@Param("username")String username);
}
