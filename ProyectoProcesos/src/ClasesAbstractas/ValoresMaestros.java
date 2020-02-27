package ClasesAbstractas;

public class ValoresMaestros {
	//Valores de restricciones externas a la empresa
	public final static double IVA = 0.12; //Impuesto al Valor Agregado, obligado a ser aplicado a los servicios moviles
	public final static double ICE = 0.15; //Impuesto de Consumo Especiales, obligado a ser aplicado a los servicios moviles
	public final static double SALARIO_MINIMO = 400; //Salario minimo en 2020
	
	//Valores de restricciones internas de la empresa
	
	public final static String ENTIDADES_BANCARIAS[] = {"SELECCIONE UNO","BCO. GUAYAQUIL","BCO. PICHINCHA","BCO. PRODUBANCO","BCO. BOLIVARIANO", "BCO. PACIFICO",
			"BCO. INTERNACIONAL","BCO. DEL AUSTRO","BCO. SOLIDARIO"};
	
	public final static String MARCAS_TARJETAS_CREDITO[]= {"SELECCIONE UNO","VISA","MASTERCARD","DINERS CLUB","AMERICAN EXPRESS"};
	
	//Valores para clase Asesor y Supervisor
	public final static String TIPOS_SUPERVISOR_ASESOR[] = {"CALL CENTER", "CAMPO", "REDES SOCIALES"};
	
	//Valores para interfaz credenciales
	public final static String TIPOS_CARGOS[] = {"SELECCIONE UNO","SUPERVISOR", "ASESOR", "OPERADOR"};
	
	public final static String TIPOS_USUARIOS[] = {"SELECCIONE UNO","ADMINISTRADOR","EDITOR/OBSERVADOR","OBSERVADOR"};
	
	//Valores
	public final static String ESTADO_CIVIL[] = {"SELECCIONE UNO","SOLTERO/A","CASADO/A","UNION LIBRE","VIUDO/A"};
	
	//Valores para clase Persona
	public final static String TIPOS_DOCUMENTOS[] = {"SELECCIONE UNO","CEDULA", "PASAPORTE", "RUC PERSONAL", "RUC JURIDICO"};
	
	//Valores para FormaPago
	public final static String TIPOS_FORMA_PAGO[] = {"SELECCIONE UNO","CONTRA FACTURA", "DEBITO CTA. AHORROS", "DEBIDO CTA. CORRIENTE", "TARJETA DE CREDITO"};
	
	//Valores para tipo de servicio movil
	public final static String TIPOS_SERVICIO_MOVIL[] = {"SELECCIONE UNO","PORTABILIDAD PREPAGO", "PORTABILIDAD POSPAGO", "MIGRACION", "LINEA NUEVA"};
	
	//Valores para operadora donante
	public final static String OPERADORA_DONANTE[] = {"SELECCIONE UNO","CNT", "MOVISTAR", "TUENTI"};
	
	//Valores para tipo de servicio
	public final static String TIPO_SERVICIO[] = {"MOVIL"};
	
	//Valores para tipo de servicio pospago
	public final static String TIPO_SERVICIO_POSPAGO[]= {"SELECCIONE UNO","PLANES - CONEXION SIN LIMITE","PLANES - CONEXION","PLAN - MAS MINUTOS","PLAN - EMPRESARIAL SIN LIMITE (CORPORATIVO)"};
	
	public final static String POSPAGO_CONEXION_SIN_LIMITE[]= {"SELECCIONE UNO","PLAN CONEXION SIN LIMITE (25)","PLAN CONEXION SIN LIMITE (30)","PLAN CONEXION SIN LIMITE (50)","PLAN CONEXION SIN LIMITE (80)"};
	
	public final static String POSPAGO_CONEXION[]= {"SELECCIONE UNO","PLAN CONEXION (15)","PLAN CONEXION (20)"};
	
	public final static String POSPAGO_MAS_MINUTOS[]= {"SELECCIONE UNO","PLAN CLARO 18 MAS MINUTOS",""};
	
	public final static String POSPAGO_EMPRESARIAL_SIN_LIMITE[]= {"SELECCIONE UNO","EMPRESA SIN LIMITE 15 ON AUT","EMPRESA SIN LIMITE 20 ON AUT","EMPRESA SIN LIMITE 25 MD AUT","EMPRESA SIN LIMITE 35 MD AUT"};
	
	public final static String COLUMNAS_MATRIZ_VENTAS[]= {"ID","NOMBRE DEL CLIENTE","CEDULA CLIENTE","NUM SOLICITUD CREDITO","PLAN POSPAGO","VALOR DE LA VENTA","CELULAR 1 CLIENTE","CORREO CLIENTE","ASESOR","SUPERVISOR","ESTADO"};
	
	public final static String ESTADO_VENTA[]= {"INGRESADO NO PROCESADO","INGRESADO Y PROCESADO","EN VERIFICACION","APROBADO","ENVIADO ASCP","NEGADO ASCP","OPERATIVO/ALTA","NEGADO"};
	
	
}
