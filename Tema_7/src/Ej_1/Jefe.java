package Ej_1;

public class Jefe extends Empleado {

	String titulo = "";
	String puesto = "";

	public Jefe(int sueldo, String nombre, String titulo, String puesto) {

		super(sueldo, nombre);
		this.titulo = titulo;
		this.puesto = puesto;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

}
