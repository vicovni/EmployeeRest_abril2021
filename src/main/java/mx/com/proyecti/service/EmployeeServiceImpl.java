package mx.com.proyecti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.proyecti.entity.Employee;
import mx.com.proyecti.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee getEmployee(Long id) {
		return employeeRepository.findOne(id);
	}

	@Override
	public Long instertEmployee(Employee employee) {
		return employeeRepository.save(employee).getId();
	}

	@Override
	public Boolean updateEmployee(Employee employee) {
		Employee emp = employeeRepository.findOne(employee.getId());
		if(emp!=null) {
			emp.setFirstname(employee.getFirstname());
			emp.setLastname(employee.getLastname());
			emp.setBirthdate(employee.getBirthdate());
			emp.setSalary(employee.getSalary());
			employeeRepository.save(emp);
			return true;
		} else return false;
	}

	@Override
	public Boolean deleteEmployee(Long id) {
		employeeRepository.delete(id);
		return true;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
