package Ej_8;

public class Libro extends Publicacion implements Prestable {
	
	boolean prestado;
	
	public Libro(int ISBN, int aniopublicaion, String titulo) {
		super(ISBN, aniopublicaion, titulo);
		prestado=false;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void presta() {
		if(prestado=false)
			System.out.println("Disfruta el libro devuelvelo en 3 dias");
			prestado=true;
	}

	@Override
	public void devuelve() {
		prestado=false;
		
	}

	@Override
	public void estaPrestado() {
		if(prestado=true)
			System.out.println("El libro esta prestado");
		else
			System.out.println("El libro no esta prestado");
	}

}
