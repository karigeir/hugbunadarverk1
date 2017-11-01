package is.hi.booksmart.services;

import java.util.List;

/**
 * 
 * @author Kári Geir Gunnarsson 	<kgg5@hi.is>
 * @date 4.október 2017
 * HBV501G Software Development 1
 *  
 */

import is.hi.booksmart.model.School;

public interface SchoolService {
	
	/**
	 * Returns all courses in coursesRep
	 * 
	 * @return list of courses
	 */
	public List<School> allSchools();
	
	public School save(School school);
}
