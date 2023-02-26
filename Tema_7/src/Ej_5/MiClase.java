package Ej_5;
import java.util.Scanner;
public class MiClase{

	private static int maximoc(int num1, int num2) {
		int maximo=0,menor=num1;
		if(num1>num2)
			menor=num2;
		for(int i =1;i<=menor;i++) {
			if(num1%i==0&&num2%i==0)
				maximo=i;
		}
		return maximo;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int num1=0,num2=0,mcd=0;
		
		System.out.println("Introduce el primer numero");
		num1= teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		num2=teclado.nextInt();
		
		mcd= maximoc(num1,num2);
		System.out.println(mcd);
	}
}
