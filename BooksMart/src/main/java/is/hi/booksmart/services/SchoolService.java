package is.hi.booksmart.services;

import java.util.List;

import is.hi.booksmart.model.School;

public interface SchoolService {
	
	/**
	 * Returns all courses in coursesRep
	 * 
	 * @return list of courses
	 */
	public List<School> allSchools();
}
