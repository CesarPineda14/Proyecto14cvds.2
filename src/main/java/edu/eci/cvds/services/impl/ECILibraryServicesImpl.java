package edu.eci.cvds.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.persistence.RecursoDAO;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.services.ECILibraryServices;

import java.util.List;

public class ECILibraryServicesImpl implements ECILibraryServices {
	@Inject
	private UsuarioDAO usuarioDAO;
	@Inject
	private RecursoDAO recursoDAO;

	@Override
	public String getTipo(String correo) {
		return usuarioDAO.getTipo(correo);

	}

	@Override
	public List<Recurso> listarRecursos() {
		return recursoDAO.listarTodos();

	}

	@Override
	public void registrarRecurso(Recurso recurso){
		recursoDAO.registrarRecurso(recurso);

	}
}
