package modelo;
import java.util.ArrayList;

public class Alumno {
private String nombre;
private String legajo;
private ArrayList<Materia> materiasAprobadas;

public boolean aproboMateria(Materia materia) {
	return this.materiasAprobadas.contains(materia);
}

@Override
public String toString() {
	return "Alumno [nombre=" + nombre + ", legajo=" + legajo + ", materiasAprobadas=" + materiasAprobadas + "]";
}

public Alumno(String nombre, String legajo) {
	this.nombre = nombre;
	this.legajo = legajo;
	materiasAprobadas = new ArrayList<Materia>();
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getLegajo() {
	return legajo;
}

public void setLegajo(String legajo) {
	this.legajo = legajo;
}
public void agregarMateriaAprobada(Materia materia) {
	this.materiasAprobadas.add(materia);
	
}
public void eliminarMateriaAprobada(Materia materia) {
	this.materiasAprobadas.remove(materia);
}


}
