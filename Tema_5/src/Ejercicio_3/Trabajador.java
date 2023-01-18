package Ejercicio_3;

import java.util.Scanner;

public class Trabajador {
	int numero, titulacion, años;
	String nombre;
	char estado, turno;

	public Trabajador(int numero, int titulacion, int años, String nombre, char estado, char turno) {
		this.numero = numero;
		this.titulacion = titulacion;
		this.años = años;
		this.nombre = nombre;
		this.estado = estado;
		this.turno = turno;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(int titulacion) {
		this.titulacion = titulacion;
	}

	public int getAños() {
		return años;
	}

	public void setAños(int años) {
		this.años = años;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

	// Metodo asignar valores predeterminados a nuevo trabajador
	public void nuevoTrabajador() {
		numero = 1;
		titulacion = 2;
		años = 0;
		nombre = "Juan";
		estado = 'S';
		turno = 'D';
	}

	// Metodo Modificar los datos de un trabajador
	public void modificarTrabajador() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Como se llama");
		nombre = teclado.nextLine();
			System.out.println("Numero del empleado");
			numero = teclado.nextInt();
		System.out.println("Cuantos años lleva en la empresa");
		años = teclado.nextInt();
		
		do {
			System.out.println("Que titulacion tiene");
			titulacion = teclado.nextInt();
		} while (titulacion < 0 || titulacion > 4);
			System.out.println("Que estado civil tiene");
			estado = teclado.next().charAt(0);
			System.out.println("Que turno trabaja");
			turno = teclado.next().charAt(0);
	}

	// Metodo que muestra por pantalla todos los datos de el trabajador
	public void leerTrabajador() {
		System.out.println("Se llama" + nombre);
		System.out.println("Titulacion" + titulacion);
		System.out.println("Lleva trabajando " + años);
		System.out.println("Su identifucador es " + numero);
		System.out.println("Estado civil " + estado);
		System.out.println("Turno " + turno);
	}

	// Metodo que calcula la nomina de un trabajador
	public void nominaTrabajador() {
		double nomina = 425;
		if (turno == 'N') {
			nomina = nomina + 100;
		}
		nomina = nomina + (75 * años);
		switch (titulacion) {
		case 0:
			nomina += 250;
			break;
		case 1:
			nomina += 500;
			break;
		case 2:
			nomina += 1000;
			break;
		case 3:
			nomina += 1250;
			break;
		case 4:
			nomina += 1500;
			break;
		}
		if (estado == 'S') {
			nomina = nomina - (nomina * 0.12);
		} else if (estado == 'C') {
			nomina = nomina - (nomina * 0.1);
		}
		System.out.println("La nomina total se queda en " + nomina);
	}
}
