package Tp;

public class Pronostico extends Partido{
	
	private ResultadoEnum  resultado;
	private String equipo;
	private String partido;

    
	public ResultadoEnum getResultado() {
		return resultado;
	}


	public void setResultado(ResultadoEnum resultado) {
		this.resultado = resultado;
	}


	public String getEquipo() {
		return equipo;
	}


	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}


	public String getPartido() {
		return partido;
	}


	public void setPartido(String partido) {
		this.partido = partido;
	}


	public Pronostico(ResultadoEnum resultado, String equipo, String partido) {
		super();
		this.resultado = resultado;
		this.equipo = equipo;
		this.partido = partido;
	}


	public int puntos() {
		int puntos = 0;
		ResultadoEnum resultadoRealParaEquipo = this.partido.resultado(this.equipo);
		if(resultadoRealParaEquipo == this.resultado) {
			puntos = 20;
		}
		return puntos;
	}
}

