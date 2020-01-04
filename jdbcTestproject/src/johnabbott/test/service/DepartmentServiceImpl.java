package johnabbott.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import johnabbott.test.DAO.DepartmentDao;
import johnabbott.test.model.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	DepartmentDao departmentDao;
	
	@Override
	public List<Department> getDepartments() {
		return departmentDao.getDepartments();
	}

	@Override
	public boolean addDepartment(Department department) {
		return departmentDao.addDepartment(department);
	}

}
