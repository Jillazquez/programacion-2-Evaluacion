package Ej_11;

public class Perro extends Animal{
	
	int comida;
	String raza;
	public Perro(String raza,int comida) {
		super(raza);
		this.comida=comida;
	}
	
	@Override
	public int calculoPrecio() {
		int precio=0;
		if(comida==1) {
			precio=valor+((valor/100)*10);
		}
		return precio;
	}

}
