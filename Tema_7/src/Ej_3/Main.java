package Ej_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Empleado[] e = new Empleado[100];
		Jefe[] j = new Jefe[100];
		int sueldobase = 1000,nume=0,numj=0;
		String empresa = "Electrica, SA";
		
		System.out.println("Que edad tiene el Empleado");
		int edad = teclado.nextInt();
		System.out.println("Que porcentaje se le suma al sueldo?");
		int porcentaje = teclado.nextInt();
		System.out.println("Como se llama el Empleado");
		teclado.nextLine();
		String nombre = teclado.nextLine();
		int sueldo = sueldobase + sueldobase*(porcentaje/100);
		System.out.println(empresa+edad+porcentaje+nombre+sueldo);
		e[nume] = new Empleado(sueldobase,empresa,nombre,edad,porcentaje);
		nume++;
		
		int jefe = 250;
		
		System.out.println("Departamento del jefe");
		String departamento = teclado.nextLine();
		System.out.println("Que edad tiene el Jefe");
		 edad = teclado.nextInt();
		System.out.println("Que porcentaje se le suma al sueldo?");
		 porcentaje = teclado.nextInt();
		System.out.println("Como se llama el Jefe");
		teclado.nextLine();
		 nombre = teclado.nextLine();
		 sueldo = sueldobase + sueldobase*(porcentaje/100);
		System.out.println(empresa+edad+porcentaje+nombre+sueldo);
		e[nume] = new Empleado(sueldobase,empresa,nombre,edad,porcentaje);
		nume++;
		
		System.out.println("DADO EL SIGUIENTE MENÚ:\n"
				+ "1. Modificar el sueldo base de todos los empleados.\n"
				+ "2. Modificar el plus de todos los jefes.\n"
				+ "3. Visualizar los datos de todos los empleados.\n"
				+ "4. Salir.\n"
				+ "ELIJA UNA OPCIÓN:");
		int numero = teclado.nextInt();
		
		
	}

}
