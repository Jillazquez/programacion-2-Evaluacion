package Ej_2;

public class Administrativo extends Persona{

	String estudios="";
	int numord=0;
	

	public String getEstudios() {
		return estudios;
	}


	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}


	public int getNumord() {
		return numord;
	}


	public void setNumord(int numord) {
		this.numord = numord;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	


	@Override
	public void visualizarTodosDatos() {
		
		
	}
	
}
