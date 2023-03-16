package tareaClase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Clase4Ejercicio3 {
public static void main (String[] args) {
	String operacion = "codificar";
	int desplazamiento = 2;
	String archivoEntrada = "palabrasok.txt";
	String archivoSalida = "palabrascodificadas.txt";
	String resultado = "";
	String resultadoOperacion = "la operacion fue exitosa";
	
	try {
		for (String linea: Files.readAllLines(Paths.get(archivoEntrada))) {
			if (operacion.equals("codificar")) {
		 resultado = mensajeCodificado(linea,desplazamiento);
			                            }
			else if (operacion.equals("decodificar")) {
	     resultado =  mensajeCodificado(linea,desplazamiento);
				
			}
				
			 
		                 }
		
    Files.writeString(Paths.get(archivoSalida), resultado);
	}catch(IOException e) {
		resultadoOperacion = "hubo un error en la operacion";
	}
	
	System.out.println(resultadoOperacion);
}

public static String mensajeCodificado(String mensaje, int desplazamiento) {
    System.out.println("Mensaje Original: " + mensaje);
    char[] abecedario = mensaje.toCharArray();
   for (int i = 0; i < abecedario.length; i++) { // codifica mensaje
        if (desplazamiento == 1) {
            abecedario[i] = (char) (abecedario[i] + (char) 1); // con desplazamiento de 1
        } else if (desplazamiento == 2) {
            abecedario[i] = (char) (abecedario[i] + (char) 2); //con desplazamiento de 2
        }
    }
    String codificado = String.valueOf(abecedario);
    System.out.println("Mensaje Codificado: " + codificado);

    char[] abecedarioDecodificado = codificado.toCharArray();
    for (int i = 0; i < abecedarioDecodificado.length; i++) { // decodifica el mensaje
        if (desplazamiento == 1) {
        } else if (desplazamiento == 2) {                                              // de 1
            abecedarioDecodificado[i] = (char) (abecedarioDecodificado[i] - (char) 2); // con desplazamiento
        }                                                                              // de 2
    }
    String decodificado = String.valueOf(abecedarioDecodificado);
    System.out.println("Mensaje Decodificado: " + decodificado);
}
}




