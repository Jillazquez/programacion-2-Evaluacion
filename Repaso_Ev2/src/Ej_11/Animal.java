package Ej_11;

public abstract class Animal {
	
	int valor=60;
	int valorFinal;
	String raza;
	
	public Animal(String raza) {
		this.valorFinal=valor;
		this.raza=raza;
	}
	
	public abstract int calculoPrecio();
}
