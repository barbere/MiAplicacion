package Tp;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class LeerArchivos {

	public void leer() {
		StringBuilder sb = new StringBuilder();
		Path filePath = Paths.get("C:\\Users\\Equipo\\eclipse-workspace\\TrabajoFinal\\resultados.cvs ");
		try {
			BufferedReader br = Files.newBufferedReader(filePath);
			String linea;
			while((linea = br.readLine())!= null);
			sb.append(linea).append("\n");
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(sb);
	}

}
