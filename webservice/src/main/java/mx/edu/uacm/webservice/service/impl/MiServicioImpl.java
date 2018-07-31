package mx.edu.uacm.webservice.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import mx.edu.uacm.webservice.service.MiServicio;

@WebService
public class MiServicioImpl implements MiServicio {

	@Override
	@WebMethod
	public String obtenerCadena() {
		
		return "Hola  WS";
	}

	@WebMethod
	@WebResult(name="SumaRespuesta")
	public Integer suma(@WebParam(name="numero") Integer operando) {
		return ++operando;
	}
}
