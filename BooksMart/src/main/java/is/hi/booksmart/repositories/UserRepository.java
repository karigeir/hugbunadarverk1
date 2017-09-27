package is.hi.booksmart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import is.hi.booksmart.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
