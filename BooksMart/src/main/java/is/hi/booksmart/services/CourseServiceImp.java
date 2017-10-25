package is.hi.booksmart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import is.hi.booksmart.model.Course;
import is.hi.booksmart.repositories.CourseRepository;

@Service
public class CourseServiceImp implements CourseService {
	
	//Connection to a list of courses
	@Autowired
	CourseRepository courseRep;
	
	@Override 
	public List<Course> allCourses() {
		return courseRep.findAll();
	}
	
	@Override
	public Course save(Course course) {
		return courseRep.save(course);
	}
	
	@Override
	public List<Course> coursesByDepartment(long depId) {
		return courseRep.findByDepartment(depId);
	}
}
