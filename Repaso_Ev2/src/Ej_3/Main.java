package Ej_3;

public class Main {

	public static void main(String[] args) {
		int[] numero = new int [100];
		double ayuda=0;
		int mayor=0,menor=numero.length;
		for(int i =0;i<numero.length;i++) {
			ayuda=Math.random()*401+100;
			numero[i]=(int)ayuda;
			if(numero[i]>mayor)
				mayor=numero[i];
			if(numero[i]<menor)
				menor=numero[i];
		}
		System.out.println(mayor);
		System.out.println(menor);
	}

}
