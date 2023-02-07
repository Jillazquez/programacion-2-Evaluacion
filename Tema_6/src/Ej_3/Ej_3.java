package Ej_3;
import Ej_2.*;
public class Ej_3 {

	public static void main(String[] args) {
		Ej_2 lleno = new Ej_2();
		// TODO Auto-generated method stub
		
		int[] vector = new int [10];
		int mayor=0,posma=0,posme=0,menor=vector.length;
		vector = lleno.llenoVector(vector.length,10);
		for (int i = 0; i<vector.length;i++) {
			if(vector[i]>mayor) {
				mayor=vector[i];
				posma=i;
			}
			if(vector[i]<menor) {
				menor=vector[i];
				posme=i;
			}
		}
		System.out.println("El numero mayor es "+mayor +" Y su posicion es "+posma);
		System.out.println("El numero menor es "+menor +" Y su posicion es "+posme);
	}

}
