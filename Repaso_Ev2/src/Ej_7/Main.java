package Ej_7;

public class Main {

	public static void main(String[] args) {
		Ameba a1 = new Ameba();
		Ameba a2 = new Ameba();
		a1.come(5);
		a1.verpeso();
		a1.come(a2);
		a1.verpeso();
		a2.come(4);
	}

}
