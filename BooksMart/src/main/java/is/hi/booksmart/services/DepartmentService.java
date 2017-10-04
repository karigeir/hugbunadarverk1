package is.hi.booksmart.services;

import java.util.List;

import is.hi.booksmart.model.Department;

public interface DepartmentService {

	/**
	 * Gets all departments
	 * @return List of departments
	 */
	public List<Department> allDepartments();
}
