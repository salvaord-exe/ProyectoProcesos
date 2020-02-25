package ProcesoComercial;

import java.awt.EventQueue;
import java.util.Date;

import Actores.Cliente;
import ClasesAbstractas.*;
import InterfazGrafica.FrmProcesoComercial;

public class ProcesoComercialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		ValoresMaestros oValoresMaestros = new ValoresMaestros();
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmProcesoComercial frame = new FrmProcesoComercial();
					Date fechaActual = new Date();
							System.out.println(fechaActual.getYear());
							
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
