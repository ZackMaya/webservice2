package mx.edu.uacm.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) throws Exception {
		//escanea todas las clases que tiene el paquete base(webservice)
		//Srping esta orientado a interfacez para el bajo acomplamiento
		SpringApplication.run(Application.class, args);
	}
}
