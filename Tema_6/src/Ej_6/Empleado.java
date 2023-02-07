package Ej_6;
import java.util.Scanner;
public class Empleado{
	 int numeroE;
	private String nombre;
	
	public Empleado(int numeroE, String nombre) {
		this.numeroE = numeroE;
		this.nombre = nombre;
	}
	public int getNumero() {
		return numeroE;
	}

	public void setNumero(int numeroE) {
		this.numeroE = numeroE;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}
	
	 public void leerDatos() {
		 Scanner teclado = new Scanner (System.in);
			System.out.print("Introduce el nombre del empleado: ");
			nombre = teclado.nextLine();
			System.out.print("Introduce el numero del empleado");
			numeroE = teclado.nextInt();
			teclado.nextLine();//Se pone esto por que si no da error al invocar mas de una vez el metodo 
			teclado.close();
			
		}
		
	 /*asdasd
	  * Metodo que muestra por pantalla los datos del empleado
	  */
	 
	 public void verDatos() {
			System.out.println("El nombre del empleado es "+ nombre + " y su numero es " + numeroE);
		}
		

}
