package ClasesAbstractas;

public abstract class Credenciales {
	private String user;
	private String password;
	private String userTipe; //Puede ser: "ADMINISTRADOR", "EDITOR", "OBSERVADOR-COMENTADOR"
	
	public Credenciales() {
		
	}
	
	public Credenciales(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	
	public boolean validarCredenciales(String user, String password) {
		if (user.equals(this.user)&&password.equals(this.password)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
}
