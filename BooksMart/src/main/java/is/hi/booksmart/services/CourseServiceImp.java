package is.hi.booksmart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import is.hi.booksmart.model.Course;
import is.hi.booksmart.repositories.CourseRepository;

public class CourseServiceImp implements CourseService {
	
	//Connection to a list of courses
	@Autowired
	CourseRepository courseRep;
	
	@Override 
	public List<Course> allCourses() {
		return courseRep.findAll();
	}
}
