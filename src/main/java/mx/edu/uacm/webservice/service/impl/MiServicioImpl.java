package mx.edu.uacm.webservice.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import mx.edu.uacm.webservice.service.MiServicio;

@WebService
public class MiServicioImpl implements MiServicio {

	@Override
	@WebMethod
	public String obtenerCadena() {
		
		return "Hola Luis David WS";
	}

}
