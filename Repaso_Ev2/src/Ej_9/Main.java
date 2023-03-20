package Ej_9;

public class Main {
public static void main(String[] args) {
	Domino domino = new Domino();
	FichaDomino[] partida = new FichaDomino[7];
	for(int i =0;i<partida.length;i++) {
		int cont =0;
		partida[i]=domino.seleccionafichas();
		if(i>0) {
			for(int j=0;j<i;j++) {
				if(partida[i].ladoder==partida[j].ladoder&&partida[i].ladoizq==partida[j].ladoizq||partida[i].ladoder==partida[j].ladoizq&&partida[i].ladoizq==partida[j].ladoder) {
					cont =1;
				}
				}
			if(cont==0) {
			if(partida[i].encaja(partida[i-1])) {
				if(partida[i].ladoder==partida[i-1].ladoder)
					partida[i].giroficha();
					System.out.print(partida[i]);
			}else if(partida[i].ladoizq==partida[i-1].ladoder) {
				System.out.print(partida[i]);
			}else {
				i--;
			}
			}else
				i--;
		}
	}

	
}
}
