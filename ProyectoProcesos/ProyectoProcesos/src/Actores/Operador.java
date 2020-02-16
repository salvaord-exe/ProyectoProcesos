package Actores;

import java.util.Date;

import ClasesAbstractas.*;

/*
 * El operador es quien procesa la venta en la matriz de ventas
 */

public class Operador extends Persona{
	//Atributos propios de la clase
	
	
	//Atributos de relaciones
	private Credenciales oCredenciales;
	
	//Constructores
	public Operador () {
	
		
	}


	//Metodos
	
	
	//Getters and setters
	public Credenciales getoCredenciales() {
		return oCredenciales;
	}

	public void setoCredenciales(Credenciales oCredenciales) {
		this.oCredenciales = oCredenciales;
	}

	
	
	
	
}
