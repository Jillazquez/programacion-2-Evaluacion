package Ej_10;

public class Baraja {
	private Carta[] baraja = new Carta[40];
	
	public Baraja() {
		
	}
	
	
	public Carta dameCarta() {
		int cont=0;
		for(int i =0;i<4;i++) {
			for(int j=1;j<=10;j++) {
				baraja[cont] = new Carta(j,i);
				cont++;
			}
		}
		double ayuda = Math.random()*40;
		int num =(int)ayuda;
		return baraja[num];
	}
		
}
