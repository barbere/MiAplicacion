package tareaClase5;

import java.time.LocalDateTime;

public class carrito {
	private producto producto1;
	private producto producto2;
	private producto producto3;
	private LocalDateTime fechacompra;
	
	public carrito(producto producto1, producto producto2, producto producto3, LocalDateTime fechacompra) {
	
		this.producto1 = producto1;
		this.producto2 = producto2;
		this.producto3 = producto3;
		this.fechacompra = fechacompra;
	}

	public producto getProducto1() {
		return producto1;
	}

	public void setProducto1(producto producto1) {
		this.producto1 = producto1;
	}

	public producto getProducto2() {
		return producto2;
	}

	public void setProducto2(producto producto2) {
		this.producto2 = producto2;
	}

	public producto getProducto3() {
		return producto3;
	}

	public void setProducto3(producto producto3) {
		this.producto3 = producto3;
	}

	public LocalDateTime getFechacompra() {
		return fechacompra;
	}

	public void setFechacompra(LocalDateTime fechacompra) {
		this.fechacompra = fechacompra;
	}
	
	public float costoFinal() {
		return this.producto1.costoFinal() + this.producto2.costoFinal()+ this.producto3.costoFinal();
	}
}
