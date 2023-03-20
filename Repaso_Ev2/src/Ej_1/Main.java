package Ej_1;

public class Main {
public static void main(String[] args) {
	int[]numero = new int[20];
	int[]cuadrado = new int[20];
	int[]cubo = new int[20];
	double ayuda=0;
	
	for(int i =0;i<numero.length;i++) {
		ayuda=Math.random()*101;
		numero[i]=(int)ayuda;
	}
	for(int i =0;i<numero.length;i++) {
		cuadrado[i]=(int)Math.pow(numero[i], 2);
		cubo[i]=(int)Math.pow(numero[i], 3);
	}
	for(int i =0;i<numero.length;i++) {
		System.out.println(numero[i]+" | "+cuadrado[i]+" | "+cubo[i]);
	}
	
}
}
