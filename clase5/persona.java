package tareaClase5;

import java.time.Duration;
import java.time.LocalDateTime;

public class persona {
private String nombre;
private String apellido;
private LocalDateTime fechaDeNacimiento;
private carrito carrito;
public persona(String nombre, String apellido, LocalDateTime fechaDeNacimiento, tareaClase5.carrito carrito) {
	
	this.nombre = nombre;
	this.apellido = apellido;
	this.fechaDeNacimiento = fechaDeNacimiento;
	this.carrito = carrito;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public LocalDateTime getFechaDeNacimiento() {
	return fechaDeNacimiento;
}
public void setFechaDeNacimiento(LocalDateTime fechaDeNacimiento) {
	this.fechaDeNacimiento = fechaDeNacimiento;
}
public carrito getCarrito() {
	return carrito;
}
public void setCarrito(carrito carrito) {
	this.carrito = carrito;
}

public int edad() {
LocalDateTime fechaActual = LocalDateTime.now();
	long dias = Duration.between(this.fechaDeNacimiento, fechaActual).toDays();
	int edad = (int) (dias/365.2425);
	return edad;
	
}






}
