package johnabbott.test.service;

import java.util.List;

import johnabbott.test.model.Department;


public interface DepartmentService {
	
	public List<Department> getDepartments();
	
	public boolean addDepartment(Department department);
}
