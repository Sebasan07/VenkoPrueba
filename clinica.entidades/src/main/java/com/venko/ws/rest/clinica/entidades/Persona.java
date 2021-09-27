package com.venko.ws.rest.clinica.entidades;

import java.util.Date;

public class Persona {
	
	String primerNombre;
	String segundoNombre;
	String primerApellido;
	String segundoApellido;
	String tipoDocumento;
	String numeroDocumento;
	Date fechaExpedicionDoc;
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public Date getFechaExpedicionDoc() {
		return fechaExpedicionDoc;
	}
	public void setFechaExpedicionDoc(Date fechaExpedicionDoc) {
		this.fechaExpedicionDoc = fechaExpedicionDoc;
	}
	@Override
	public String toString() {
		return "Persona [primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido="
				+ primerApellido + ", segundoApellido=" + segundoApellido + ", tipoDocumento=" + tipoDocumento
				+ ", numeroDocumento=" + numeroDocumento + ", fechaExpedicionDoc=" + fechaExpedicionDoc + "]";
	}

}
