package com.venko.ws.rest.clinica.servicios;

import java.util.ArrayList;
import java.util.List;

import com.venko.ws.rest.clinica.entidades.Medico;
import com.venko.ws.rest.clinica.entidades.Paciente;

public class MedicoServicio implements IProceso<Medico>{

	private List<Medico> medicoList;

	public MedicoServicio() {
		this.medicoList = new ArrayList<>();
	}
	
	@Override
	public boolean registrar(Medico info) {
		for (Medico m: medicoList) {
			if(info.getNumeroDocumento().equals(m.getNumeroDocumento()) && 
					info.getTipoDocumento().equals(m.getTipoDocumento())) {
				return false;
			}
		}
		this.medicoList.add(info);
		return true;
	}

	@Override
	public Medico editar(Medico info) {
		for(Medico m: this.medicoList) {
			if(m.getNumeroDocumento().equals(info.getNumeroDocumento())) {
				m.setPrimerNombre(info.getPrimerNombre());
				m.setSegundoNombre(info.getSegundoNombre());
				m.setPrimerApellido(info.getPrimerApellido());
				m.setSegundoApellido(info.getSegundoApellido());
				m.setTipoDocumento(info.getTipoDocumento());
				m.setFechaExpedicionDoc(info.getFechaExpedicionDoc());
				return m;
			}
		}
		return null;
	}

	@Override
	public Medico ver(String doc) {
		for (Medico m : medicoList) {
			if(doc.equals(m.getNumeroDocumento())) {
				return m;
			}
		}
		return null;
	}

	@Override
	public boolean eliminar(Medico info) {
		for(Medico m: this.medicoList) {
			if(m.getNumeroDocumento().equals(info.getNumeroDocumento())) {
				return this.medicoList.remove(m);
			}
		}
		return false;
	}

	public List<Medico> getMedicoList() {
		return medicoList;
	}

	

}
