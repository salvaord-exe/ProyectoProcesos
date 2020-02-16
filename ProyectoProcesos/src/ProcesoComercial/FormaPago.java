package ProcesoComercial;

import Actores.Cliente;

public class FormaPago {
	//Atributos propios de la clase
	private String nombreTitular;
	private String formaPago; //Puede ser: "CONTRA FACTURA", "DEBITO CTA. AHORROS", "DEBIDO CTA. CORRIENTE", "TARJETA DE CREDITO";
	private String entidadBancaria; //No aplicable cuando es por CONTRAFACTURA
	private String observaciones;
	//En caso de que sea tarjeta de credito o debito
	private String codigoCSV;
	private String numTarjeta;
	private String anioExpiracion;
	private String mesExpiracion;
	
	
	//Atributos de relaciones
	private Venta oVenta;
	private Cliente oCliente;
	
	//constructor
	public FormaPago(String nombreTitular, String formaPago, String entidadBancaria, String observaciones,
			String codigoCSV, String numTarjeta, String anioExpiracion, String mesExpiracion, Venta oVenta,
			Cliente oCliente) {
		super();
		this.nombreTitular = nombreTitular;
		this.formaPago = formaPago;
		this.entidadBancaria = entidadBancaria;
		this.observaciones = observaciones;
		this.codigoCSV = codigoCSV;
		this.numTarjeta = numTarjeta;
		this.anioExpiracion = anioExpiracion;
		this.mesExpiracion = mesExpiracion;
		this.oVenta = oVenta;
		this.oCliente = oCliente;
	}

	//getters y setters//
	
	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public String getEntidadBancaria() {
		return entidadBancaria;
	}

	public void setEntidadBancaria(String entidadBancaria) {
		this.entidadBancaria = entidadBancaria;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getCodigoCSV() {
		return codigoCSV;
	}

	public void setCodigoCSV(String codigoCSV) {
		this.codigoCSV = codigoCSV;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getAnioExpiracion() {
		return anioExpiracion;
	}

	public void setAnioExpiracion(String anioExpiracion) {
		this.anioExpiracion = anioExpiracion;
	}

	public String getMesExpiracion() {
		return mesExpiracion;
	}

	public void setMesExpiracion(String mesExpiracion) {
		this.mesExpiracion = mesExpiracion;
	}

	public Venta getoVenta() {
		return oVenta;
	}

	public void setoVenta(Venta oVenta) {
		this.oVenta = oVenta;
	}

	public Cliente getoCliente() {
		return oCliente;
	}

	public void setoCliente(Cliente oCliente) {
		this.oCliente = oCliente;
	}
	
	
	
	
	
	
}
