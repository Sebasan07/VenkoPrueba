package com.venko.ws.rest.clinica.servicios;

import java.util.ArrayList;
import java.util.List;

import com.venko.ws.rest.clinica.entidades.Medico;
import com.venko.ws.rest.clinica.entidades.Paciente;

public class PacienteServicio implements IProceso<Paciente>{

	private List<Paciente> pacienteList;

	public PacienteServicio() {
		this.pacienteList=new ArrayList<>();
	}
	
	@Override
	public boolean registrar(Paciente info) {
		
		for (Paciente p: pacienteList) {
			if(info.getNumeroDocumento().equals(p.getNumeroDocumento()) && 
					info.getTipoDocumento().equals(p.getTipoDocumento())) {
				return false;
			}
		}
		return this.pacienteList.add(info);
	}

	@Override
	public Paciente editar(Paciente info) {
		for(Paciente p: this.pacienteList) {
			if(p.getNumeroDocumento().equals(info.getNumeroDocumento())) {
				p.setPrimerNombre(info.getPrimerNombre());
				p.setSegundoNombre(info.getSegundoNombre());
				p.setPrimerApellido(info.getPrimerApellido());
				p.setSegundoApellido(info.getSegundoApellido());
				p.setTipoDocumento(info.getTipoDocumento());
				p.setFechaExpedicionDoc(info.getFechaExpedicionDoc());
				return p;
			}
		}
		return null;
	}

	@Override
	public Paciente ver(String doc) {
		for (Paciente p : pacienteList) {
			if(doc.equals(p.getNumeroDocumento())) {
				return p;
			}
		}
		return null;
	}

	@Override
	public boolean eliminar(Paciente info) {
		for(Paciente p: this.pacienteList) {
			if(p.getNumeroDocumento().equals(info.getNumeroDocumento())) {
				return this.pacienteList.remove(p);
			}
		}
		return false;
	}

	public List<Paciente> getPacienteList() {
		return pacienteList;
	}

	
}
