package Tp;

public class Ronda {
	private int nroRonda;
	private String[] partido;


	public Ronda(int nroRonda, String[] partido) {
		this.nroRonda = nroRonda;
		this.partido = partido;
	}


	public int getNroRonda() {
		return this.nroRonda;
	}


	public void setNroRonda(int nroRonda) {
		this.nroRonda = nroRonda;
	}


	public String[] getPartido() {
		return this.partido;
	}


	public void setPartido(String[] partido) {
		this.partido = partido;
	}

}

