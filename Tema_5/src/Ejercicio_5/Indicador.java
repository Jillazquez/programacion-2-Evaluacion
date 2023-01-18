package Ejercicio_5;

import java.util.Scanner;

public class Indicador {
	
	int velocidad,nivel,tacometro;
	
	public Indicador(int velocidad, int nivel, int tacometro) {
		this.velocidad = velocidad;
		this.nivel = nivel;
		this.tacometro = tacometro;
	}
	public int getVelocidad(){
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getNivel(){
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getTacometro(){
		return tacometro;
	}
	public void setTacometro(int tacometro) {
		this.tacometro = tacometro;
	}
	
	// método para imprimir los valores
    public void imprimirValores() {
        System.out.println("Velocidad actual: " + velocidad);
        System.out.println("Nivel actual: " + nivel);
        System.out.println("Tacómetro actual: " + tacometro);
    }
    
	public void ModificoValores() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Cuanto cambias la velocidad");
		this.velocidad = velocidad = teclado.nextInt();
		System.out.println("Cuanto cambia el nivel de la carretera");
		this.nivel = nivel = teclado.nextInt();
		System.out.println("A cuantas revoluciones va el tacometro");
		this.tacometro = tacometro = teclado.nextInt();
	}
	public void IncrementarValores() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Cuanto aumenta la velocidad");
		this.velocidad += velocidad = teclado.nextInt();
		System.out.println("Cuanto aumenta el nivel de la carretera");
		this.nivel += nivel = teclado.nextInt();
		System.out.println("A cuantas revoluciones sube el tacometro");
		this.tacometro += tacometro = teclado.nextInt();
	}
	public void ReducirValores() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Cuanto reduces la velocidad");
		this.velocidad -= velocidad = teclado.nextInt();
		System.out.println("Cuanto disminuye el nivel de la carretera");
		this.nivel -= nivel = teclado.nextInt();
		System.out.println("A cuantas revoluciones baja el tacometro");
		this.tacometro -= tacometro = teclado.nextInt();
	}
}
	
	
