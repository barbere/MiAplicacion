package tareaClase8;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Carrito {
	private ArrayList<Producto>productos;
	private LocalDateTime fechacompra;
	
	public Carrito( LocalDateTime fechacompra) {
	     this.fechacompra = fechacompra;
	     this.productos = new ArrayList<Producto>();
	}
	//agrega productos
public void agregarProducto(Producto p) {
	if(!existeProducto(p)) {
	this.productos.add(p);
	}
}
public boolean existeProducto(Producto p) {
	for(Producto prod : productos) {
		if (prod.getCodigo().equals (p.getCodigo())) {
			return true;
		}
		
	}
	return false;
}
	public void eliminarProducto(String codigo) {
		for(int i =0 ; i < this.productos.size(); i++) {
		if(this.productos.get(i).getCodigo().equals(codigo)){
			this.productos.remove(i);
		}	
		}
		
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	public LocalDateTime getFechacompra() {
		return fechacompra;
	}

	public void setFechacompra(LocalDateTime fechacompra) {
		this.fechacompra = fechacompra;
	}
	
	public float costoFinal(Descuento desc) throws ValorCeroException,TotalNegativoException {
	float total = 0;
	for(Producto p: this.productos) {
		total = total + p.costoFinal();
		}
	if(total == 0) {
		throw new  ValorCeroException(total);
	}
	total = desc.valorFinal(total);
	if(total<0) {
		throw new TotalNegativoException(total);
	}
		return total;
	}
}




