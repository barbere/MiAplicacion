package Tp;

public class Pronostico {
	private int id;
	private int idPronostico;
	private String[] Partido;
	private String[] Equipo;
	Resultado resultado1 = Resultado.GANADOR;
    Resultado resultado2 = Resultado.PERDEDOR;
    Resultado resultado3 = Resultado.EMPATE;
	
	public String[] getPartido() {
		return Partido;
	}


	public void setPartido(String[] partido) {
		Partido = partido;
	}


	public String[] getEquipo() {
		return Equipo;
	}


	public void setEquipo(String[] equipo) {
		Equipo = equipo;
	}


	public Pronostico(int idPronostico, String[] partido, String[] equipo) {
		this.idPronostico = idPronostico;
		this.Partido = partido;
		this.Equipo = equipo;
	}


	public int getInd() {
		return this.id;
	}
	public int getIndPronostico() {
		return this.idPronostico;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setIdPronostico(int idPronostico) {
		this.idPronostico = idPronostico;
	}
	  
}


