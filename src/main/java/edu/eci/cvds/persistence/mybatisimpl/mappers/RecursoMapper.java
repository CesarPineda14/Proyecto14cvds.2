package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Recurso;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecursoMapper {

	List<Recurso> getRecursos();
	void registrarRecurso(@Param("recurso") Recurso recurso);
}
