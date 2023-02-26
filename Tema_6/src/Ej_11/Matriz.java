package Ej_11;

import java.util.Scanner;

public class Matriz {
	public static int[][] generaMatriz(int[][] m1) {
		double ayuda = 0;
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				ayuda = Math.random() * 10;
				m1[i][j] = (int) ayuda;
			}
		}
		return m1;
	}

	public static void muestraMatriz(int[][] m1) {
		int[][] comodin = m1;
		for (int i = 0; i < comodin.length; i++) {
			for (int j = 0; j < comodin[0].length; j++) {
				System.out.print("[" + comodin[i][j] + "]");
			}
			System.out.println();
		}
	}

	public static void sumaMatriz(int[][] m1, int[][] m2) {
		if (m1.length == m2.length && m1[0].length == m2[0].length) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					int num = m1[i][j] + m2[i][j];
					System.out.print("[" + num + "]");
				}
				System.out.println();
			}
		} else {
			System.out.println("No se pueden sumar pues no tienen las mismas dimensiones");
		}
	}

	public static void restaMatriz(int[][] m1, int[][] m2) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int num = m1[i][j] - m2[i][j];
				System.out.print("[" + num + "]");
			}
			System.out.println();
		}
	}

	public static void celdaMatriz(int[][] m1, int f, int c) {
		System.out.println("[" + m1[f][c] + "]");
	}

	public static void cambiarCelda(int[][] m1) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Que fila quieres cambiar");
		int f = teclado.nextInt();
		System.out.println("Que celda quieres cambiar");
		int c = teclado.nextInt();
		System.out.println("A que numero lo quieres cambiar");
		int valor = teclado.nextInt();

		m1[f][c] = valor;
	}

	public static void filasColumnas(int[][] m1) {
		System.out.println("La matriz tiene " + m1.length + " filas y " + m1[0].length + " columnas");
	}

	public static void multiplicarMatrices(int[][] m1, int[][] m2) {
		int numero=0;
		int [][] transito = new int [m1.length][m2[0].length];
		for(int i =0;i<m1.length;i++) {
			numero=0;
			for(int j =0;j <m2[0].length;j++) {
				for(int k=0;k<m1[0].length;k++) {
					numero +=m1[i][j]+m2[j][k];
				}
				transito[i][j]=numero;
			}
				
		}
		
		 System.out.println("Resultado de la multiplicación:");
		    for (int i = 0; i < m1.length; i++) {
		        for (int j = 0; j < m2[0].length; j++) {
		            System.out.print("["+transito[i][j] + "]");
		        }
		        System.out.println();
		    }
		
	}

	public static void main(String[] args) {
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];

		m1 = generaMatriz(m1);
		m2 = generaMatriz(m2);
		muestraMatriz(m1);
		muestraMatriz(m2);
		sumaMatriz(m1, m2);
		// restaMatriz(m1,m2);
		// celdaMatriz(m1,0,0);
		// cambiarCelda(m1);
		// muestraMatriz(m1);
		filasColumnas(m1);
		multiplicarMatrices(m1, m2);

	}
}
