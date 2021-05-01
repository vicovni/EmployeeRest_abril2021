package mx.com.proyecti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.com.proyecti.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	//@Query(value = "select * from Employee where salary < 5000", nativeQuery=true)
	@Query("from Employee where salary < 5000")
	List<Employee> findBySalary();
}
