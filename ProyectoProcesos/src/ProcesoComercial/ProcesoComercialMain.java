package ProcesoComercial;

import java.awt.EventQueue;
import java.util.Date;

import Actores.*;
import Actores.Cliente;
import ClasesAbstractas.*;
import InterfazGrafica.FrmProcesoComercial;

public class ProcesoComercialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ValoresMaestros oValoresMaestros = new ValoresMaestros();
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					FrmProcesoComercial frame = new FrmProcesoComercial();
					
					
					
							
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
