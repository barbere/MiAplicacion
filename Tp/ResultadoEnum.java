package Tp;



public class ResultadoEnum {
	boolean Ganador = true ;
	boolean Perdedor = true;
	boolean Empate = true;
	public ResultadoEnum(boolean ganador, boolean perdedor, boolean empate) {
		
		Ganador = ganador;
		Perdedor = perdedor;
		Empate = empate;
	}
	public boolean isGanador() {
		return Ganador;
	}
	public void setGanador(boolean ganador) {
		Ganador = ganador;
	}
	public boolean isPerdedor() {
		return Perdedor;
	}
	public void setPerdedor(boolean perdedor) {
		Perdedor = perdedor;
	}
	public boolean isEmpate() {
		return Empate;
	}
	public void setEmpate(boolean empate) {
		Empate = empate;
	}
}