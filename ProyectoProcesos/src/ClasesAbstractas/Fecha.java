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
	
	public int diasxMes(String txtMes) {
		int i=0;	//la i representa el mes en el array de MESES 
		while(i<=12) {
			if(i==0||i==2||i==4||i==6||i==7||i==9||i==11){//comparo si el mes ingresado es de los que termina en 31
				if(txtMes.equals(ValoresMaestros.MESES[i])){
					return 31;
				}
			}else if(i==3||i==5||i==8||i==10){//comparo si el mes ingresado es de los que termina en 30
				if(txtMes.equals(ValoresMaestros.MESES[i])){
					return 30;
				}
			}else if(i==1&&validarAnioBisiesto(anio)==true) {//comparo si el mes ingresado es febrero y si es bisiesto
				return 29;
			}else if(i==1&&validarAnioBisiesto(anio)==false){//comparo si el mes ingresado es febrero y si NO es bisiesto
				return 28;
			}
			
			i++;
		}
		return 0;
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
