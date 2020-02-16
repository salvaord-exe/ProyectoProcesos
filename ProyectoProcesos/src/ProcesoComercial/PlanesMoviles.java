package ProcesoComercial;

import Ficheros.*;

public class PlanesMoviles {
	//Atributos propio de la clase
	private String tipoServicioMovil; //Puede ser: "PORTABILIDAD PREPAGO", "PORTABILIDAD POSPAGO", "MIGRACION", "LINEA NUEVA",
	private String codigoNIP; //Este codigo solo es aplicable para "PORTABILIDAD PREPAGO"
	private String planLineaMovil[];
	private String subPlanLineaMovil[];
	private String operadoraDonante[]; //Puede ser: "CNT", "MOVISTAR", "TUENTI", esto solamente aplica cuando el tipoServicioMovil es PROTABILIDAD
	private double buzonVoz; //valor de cobro por servicio de buzon
	private boolean deseaBuzonVoz;
	private boolean deseaServicioPromocional;//Hay un valor que se cobra si se maneja los servicios promocionales
	private String servicioPromocional[];
	private boolean numeroPropio; //Si no tiene numero propio para hacer portabilidad, tiene que adjuntar CARTA DE CESION DE DERECHOS, CEDULA DEL ACTUAL TITULAR
	private PDF cesionDerechos;
	private PDF cedulaActualTitular;
	private Imagen cedActualTitularFrontal;
	private Imagen cedActualTitularPosterior; 
	
	//Atributos de relaciones
	private Servicio oServicio;
	
	//constructor//
	
	public PlanesMoviles(String tipoServicioMovil, String codigoNIP, String[] planLineaMovil,
			String[] subPlanLineaMovil, String[] operadoraDonante, double buzonVoz, boolean deseaBuzonVoz,
			boolean deseaServicioPromocional, String[] servicioPromocional, boolean numeroPropio, PDF cesionDerechos,
			PDF cedulaActualTitular, Imagen cedActualTitularFrontal, Imagen cedActualTitularPosterior,
			Servicio oServicio) {
		super();
		this.tipoServicioMovil = tipoServicioMovil;
		this.codigoNIP = codigoNIP;
		this.planLineaMovil = planLineaMovil;
		this.subPlanLineaMovil = subPlanLineaMovil;
		this.operadoraDonante = operadoraDonante;
		this.buzonVoz = buzonVoz;
		this.deseaBuzonVoz = deseaBuzonVoz;
		this.deseaServicioPromocional = deseaServicioPromocional;
		this.servicioPromocional = servicioPromocional;
		this.numeroPropio = numeroPropio;
		this.cesionDerechos = cesionDerechos;
		this.cedulaActualTitular = cedulaActualTitular;
		this.cedActualTitularFrontal = cedActualTitularFrontal;
		this.cedActualTitularPosterior = cedActualTitularPosterior;
		this.oServicio = oServicio;
	}
	
	//getters y setters//

	public String getTipoServicioMovil() {
		return tipoServicioMovil;
	}

	public void setTipoServicioMovil(String tipoServicioMovil) {
		this.tipoServicioMovil = tipoServicioMovil;
	}

	public String getCodigoNIP() {
		return codigoNIP;
	}

	public void setCodigoNIP(String codigoNIP) {
		this.codigoNIP = codigoNIP;
	}

	public String[] getPlanLineaMovil() {
		return planLineaMovil;
	}

	public void setPlanLineaMovil(String[] planLineaMovil) {
		this.planLineaMovil = planLineaMovil;
	}

	public String[] getSubPlanLineaMovil() {
		return subPlanLineaMovil;
	}

	public void setSubPlanLineaMovil(String[] subPlanLineaMovil) {
		this.subPlanLineaMovil = subPlanLineaMovil;
	}

	public String[] getOperadoraDonante() {
		return operadoraDonante;
	}

	public void setOperadoraDonante(String[] operadoraDonante) {
		this.operadoraDonante = operadoraDonante;
	}

	public double getBuzonVoz() {
		return buzonVoz;
	}

	public void setBuzonVoz(double buzonVoz) {
		this.buzonVoz = buzonVoz;
	}

	public boolean isDeseaBuzonVoz() {
		return deseaBuzonVoz;
	}

	public void setDeseaBuzonVoz(boolean deseaBuzonVoz) {
		this.deseaBuzonVoz = deseaBuzonVoz;
	}

	public boolean isDeseaServicioPromocional() {
		return deseaServicioPromocional;
	}

	public void setDeseaServicioPromocional(boolean deseaServicioPromocional) {
		this.deseaServicioPromocional = deseaServicioPromocional;
	}

	public String[] getServicioPromocional() {
		return servicioPromocional;
	}

	public void setServicioPromocional(String[] servicioPromocional) {
		this.servicioPromocional = servicioPromocional;
	}

	public boolean isNumeroPropio() {
		return numeroPropio;
	}

	public void setNumeroPropio(boolean numeroPropio) {
		this.numeroPropio = numeroPropio;
	}

	public PDF getCesionDerechos() {
		return cesionDerechos;
	}

	public void setCesionDerechos(PDF cesionDerechos) {
		this.cesionDerechos = cesionDerechos;
	}

	public PDF getCedulaActualTitular() {
		return cedulaActualTitular;
	}

	public void setCedulaActualTitular(PDF cedulaActualTitular) {
		this.cedulaActualTitular = cedulaActualTitular;
	}

	public Imagen getCedActualTitularFrontal() {
		return cedActualTitularFrontal;
	}

	public void setCedActualTitularFrontal(Imagen cedActualTitularFrontal) {
		this.cedActualTitularFrontal = cedActualTitularFrontal;
	}

	public Imagen getCedActualTitularPosterior() {
		return cedActualTitularPosterior;
	}

	public void setCedActualTitularPosterior(Imagen cedActualTitularPosterior) {
		this.cedActualTitularPosterior = cedActualTitularPosterior;
	}

	public Servicio getoServicio() {
		return oServicio;
	}

	public void setoServicio(Servicio oServicio) {
		this.oServicio = oServicio;
	}
	
	
	/*
	 * (planLineaMovil) puede ser:
	 * "PLANES - CONEXION SIN LIMITE", "PLANES - CONEXION", "PLAN - MAS MINUTOS", "PLAN - EMPRESARIAL SIN LIMITE (CORPORATIVO)"
	 * 
	 * (subPlanLineaMovil) puede ser:
	 * Para "PLANES - CONEXION SIN LIMITE":
	 * 	- PLAN CONEXION SIN LIMITE (25)
	 * 	- PLAN CONEXION SIN LIMITE (30)
	 * 	- PLAN CONEXION SIN LIMITE (50)
	 *  - PLAN CONEXION SIN LIMITE (80)
	 * 
	 * Para "PLANES - CONEXION"
	 *  - PLAN CONEXION (15)
	 *  - PLAN CONEXION (20)
	 *  
	 * Para "PLANES - MAS MINUTOS"
	 *  - PLAN CLARO 18 MAS MINUTOS
	 *  
	 * Para "PLAN - EMPRESARIAL SIN LIMITE (CORPORATIVO)"
	 *  - EMPRESA SIN LIMITE 15 ON AUT
	 *  - EMPRESA SIN LIMITE 20 ON AUT
	 *  - EMPRESA SIN LIMITE 25 MD AUT
	 *  - EMPRESA SIN LIMITE 35 MD AUT
	 *  
	 * 
	 * (buzonVoz) -> Valor = ($ 0.95 + IVA = $1.06)
	 * 
	 * (deseaServicioPromocional) -> ("SERVICIOS INTERACTIVOS", "SERVICIOS MULTIMEDIA", "MENSAJES DE MARKETING")
	 * eso debe verse como comentario en el formulario
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
}
