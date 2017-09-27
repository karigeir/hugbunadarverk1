package is.hi.booksmart.services;

public interface UserService {
	
	public boolean isUsernameGood(String username);
	
	public boolean isEmailGood(String email);
	
	public boolean isPasswordGood(String password);
	
}
