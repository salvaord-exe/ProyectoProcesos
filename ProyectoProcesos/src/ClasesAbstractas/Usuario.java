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

	@Override
	public String toString() {
		return "Usuario [user=" + user + ", password=" + password + ", userTipe=" + userTipe + ", cargo=" + cargo + "]";
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Administrador getoAdministrador() {
		return oAdministrador;
	}

	public void setoAdministrador(Administrador oAdministrador) {
		this.oAdministrador = oAdministrador;
	}

	public Operador getoOperador() {
		return oOperador;
	}

	public void setoOperador(Operador oOperador) {
		this.oOperador = oOperador;
	}

	public AsesorComercial getoAsesorComercial() {
		return oAsesorComercial;
	}

	public void setoAsesorComercial(AsesorComercial oAsesorComercial) {
		this.oAsesorComercial = oAsesorComercial;
	}

	public Supervisor getoSupervisor() {
		return oSupervisor;
	}

	public void setoSupervisor(Supervisor oSupervisor) {
		this.oSupervisor = oSupervisor;
	}
	
	
	

}
