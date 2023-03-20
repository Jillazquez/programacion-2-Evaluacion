package Ej_4;

public class Conductor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor p1 = new Profesor(null, 0, null, 0);
		Alumno a1 = new Alumno (null, 0, null, 0, null);
		
		p1.pedirDatos();
		a1.setEdad(p1.edad);
		p1.mostrarInfo();
		p1.masAlto();
	}

}
