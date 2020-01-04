package johnabbott.test.DAO;

import java.util.List;

import johnabbott.test.model.Department;

public interface DepartmentDao {
	public List<Department> getDepartments();
	
	public boolean addDepartment(Department dep);
}
