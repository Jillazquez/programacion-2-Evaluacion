package Ej_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nume = 0, numj = 0;
		System.out.println("Cuantos empleados quieres poner");
		int ne = teclado.nextInt();
		System.out.println("Cuantos jefes quieres poner");
		int nj = teclado.nextInt();
		Empleado[] empleados = new Empleado[ne];
		Jefe[] jefes = new Jefe[nj];
		boolean seguir = true;
		while (seguir == true) {
			System.out.println("Añade el siguiente empleado");
			System.out.println("Cuanto cobra");
			int sueldo = teclado.nextInt();
			System.out.println("Nombre");
			teclado.nextLine();
			String nombre = teclado.nextLine();
			empleados[nume] = new Empleado(sueldo, nombre);
			nume++;
			System.out.println("Quieres introducir otro? SI o NO");
			String ayuda = teclado.nextLine();
			ayuda = ayuda.toUpperCase();
			if (ayuda.equals("SI")) {
				seguir = true;
			} else {
				seguir = false;
			}
		}
		seguir = true;
		while (seguir == true) {

			System.out.println("Añade el siguiente Jefe");
			System.out.println("Cuanto cobra");
			int sueldo = teclado.nextInt();
			System.out.println("Nombre");
			teclado.nextLine();
			String nombre = teclado.nextLine();
			System.out.println("Puesto");
			String puesto = teclado.nextLine();
			System.out.println("Titulo");
			String titulo = teclado.nextLine();

			jefes[numj] = new Jefe(sueldo, nombre, titulo, puesto);
			numj++;
			System.out.println("Quieres introducir otro? SI o NO");
			String ayuda = teclado.nextLine();
			ayuda = ayuda.toUpperCase();
			if (ayuda.equals("SI"))
				seguir = true;
			else
				seguir = false;
		}
		for (int i = 0; i < nume; i++) {
			System.out.println("Nombre del empleado " + empleados[i].getNombre() + " Sueldo del empleado "
					+ empleados[i].getSueldo());
		}
		for (int i = 0; i < numj; i++) {
			System.out.println("Nombre del jefe " + jefes[i].getNombre() + " Sueldo del jefe " + jefes[i].getSueldo()
					+ " " + jefes[i].getTitulo() + " " + jefes[i].getPuesto());
		}
	}

}
