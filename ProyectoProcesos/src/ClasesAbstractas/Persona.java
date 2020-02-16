package ClasesAbstractas;

import java.util.Date;
import java.util.Scanner;

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
	private String sexo;
	private Date fechaNacimiento;
	
	
	
	/*
	 * Constructores
	 */
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String tipoDocumento, String documento, String celular1, String celular2,
			String convencional, String correoPersonal, String direccionDomicilio, String direccionTrabajo,
			String sexo, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.celular1 = celular1;
		this.celular2 = celular2;
		this.convencional = convencional;
		this.correoPersonal = correoPersonal;
		this.direccionDomicilio = direccionDomicilio;
		this.direccionTrabajo = direccionTrabajo;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
	}

	/*
	 * Metodos
	 */
	public void ingresarFechaNacimiento(int anio, int mes, int dia) {
		
		this.fechaNacimiento = new Date (anio-1900,mes,dia);
		
	}
	
	
	


	public boolean cedulaValida(String cedula) {
		 //String cedula;
	    	//System.out.println("Ingrese el numero de cedula");
	    	//Scanner sc=new Scanner(System.in);
	    	//cedula=sc.nextLine();
	        String [] arr_cedula = cedula.split("");
	        if(arr_cedula.length > 10 || arr_cedula.length<10){
	           // System.err.println("Numero de cedula invalido");
	        } else {
	            int digito_1 = Integer.parseInt(arr_cedula[0]) * 2;
	            int digito_2 = Integer.parseInt(arr_cedula[1]);
	            int digito_3 = Integer.parseInt(arr_cedula[2]) * 2;
	            int digito_4 = Integer.parseInt(arr_cedula[3]);
	            int digito_5 = Integer.parseInt(arr_cedula[4]) * 2;
	            int digito_6 = Integer.parseInt(arr_cedula[5]);
	            int digito_7 = Integer.parseInt(arr_cedula[6]) * 2;
	            int digito_8 = Integer.parseInt(arr_cedula[7]);
	            int digito_9 = Integer.parseInt(arr_cedula[8]) * 2;
	            int digito_10 = Integer.parseInt(arr_cedula[9]);
	            
	            if(digito_1 > 10) digito_1 = digito_1 - 9;
	            if(digito_3 >= 10) digito_3 = digito_3 - 9;
	            if(digito_5 >= 10) digito_5 = digito_5 - 9;
	            if(digito_7 >= 10) digito_7 = digito_7 - 9;
	            if(digito_9 >= 10) digito_9 = digito_9 - 9;
	                
	            int parte_1 = digito_1 + digito_3 + digito_5 + digito_7 + digito_9;
	            int parte_2 = digito_2 + digito_4 + digito_6 + digito_8;

	            int resultado = (parte_1 + parte_2);
	            int aux=resultado/10;
	            int dec=(aux+1)*10; 
	            
	            int validador = Math.abs(resultado - dec);
	            if(validador == digito_10){
	                //System.out.println("CEDULA VALIDA");
	                return true;
	            } else {
	                //System.out.println("CEDULA INVALIDA");
	                return false;
	            }    	
	    	
	        }
	        
			return false;
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

	public String getCorreoPersonal() {
		return correoPersonal;
	}

	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}

	public String getDireccionDomicilio() {
		return direccionDomicilio;
	}

	public void setDireccionDomicilio(String direccionDomicilio) {
		this.direccionDomicilio = direccionDomicilio;
	}

	public String getDireccionTrabajo() {
		return direccionTrabajo;
	}

	public void setDireccionTrabajo(String direccionTrabajo) {
		this.direccionTrabajo = direccionTrabajo;
	}

	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	
	
}
