package Ej_10;

public class Carta {

	private int valor;
	private int palo;
	public Carta(int valor,int palo) {
		this.valor=valor;
		this.palo=palo;
	}
	public String queCarta() {
		String carta="";
		int num=0;
		if(valor>7) {
			switch(valor) {
			case 8:
				carta+="Sota";
				break;
			case 9:
				carta+="Caballo";
				break;
			case 10:
				carta+="Rey";
				break;
			}
		}else {
			carta+=valor;
		}
		switch(palo) {
		case 0:
			carta+=" de oros";
			break;
		case 1:
			carta+=" de bastos";
			break;
		case 2:
			carta+=" de espadas";
			break;
		case 3:
			carta+=" de copas";
			break;
		}
		System.out.println(carta);
		return carta;
	}
	
	public int getValor() {
		if(valor>7) {
			valor+=2;
		}
		return valor;
	}
	
	public String toString() {
		String carta="";
		int num=0;
		if(valor>7) {
			switch(valor) {
			case 8:
				carta+="Sota";
				break;
			case 9:
				carta+="Caballo";
				break;
			case 10:
				carta+="Rey";
				break;
			}
		}else {
			carta+=valor;
		}
		switch(palo) {
		case 0:
			carta+=" de oros";
			break;
		case 1:
			carta+=" de bastos";
			break;
		case 2:
			carta+=" de espadas";
			break;
		case 3:
			carta+=" de copas";
			break;
		}
		return carta;
	}
}
