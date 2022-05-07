package edu.eci.cvds.entities;

import java.sql.Time;

/**
 * Clase que representaa un Recurso
 */
public class Recurso {

	private int id;
	private String nombre;
	private int capacidad;
	private Time disponibilidadInicio;
	private Time disponibilidadFin;

	private int idUbicacionRecurso;

	private int idTipoRecurso;


	public Recurso() {
		super();
	}

	public Recurso(int id, String nombre, int capacidad, Time disponibilidadInicio, Time disponibilidadFin, int idTipoRecurso, int idUbicacionRecurso) {

		this.id = id;
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.disponibilidadInicio = disponibilidadInicio;
		this.disponibilidadFin = disponibilidadFin;
		this.idTipoRecurso = idTipoRecurso;
		this.idUbicacionRecurso = idUbicacionRecurso;

	}

	public Time getDisponibilidadFin() {
		return disponibilidadFin;
	}

	public void setDisponibilidadFin(Time disponibilidadFin) {
		this.disponibilidadFin = disponibilidadFin;
	}

	public Time getDisponibilidadInicio() {
		return disponibilidadInicio;
	}

	public void setDisponibilidadInicio(Time disponibilidadInicio) {
		this.disponibilidadInicio = disponibilidadInicio;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdUbicacionRecurso() {
		return idUbicacionRecurso;
	}

	public void setIdUbicacionRecurso(int idUbicacionRecurso) {
		this.idUbicacionRecurso = idUbicacionRecurso;
	}

	public int getIdTipoRecurso() {
		return idTipoRecurso;
	}

	public void setIdTipoRecurso(int idTipoRecurso) {
		this.idTipoRecurso = idTipoRecurso;
	}
}
