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
		Administrador oAdministrador = new Administrador();
		
		
	}



	public FrmProcesoComercial getoFrmProcesoComercial() {
		return oFrmProcesoComercial;
	}

	public void setoFrmProcesoComercial(FrmProcesoComercial oFrmProcesoComercial) {
		this.oFrmProcesoComercial = oFrmProcesoComercial;
	}
	
	
	
}
