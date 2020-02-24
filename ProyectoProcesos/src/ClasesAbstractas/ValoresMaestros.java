package ClasesAbstractas;

public class ValoresMaestros {
	//Valores de restricciones externas a la empresa
	public final static double IVA = 0.12; //Impuesto al Valor Agregado, obligado a ser aplicado a los servicios moviles
	public final static double ICE = 0.15; //Impuesto de Consumo Especiales, obligado a ser aplicado a los servicios moviles
	public final static double SALARIO_MINIMO = 400; //Salario minimo en 2020
	
	//Valores de restricciones internas de la empresa
	
	//Valores para clase Asesor y Supervisor
	public final static String TIPOS_SUPERVISOR_ASESOR[] = {"CALL CENTER", "CAMPO", "REDES SOCIALES"};
	
	//Valores para interfaz credenciales
	public final static String TIPOS_USUARIOS[] = {"SUPERVISOR", "ASESOR", "OPERADOR"};
	
	//Valores para clase Persona
	public final static String TIPOS_DOCUMENTOS[] = {"CEDULA", "PASAPORTE", "RUC PERSONAL", "RUC JURIDICO"};
	
	//Valores para FormaPago
	public final static String TIPOS_FORMA_PAGO[] = {"CONTRA FACTURA", "DEBITO CTA. AHORROS", "DEBIDO CTA. CORRIENTE", "TARJETA DE CREDITO"};
	
	//Valores para tipo de servicio movil
	public final static String TIPOS_SERVICIO_MOVIL[] = {"PORTABILIDAD PREPAGO", "PORTABILIDAD POSPAGO", "MIGRACION", "LINEA NUEVA"};
	
	//Valores para operadora donante
	public final static String OPERADORA_DONANTE[] = {"CNT", "MOVISTAR", "TUENTI"};
	
	//Valores para tipo de servicio
	public final static String TIPO_SERVICIO[] = {"MOVIL"};
	
	//Meses que maneja el año
	public final static String MESES[]= {"ENERO","FEBRERO","MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"}; //DEBER PARA PINZA

}
