package Ej_4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean seguir = true;
		int[] mesa = new int[5];
		while (seguir) {
			int mas = 0;
			System.out.println("Bienvenido al restaurante");
			System.out.println("Cuantos clientes son?");
			int cliente = sc.nextInt();
			if (cliente > 4) {
				System.out.println("Lo sentimos no aceptamos grupos de " + cliente + " el maximo es 4");
			} else {
				boolean mesaEncontrada = false;
				for (int i = 0; i < mesa.length; i++) {
					if (mesa[i] == 0) {
						mesa[i] = cliente;
						mesaEncontrada = true;
						System.out.println("Por favor, síganme a la mesa número " + (i));
						break;
					}
				}
				if (!mesaEncontrada)
					System.out.println("Lo sentimos todas las mesas estan ocupadas");
				System.out.println("Ha terminado algun cliente de comer?");
				int num = sc.nextInt();
				if (num == 1) {
					System.out.println("Que mesa?");
					int vaciar = sc.nextInt();
					if (mesa[vaciar] != 0) {
						System.out.println("La mesa " + vaciar + " ha sido vaciada");
						mesa[vaciar] = 0;
					}
				}
				System.out.println("Viene otro cliente?");
				mas = sc.nextInt();
				if (mas == 1)
					seguir = false;
			}
		}
	}
}
