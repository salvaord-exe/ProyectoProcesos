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
	
	
	
	
}
