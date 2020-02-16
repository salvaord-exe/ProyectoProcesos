package ClasesAbstractas;

import Actores.*;

public class Usuario {
	private String user;
	private String password;
	private String userTipe; // Puede ser: "ADMINISTRADOR", "EDITOR", "OBSERVADOR-COMENTADOR"
	private String cargo; // Puede ser: "ASESOR COMERCIAL", "SUPERVISOR", "OPERADOR"

	// Tipo de usuarios segun la clase
	private Administrador oAdministrador;
	private Operador oOperador;
	private AsesorComercial oAsesorComercial;
	private Supervisor oSupervisor;

	// constructores
	public Usuario() {

	}

	public Usuario(String cargo) {
		switch (cargo) {
		
		case "ASESOR COMERCIAL":
			this.cargo = cargo;
			this.oAsesorComercial = new AsesorComercial();
			this.userTipe = "OBSERVADOR-COMENTADOR";
			break;
		case "SUPERVISOR":
			this.cargo = cargo;
			this.oSupervisor = new Supervisor();
			this.userTipe = "OBSERVADOR-COMENTADOR";
			break;
		case "OPERADOR":
			this.cargo = cargo;
			this.oOperador = new Operador();
			this.userTipe = "EDITOR";
			break;
			
		}
		
		
	}

	public Usuario(String user, String password, String userTipe) {
		super();
		this.user = user;
		this.password = password;
		this.userTipe = userTipe;
	}

	/* metodos */

	public boolean validarCredenciales(String user, String password) {
		if (user.equals(this.user) && password.equals(this.password)) {
			return true;
		} else {
			return false;
		}

	}

	// getters y setters
	public Usuario getThis() {
		return this;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserTipe() {
		return userTipe;
	}

	public void setUserTipe(String userTipe) {
		this.userTipe = userTipe;
	}

}
