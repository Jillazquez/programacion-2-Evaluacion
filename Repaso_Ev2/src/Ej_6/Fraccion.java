package Ej_6;

public class Fraccion {
	int numerador=0;
	int denominador=0;
	public Fraccion(int numerador,int denominador) {
		this.numerador=numerador;
		this.denominador=denominador;
	}
	public void invertir() {
		System.out.println(denominador);
		System.out.println("-");
		System.out.println(numerador);
	}
	public void sumar() {
		System.out.println(numerador+numerador);
		System.out.println("-");
		System.out.println(denominador);
	}
	public void multiplicaar() {
		System.out.println(numerador*numerador);
		System.out.println("-");
		System.out.println(denominador*denominador);
	}
	public void simplificar() {
		int menor=numerador;
		if(menor>denominador)
			menor=denominador;
		for(int i =2;i<=menor;i++) {
			if(numerador%2==0&&denominador%2==0) {
				numerador=numerador/i;
				denominador=denominador/i;
			}
			System.out.println(numerador);
			System.out.println("-");
			System.out.println(denominador);
		}
	}
	
}
