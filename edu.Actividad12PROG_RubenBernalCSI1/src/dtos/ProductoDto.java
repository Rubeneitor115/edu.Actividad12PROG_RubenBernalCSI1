/**
 * Ruben Bernal Ramos, CSI1
 */

package dtos;

public class ProductoDto {
	
	//Atributos
	long idProducto;
	String nombreProducto = "aaaaa";	
	
	//Constructores
	public ProductoDto(long idProducto, String nombreProducto) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
	}
	public ProductoDto() {
		super();
	}
	
	//Getters y Setters
	public long getIdProducto() {
		return idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	//Metodo toString
	public String toString() {
		return "ProductoDto [nombreProducto=" + nombreProducto + "]";
	}	
	
}