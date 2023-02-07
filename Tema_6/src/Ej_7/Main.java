package Ej_7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conjunto a = new Conjunto();
		for(int i = 0;i<100;i++) {
		a.agregoVector();
		}
		a.imprimirVector();
		a.eliminarVector(15);
		if(a.esMiembro(16)==true){
			System.out.println("Se repite el numero");
		}else{
			System.out.println("No se repite");
		}
	}

}
