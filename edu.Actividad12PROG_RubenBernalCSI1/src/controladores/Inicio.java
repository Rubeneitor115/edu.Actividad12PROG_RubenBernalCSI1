/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ProductoDto;
import servicios.OperativaInterfaz;
import servicios.OperativaImplementacion;

/**
 * Clase controladora de la aplicacion
 * @author rbr - 141224
 *
 */
public class Inicio {
	
	public static List<ProductoDto> productos = new ArrayList<ProductoDto>();

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 141224
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		OperativaInterfaz operativaInterfaz = new OperativaImplementacion();
		
		for(int i=0;i<4;i++) {
			operativaInterfaz.agregarNuevo(scanner);
		}
		
		operativaInterfaz.ordenarMetodoBurbuja();
		
	}

}

