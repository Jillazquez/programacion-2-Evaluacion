package Ej_11;

public class Main {

	public static void main(String[] args) {
		Animal[] animales = new Animal[100];
		int precio=0;
		for (int i = 0; i < animales.length; i++) {
			double ayuda = Math.random() * 3;
			int num = (int) ayuda;
			switch(num) {
			case 0:
				String[] razap = {"perro1","perro2"};
				ayuda=Math.random()*razap.length;
				int perro=(int)ayuda;
			animales[i]=new Perro(razap[perro], perro);
			precio=animales[i].calculoPrecio();
			System.out.println(animales[i]+" "+precio);
				break;
			case 1:
				String[] razag = {"gato1","gato2"};
				ayuda=Math.random()*razag.length;
				int gato=(int)ayuda;
			animales[i]=new Gato(razag[gato],(i % 2 == 0 ? true:false));
			precio=animales[i].calculoPrecio();
				break;
				
			case 2:
				
				break;
			}
			System.out.println(animales[i].raza+" "+precio);

		}

	}

}
