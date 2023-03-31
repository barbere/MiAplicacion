package Tp;

public class Partido  {
	private int id;
	private int idPartido;
	private String Equipo1;
	private String Equipo2;
	private int GolesEquipo1;
	private int GolesEquipo2;
     Resultado resultado1 = Resultado.GANADOR;
     Resultado resultado2 = Resultado.PERDEDOR;
     Resultado resultado3 = Resultado.EMPATE;
    
	public Partido(int id,int idPartido, String equipo1, String equipo2, int golesEquipo1, int golesEquipo2) {
		
		this.id = id;
		this.idPartido = idPartido;
		this.Equipo1 = equipo1;
		this.Equipo2 = equipo2;
		this.GolesEquipo1 = golesEquipo1;
		this.GolesEquipo2 = golesEquipo2;
		
	                               }


	public Partido(String equipo1, String equipo2, int golesEquipo1, int golesEquipo2) {
	
		this.Equipo1 = equipo1;
		this.Equipo2 = equipo2;
		this.GolesEquipo1 = golesEquipo1;
		this.GolesEquipo2 = golesEquipo2;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIdPartido() {
		return idPartido;
	}


	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}


	public String getEquipo1() {
		return Equipo1;
	}


	public void setEquipo1(String equipo1) {
		Equipo1 = equipo1;
	}


	public String getEquipo2() {
		return Equipo2;
	}


	public void setEquipo2(String equipo2) {
		Equipo2 = equipo2;
	}


	public int getGolesEquipo1() {
		return GolesEquipo1;
	}


	public void setGolesEquipo1(int golesEquipo1) {
		GolesEquipo1 = golesEquipo1;
	}


	public int getGolesEquipo2() {
		return GolesEquipo2;
	}


	public void setGolesEquipo2(int golesEquipo2) {
		GolesEquipo2 = golesEquipo2;
	}


	
	}
	