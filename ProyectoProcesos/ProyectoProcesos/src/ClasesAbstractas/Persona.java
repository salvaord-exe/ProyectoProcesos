package ClasesAbstractas;

import java.util.Date;

public abstract class Persona {
	
	/*
	 * Atributos
	 */
	private String nombre;
	private String tipoDocumento;
	/*
	 * Puede ser: "CEDULA", "PASAPORTE", "RUC PERSONAL", "RUC JURIDICO", esto se selecciona desde el formulario
	 */
	private String documento; //El numero del documento, sea del tipo que sea
	private String celular1;
	private String celular2;
	private String convencional;
	private String correoPersonal;
	private String direccionDomicilio; 
	private String direccionTrabajo; //Si es que tiene
	private Date fechaNacimiento;
	
	
	/*
	 * Constructores
	 */
	

	/*
	 * Metodos
	 */
	public void ingresarFechaNacimiento(int anio, int mes, int dia) {
		
		this.fechaNacimiento = new Date (anio-1900,mes,dia);
		
	}
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String tipoDocumento, String documento, String celular1, String celular2,
			String convencional, String correoPersonal, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.celular1 = celular1;
		this.celular2 = celular2;
		this.convencional = convencional;
		this.correoPersonal = correoPersonal;
		this.fechaNacimiento = fechaNacimiento;
	}

	
	public boolean cedulaValida(String cedula) {
		
		return true;
	}
	
	/*
	 * Getters y Setters
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCelular1() {
		return celular1;
	}

	public void setCelular1(String celular1) {
		this.celular1 = celular1;
	}

	public String getCelular2() {
		return celular2;
	}

	public void setCelular2(String celular2) {
		this.celular2 = celular2;
	}

	public String getConvencional() {
		return convencional;
	}

	public void setConvencional(String convencional) {
		this.convencional = convencional;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getCorreoPersonal() {
		return correoPersonal;
	}

	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}
	
	
	
	
	
	
}
