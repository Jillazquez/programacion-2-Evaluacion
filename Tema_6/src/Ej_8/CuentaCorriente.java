package Ej_8;

import java.util.Scanner;

public class CuentaCorriente {
	float saldo;
	int codigo;
	String titular;

	
	 public CuentaCorriente(float saldo, int codigo, String titular) {
		this.saldo = saldo;
		this.codigo = codigo;
	this.titular = titular;

	}
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getTirular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	// Metodo para ingresar dinero y actualizar el saldo
	public void IngresoDinero() {
		int suma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuando dinero vas a ingresar?");
		suma = teclado.nextInt();
		saldo = saldo + suma;
		System.out.println("Su saldo es de: " + saldo);
		
	}
	public boolean PuedoSacar(float saldo,float retiro) {
		boolean dinero=false;
		if(retiro>saldo) {
			dinero = false;
		}else {
			dinero = true;
		}
		return dinero;
	}
	public void RetiroDinero() {
		Scanner teclado = new Scanner(System.in);
		float retiro = 0;
		boolean dinero = false;
		System.out.println("Cuanto dinero quieres retirar");
		retiro = teclado.nextFloat();
		dinero = PuedoSacar(saldo,retiro);
		if(dinero == true) {
			saldo = saldo - retiro;
			System.out.println("Su salario actual es: " + saldo);
		}else if ( dinero == false) {
			System.out.println("No dispone de saldo suficiente");
			System.out.println("Pulse return para continuar");
		}
	}
}
