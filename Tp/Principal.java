package Tp;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main (String[] args) {
		
		String archivoResultado  = "resultados.cvs";
		String archivoPronostico = "pronosticos.cvs";

		// Envio el nombre de la UNICA persona de este pronostico
		Participante nombre = new Participante ("Mariana","Uria");
		System.out.println("La persona que hizo este pronostico es: " + nombre.getNombre());
		System.out.println(" ");

		try {
			List<String> listaResultado  = Files.readAllLines(Paths.get(archivoResultado));
			List<String> listaPronostico = Files.readAllLines(Paths.get(archivoPronostico));

			String[] equipo1Resultado = listaResultado.get(0).split(" ");  // Argentina 1 2 ArabiaSaudita
			String[] equipo2Resultado = listaResultado.get(1).split(" ");
			String[] equipo3Resultado = listaResultado.get(2).split(" ");

			String[] equipo1Pronostico = listaPronostico.get(0).split(" ");
			String[] equipo2Pronostico = listaPronostico.get(1).split(" ");
			String[] equipo3Pronostico = listaPronostico.get(2).split(" ");

			Partido resultadoPartido1 = new Partido(1,1, equipo2Resultado[0], equipo2Resultado[3], Integer.parseInt(equipo2Resultado[1]), Integer.parseInt(equipo2Resultado[2]));
			Partido resultadoPartido2 = new Partido(2,2, equipo3Resultado[0], equipo3Resultado[3], Integer.parseInt(equipo3Resultado[1]), Integer.parseInt(equipo3Resultado[2]));

			//no se que parametros enviarle, probe de todo!!!	
			//Pronostico resultadoPronostico1 = new Pronostico(resultadoPartido1.getIdPartido(), resultadoPartido1.getEquipo1(), );


			//Con estas dos lines, muestro titulo de columnas
			System.out.println("ARCHIVO RESULTADO");
			System.out.println(equipo1Resultado[0] + "  " + equipo1Resultado[1] + "  " + equipo1Resultado[2] + "  " + equipo1Resultado[3]);
			System.out.println(resultadoPartido1.getEquipo1() + "     "+ resultadoPartido1.getGolesEquipo1() + "            " + resultadoPartido1.getGolesEquipo2() + "       " + resultadoPartido1.getEquipo2() + "        = Parido:" + resultadoPartido1.getIdPartido());
			System.out.println(resultadoPartido2.getEquipo1() + "       "+ resultadoPartido2.getGolesEquipo1() + "            " + resultadoPartido2.getGolesEquipo2() + "       " + resultadoPartido2.getEquipo2() + "               = Parido:" + resultadoPartido2.getIdPartido());

			System.out.println("");
			System.out.println("");

			System.out.println("ARCHIVO PRONOSTICO");
			System.out.println(equipo1Pronostico[0] + "  " + equipo1Pronostico[1] + "  " + equipo1Pronostico[2] + "  " + equipo1Pronostico[3] + " " + equipo1Pronostico[4]);



			//Partido datosPartido1 = new Partido(1, equipo2Resultado[0], equipo2Resultado[3], Integer.parseInt(equipo2Resultado[1]), Integer.parseInt(equipo2Resultado[2]));
			//System.out.println(datosPartido1.getEquipo1() + datosPartido1.getGolesEquipo2());


			}catch(IOException e) {        // comienza la excepcion
			System.out.println("Hubo un error en la operacion...");

		}
	}




}
