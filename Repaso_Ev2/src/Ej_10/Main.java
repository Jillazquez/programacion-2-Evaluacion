package Ej_10;

public class Main {

	public static void main(String[] args) {
		Baraja b1 = new Baraja();
		Carta[] cartas = new Carta[10];
		int valorcartas=0;
		
		for(int i = 0;i<cartas.length;i++) {
			cartas[i] = b1.dameCarta();
			String carta = cartas[i].queCarta();
			valorcartas+=cartas[i].getValor();
		}
		System.out.println("Todas las cartas valen: "+valorcartas);

	}

}
