package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.persistence.RecursoDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.RecursoMapper;

import java.util.List;

public class MyBatisRecursoDAO implements RecursoDAO {

	@Inject
	private RecursoMapper recursoMapper;

	@Override
	public List<Recurso> listarTodos() {
		return recursoMapper.getRecursos();

	}
	@Override
	public void registrarRecurso(Recurso recurso){
		recursoMapper.registrarRecurso(recurso);

	}

}
