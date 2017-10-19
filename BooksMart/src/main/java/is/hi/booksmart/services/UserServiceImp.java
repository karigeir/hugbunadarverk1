package is.hi.booksmart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import is.hi.booksmart.model.User;
import is.hi.booksmart.repositories.UserRepository;

@Service
public class UserServiceImp implements UserService{
	
	// Connection to repository of Users.
	@Autowired
	UserRepository userRep;
	
	@Override
	public List<User> allUsers() {
		return userRep.findAll();
	}
}
