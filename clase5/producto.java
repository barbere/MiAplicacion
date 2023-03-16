package tareaClase5;

public class producto {
 
 private String nombre;
 private String codigo;
 private float precio;
 
 public producto(String nombre, String codigo, float precio) {
 this.nombre=nombre;
 this.codigo=codigo;
 this.precio=precio;
 
 }
public String getNombre() {
	return this.nombre;
}
public void setNombre(String nuevoNombre) {
	this.nombre = nuevoNombre;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public float getPrecio() {
	return precio;
}
public void setPrecio(float precio) {
	this.precio = precio;
}
public float costoFinal() {
	return this.precio;
}



}