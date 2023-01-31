package Ej_5;

public class Disco {
	int numero = 0, precio = 0;
	String fecha = "", titulo = "";

	public Disco(int numero, int precio, String fecha, String titulo) {
		this.numero = numero;
		this.precio = precio;
		this.fecha = fecha;
		this.titulo = titulo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;

	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;

	}

	public String getTitulo() {
		return fecha;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;

	}

	public String toString() {
		return numero + " " + precio + " " + fecha + " " + titulo;
	}
}
