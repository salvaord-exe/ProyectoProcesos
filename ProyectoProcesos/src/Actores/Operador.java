package Actores;

import java.util.Date;

import ClasesAbstractas.*;

/*
 * El operador es quien procesa la venta en la matriz de ventas
 */

public class Operador extends Persona{
	//Atributos propios de la clase
	
	
	//Atributos de relaciones
	private Usuario oCredenciales;
	
	//Constructores
	
	public Operador(String nombre, String tipoDocumento, String documento, String celular1, String celular2,
				String convencional, String correoPersonal, String direccionDomicilio, String direccionTrabajo,
				String sexo,Date fechaNacimiento) {
			super(nombre, tipoDocumento, documento, celular1, celular2, convencional, correoPersonal, direccionDomicilio,
					direccionTrabajo, sexo, fechaNacimiento);
		}

	//Metodos
	
	
	public Operador() {
		// TODO Auto-generated constructor stub
	}

	//Getters and setters
	public Usuario getoCredenciales() {
		return oCredenciales;
	}

	public void setoCredenciales(Usuario oCredenciales) {
		this.oCredenciales = oCredenciales;
	}

	
	
	
	
}
