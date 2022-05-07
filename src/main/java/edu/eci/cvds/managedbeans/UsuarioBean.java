package edu.eci.cvds.managedbeans;

import com.google.inject.Inject;
import edu.eci.cvds.services.ECILibraryServices;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "usuarioBean")
@RequestScoped
public class UsuarioBean extends BasePageBean {

	@Inject
	private ECILibraryServices ECILibraryServices;

	public String getTipo(String correo) {
		return ECILibraryServices.getTipo(correo);
	}
}
