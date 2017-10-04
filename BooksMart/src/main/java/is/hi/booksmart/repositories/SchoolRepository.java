package is.hi.booksmart.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import is.hi.booksmart.model.School;

/**
 * 
 * @author Kári Geir Gunnarsson 	<kgg5@hi.is>
 * @date 4.október 2017
 * HBV501G Software Development 1
 * 
 * Repository for the School model
 * 
 */

public interface SchoolRepository extends JpaRepository<School, Long> {
	/*
	 * Gets all schools
	 * @return list of schools
	 */
	List<School> findAll();
}
