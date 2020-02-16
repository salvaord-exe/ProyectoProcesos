package Actores;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ClasesAbstractas.*;

/*
 * El supervisor es quien está por encima del asesor comercial
 */

public class Supervisor extends Persona {
	// Atributos propios de la clase
	private String correoCorporativo;
	private String tipoSupervisor;
	
	// Atributos de relaciones
	private List<AsesorComercial> lstAsesores = new ArrayList<AsesorComercial>();
	
	
	// Constructores
	public Supervisor(String nombre, String tipoDocumento, String documento, String celular1, String celular2,
				String convencional, String correoPersonal, String direccionDomicilio, String direccionTrabajo,
				String sexo,Date fechaNacimiento) {
			super(nombre, tipoDocumento, documento, celular1, celular2, convencional, correoPersonal, direccionDomicilio,
					direccionTrabajo, sexo, fechaNacimiento);
		}

	

	// Metodos

	// Getters y Setters
	
	public Supervisor() {
		// TODO Auto-generated constructor stub
	}



	public String getCorreoCorporativo() {
		return correoCorporativo;
	}
	

	public void setCorreoCorporativo(String correoCorporativo) {
		this.correoCorporativo = correoCorporativo;
	}


	public String getTipoSupervisor() {
		return tipoSupervisor;
	}


	public void setTipoSupervisor(String tipoSupervisor) {
		this.tipoSupervisor = tipoSupervisor;
	}


	public List<AsesorComercial> getLstAsesores() {
		return lstAsesores;
	}


	public void setLstAsesores(List<AsesorComercial> lstAsesores) {
		this.lstAsesores = lstAsesores;
	}
}
