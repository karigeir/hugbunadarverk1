package is.hi.booksmart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import is.hi.booksmart.model.School;

public interface SchoolRepository extends JpaRepository<School, Long> {

}
