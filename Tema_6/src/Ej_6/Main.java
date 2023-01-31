package Ej_6;
public class Main {
	public static void main(String args) {
		// Vector de la clase empleado para guardar empleados
		Empleado[] empleados = new Empleado[50];
		//Vector con nombre aleatorios
		String[] nombres = {"Marcos","Juan","Jose","Daniel","Maria","Rosa"};
		
		for (int i = 0;i < empleados.length;i++) {
			int numero = i+1;
			String nombre = nombres[(int)Math.random()*5];
			empleados[i] = new Empleado(numero,nombre);
		}
		System.out.println("asd");
		
		for (int i = 0; i<empleados.length;i++) {
			System.out.println(empleados[i]);
		}
		
	}
}
