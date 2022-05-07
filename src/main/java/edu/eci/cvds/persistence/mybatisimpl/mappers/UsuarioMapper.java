package edu.eci.cvds.persistence.mybatisimpl.mappers;

import org.apache.ibatis.annotations.Param;

public interface UsuarioMapper {

	public String getTipo(@Param("correo") String correo);
}
