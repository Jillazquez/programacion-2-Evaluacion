package Ej_5;

public class Animal {
	 String patas;
	 String raza;
	 
	 public Animal(String patas,String raza) {
		 this.patas=patas;
		 this.raza=raza;
	 }
	 
	 public void comer() {
		 System.out.println("El animal "+raza+" esta comiendo");
	 }
	 public void dormir(){
		 System.out.println("El animal "+raza+" esta durmiendo");
	 }
	 public void reproducir(){
		 System.out.println("El animal "+raza+" esta reproduciendose");
	 }
}
