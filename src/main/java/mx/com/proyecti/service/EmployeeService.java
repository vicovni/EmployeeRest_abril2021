package mx.com.proyecti.service;

import java.util.List;

import mx.com.proyecti.entity.Employee;

public interface EmployeeService {

	Employee getEmployee(Long id);
	Long instertEmployee(Employee employee);
	Boolean  updateEmployee(Employee employee);
	Boolean deleteEmployee(Long id);
	List<Employee> getAllEmployees();
	
}
