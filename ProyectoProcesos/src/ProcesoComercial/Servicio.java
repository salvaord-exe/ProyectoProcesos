package ProcesoComercial;

import java.util.ArrayList;
import java.util.List;

public class Servicio {
	
	private String tipoServicio; //Solo será "MOVIL"
	private int lineasSolicitadas; //Puede ser entre 1 y 4 lineas moviles
	private String numPortarMigrar;
	private PlanesMoviles planMovilPospago;
	private Venta oVenta;
	
	//constructores
	
	public Servicio(String tipoServicio, int lineasSolicitadas, String[] lstNumPortarMigrar,
			PlanesMoviles[] lstPlanesMoviles) {
		super();
		this.tipoServicio = tipoServicio;
		this.lineasSolicitadas = lineasSolicitadas;
		this.numPortarMigrar = numPortarMigrar;
		
	}

	//metodos//
	
	public Servicio() {
		// TODO Auto-generated constructor stub
	}

	

	public boolean validarCantidadLineas(int cantidad) {
		if (cantidad>4||cantidad<1) {
			return false;
		} else {
			return true;
		}
	}
	
	//getters y setters
	
	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String string) {
		this.tipoServicio = string;
	}

	public int getLineasSolicitadas() {
		return lineasSolicitadas;
	}

	public void setLineasSolicitadas(int lineasSolicitadas) {
		this.lineasSolicitadas = lineasSolicitadas;
	}


	public String getNumPortarMigrar() {
		return numPortarMigrar;
	}

	public void setNumPortarMigrar(String numPortarMigrar) {
		this.numPortarMigrar = numPortarMigrar;
	}

	public Venta getoVenta() {
		return oVenta;
	}

	public void setoVenta(Venta oVenta) {
		this.oVenta = oVenta;
	}

	public PlanesMoviles getPlanMovilPospago() {
		return planMovilPospago;
	}

	public void setPlanMovilPospago(PlanesMoviles planMovilPospago) {
		this.planMovilPospago = planMovilPospago;
	}


	
	


	

	
	
	
	
	
}
