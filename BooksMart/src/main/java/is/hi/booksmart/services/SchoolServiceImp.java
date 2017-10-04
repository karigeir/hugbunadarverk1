package is.hi.booksmart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import is.hi.booksmart.model.School;
import is.hi.booksmart.repositories.SchoolRepository;

public class SchoolServiceImp implements SchoolService {
	
	//Connection to a list of schools
	@Autowired
	SchoolRepository schoolRep;
	
	@Override 
	public List<School> allSchools() {
		return schoolRep.findAll();
	}
}
