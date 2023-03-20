package Ej_4;
import java.util.Scanner;
public final class Profesor extends Persona{
	
	String departamento="";
	int plus=1;
	int[] pluses = new int[100];
	int cantidadpluses=0;
	
	public Profesor(String nombre, int edad,String departamento, int cantidadpluses) {
		super(nombre, edad);
		this.departamento = departamento;
		this.cantidadpluses = cantidadpluses;
	}

	public String getDepartamento() {
		return departamento;
	}

	public int[] getPluses() {
		return pluses;
	}

	public int getCantidadpluses() {
		return cantidadpluses;
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Departamento: " + departamento);
	    System.out.println("Pluses: " + cantidadpluses);
	    System.out.println("Nombre: "+nombre);
	    System.out.println("Edad: "+edad);
	    for(int i =0;i<cantidadpluses;i++) {
	    	System.out.println("El plus "+(i+1)+" vale: "+pluses[i]);
	    }
	}
	
	public void masAlto() {
		int alto=0;
		for(int i =0;i<pluses.length;i++) {
			if(pluses[i]>alto)
				alto = pluses[i];
		}
		System.out.println(alto);
	}
	public void pedirDatos() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Nombre del Profesor?");
		nombre=teclado.nextLine();
		System.out.println("Edad del profesor");
		edad=teclado.nextInt();
		System.out.println("Departamento del Profesor?");
		teclado.nextLine();
		departamento=teclado.nextLine();
		
		System.out.println("Cuantos pluses tiene?");
		cantidadpluses=teclado.nextInt();
		if(cantidadpluses>0) {
			for(int i =0;i<cantidadpluses;i++) {
				System.out.println("Dime cuanto vale el plus: "+(i+1));
				pluses[i]=teclado.nextInt();
			
		}
		}
	}
	

	
	
	

}
