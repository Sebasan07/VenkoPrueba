package com.venko.ws.rest.clinica.entidades;

public class Medico extends Persona{

	public Medico(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String tipoDocumento, String numeroDocumento, Date fechaExpedicionDoc) {
		super(primerNombre, segundoNombre, primerApellido, segundoApellido,
				tipoDocumento, numeroDocumento,fechaExpedicionDoc);
	}
}
