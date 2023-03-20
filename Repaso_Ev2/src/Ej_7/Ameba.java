package Ej_7;

public class Ameba {
	private int peso=3;
	
	public void verpeso() {
		System.out.println("La ameba pesa "+peso);
	}
	
	public void come(int comida) {
		if(peso==0) {
			System.out.println("Esta ameba ya no puede comer");
		}else {
		peso+= (comida-1);
		}
	}
	
	public void come(Ameba ameba) {
		if(peso==0) {
			System.out.println("Esta ameba ya no puede comer");
		}else {
		if(peso<ameba.peso) {
			System.out.println("No se puede comer una ameba mas grande que ella");
		}else {
			peso+=(ameba.peso-1);
			ameba.peso=0;
		}
		}
	}	
}
