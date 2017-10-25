package is.hi.booksmart.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import is.hi.booksmart.model.Course;

/**
 * 
 * @author Kári Geir Gunnarsson 	<kgg5@hi.is>
 * @date 4.október 2017
 * HBV501G Software Development 1
 * 
 * Repository for the Course model
 * 
 */

public interface CourseRepository extends JpaRepository<Course, Long> {
	/**
	 * Gets all courses
	 * 
	 * @return list of courses
	 */
	List<Course> findAll();
	
	List<Course> findByDepartment(long depId);
}
