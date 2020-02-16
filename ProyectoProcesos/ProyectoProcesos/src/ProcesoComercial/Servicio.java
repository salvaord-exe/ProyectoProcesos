package ProcesoComercial;

import java.util.ArrayList;
import java.util.List;

public class Servicio {
	
	private String tipoServicio[]; //Solo será "MOVIL"
	private int lineasSolicitadas; //Puede ser entre 1 y 4 lineas moviles
	private String lstNumPortarMigrar[] = new String[4];
	private PlanesMoviles lstPlanesMoviles[] = new PlanesMoviles[4];
	
	
	public Servicio() {
		this.tipoServicio[0] = "MOVIL";
	}
	
	
	
	public boolean validarCantidadLineas(int cantidad) {
		if (cantidad>4||cantidad<1) {
			return false;
		} else {
			return true;
		}
	}
	
	
	
	
}
