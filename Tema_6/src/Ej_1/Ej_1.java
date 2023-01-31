package Ej_1;
import Ej_2.*;
public class Ej_1 {

	public static void main(String[] args) {
		Ej_2 prueba = new Ej_2();
		// TODO Auto-generated method stub
		int vector[] = new int [20];
		int media=0,cont=0;
		int mayor=0,igual=0,menor=0;
		double ayuda=0;
		for (int i = 0; i <vector.length;i++) {
			ayuda = Math.random()*10+1;
			vector[i]=(int)ayuda;
			System.out.println(vector[i]);
			media+=vector[i];
			cont++;
		}
		media = media/cont;
		for (int i = 0; i <vector.length;i++) {
			if(vector[i]>media) {
				mayor++;
			}else if(vector[i]<media) {
				menor++;
			}else {
				igual++;
			}
		}
		System.out.println("La media es " + media);
		System.out.println("Mayores "+mayor);
		System.out.println("Menores "+menor);
		System.out.println("Iguales "+igual);
	}

}
