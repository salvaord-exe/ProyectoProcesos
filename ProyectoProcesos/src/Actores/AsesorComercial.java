package Actores;

import ProcesoComercial.*;
import ClasesAbstractas.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * El asesor comercial es la persona que ingresa la venta en el formulario.
 */

public class AsesorComercial extends Persona {

	// Atributos propios de la clase

	private String correoCorporativo;
	private String tipoAsesor;
	/*
	 * Puede ser de tres tipos: "CALL CENTER","CAMPO","REDES SOCIALES". El tipo de
	 * asesor se selecciona desde el formulario
	 */
	private Supervisor oSupervisor;

	// Atributos de relaciones
	private List<Venta> lstVentas = new ArrayList<Venta>();
	private Usuario oUsuario;
	
	
	//Constructores
	
	public AsesorComercial() {
		super();
	}
	

	public AsesorComercial(String nombre, String tipoDocumento, String documento, String celular1, String celular2,
			String convencional, String correoPersonal, String sexo, Date fechaNacimiento) {
		super(nombre, tipoDocumento, documento, celular1, celular2, convencional, correoPersonal, correoPersonal, correoPersonal, sexo, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}


	
	/*
	 * Metodos
	 */

	
	//Getters y Setters
	 public String getCorreoCorporativo() {
		return correoCorporativo;
	}

	public void setCorreoCorporativo(String correoCorporativo) {
		this.correoCorporativo = correoCorporativo;
	}

	public String getTipoAsesor() {
		return tipoAsesor;
	}

	public void setTipoAsesor(String tipoAsesor) {
		this.tipoAsesor = tipoAsesor;
	}

	public Supervisor getoSupervisor() {
		return oSupervisor;
	}

	public void setoSupervisor(Supervisor oSupervisor) {
		this.oSupervisor = oSupervisor;
	}

	public List<Venta> getLstVentas() {
		return lstVentas;
	}

	public void setLstVentas(List<Venta> lstVentas) {
		this.lstVentas = lstVentas;
	}


	public Usuario getoUsuario() {
		return oUsuario;
	}


	public void setoUsuario(Usuario oUsuario) {
		this.oUsuario = oUsuario;
	}

	
	
}
