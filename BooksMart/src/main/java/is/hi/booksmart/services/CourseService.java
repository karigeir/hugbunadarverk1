package is.hi.booksmart.services;

import java.util.List;

import is.hi.booksmart.model.Course;

/**
 * 
 * @author Kári Geir Gunnarsson 	<kgg5@hi.is>
 * @date 4.október 2017
 * HBV501G Software Development 1
 * 
 * Placeholder
 * 
 */

public interface CourseService {
	
	/**
	 * Returns all courses in coursesRep
	 * 
	 * @return list of courses
	 */
	public List<Course> allCourses();
	
	public Course save(Course course);
	
	
}
