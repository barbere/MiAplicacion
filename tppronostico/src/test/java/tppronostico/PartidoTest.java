package tppronostico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ap.tppronostico.EnumResultado;
import ap.tppronostico.Equipo;
import ap.tppronostico.Partido;


public class PartidoTest {
	
@Test
public void TestPartidoEmpatado () {

   Equipo equipo1 = new Equipo("Boca");
   Equipo equipo2 = new Equipo("San Lorenzo");
   Partido partido = new Partido(equipo1,equipo2, 1, 1);
   
   EnumResultado resultadoObtenido = partido.resultado(equipo1);
   
   
   assertEquals (EnumResultado.EMPATE,resultadoObtenido);
   
	
}

@Test
public void TestPartidoGanador () {
	Equipo equipo1 = new Equipo("Boca");
	   Equipo equipo2 = new Equipo("San Lorenzo");
	   Partido partido = new Partido(equipo1,equipo2, 3, 1);
	   
	   EnumResultado resultadoObtenido = partido.resultado(equipo1);
	   
	   
	   assertEquals (EnumResultado.GANADOR, resultadoObtenido);
	   	
}
@Test
public void TestPartidoPerdedor () {
	Equipo equipo1 = new Equipo("Boca");
	   Equipo equipo2 = new Equipo("San Lorenzo");
	   Partido partido = new Partido(equipo1,equipo2, 1, 3);
	   
	   EnumResultado resultadoObtenido = partido.resultado(equipo1);
	   
	   
	   assertEquals (EnumResultado.PERDEDOR, resultadoObtenido);
}
	   
}
