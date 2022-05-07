package edu.eci.cvds.services;

import edu.eci.cvds.entities.Recurso;

import java.util.List;

public interface ECILibraryServices {

	public String getTipo(String correo);

	public List<Recurso> listarRecursos();

	public void registrarRecurso(Recurso recurso);

}
