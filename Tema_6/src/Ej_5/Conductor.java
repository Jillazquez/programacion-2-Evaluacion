package Ej_5;

public class Conductor {

	public static void main(String[] args) {
		
		Coleccion coleccion = new Coleccion();
		
		Disco disco1 = new Disco(1,13245,"1-1-2000","Mio");
		Disco disco2 = new Disco(1,1524,"1-1-2000","Nadie");
		Disco disco3 = new Disco(1,12465,"1-1-2000","A");
		Disco disco4 = new Disco(1,1523,"1-1-2000","No se");
		Disco disco5 = new Disco(1,1215,"1-1-2000","alguien");
		Disco disco6 = new Disco(1,153,"1-1-2000","Tuyo");
		Disco disco7 = new Disco(1,153,"1-1-2000","Suyo");
		Disco disco8 = new Disco(1,135,"1-1-2000","Mio");
		Disco disco9 = new Disco(1,115,"1-1-2000","Mio");
		Disco disco10 = new Disco(1,145,"1-1-2000","Mio");
		
		coleccion.Metodisco(disco3);
		coleccion.Metodisco(disco2);
		coleccion.Metodisco(disco10);
		coleccion.eliminarDisco(0);
		coleccion.mostrarDiscos();
	}

}
