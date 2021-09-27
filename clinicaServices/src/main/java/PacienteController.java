package com.venko.ws.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.venko.ws.rest.clinica.entidades.Paciente;
import com.venko.ws.rest.clinica.servicios.PacienteServicio;

@Path("/pacientes")
public class PacienteController {

	private PacienteServicio pServicio;

	@Path("/crearPaciente")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String crear(Paciente p) {
		if(pServicio.registrar(p)) {
			return p.toString();
		}
		return "Ya se encuentra registrado el paciente";
	}

	@Path("/editarPaciente")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String editar(Paciente p) {
		if(pServicio.editar(p)!=null) {
			return p.toString();
		}
		return "No se encuentra registrado";
	}

	@Path("/mostrarPacientes")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Paciente> getInfo() {
		return (ArrayList<Paciente>) pServicio.getPacienteList();
	}

	@Path("/eliminarPaciente")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String eliminar(Paciente p) {
		if(pServicio.eliminar(p)) {
			return p.toString();
		}
		return "No se pudo eliminar";
	}
}
