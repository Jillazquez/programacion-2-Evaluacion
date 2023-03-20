package Ej_5;

public class Pinguino extends Ave{
	public Pinguino(String patas, String raza, String alas) {
		super(patas, raza, alas);
	}
	public void nadar() {
		System.out.println("El "+ raza+ " esta nadando");
	}
	@Override
	public void volar() {
		System.out.println("Los pinguinos no pueden volar");
	}

}
