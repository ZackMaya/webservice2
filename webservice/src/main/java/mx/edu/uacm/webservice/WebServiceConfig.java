package mx.edu.uacm.webservice;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.edu.uacm.webservice.service.impl.MiServicioImpl;

//va a configurar un cierto componente
@Configuration
public class WebServiceConfig {
	//Injección de dependencias (auto cableado)
	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, new MiServicioImpl());
		//en este punto se le pone el nombre al servicio en este caso llamado MiServicio6
		endpoint.publish("/MiServicio");
		return endpoint;
	}
	
}
