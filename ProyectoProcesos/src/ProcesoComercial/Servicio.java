package ProcesoComercial;

import java.util.ArrayList;
import java.util.List;

public class Servicio {
	
	private String tipoServicio[]; //Solo será "MOVIL"
	private int lineasSolicitadas; //Puede ser entre 1 y 4 lineas moviles
	private String lstNumPortarMigrar[] = new String[4];
	private PlanesMoviles lstPlanesMoviles[] = new PlanesMoviles[4];
	
	//constructores
	
	public Servicio(String[] tipoServicio, int lineasSolicitadas, String[] lstNumPortarMigrar,
			PlanesMoviles[] lstPlanesMoviles) {
		super();
		this.tipoServicio = tipoServicio;
		this.lineasSolicitadas = lineasSolicitadas;
		this.lstNumPortarMigrar = lstNumPortarMigrar;
		this.lstPlanesMoviles = lstPlanesMoviles;
	}

	//metodos//
	
	public boolean validarCantidadLineas(int cantidad) {
		if (cantidad>4||cantidad<1) {
			return false;
		} else {
			return true;
		}
	}
	
	//getters y setters
	
	public String[] getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String[] tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public int getLineasSolicitadas() {
		return lineasSolicitadas;
	}

	public void setLineasSolicitadas(int lineasSolicitadas) {
		this.lineasSolicitadas = lineasSolicitadas;
	}

	public String[] getLstNumPortarMigrar() {
		return lstNumPortarMigrar;
	}

	public void setLstNumPortarMigrar(String[] lstNumPortarMigrar) {
		this.lstNumPortarMigrar = lstNumPortarMigrar;
	}

	public PlanesMoviles[] getLstPlanesMoviles() {
		return lstPlanesMoviles;
	}

	public void setLstPlanesMoviles(PlanesMoviles[] lstPlanesMoviles) {
		this.lstPlanesMoviles = lstPlanesMoviles;
	}



	

	
	
	
	
	
}
