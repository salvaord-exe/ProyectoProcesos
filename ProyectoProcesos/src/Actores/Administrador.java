package Actores;

import ClasesAbstractas.Usuario;
import ClasesAbstractas.Persona;
import ClasesAbstractas.ValoresMaestros;

public class Administrador extends Persona{
	private Usuario oCredenciales;
	private ValoresMaestros oValoresMaestros;
	
	public Administrador() {
		this.oCredenciales = new Usuario();
		this.oCredenciales.setUser("admin");
		this.oCredenciales.setPassword("admin");
		this.oCredenciales.setUserTipe(this.oValoresMaestros.TIPOS_USUARIOS[0]);
		
	}
	
}
