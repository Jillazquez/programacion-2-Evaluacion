package Ejercicio_7;

import java.util.Scanner;
import Ejercicio_2.*;
public class InterfazEmpleado {

 	static private Scanner teclado = new Scanner (System.in);
 	Empleado e;
 	public InterfazEmpleado( Empleado e ) {
 		this.e = e;
 	}
 
 	public void verDatos() {
		System.out.println("El nombre del empleado es "+ e.getNombre() + " y su numero es " + e.getNumero());
	}
 	
 	 public void leerDatos() {
			System.out.print("Introduce el nombre del empleado: ");
			e.setNombre(teclado.nextLine());
			System.out.print("Introduce el numero del empleado");
			e.setNumero(teclado.nextInt());
			teclado.nextLine();//Se pone esto por que si no da error al invocar mas de una vez el metodo 
			teclado.close();
			
		}

}

