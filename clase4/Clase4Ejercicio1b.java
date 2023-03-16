package tareaClase4;
import java.util.Arrays;
import java.util.Scanner;

public class Clase4Ejercicio1b {
	public static void main(String[]args) {
      Scanner scn = new Scanner(System.in);
      System.out.println("ingrese el primer numero");
      int n1 = Integer.parseInt(scn.nextLine());
      
      System.out.println("ingrese el segundo numero");
      int n2 = Integer.parseInt(scn.nextLine());
      
      System.out.println("ingrese el tercer numero");
      int n3 = Integer.parseInt(scn.nextLine());
      
      System.out.println("ingrese el orden");
      String orden = scn.nextLine();
      
      int[] ordenados = ordenarNumeros( n1, n2, n3, orden);   
      System.out.println(Arrays.toString(ordenados));
      
                }
public static int[] ordenarNumeros(int n1, int n2, int n3, String orden) {
	int [] vector = new int[] {n1, n2, n3};
	  for (int i = 0; i < vector.length; i++) {
		  //System.out.println("i" + vector[i]);
		  
		  for (int j = i + 1; j < vector.length; j++) {
			 // System.out.println("    j" + vector[j]);
			  if (orden.equals("asc")) {
			     if (vector[i] > vector[j]) {
				  //System.out.println("encontre el mayor"+ vector[i]);
				  int temp = vector[i];
				  vector[i] = vector[j];
				  vector[j] = temp;
		                      }
			        }
			  else if (orden.equals("desc")) {
				  if (vector[i] < vector[j]) {
					  //System.out.println("encontre el menor"+ vector[i]);
					  int temp = vector[i];
					  vector[i] = vector[j];
					  vector[j] = temp;
			                      }	
				  

			                       }
		  }
		  
			  }
	return vector;

}
}