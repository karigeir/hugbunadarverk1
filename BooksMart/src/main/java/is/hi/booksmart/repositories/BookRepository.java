package is.hi.booksmart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import is.hi.booksmart.model.Book;

public interface BookRepository extends JpaRepository<Book,Long>{
	

}
