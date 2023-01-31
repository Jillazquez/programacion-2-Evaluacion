package Ej_2;

public class Ej_2 {
	
	public static int[] llenoVector(int num,int ran) {
		
		int prueba[] = new int [num];
		double ayuda = 0;
		for (int i = 0; i <prueba.length;i++) {
			ayuda = Math.random()*ran+1;
			prueba[i]=(int)ayuda;
		} 
		return prueba;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]vector1 = new int [10];
		int[]vector2 = new int [10];
		int[]vector3 = new int [10];
		double ayuda=0;
		vector1 = llenoVector(vector1.length,10);
		vector2 = llenoVector(vector2.length,10);
		vector3 = llenoVector(vector3.length,10);
		
		for (int i = 0; i <vector3.length;i++) {
			vector3[i]=vector1[i]+vector2[i];
			System.out.print(vector3[i]+",");
		} 
		
		
	}

}
