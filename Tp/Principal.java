package Tp;

public class Principal {
	public static void main (String[] args) {
		
LeerArchivos leerArchivos = new LeerArchivos();
LectorCsv lectorCsv = new LectorCsv();
leerArchivos.leer();
lectorCsv.leerCsv();

}
}