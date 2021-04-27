package mx.com.proyecti.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Anotación: Metadata que hace referencia a la funcionalidad de nuestro código
//Le asigna características o funcionalidad a nuestro código
//Las anotaciones sustituyen a los archivos de configuración
//Las anotaciones usualmente inician con el símbolo de '@'

@Entity //Definir a esta clase como una entidad
@Table(name="employee") //Relacionar nuestra entidad definida en java con la tabla definida en oracle
public class Employee {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private long id;
	private String firstname;
	private String lastname;
	private Date birthdate;
	private double salary;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
