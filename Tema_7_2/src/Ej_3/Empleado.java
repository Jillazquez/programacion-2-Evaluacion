package Ej_3;

public class Empleado {

	String nombre ="";
	int sueldobase=1000;
	int edad =0;
	
	public Empleado(String nombre, int sueldobase, int edad) {
		this.nombre = nombre;
		this.sueldobase = sueldobase;
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}

	
	
public void visualizarTodosDatos() {
	System.out.println("El nombre es: " + nombre);
	System.out.println("El sueldo base es: " + sueldobase);
	System.out.println("La edad es: " + edad);
}
	
	
}
