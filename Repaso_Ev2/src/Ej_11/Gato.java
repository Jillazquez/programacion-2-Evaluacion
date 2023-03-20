package Ej_11;

public class Gato extends Animal{
	
	String raza;
	boolean garras;
	public Gato(String raza,boolean garras) {
		super(raza);
		this.garras=garras;
	}
	
	@Override
	public int calculoPrecio() {
		int precio=0;
		if(garras) {
			precio=valor-((valor/100)*5);
		}
		return precio;
	}

}

