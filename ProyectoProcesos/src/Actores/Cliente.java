package Actores;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ClasesAbstractas.Persona;
import Ficheros.Imagen;
import ProcesoComercial.Venta;

/*
 * El cliente es la persona a quien se le vende el servicio
 */

public class Cliente extends Persona{
	//Atributos propios de la clase
	private Imagen imgCedulaFrontal;
	private Imagen imgCedulaPosterior;
	private String dirCedulaFrontal;
	private String dirCedulaPosterior;
	
	//Atributos de relaciones
	private Venta oVenta;
	private List<AsesorComercial> lstListaAsesores = new ArrayList<AsesorComercial>();
	
	//Constructores
	
	public Cliente() {
		super();
	}

	public Cliente(String nombre, String tipoDocumento, String documento, String celular1, String celular2,
			String convencional, String correoPersonal, String sexo, Date fechaNacimiento) {//OJO AQUI ABAJO
		super(nombre, tipoDocumento, documento, celular1, celular2, convencional, correoPersonal, correoPersonal, correoPersonal, sexo, fechaNacimiento);
	}
	

	
	//Metodos
	
	
	
	//Getters and Setters
	public Imagen getImgCedulaFrontal() {
		return imgCedulaFrontal;
	}

	public void setImgCedulaFrontal(Imagen imgCedulaFrontal) {
		this.imgCedulaFrontal = imgCedulaFrontal;
	}

	public Imagen getImgCedulaPosterior() {
		return imgCedulaPosterior;
	}

	public void setImgCedulaPosterior(Imagen imgCedulaPosterior) {
		this.imgCedulaPosterior = imgCedulaPosterior;
	}

	public String getDirCedulaFrontal() {
		return dirCedulaFrontal;
	}

	public void setDirCedulaFrontal(String dirCedulaFrontal) {
		this.dirCedulaFrontal = dirCedulaFrontal;
	}

	public String getDirCedulaPosterior() {
		return dirCedulaPosterior;
	}

	public void setDirCedulaPosterior(String dirCedulaPosterior) {
		this.dirCedulaPosterior = dirCedulaPosterior;
	}

	public Venta getoVenta() {
		return oVenta;
	}

	public void setoVenta(Venta oVenta) {
		this.oVenta = oVenta;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
