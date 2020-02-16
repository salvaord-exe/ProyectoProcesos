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
