package ProcesoComercial;

import Actores.*;
import InterfazGrafica.ItnFrmFormularioIngresoVenta;

public class Venta {
	//Atributos propios de la clase
	private int numeroVenta; //Comienza en 10000 y se va incrementando de uno a uno
	
	
	//Atributos de relaciones
	private AsesorComercial oAsesorComercial;
	private Supervisor oSupervisor;
	private Cliente oCliente;
	private Servicio oServicio;
	private FormaPago oFormaPago;
	private ItnFrmFormularioIngresoVenta oItnFrmFormularioIngresoVenta;
	
	//constructores//
	
	public Venta(int numeroVenta, AsesorComercial oAsesorComercial, Supervisor oSupervisor, Cliente oCliente,
			Servicio oServicio, FormaPago oFormaPago) {
		super();
		this.numeroVenta = numeroVenta;
		this.oAsesorComercial = oAsesorComercial;
		this.oSupervisor = oSupervisor;
		this.oCliente = oCliente;
		this.oServicio = oServicio;
		this.oFormaPago = oFormaPago;
	}
	
	//getters y setters//
	
	public int getNumeroVenta() {
		return numeroVenta;
	}
	public void setNumeroVenta(int numeroVenta) {
		this.numeroVenta = numeroVenta;
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
	public Cliente getoCliente() {
		return oCliente;
	}
	public void setoCliente(Cliente oCliente) {
		this.oCliente = oCliente;
	}
	public Servicio getoServicio() {
		return oServicio;
	}
	public void setoServicio(Servicio oServicio) {
		this.oServicio = oServicio;
	}
	public FormaPago getoFormaPago() {
		return oFormaPago;
	}
	public void setoFormaPago(FormaPago oFormaPago) {
		this.oFormaPago = oFormaPago;
	}
	
	
	
	
	
}
