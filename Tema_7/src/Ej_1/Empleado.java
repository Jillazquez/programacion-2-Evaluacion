package Ej_1;

public class Empleado {

	public int sueldo = 0;
	String nombre = "";

	public Empleado(int sueldo, String nombre) {
		this.sueldo = sueldo;
		this.nombre = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
