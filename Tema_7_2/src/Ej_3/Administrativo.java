package Ej_3;

import java.util.Scanner;

public class Administrativo extends Empleado {

	private String estudios = "";
	private int numord = 0;

	public Administrativo(String nombre, int sueldobase, int edad, String estudios,int numord) {
		super(nombre, sueldobase, edad);
		this.estudios = estudios;
		this.numord = numord;
	}

/*
	public void pedirDatos() {
		// Hay que usar los contructores
		Scanner teclado = new Scanner(System.in);
		System.out.println("El nombre del Administrativo es: ");
		nombre = teclado.nextLine();
		System.out.println("El sueldo base del Administrativo es: ");
		sueldobase = teclado.nextInt();
		System.out.println("La edad del Administrativo es: " + edad);
		edad = teclado.nextInt();
		System.out.println("Los estudios del Administrativo son: ");
		estudios = teclado.nextLine();
		System.out.println("El numero de ordenadores asignado son: ");
		numord = teclado.nextInt();
	}
	*/

	@Override
	public void visualizarTodosDatos() {
		super.visualizarTodosDatos();
		System.out.println("Los estudios del Administrativo son: " + estudios);
		System.out.println("El numero de ordenadores asignado son: " + numord);

	}

}
