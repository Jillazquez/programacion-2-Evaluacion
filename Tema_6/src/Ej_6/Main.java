package Ej_6;
public class Main {
	
	public static void main(String[] args) {
		
		// Vector de la clase empleado para guardar empleados
		Empleado[] empleados = new Empleado[50];
		double ayuda=0;
		//Vector con nombre aleatorios
		String[] nombres = {"Marcos","Juan","Jose","Daniel","Maria","Rosa"};
		for (int i = 0;i < empleados.length;i++) {
			int numero = i+1;
			ayuda = Math.random()*5;
			String nombre = nombres[(int)ayuda];
			Empleado nuevo = new Empleado(numero,nombre);			
			empleados[i] = new Empleado(numero,nombre);

		}
		
		for (int i = 0; i<empleados.length;i++) {
			System.out.println("Nombre del empleado "+empleados[i].getNombre()+" numero del empleado "+empleados[i].getNumero());
		}
		
	}
}

