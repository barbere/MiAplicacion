package tareaClase4;

import java.util.Arrays;

public class Clase4Ejercicio1a {

public static void main (String[] args) {
		int n1= Integer.parseInt(args[0]);	
		int n2= Integer.parseInt(args[1]);
		int n3= Integer.parseInt(args[2]);
		String orden = (args[3]); 
		
System.out.println(Arrays.toString(ordenarNumeros( n1, n2, n3, orden)));
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






