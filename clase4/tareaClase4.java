package tareaClase4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class tareaClase4 {
      public static void main(String [] args) {
    	  String archivo = "C:\\Users\\Equipo\\eclipse-workspace\\miProyecto\\UnArchivo.txt";
    	  // ruta absoluta
   try {
	for(String linea: Files.readAllLines(Paths.get(archivo))) {  
	    	  System.out.println(linea);
	   }
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
       archivo = "..\\miProyecto\\OtroArchivo.txt";// ruta relativa
      try { 
      Files.writeString(Paths.get(archivo),"Hola que tal, todo bien?");
      } catch (IOException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
   
      }


}
