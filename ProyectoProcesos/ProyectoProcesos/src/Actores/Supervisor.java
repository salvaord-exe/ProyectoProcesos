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
	public Supervisor() {
		super();
	}

	// Metodos

	// Getters y Setters

}
