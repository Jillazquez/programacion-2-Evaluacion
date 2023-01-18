package Ejercicio_2;

import Ejercicio_7.*;

public class Ej_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfazEmpleado i;
		Empleado e2;
		

		i = new InterfazEmpleado(new Empleado());
		
		//Ingreso datos
		i.verDatos();
		i.leerDatos();
		
		e2 = new Empleado();
		i = new InterfazEmpleado(e2);
		//Leo los datos
		i.verDatos();
		i.leerDatos();
		i.verDatos();
	}

}
