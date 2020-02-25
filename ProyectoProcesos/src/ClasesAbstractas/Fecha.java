package ClasesAbstractas;

import java.util.Date;
import java.util.Scanner;
import ClasesAbstractas.ValoresMaestros;

public class Fecha {
	private Date fechaActual;
	private int anio;
	private int mes;
	private int dia;

	public Fecha() {
		
	}

	public boolean validarAnioBisiesto(int anio) {
		anio=this.anio;
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
			System.out.println("El año es bisiesto");
		return true;
		}
			
		else {
			System.out.println("El año no es bisiesto");
		return false;
		}
	}

	public void getAnioActual() {
		
	}
	


	public boolean esBisiesto(int anio) {
		this.anio = anio;

		return true;
	}

	public void calcularAnio(int anio) {
		this.anio = anio;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

}
