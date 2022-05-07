package edu.eci.cvds.entities;

/**
 * Clase que representaa un Usuario
 */
public class Usuario {

	private int numeroCarnet;

	private String nombre;

	private String correo;

	private String tipo;

	public Usuario() {
		super();
	}

	public Usuario(int numeroCarnet, String nombre, String correo, String tipo) {

		this.numeroCarnet = numeroCarnet;
		this.nombre = nombre;
		this.correo = correo;
		this.tipo = tipo;

	}

	public int getNumeroCarnet() {
		return numeroCarnet;
	}

	public String getCorreo() {
		return correo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNumeroCarnet(int numeroCarnet) {
		this.numeroCarnet = numeroCarnet;
	}

}
