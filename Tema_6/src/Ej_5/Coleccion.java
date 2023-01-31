package Ej_5;

import java.util.Scanner;

public class Coleccion {
	private Disco[] discos;
    private int indice;
  
    public Coleccion() {
    	discos = new Disco[100];
        indice = 0;
    }

	public void Metodisco(Disco d) {
		 if (indice < 100) {
	            discos[indice] = d;
	            indice++;
	        } else {
	            System.out.println("La colección está llena, no se pueden insertar más discos.");
	        }
	}

	public void eliminarDisco(int posicion) {
        if (posicion >= 0 && posicion < indice) {
            for (int i = posicion; i < indice - 1; i++) {
                discos[i] = discos[i + 1];
            }
            indice--;
        } else {
            System.out.println("La posición especificada no es válida.");
        }
    }
	public void mostrarDiscos() {
        for (int i = 0; i < indice; i++) {
            System.out.println(discos[i].toString());
        }
    }
}
