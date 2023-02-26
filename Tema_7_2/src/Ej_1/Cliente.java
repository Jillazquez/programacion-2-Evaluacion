package Ej_1;

import java.util.Scanner;

public class Cliente implements Persona {

	private String nombre = "";
	private int edad = 0;
	
	
	public void pedirTodosDatos() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Cual es la edad del cliente");
		edad = sc.nextInt();
		System.out.println("Como se llama el cliente");
		nombre = sc.nextLine();
		sc.nextLine();//Para limpiar
	}
	public void visualizarTodosDatos() {
		System.out.println("Nombre del cliente: "+nombre);
		System.out.println("Edad del cliente: "+edad);
		System.out.println("Nombre de la empresa" +nombreEmpresa);
		
	}
}
