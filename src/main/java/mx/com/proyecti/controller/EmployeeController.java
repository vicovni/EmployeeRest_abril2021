package mx.com.proyecti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.proyecti.service.EmployeeService;
import mx.com.proyecti.entity.*;

//Indicarle a spring que mi clase va a fungir como capa controladora
@RestController
//Definir la ruta del endpoint de mi servicio web REST en base a la ruta http://localhost:8090/api
@RequestMapping("api")
public class EmployeeController {
	
	@Autowired
	//1. Busca dentro de las clases publicadas para encontrar la definición de la interfaz EmployeeService
	//2. Busca alguna clase que implemente la interfaz EmployeeService, en este caso la mejor candidata es la clase EmployeeServiceImpl
	//3. Crea una instancia de EmployeeServiceImpl y se la asigna al objeto employeeService que es de tipo interfaz EmployeeService
	private EmployeeService employeeService;
	
	//Crear los métodos (operaciones) de mi servicio web REST
	@GetMapping("/employees") //Utilizar la operación http GET
	List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employees/bysalary")
	List<Employee> findBySalary(){
		return employeeService.findBySalary();
	}

	@PostMapping("/employees") //Utilizar la operación http POST
	Long insertEmployee(@RequestBody Employee employee) {
		return employeeService.instertEmployee(employee);
	}
	
	@GetMapping("/employees/{id}")
	Employee getEmployee(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}
	
	@PutMapping("/employees") //Utiliza la operación http PUT
	Boolean updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/employees/{id}")
	Boolean deleteEmployee(@PathVariable Long id) {
		return employeeService.deleteEmployee(id);
	}
	
	//Operación http PATCH para recuperar una entidad, actualizar uno de sus valores y volver a guardarlo
	
	
}
