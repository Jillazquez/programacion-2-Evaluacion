package Ej_5;

public class Mamifero extends Animal{
	
	
	public Mamifero(String patas, String raza) {
		super(patas, raza);
	}
	
	public void amamantar(){
		 System.out.println("El animal "+raza+" esta amamantando");
	 }
	

}
