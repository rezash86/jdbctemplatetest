package johnabbott.test.DAO;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import johnabbott.test.model.Department;
import johnabbott.test.model.DepartmentMapper;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	JdbcTemplate jdbcTemplate;
	
	private final String SQL_FIND_DEPARTMENT = "select id, name from department";
	private final String SQL_INSERT_DEPARTMENT = "insert into department(name) values(?)";
	
	@Override
	public List<Department> getDepartments() {
		return jdbcTemplate.query(SQL_FIND_DEPARTMENT, new DepartmentMapper());
	}
	
	public DepartmentDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean addDepartment(Department dep) {
		return jdbcTemplate.update(SQL_INSERT_DEPARTMENT, dep.getName())> 0;
		
	}
	
	
}
