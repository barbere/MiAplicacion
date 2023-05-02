package ap.tppronostico;


public class Ronda {
    private int nroRonda;
    private ParticipantePuntuacion[][] partido;

    public Ronda(int nroRonda, ParticipantePuntuacion[][] partido) {
        this.nroRonda = nroRonda;
        this.partido = partido;
    }

    public Ronda(String string) {
		// TODO Auto-generated constructor stub
	}

	public int getNroRonda() {
        return this.nroRonda;
    }

    public void setNroRonda(int nroRonda) {
        this.nroRonda = nroRonda;
    }

    public ParticipantePuntuacion[][] getPartido() {
        return this.partido;
    }

    public void setPartido(ParticipantePuntuacion[][] partido) {
        this.partido = partido;
    }

    public void registrarPuntos(String idPartido, int puntosParticipante1, int puntosParticipante2) {
        // Buscar los participantes en la matriz de objetos "partido" utilizando el objeto "IdPartido"
        // Sumar los puntos correspondientes a cada participante y actualizar sus puntuaciones en la matriz
    }
}