package is.hi.booksmart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import is.hi.booksmart.model.Department;
import is.hi.booksmart.repositories.DepartmentRepository;

public class DepartmentServiceImp implements DepartmentService {
	
	// Connection to DepartmentRepository
	@Autowired
	DepartmentRepository depRep;
	
	@Override
	public List<Department> allDepartments() {
		return depRep.findAll();
	}
}
