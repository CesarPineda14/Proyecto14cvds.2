package edu.eci.cvds.entities;

public class UbicacionRecurso {

	private int id;
	private String edificio;

	public UbicacionRecurso() {
		super();
	}

	public UbicacionRecurso(int id, String edificio) {
		this.id = id;
		this.edificio = edificio;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

}
