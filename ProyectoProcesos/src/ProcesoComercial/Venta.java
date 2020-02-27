package ProcesoComercial;

import Actores.*;
import InterfazGrafica.ItnFrmFormularioIngresoVenta;

public class Venta {
	//Atributos propios de la clase
	private int numeroVenta; //Comienza en 10000 y se va incrementando de uno a uno
	private String numSolicitudCredito;
	private String estadoVenta;
	private int valorVenta;
	private int codMatrizVenta;
	
	//Atributos de relaciones
	private AsesorComercial oAsesorComercial;
	private Supervisor oSupervisor;
	private Cliente oCliente;
	private Servicio oServicio;
	private FormaPago oFormaPago;
	private ItnFrmFormularioIngresoVenta oItnFrmFormularioIngresoVenta;
	private Empresa oEmpresa;
	
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
	
	public int calcularValorVenta(String planPospago) {
		switch(planPospago) {
		case "PLAN CONEXION SIN LIMITE (25)":
			return 25;
			
		case "PLAN CONEXION SIN LIMITE (30)":
			return 30;
		
		case "PLAN CONEXION SIN LIMITE (50)":
			return 50;
		
		case "PLAN CONEXION SIN LIMITE (80)":
			return 80;
			
		case "PLAN CONEXION (15)":
			return 15;
			
		case "PLAN CONEXION (20)":
			return 20;
			
		case "PLAN CLARO 18 MAS MINUTOS":
			return 18;
		
		case "EMPRESA SIN LIMITE 15 ON AUT":
			return 15;
		
		case "EMPRESA SIN LIMITE 20 ON AUT":
			return 20;
			
		case "EMPRESA SIN LIMITE 25 MD AUT":
			return 25;
		
		case "EMPRESA SIN LIMITE 35 MD AUT":
			return 35;
			
		default:
			return 0;
		}
	}
	
	public void actualizarVenta() {
		String nombreCliente = this.getoItnFrmFormularioIngresoVenta().getTxtNombresCliente().getText().toUpperCase();
		String apellidosCliente = this.getoItnFrmFormularioIngresoVenta().getTxtApellidosCliente().getText().toUpperCase();
		
		oCliente.setNombre(apellidosCliente+" "+nombreCliente);
		oCliente.setCelular1(this.getoItnFrmFormularioIngresoVenta().getTxtCelular1Cliente().getText());
		oCliente.setCelular2(this.getoItnFrmFormularioIngresoVenta().getTxtCelular2Cliente().getText());
		oCliente.setConvencional(this.getoItnFrmFormularioIngresoVenta().getTxtConvencionalCliente().getText());
		oCliente.setCorreoPersonal(this.getoItnFrmFormularioIngresoVenta().getTxtCorreoElectronicoCliente().getText());
		oCliente.setTipoDocumento(this.getoItnFrmFormularioIngresoVenta().getCmbxTipoDocumentoCliente().getSelectedItem().toString());
		oCliente.setDocumento(this.getoItnFrmFormularioIngresoVenta().getFtxtNumDocumentoCliente().getText());
		oCliente.setDireccionDomicilio(this.getoItnFrmFormularioIngresoVenta().getTxtAreaDireccionDomicilioCliente().getText());
		oCliente.setDireccionTrabajo(this.getoItnFrmFormularioIngresoVenta().getTxtAreaDireccionLaboralCliente().getText());
		oCliente.setFechaNacimiento(this.getoItnFrmFormularioIngresoVenta().getDateFechaNacimientoCliente().getDatoFecha());
		oCliente.setReferenciaInstalacion(this.getoItnFrmFormularioIngresoVenta().getTxtReferenciaInstalacionCliente().getText());
		oCliente.setEstadoCivil(this.getoItnFrmFormularioIngresoVenta().getCmbxEstadoCivilCliente().getSelectedItem().toString());
		
		
		
		oServicio.setLineasSolicitadas(1);
		oServicio.setTipoServicio("MOVIL");
		oServicio.setNumPortarMigrar(this.getoItnFrmFormularioIngresoVenta().getTxtNumPortarMigrar().getText());
		
		oServicio.getPlanMovilPospago().setTipoServicioMovil(this.getoItnFrmFormularioIngresoVenta().getCmbxServicioMovilSolicitado().getSelectedItem().toString());
		oServicio.getPlanMovilPospago().setCodigoNIP(this.getoItnFrmFormularioIngresoVenta().getTxtCodigoNIP().getText());
		oServicio.getPlanMovilPospago().setPlanLineaMovil(this.getoItnFrmFormularioIngresoVenta().getCmbxPlanPospago().getSelectedItem().toString());
		try {
			oServicio.getPlanMovilPospago().setOperadoraDonante(this.getoItnFrmFormularioIngresoVenta().getCmbxOperadorDonante().getSelectedItem().toString());
			
		}catch(Exception e) {
			oServicio.getPlanMovilPospago().setOperadoraDonante("");
		}
		
		
		oFormaPago.setNumCuentaBancaria(this.getoItnFrmFormularioIngresoVenta().getTxtNoCuenta().getText());
		oFormaPago.setNombreTitular(this.getoCliente().getNombre());
		
		
		oFormaPago.setFormaPago(this.getoItnFrmFormularioIngresoVenta().getCmbxFormaPago().getSelectedItem().toString());
		
		try {
			oFormaPago.setEntidadBancaria(this.getoItnFrmFormularioIngresoVenta().getCmbxEntidadesBancarias().getSelectedItem().toString());
			
		}catch(Exception e) {
			oFormaPago.setEntidadBancaria("");
		}
		
		try {
			oFormaPago.setMarcaTarjetaCredito(this.getoItnFrmFormularioIngresoVenta().getCmbxMarcaTarjetaCredito().getSelectedItem().toString());
			
		}catch(Exception e) {
			oFormaPago.setMarcaTarjetaCredito("");
		}
		
		
		
		oFormaPago.setNumTarjeta(this.getoItnFrmFormularioIngresoVenta().getTxtNoTarjetaCredito().getText());
		oFormaPago.setAnioExpiracion(this.getoItnFrmFormularioIngresoVenta().getSpnAnioExpiracion().getValue().toString());
		oFormaPago.setMesExpiracion(this.getoItnFrmFormularioIngresoVenta().getSpnMesExpiracion().getValue().toString());
		oFormaPago.setCodigoCSV(this.getoItnFrmFormularioIngresoVenta().getTxtCodCSV().getText());
		
		
		this.setEstadoVenta(this.getoItnFrmFormularioIngresoVenta().getCmbxEstadoVenta().getSelectedItem().toString());
		this.setNumSolicitudCredito(this.getoItnFrmFormularioIngresoVenta().getTxtSolicitudCredito().getText());
		this.setValorVenta(this.calcularValorVenta(this.getoServicio().getPlanMovilPospago().getPlanLineaMovil()));
		
		String arrayFila[] = new String[11];
		
		
		arrayFila[0] = Integer.toString(this.getNumeroVenta());
		arrayFila[1] = this.getoCliente().getNombre();
		arrayFila[2] = this.getoCliente().getDocumento();
		arrayFila[3] = this.getNumSolicitudCredito();
		arrayFila[4] = this.getoServicio().getPlanMovilPospago().getPlanLineaMovil();
		arrayFila[5] = Integer.toString(this.getValorVenta());
		arrayFila[6] = this.getoCliente().getCelular1();
		arrayFila[7] = this.getoCliente().getCorreoPersonal();
		arrayFila[8] = this.getoAsesorComercial().getNombre();
		arrayFila[9] = this.getoAsesorComercial().getoSupervisor().getNombre();
		arrayFila[10] = this.getEstadoVenta().toString();
		
		this.getoEmpresa().getoFrmProcesoComercial().getoItnFrmMatrizVentas().actualizarFila(this.numeroVenta, arrayFila);
		
		this.getoItnFrmFormularioIngresoVenta().setVisible(false);
		
	}
	
	
	
	//getters y setters//
	
	public Venta() {
		// TODO Auto-generated constructor stub
	}

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

	public ItnFrmFormularioIngresoVenta getoItnFrmFormularioIngresoVenta() {
		return oItnFrmFormularioIngresoVenta;
	}

	public void setoItnFrmFormularioIngresoVenta(ItnFrmFormularioIngresoVenta oItnFrmFormularioIngresoVenta) {
		this.oItnFrmFormularioIngresoVenta = oItnFrmFormularioIngresoVenta;
	}

	public String getNumSolicitudCredito() {
		return numSolicitudCredito;
	}

	public void setNumSolicitudCredito(String numSolicitudCredito) {
		this.numSolicitudCredito = numSolicitudCredito;
	}

	public String getEstadoVenta() {
		return estadoVenta;
	}

	public void setEstadoVenta(String estadoVenta) {
		this.estadoVenta = estadoVenta;
	}

	public int getValorVenta() {
		return valorVenta;
	}

	public void setValorVenta(int valorVenta) {
		this.valorVenta = valorVenta;
	}

	public int getCodMatrizVenta() {
		return codMatrizVenta;
	}

	public void setCodMatrizVenta(int codMatrizVenta) {
		this.codMatrizVenta = codMatrizVenta;
	}

	public Empresa getoEmpresa() {
		return oEmpresa;
	}

	public void setoEmpresa(Empresa oEmpresa) {
		this.oEmpresa = oEmpresa;
	}
	
	
	
	
	
}
