package Ej_1;

import java.util.Scanner;

public class Empleado implements Persona{

	private String nombre = "";
	private String puesto = "";
	
	public void pedirTodosDatos() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Cual es el puesto del Empleado");
		puesto = sc.nextLine();
		System.out.println("Como se llama el Empleado");
		nombre = sc.nextLine();
		sc.nextLine();//Para limpiar
	}
	public void visualizarTodosDatos() {
		System.out.println("Nombre del Empleado: "+nombre);
		System.out.println("Puesto del Empleado "+ puesto);
		System.out.println("Nombre de la empresa" +nombreEmpresa);
		
	}
	
}
