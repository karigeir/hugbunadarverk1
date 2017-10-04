package is.hi.booksmart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import is.hi.booksmart.model.User;
import is.hi.booksmart.repositories.UserRepository;

public class UserServiceImp implements UserService{

	@Autowired
	private UserRepository userRep;
	
	@Override
	public List<User> allUsers() {
		return userRep.findAll();
	}
}
