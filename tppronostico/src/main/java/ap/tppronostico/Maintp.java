package ap.tppronostico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Maintp {

	public static void main(String[] args) {
		
		// Leer resultados
				Collection<Partido> partidos = new ArrayList<Partido>();

				Path pathResultados = Paths.get(args[0]);
				List<String> lineasResultados = null;
				try {
					lineasResultados = Files.readAllLines(pathResultados);
				} catch (IOException e) {
					System.out.println("No se pudo leer la linea de resultados...");
					System.out.println(e.getMessage());
					System.exit(1);
				}
				boolean primera = true;
				for (String lineaResultado : lineasResultados) {
					if (primera) {
						primera = false;
					} else {
						// Argentina,1,2,Arabia Saudita
						System.out.println(lineaResultado);
						String[] campos = lineaResultado.split(";");
						Ronda nroRonda = new Ronda(campos[0]);
						Equipo equipo1 = new Equipo(campos[1]);
						Equipo equipo2 = new Equipo(campos[4]);
						Partido partido = new Partido(equipo1, equipo2);
						partido.setGolesEq1(Integer.parseInt(campos[2]));
						partido.setGolesEq2(Integer.parseInt(campos[3]));
						partidos.add(partido);
					}
                         
				}
				// Leer pronostico
				int puntos = 0; // total puntos pesona
				
				Path pathPronostico = Paths.get(args[1]);
				List<String> lineasPronostico = null;
				try {
					lineasPronostico = Files.readAllLines(pathPronostico);
				} catch (IOException e) {
					System.out.println("No se pudo leer la linea de pronosticos...");
					System.out.println(e.getMessage());
					System.exit(1);
				}
				primera = true;
				for (String lineaPronostico : lineasPronostico) {
					if (primera) {
						primera = false;
					} else {
						
						String[] campos = lineaPronostico.split(";");
						Participante nombre = Nombre(campos[0]);
						Equipo equipo1 = new Equipo(campos[1]);
						Equipo equipo2 = new Equipo(campos[5]);
						Partido partido = null;
						System.out.println(lineaPronostico);
                        
						for (Partido partidoCol : partidos) {
							if (partidoCol.getEquipo1().getNombre(
									).equals(equipo1.getNombre())
									&& partidoCol.getEquipo2().getNombre(
											).equals(equipo2.getNombre())) {
								
								partido = partidoCol;
								
							}
						}
						Equipo equipo = null;
						EnumResultado resultado = null;
						if("X".equals(campos[2])) {
							equipo = equipo1;
							resultado = EnumResultado.GANADOR;
						}
						if("X".equals(campos[3])) {
							equipo = equipo1;
							resultado = EnumResultado.EMPATE;
						}
						if("X".equals(campos[4])) {
							equipo = equipo1;
							resultado = EnumResultado.PERDEDOR;
						}
						Pronostico pronostico = new Pronostico(partido, equipo, resultado);
						// sumar los puntos correspondientes
						puntos += pronostico.puntos();
					}
				}

				// mostrar los puntos
				System.out.println("Los puntos obtenidos por el usuario fueron:");
				System.out.println(puntos);

			}

	private static Participante Nombre(String string) {
		// TODO Auto-generated method stub
		return null;
	}

		}