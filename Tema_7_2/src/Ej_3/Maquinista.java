package Ej_3;

public class Maquinista extends Empleado{
	private int nummaquina;
	private int tiempomaq;

	public Maquinista(String nombre, int sueldobase, int edad,int nummaquina,int tiempomaq) {
		super(nombre, sueldobase, edad);
		this.nummaquina = nummaquina;
		this.tiempomaq = tiempomaq;
	}


	@Override
	public void visualizarTodosDatos() {
		super.visualizarTodosDatos();
		System.out.println("EL número de máquinas asignadas es: " + nummaquina);
		System.out.println("El tiempo que lleva con la máquina es: " + tiempomaq);

	}

}
