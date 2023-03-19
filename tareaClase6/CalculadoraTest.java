package tareaClase6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void multiplicarTest() {
		double resultado = Calculadora.multiplicar(80, 3);
		 assertEquals(resultado,240);
		 System.out.println(resultado);
	}

	@Test
	void operaciondobleTest() {
		double resultadoSuma = Calculadora.sumar(150, 180);
		double resultadoFinal = Calculadora.dividir(resultadoSuma,3);
	      assertEquals(resultadoFinal,110);
		  System.out.println(resultadoFinal);
	}
	@Test
	void operacioncompuestaTest() {
		double resultadoResta = Calculadora.resta(90,50);
		double resultadoFinal = Calculadora.multiplicar(resultadoResta, 15);
		assertFalse(resultadoFinal == 605);
		System.out.println(resultadoFinal);
	}
	@Test
	void operacionmultipleTest() {
		double resultadoSuma = Calculadora.sumar(70, 40);
		double resultadoFinal = Calculadora.multiplicar(resultadoSuma, 25);
		assertFalse(resultadoFinal == 2700);
		System.out.println(resultadoFinal);
	}
}
