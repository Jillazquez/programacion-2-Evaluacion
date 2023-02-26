package Ej_3;

public class Jefe extends Empleado{
	
	int bonusjefe=250;
	String departamento ="";

	public Jefe(int sueldobase, String nombreE, String nombre, int edad, int porcentaje) {
		super(sueldobase, nombreE, nombre, edad, porcentaje);
		this.bonusjefe = bonusjefe;
		this.departamento = departamento;
	}

	public int getBonusjefe() {
		return bonusjefe;
	}

	public void setBonusjefe(int bonusjefe) {
		this.bonusjefe = bonusjefe;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	

}
