package Ej_3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double mediaEm=0,mediaMa=0,mediaAd=0;
		int numEm=0,numMa=0,numAd=0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Número de empleados administrativos: ");
        int numAdministrativos = teclado.nextInt();
        System.out.print("Número de maquinistas: ");
        int numMaquinistas = teclado.nextInt();
        System.out.println("Numero de Empleados");
        int numEmpleados = teclado.nextInt();
        
        
        Empleado[] empleados = new Empleado[numAdministrativos+numMaquinistas+numEmpleados];
       
        
        System.out.println("Introduce los datos de los empleados");
        for(int i =0;i<numEmpleados;i++) {
        	int sueldobase=1000;
        	System.out.println("Edad: ");
        	int edad = teclado.nextInt();
        	System.out.println("Nombre: ");
        	teclado.nextLine();
        	String nombre = teclado.nextLine();
        	empleados[i] = new Empleado(nombre,sueldobase,edad);
        }
       
        
        System.out.println("Introduce los datos de los maquinistas:");
        for (int i = 0; i < numMaquinistas; i++) {
            System.out.println("Maquinista numero:" + (i+1));
            System.out.print("Nombre: ");
            String nombre = teclado.next();
            System.out.print("Edad: ");
            int edad = teclado.nextInt();
            System.out.print("Sueldo base: ");
            int sueldobase = teclado.nextInt();
            System.out.print("Número de máquina: ");
            int nummaquina = teclado.nextInt();
            System.out.print("Años con la máquina: ");
            int tiempomaq = teclado.nextInt();
            empleados[i+numEmpleados] = new Maquinista(nombre, sueldobase, edad, nummaquina, tiempomaq);
        }
        
        System.out.println("Introduce los datos de los administrativos:");
        for (int i = 0; i < numAdministrativos; i++) {
            System.out.println("Administrativo numero:" + (i+1));
            System.out.print("Nombre: ");
            String nombre = teclado.next();
            System.out.print("Edad: ");
            int edad = teclado.nextInt();
            System.out.print("Sueldo base: ");
            int sueldobase = teclado.nextInt();
            System.out.print("Estudios: ");
            teclado.nextLine();
            String estudios = teclado.nextLine();
            System.out.print("Numero ordenadores: ");
            int numord = teclado.nextInt();
            empleados[numMaquinistas+numEmpleados+i] = new Administrativo(nombre, sueldobase, edad, estudios, numord);
        }
        
        System.out.println("Visualizar datos");
        for(int i =0;i<numEmpleados+numAdministrativos+numMaquinistas;i++) {
        	if(empleados[i] instanceof Empleado) {
        		System.out.println("Datos Empleado");
        	}
        	if(empleados[i] instanceof Administrativo) {
        		System.out.println("Datos Administrativo");
        	}
        	if(empleados[i] instanceof Maquinista) {
        		System.out.println("Datos Maquinista");
        	}
        	empleados[i].visualizarTodosDatos();
        }
        
        System.out.println("Media Empleados");
        for(int i =0;i<numEmpleados+numAdministrativos+numMaquinistas;i++) {
        	if(empleados[i] instanceof Administrativo) {
        		numAd++;
        		mediaAd+=empleados[i].getEdad();
        	}
        	if(empleados[i] instanceof Maquinista) {
        		numMa++;
        		mediaMa+=empleados[i].getEdad();
        	}
        	if(empleados[i] instanceof Empleado) {
        		numEm++;
        		mediaEm+=empleados[i].getEdad();
        	}
        }
        mediaAd=mediaAd/numAd;
        mediaMa=mediaMa/numMa;
        mediaEm=mediaEm/numEm;
        System.out.println("Edad media Administrativos: "+mediaAd);
        System.out.println("Edad media Maqunistas: "+mediaMa);
        System.out.println("Edad media Empleados: "+mediaEm);
        
        
	}

}
