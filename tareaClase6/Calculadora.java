package tareaClase6;

public class Calculadora {
 public static double sumar(double n1 , double n2) {
	double resultado =  n1 +  n2;
	return resultado; //una forma de plantear la opreracion.
 }
 
 public static double resta (double n1 , double n2) {
		return   n1 -  n2; // otra manera
		
	 }
 public static double dividir(double n1 , double n2) {
		if(n1 == 0 || n2 == 0) {
		return -1; 
		}
		return  n1 / n2;
	 }
 
 public static double multiplicar (double n1 , double n2) {
		return   n1 *  n2; 
		
	 }
 
  public static void main (String [] args) {
	  double resultado = Calculadora.sumar(1, 2);
	  System.out.println(resultado);
  }
}
