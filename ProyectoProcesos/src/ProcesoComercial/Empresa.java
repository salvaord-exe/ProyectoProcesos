package ProcesoComercial;

import java.util.ArrayList;
import java.util.List;

import Actores.*;
import ClasesAbstractas.Usuario;
import InterfazGrafica.*;

public class Empresa {
	
	private List<Usuario> lstUsuarios = new ArrayList<Usuario>();
	private List<AsesorComercial> lstAsesoresComerciales = new ArrayList<AsesorComercial>();
	private List<Supervisor> lstSupervisores = new ArrayList<Supervisor>();
	
	private FrmProcesoComercial oFrmProcesoComercial;
	private List<Venta> lstVentas = new ArrayList<Venta>();
	
	public Empresa() {
		
		Usuario oUsuario0 = new Usuario();
		this.agregarUsuario(oUsuario0,"admin","admin");
		
	}
	
	public void ingresarVenta(ItnFrmFormularioIngresoVenta oItnFrmFormularioIngresoVenta) {
				
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

	public List<AsesorComercial> getLstAsesoresComerciales() {
		return lstAsesoresComerciales;
	}

	public void setLstAsesoresComerciales(List<AsesorComercial> lstAsesoresComerciales) {
		this.lstAsesoresComerciales = lstAsesoresComerciales;
	}

	public List<Supervisor> getLstSupervisores() {
		return lstSupervisores;
	}

	public void setLstSupervisores(List<Supervisor> lstSupervisores) {
		this.lstSupervisores = lstSupervisores;
	}

	public List<Venta> getLstVentas() {
		return lstVentas;
	}

	public void setLstVentas(List<Venta> lstVentas) {
		this.lstVentas = lstVentas;
	}
	
	
	
	
	
}
