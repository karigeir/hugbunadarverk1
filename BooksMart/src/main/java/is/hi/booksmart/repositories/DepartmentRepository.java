package is.hi.booksmart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import is.hi.booksmart.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
