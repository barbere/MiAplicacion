package tareaClase7Ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class TestCarrito {

	@Test
	void testCostoFinalDescuentoFijo() {
		Producto producto1 = new Producto("Arroz", "3423",2000);
		Producto producto2 = new Producto("Atun", "3428",1000);
		Producto producto3 = new Producto("Sal", "5478",3000);
				
				
				;
		Carrito carrito = new Carrito(producto1, producto2, producto3,LocalDateTime.parse("2023-01-13T11:12:00"));
		Descuento desFijo = new DescuentoFijo (2000);
		float valorFinal= carrito.costoFinal(desFijo);
		assertEquals(valorFinal, 4000);
	}
	@Test
	void testCostoFinalDescuentoPorcentaje() {
		Producto producto1 = new Producto("Arroz", "3423",4000);
		Producto producto2 = new Producto("Atun", "3428",4000);
		Producto producto3 = new Producto("Sal", "5478",2000);
		Carrito carrito = new Carrito(producto1, producto2, producto3,LocalDateTime.parse("2023-01-13T11:12:00"));
		Descuento desFijo = new DescuentoPorcentaje (0.50f);
		float valorFinal= carrito.costoFinal(desFijo);
		assertEquals(valorFinal, 5000);
	}
	@Test
	void testCostoFinalDescuentoPorcentajeConTope() {
		Producto producto1 = new Producto("Arroz", "3423",4000);
		Producto producto2 = new Producto("Atun", "3428",4000);
		Producto producto3 = new Producto("Sal", "5478",2000);
		Carrito carrito = new Carrito(producto1, producto2, producto3,LocalDateTime.parse("2023-01-13T11:12:00"));
		Descuento desPorcentaje = new DescuentoPorcentajeConTope (0.50f);
		desPorcentaje.setValorDesc(0.20f);
		float valorFinal= carrito.costoFinal(desPorcentaje);
		assertEquals(valorFinal,8000);
	}
}
