package Ejercicio_8;
import java.util.Scanner;
public class Menu {
	private String bebida, postre;
	private static Scanner teclado = new Scanner (System.in);
	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		if(bebida.equals("Vino")==true||bebida.equals("Agua")==true) {
		this.bebida = bebida;
		}else {
			this.bebida="Nada";
		}
	}

	public String getPostre() {
		return postre;
	}

	public void setPostre(String postre) {
		this.postre = postre;
	}
	public static void main (String[] args) {
		Plato p1 = new Plato("Bocadillo","Ensalada",15);
		Menu m1 = new Menu();
		
		System.out.println("El menu esta formado por el Plato numero uno esta formado por");
		System.out.println(p1.getNombre());
		System.out.println(p1.getCategoria());
		System.out.println("Y cuesta "+p1.getPrecio());
		System.out.println("Para beber Agua o Vino?");
		m1.setBebida(teclado.nextLine());
		System.out.println("Y de beber tendra "+m1.getBebida());
		
	}
}
