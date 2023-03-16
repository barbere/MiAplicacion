package tareaClase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

public class inicio {
public static void main (String [] args) {
	String archivoEntrada = "compras.txt";
	 try {
		List<String>lista = Files.readAllLines(Paths.get(archivoEntrada));
		  String[] datosProducto1 = lista.get(1).split(" ");
		  String[] datosProducto2 = lista.get(2).split(" ");
		  String[] datosProducto3 = lista.get(3).split(" ");
		  
		  producto producto1 = new producto(datosProducto1[1], datosProducto1[2],Float.parseFloat(datosProducto1[0]));
		  producto producto2 = new producto(datosProducto2[1], datosProducto2[2],Float.parseFloat(datosProducto2[0]));
		  producto producto3 = new producto(datosProducto3[1], datosProducto3[2],Float.parseFloat(datosProducto3[0]));
		  
		  carrito carrito = new carrito(producto1, producto2, producto3,LocalDateTime.parse("2023-01-13T11:12:00"));
		  
		  persona persona1 = new persona("Carlos","Barbere", LocalDateTime.parse("1975-11-18T11:12:00"),carrito );
		  
		  carrito miCarrito = persona1.getCarrito();
		  float resultado = miCarrito.costoFinal();
		  System.out.println(resultado);
		  
		  
	 }catch(IOException e) {
		 System.out.println("hubo un error en la operacion" + e);
	 }
}
}
