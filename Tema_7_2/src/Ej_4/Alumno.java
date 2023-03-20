package Ej_4;

public final class Alumno extends Persona {

	String cursos = "";
	int asignaturas = 0;
	int[] media = new int[100];

	public Alumno(String nombre, int edad,String cursos,int asignaturas,int[] media) {
		super(nombre, edad);
		this.cursos=cursos;
		this.asignaturas=asignaturas;
		this.media=media;
	}

	public String getCursos() {
		return cursos;
	}

	public int getAsignaturas() {
		return asignaturas;
	}

	public int[] getMedia() {
		return media;
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Nombre del curso: "+cursos);
		System.out.println("Numero de asignaturas: " + asignaturas);
	    System.out.println("Nombre: "+nombre);
	    System.out.println("Edad: "+edad);
	}

}
