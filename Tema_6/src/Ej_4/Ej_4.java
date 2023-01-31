package Ej_4;
import Ej_2.*;
public class Ej_4 {

	public static void main(String[] args) {
		Ej_2 ayuda = new Ej_2();
		// TODO Auto-generated method stub
		int[] vector1 = new int [10];
		int[] vector2 = new int [10];
		int[] cont = new int[10];
		int cuantas;
		vector1 = ayuda.llenoVector(vector1.length, 5);
		vector2 = ayuda.llenoVector(vector1.length, 5);
		
		for (int i = 0;i<vector1.length;i++) {
			cuantas=0;
			for(int j = 0;j<vector2.length;j++) {
				if(vector2[j]==vector1[i]) {
					cuantas++;
				}
			}
			cont[i]=cuantas;
		}
		
		
		for(int i = 0 ;i <vector1.length;i++) {
			System.out.println("Elemento ["+i+"] "+"("+vector1[i]+") "+cont[i]+"veces");
		}
		
	}

}
