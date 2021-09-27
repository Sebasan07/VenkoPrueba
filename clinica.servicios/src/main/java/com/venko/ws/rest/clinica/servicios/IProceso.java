package com.venko.ws.rest.clinica.servicios;

public interface IProceso<T> {

	public boolean registrar(T info);
	public T editar(T info);
	public T ver(String doc);
	public boolean eliminar(T info);
	
}
