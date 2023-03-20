package Ej_9;

public class FichaDomino {
	int ladoizq=0,ladoder=0;
	
	public FichaDomino(int ladoizq,int ladoder) {
	
		this.ladoder=ladoder;
		this.ladoizq=ladoizq;
	}
	public void miroficha() {
		System.out.print("["+ladoizq+"|"+ladoder+"]");
	}
	
	public boolean encaja(FichaDomino otraficha) {
		return otraficha.ladoder==ladoder||otraficha.ladoder==ladoizq;
	}
	public void giroficha() {
		int moment=0;
		moment=ladoizq;
		ladoizq=ladoder;
		ladoder=moment;
	}
	
	public String toString() {
		return "["+ladoizq+"|"+ladoder+"]";
	}
}
