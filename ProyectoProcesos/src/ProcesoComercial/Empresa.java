package ProcesoComercial;

import java.util.ArrayList;
import java.util.List;

import Actores.Administrador;
import ClasesAbstractas.Usuario;
import InterfazGrafica.FrmProcesoComercial;

public class Empresa {
	
	private List<Usuario> lstUsuarios = new ArrayList<Usuario>();
	private FrmProcesoComercial oFrmProcesoComercial;
	
	public Empresa() {
		
		Usuario oUsuario0 = new Usuario("ADMINISTRADOR");
		this.agregarUsuario(oUsuario0,"admin","admin");
		
	}

	public void agregarUsuario(Usuario oUsuario, String user, String password) {
		oUsuario.setUser(user);
		oUsuario.setPassword(password);
		this.lstUsuarios.add(oUsuario);
	}

	public FrmProcesoComercial getoFrmProcesoComercial() {
		return oFrmProcesoComercial;
	}

	public void setoFrmProcesoComercial(FrmProcesoComercial oFrmProcesoComercial) {
		this.oFrmProcesoComercial = oFrmProcesoComercial;
	}

	public List<Usuario> getLstUsuarios() {
		return lstUsuarios;
	}

	public void setLstUsuarios(List<Usuario> lstUsuarios) {
		this.lstUsuarios = lstUsuarios;
	}
	
	
	
	
}
