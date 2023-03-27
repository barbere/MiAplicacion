package Tp;

public class Equipo {
	private int id;
	private int idEquipo;
	private String[] nombre = new String[] {"Argentina", "Arabia Saudito", "Polonia", "Mexico"};
	private String descripcion;

	
	public Equipo(int idEquipo, String[] nombre, String descripcion) {
		this.idEquipo    = idEquipo;
		this.nombre      = nombre;
		this.descripcion = descripcion;
	}


	public int getId() {
		return id;
	}
	public int getIdEquipo() {
		return idEquipo;
	}

	public void setId(int id) {
		this.id = id;
		    }
	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String[] getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String[] nombre) {
		this.nombre = nombre;
	}
		
	public String geDescripcion() {
		return this.descripcion;
	}
	
	public void setDescripicion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}

