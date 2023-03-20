package Ej_5;

public class Canario extends Ave{
	String nombre;
	public Canario(String patas, String raza,String alas,String nombre) {
		super(patas, raza, nombre);
		this.nombre = nombre;
	}
	public void cantar() {
		System.out.println("El canario "+nombre+" esta cantando");
	}

}
