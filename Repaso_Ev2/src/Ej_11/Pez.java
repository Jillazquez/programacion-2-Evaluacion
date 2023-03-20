package Ej_11;

public class Pez extends Animal{
	String agua;
	
	public Pez(String raza) {
		super(raza);
		this.agua=agua;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int calculoPrecio() {
		int precio=0;
		if(agua.equals("Dulce")) {
			precio=valor+((valor/100)*20);
		}
		return precio;
	}

}
