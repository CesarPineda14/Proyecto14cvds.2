package edu.eci.cvds.managedbeans;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.services.ECILibraryServices;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.sql.Time;
import java.util.List;

@ManagedBean(name = "recursoBean")
@RequestScoped
public class RecursoBean extends BasePageBean {
	private Recurso recursoSeleccionado;
	
	@Inject
	private ECILibraryServices ECILibraryServices;

	public List<Recurso> getRecurso() {
		return ECILibraryServices.listarRecursos();
	}

	public void registrarRecurso(int id, String nombre, int capacidad, Time disponibilidadInicio, Time disponibilidadFin, int idTipoRecurso, int idUbicacionRecurso){
		ECILibraryServices.registrarRecurso(new Recurso(id,nombre,capacidad,disponibilidadInicio, disponibilidadFin, idTipoRecurso, idUbicacionRecurso));

	}

}
