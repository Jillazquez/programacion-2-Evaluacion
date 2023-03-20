package Ej_4;

public abstract class Persona {

	String nombre="";
	int edad=0;
	
	public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
	
	  public void mostrarInfo() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Edad: " + edad);
	    }
}
