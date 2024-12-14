/**
 * Ruben Bernal Ramos, CSI1
 */

package servicios;

import java.util.List;
import java.util.Scanner;

import controladores.Inicio;
import dtos.ProductoDto;

/**
 * Implementacion de la interfaz operativa
 * @author rbr - 141224
 *
 */
public class OperativaImplementacion implements OperativaInterfaz {

	/**
	 * Metodo para agregar un nuevo producto
	 * rbr - 141224
	 */
	public void agregarNuevo(Scanner scanner) {		
		
		System.out.println("Dime el nombre del producto: ");
		String nombreAux = scanner.next();
		long id = calcularNuevoId();
		
		Inicio.productos.add(new ProductoDto(id,nombreAux));

	}
	
	/**
	 * Metodo para calcular un nuevo id
	 * rbr - 141224
	 * @return nuevoId
	 */
	private long calcularNuevoId() {
		long nuevoId;
		long tamanio = Inicio.productos.size();
		if (tamanio==0) {
			nuevoId = 1;
		}else {
			nuevoId = Inicio.productos.get((int)(tamanio-1)).getIdProducto();
		}
		return nuevoId;
	}

	/**
	 * Metodo para ordenar los productos a traves de un metodo burbuja
	 * rbr - 141224
	 */
	public void ordenarMetodoBurbuja() {
		
		List<ProductoDto> listaAuxiliar = Inicio.productos;
		int j=0;
		
		if(listaAuxiliar.get(j).getNombreProducto().compareTo(listaAuxiliar.get(j+1).getNombreProducto()) > 0) {
			
			ProductoDto temporalDto = listaAuxiliar.get(j);
			listaAuxiliar.set(j, listaAuxiliar.get(j+1));
			listaAuxiliar.set(j+1, temporalDto);
			
		}
		
	}

}