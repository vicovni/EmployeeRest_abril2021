package mx.com.proyecti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//Nos permite configurar nuestro servicio web REST de forma sencilla sin tener que incluir mayor configuración
@SpringBootApplication
public class EmployeeRest {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRest.class, args);

	}

}
