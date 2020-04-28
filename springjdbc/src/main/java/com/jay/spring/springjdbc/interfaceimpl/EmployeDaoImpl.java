package com.jay.spring.springjdbc.interfaceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.jay.spring.springjdbc.dao.EmployeeDao;
import com.jay.spring.springjdbc.entity.Employee;
import com.jay.spring.springjdbc.rowmapper.EmployeeRowMapper;

@Component("employeeDao")
public class EmployeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * @return the jdbcTemplate
	 */
	/*
	 * public JdbcTemplate getJdbcTemplate() { return jdbcTemplate; }
	 */

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	/*
	 * public void setJdbcTemplate(JdbcTemplate jdbcTemplate) { this.jdbcTemplate =
	 * jdbcTemplate; }
	 */

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee emp = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return emp;
	}

	@Override
	public List<Employee> read() {
		String sql = "select * from employee";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		List<Employee> result = jdbcTemplate.query(sql, rowmapper);
		return result;
	}

}
