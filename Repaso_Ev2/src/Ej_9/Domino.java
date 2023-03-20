package Ej_9;

public class Domino {
	
	FichaDomino[] fichas = new FichaDomino[28];
	
	int cont = 0;
	public Domino() {
		
		for(int i =0;i<=6;i++) {
			for(int j=i;j<=6;j++) {
				fichas[cont] = new FichaDomino(i,j);
				cont++;
			}
		}
	}
	public FichaDomino seleccionafichas() {
		FichaDomino[] f1 = new FichaDomino[7];
		int[] fic = new int[f1.length];
		int cont=0;
		for(int i =0;i<fic.length;i++) {
			fic[i]=-1;
		}
		
		for(int i =0;i<f1.length;i++) {
			cont=0;
				double ayuda=Math.random()*28;
				int num=(int)ayuda;
				for(int j=0;j<fic.length;j++) {
					if(fic[j]==num) {
						cont++;
					}
				}if(cont!=0) {
					i--;
				}else {
					f1[i]=fichas[num];
					fic[i]=num;
				}
				}
		return f1[0];
	}
	
	
}//finclass
