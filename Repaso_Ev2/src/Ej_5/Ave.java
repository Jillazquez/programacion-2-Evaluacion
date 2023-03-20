package Ej_5;

public class Ave extends Animal{
	
	String alas;
	
	public Ave(String patas, String raza,String alas) {
		super(patas, raza);
		this.alas=alas;
	}
	
	public void volar(){
		System.out.println("El animal "+raza+" esta volando");
	}
}
