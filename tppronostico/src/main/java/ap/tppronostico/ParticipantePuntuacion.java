package ap.tppronostico;

public class ParticipantePuntuacion {
	private String nombre;
    private int puntuacion;

    public ParticipantePuntuacion(String nombre) {
        this.nombre = nombre;
        this.puntuacion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void sumarPuntos(int puntos) {
        this.puntuacion += puntos;
    }
}

