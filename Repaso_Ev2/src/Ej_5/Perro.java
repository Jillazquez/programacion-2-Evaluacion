package Ej_5;

public class Perro extends Mamifero{
	String nombre;
	public Perro(String patas, String raza,String nombre) {
		super(patas, raza);
		this.nombre=nombre;
		// TODO Auto-generated constructor stub
	}
	public void ladrar() {
		System.out.println("El perro "+nombre+" esta ladrando");
	}
}
