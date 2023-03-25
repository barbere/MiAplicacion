package tareaClase7Ejercicios;
import java.time.LocalDateTime;

public class Carrito {
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private LocalDateTime fechacompra;
	
	public Carrito(Producto producto1, Producto producto2, Producto producto3, LocalDateTime fechacompra) {
	
		this.producto1 = producto1;
		this.producto2 = producto2;
		this.producto3 = producto3;
		this.fechacompra = fechacompra;
	}

	public Producto getProducto1() {
		return producto1;
	}

	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}

	public Producto getProducto2() {
		return producto2;
	}

	public void setProducto2(Producto producto2) {
		this.producto2 = producto2;
	}

	public Producto getProducto3() {
		return producto3;
	}

	public void setProducto3(Producto producto3) {
		this.producto3 = producto3;
	}

	public LocalDateTime getFechacompra() {
		return fechacompra;
	}

	public void setFechacompra(LocalDateTime fechacompra) {
		this.fechacompra = fechacompra;
	}
	
	public float costoFinal(Descuento desc) {
		float total = desc.valorFinal (this.producto1.costoFinal() + this.producto2.costoFinal()+ this.producto3.costoFinal());
		return total;
	}
}


