package Ej_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ayuda=0;
		int[] numero = new int[20];
		int[] com = new int [20];
		int contp=0,conti=numero.length-1;
		
		for(int i =0;i<numero.length;i++) {
			ayuda=Math.random()*101;
			numero[i]=(int)ayuda;
		}
		for(int i =0;i<numero.length;i++) {
			if(numero[i]%2==0) {
				com[contp]=numero[i];
				contp++;
			}else {
				com[conti]=numero[i];
				conti--;
			}
		}
		for(int i =0;i<numero.length;i++) {
			System.out.print(com[i]+" ");
		}
	}

}
