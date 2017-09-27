package is.hi.booksmart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import is.hi.booksmart.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
