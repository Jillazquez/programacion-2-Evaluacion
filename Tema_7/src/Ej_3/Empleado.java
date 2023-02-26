package Ej_3;

public class Empleado {

	int sueldobase = 1000;
	String nombreE = "";
	String nombre = "";
	int edad = 0;
	int porcentaje = 0;

	public Empleado(int sueldobase, String nombreE, String nombre, int edad, int porcentaje) {
		this.sueldobase = sueldobase;
		this.nombreE = nombreE;
		this.nombre = nombre;
		this.edad = edad;
		this.porcentaje = porcentaje;
	}

	public int getSueldobase() {
		return sueldobase;
	}

	public void setSueldobase(int sueldobase) {
		this.sueldobase = sueldobase;
	}

	public String getNombreE() {
		return nombreE;
	}

	public void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	
}
