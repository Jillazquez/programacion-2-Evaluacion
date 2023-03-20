package Ej_5;

public class Gato extends Mamifero {

	String nombre;

	public Gato(String patas, String raza,String nombre) {
		super(patas, raza);
		this.nombre = nombre;
		// TODO Auto-generated constructor stub
	}
	public void maullar() {
		System.out.println("El gato "+nombre+" esta maullando");
	}
	public void pelea() {
		System.out.println("El gato "+nombre+" esta peleando");
	}
	
}
