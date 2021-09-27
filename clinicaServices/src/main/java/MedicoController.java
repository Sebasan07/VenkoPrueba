package com.venko.ws.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.venko.ws.rest.clinica.entidades.Medico;
import com.venko.ws.rest.clinica.servicios.MedicoServicio;

@Path("/medico")
public class MedicoController {
	private MedicoServicio mServicio;

	@Path("/crearMedico")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String crear(Medico m) {

		if(mServicio.registrar(m)) {
			return m.toString();
		}
		return "Ya se encuentra registrado";
		
	}

	@Path("/editarMedico")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String editar(Medico m) {
		if(mServicio.editar(m)!=null) {
			return m.toString();
		}
		return "No se encuentra registrado";
	}

	@Path("/mostrarMedicos")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Medico> getInfo() {
		return (ArrayList<Medico>) mServicio.getMedicoList();
	}

	@Path("/eliminarMedico")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String eliminar(Medico m) {
		if(mServicio.eliminar(m)) {
			return m.toString();
		}
		return "No se pudo eliminar";
	}

}
