package ProcesoComercial;

import java.util.ArrayList;
import java.util.List;

import Actores.*;
import ClasesAbstractas.Usuario;
import InterfazGrafica.*;

public class Empresa {
	
	private List<Usuario> lstUsuarios = new ArrayList<Usuario>();
	private List<AsesorComercial> lstAsesoresComerciales = new ArrayList<AsesorComercial>();
	private List<Supervisor> lstSupervisores = new ArrayList<Supervisor>();
	private int idVenta;
	
	private FrmProcesoComercial oFrmProcesoComercial;
	private List<Venta> lstVentas = new ArrayList<Venta>();
	
	public Empresa() {
		this.idVenta = 0;
		Usuario oUsuario0 = new Usuario();
		this.agregarUsuario(oUsuario0,"admin","admin");
		
	}
	
	public void ingresarVenta(ItnFrmFormularioIngresoVenta oItnFrmFormularioIngresoVenta) {
		
		Venta oVenta = new Venta();
		oVenta.setoItnFrmFormularioIngresoVenta(oItnFrmFormularioIngresoVenta);
		this.idVenta++;
		oVenta.setNumeroVenta(this.idVenta);
		
		int cantidadAsesores = this.lstAsesoresComerciales.size();
		String nombreAsesor = oVenta.getoItnFrmFormularioIngresoVenta().getCmbxAsesor().getSelectedItem().toString();
		
		for(int i=0;i<cantidadAsesores;i++) {
			if(nombreAsesor.equals(this.lstAsesoresComerciales.get(i).getNombre())) {
				oVenta.setoAsesorComercial(this.lstAsesoresComerciales.get(i));
				i=cantidadAsesores;
			}else {
				
			}
		}
		
		Cliente oCliente = new Cliente();
		
		String nombreCliente = oVenta.getoItnFrmFormularioIngresoVenta().getTxtNombresCliente().getText().toUpperCase();
		String apellidosCliente = oVenta.getoItnFrmFormularioIngresoVenta().getTxtApellidosCliente().getText().toUpperCase();
		
		oCliente.setNombre(apellidosCliente+" "+nombreCliente);
		oCliente.setCelular1(oVenta.getoItnFrmFormularioIngresoVenta().getTxtCelular1Cliente().getText());
		oCliente.setCelular2(oVenta.getoItnFrmFormularioIngresoVenta().getTxtCelular2Cliente().getText());
		oCliente.setConvencional(oVenta.getoItnFrmFormularioIngresoVenta().getTxtConvencionalCliente().getText());
		oCliente.setCorreoPersonal(oVenta.getoItnFrmFormularioIngresoVenta().getTxtCorreoElectronicoCliente().getText());
		oCliente.setTipoDocumento(oVenta.getoItnFrmFormularioIngresoVenta().getCmbxTipoDocumentoCliente().getSelectedItem().toString());
		oCliente.setDocumento(oVenta.getoItnFrmFormularioIngresoVenta().getFtxtNumDocumentoCliente().getText());
		oCliente.setDireccionDomicilio(oVenta.getoItnFrmFormularioIngresoVenta().getTxtAreaDireccionDomicilioCliente().getText());
		oCliente.setDireccionTrabajo(oVenta.getoItnFrmFormularioIngresoVenta().getTxtAreaDireccionLaboralCliente().getText());
		oCliente.setFechaNacimiento(oVenta.getoItnFrmFormularioIngresoVenta().getDateFechaNacimientoCliente().getDatoFecha());
		oCliente.setReferenciaInstalacion(oVenta.getoItnFrmFormularioIngresoVenta().getTxtReferenciaInstalacionCliente().getText());
		oCliente.setEstadoCivil(oVenta.getoItnFrmFormularioIngresoVenta().getCmbxEstadoCivilCliente().getSelectedItem().toString());
		oCliente.setoVenta(oVenta);
		oVenta.setoCliente(oCliente);
		
		Servicio oServicio = new Servicio();
		oServicio.setLineasSolicitadas(1);
		oServicio.setTipoServicio("MOVIL");
		oServicio.setNumPortarMigrar(oVenta.getoItnFrmFormularioIngresoVenta().getTxtNumPortarMigrar().getText());
		oServicio.setoVenta(oVenta);
		oVenta.setoServicio(oServicio);
		
		PlanesMoviles oPlanesMoviles = new PlanesMoviles();
		oPlanesMoviles.setTipoServicioMovil(oVenta.getoItnFrmFormularioIngresoVenta().getCmbxServicioMovilSolicitado().getSelectedItem().toString());
		oPlanesMoviles.setCodigoNIP(oVenta.getoItnFrmFormularioIngresoVenta().getTxtCodigoNIP().getText());
		oPlanesMoviles.setPlanLineaMovil(oVenta.getoItnFrmFormularioIngresoVenta().getCmbxPlanPospago().getSelectedItem().toString());
		oPlanesMoviles.setOperadoraDonante(oVenta.getoItnFrmFormularioIngresoVenta().getCmbxOperadorDonante().getSelectedItem().toString());
		oPlanesMoviles.setoServicio(oServicio);
		
		
		FormaPago oFormaPago = new FormaPago();
		oFormaPago.setFormaPago(oVenta.getoItnFrmFormularioIngresoVenta().getCmbxFormaPago().getSelectedItem().toString());
		oFormaPago.setEntidadBancaria(oVenta.getoItnFrmFormularioIngresoVenta().getCmbxEntidadesBancarias().getSelectedItem().toString());
		oFormaPago.setNumCuentaBancaria(oVenta.getoItnFrmFormularioIngresoVenta().getTxtNoCuenta().getText());
		oFormaPago.setNombreTitular(oVenta.getoCliente().getNombre());
		oFormaPago.setMarcaTarjetaCredito(oVenta.getoItnFrmFormularioIngresoVenta().getCmbxMarcaTarjetaCredito().getSelectedItem().toString());
		oFormaPago.setNumTarjeta(oVenta.getoItnFrmFormularioIngresoVenta().getTxtNoTarjetaCredito().getText());
		oFormaPago.setAnioExpiracion(oVenta.getoItnFrmFormularioIngresoVenta().getSpnAnioExpiracion().getValue().toString());
		oFormaPago.setMesExpiracion(oVenta.getoItnFrmFormularioIngresoVenta().getSpnMesExpiracion().getValue().toString());
		oFormaPago.setCodigoCSV(oVenta.getoItnFrmFormularioIngresoVenta().getTxtCodCSV().getText());
		oVenta.setoFormaPago(oFormaPago);
		oFormaPago.setoVenta(oVenta);
		
		oVenta.setEstadoVenta(oVenta.getoItnFrmFormularioIngresoVenta().getCmbxEstadoVenta().getSelectedItem().toString());
		
		
		
		this.lstVentas.add(oVenta);
		
		 
		
		String arrayFila[] = new String[11];
		
		
		arrayFila[0] = Integer.toString(oVenta.getNumeroVenta());
		
		
		System.out.println(arrayFila.toString());
		
	}
	
	

	public void agregarUsuario(Usuario oUsuario, String user, String password) {
		oUsuario.setUser(user);
		oUsuario.setPassword(password);
		
		this.lstUsuarios.add(oUsuario);
	}

	public FrmProcesoComercial getoFrmProcesoComercial() {
		return oFrmProcesoComercial;
	}

	public void setoFrmProcesoComercial(FrmProcesoComercial oFrmProcesoComercial) {
		this.oFrmProcesoComercial = oFrmProcesoComercial;
	}

	public List<Usuario> getLstUsuarios() {
		return lstUsuarios;
	}

	public void setLstUsuarios(List<Usuario> lstUsuarios) {
		this.lstUsuarios = lstUsuarios;
	}

	public List<AsesorComercial> getLstAsesoresComerciales() {
		return lstAsesoresComerciales;
	}

	public void setLstAsesoresComerciales(List<AsesorComercial> lstAsesoresComerciales) {
		this.lstAsesoresComerciales = lstAsesoresComerciales;
	}

	public List<Supervisor> getLstSupervisores() {
		return lstSupervisores;
	}

	public void setLstSupervisores(List<Supervisor> lstSupervisores) {
		this.lstSupervisores = lstSupervisores;
	}

	public List<Venta> getLstVentas() {
		return lstVentas;
	}

	public void setLstVentas(List<Venta> lstVentas) {
		this.lstVentas = lstVentas;
	}
	
	
	
	
	
}
