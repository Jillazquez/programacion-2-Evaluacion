package Ej_7;

import java.util.Arrays;

public class Conjunto {
	int[] vector;
	double ayuda;
	int indice;

	public Conjunto() {
		vector = new int[100];
		ayuda = 0;
		indice = 0;
		// for (int i = 0; i < vector.length; i++) {
		// ayuda=Math.random()*500+1;
		// vector[i]=i*((int)ayuda);
		// System.out.println(vector[i]);
		// }
	}

	public void vacioVector() {
		Arrays.fill(vector, 0);
	}

	public void agregoVector() {
		ayuda = Math.random() * 1000 + 1;
		for (int i = 0; i <= indice; i++) {
			if ((int) ayuda == vector[i]) {
				i--;
				ayuda = Math.random() * 1000 + 1;
			}
		}
		vector[indice]=(int)ayuda;
		indice++;
	}

	public void eliminarVector(int posicion) {
		if(posicion>=0&&posicion<100) {
		vector[posicion]=0;
		}
	}

	public void copiarVector() {
		int[] vector2 = new int [100];
		for(int i = 0;i<vector.length;i++) {
			vector2[i]=vector[i];
		}
	}

	public boolean esMiembro(int numero) {
		for(int i =0;i<vector.length;i++) {
			if(numero==vector[i]) {
				return true;
			}
		}
		return false;

	}

	public void esIgual() {
		if(vector.equals(vector)==true)
			System.out.println("Verdadero");
		else 
				System.out.println("Falso");
	}

	public void imprimirVector() {
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}
}
