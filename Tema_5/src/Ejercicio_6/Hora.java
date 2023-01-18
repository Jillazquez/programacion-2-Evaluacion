package Ejercicio_6;

import java.util.Scanner;

public class Hora {

	int hora, minutos, segundos;

	public Hora(int hora, int minutos, int segundos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;

	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	// Metodo que leee la hora y la muestra en formatro hh:mm:ss
	public void leeHora() {
		System.out.println(hora + ":" + minutos + ":" + segundos);
	}

	public void modificarHora() {
		int horas,minutos,segundos;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Suma o resta los segundos");
		segundos = teclado.nextInt();
		if (segundos >= 0) {
			this.segundos = this.segundos + segundos;
			if (this.segundos > 60) {
				this.segundos -= 60;
				this.minutos++;
			}
		} else {
			this.segundos += segundos;
			if (this.segundos < 0) {
				this.segundos += 60;
				this.minutos--;
			}
		}
		System.out.println("Suma o resta los minutos");
		minutos = teclado.nextInt();
		if (minutos >= 0) {
			this.minutos += minutos;
			
			if (this.minutos > 60) {
				this.minutos -= 60;
				this.hora++;
			}
		} else {
			this.minutos += minutos;
			if (this.minutos < 0) {
				this.minutos += 60;
				this.hora--;
			}
		}
		System.out.println("Suma o resta las horas");
		horas = teclado.nextInt();
		this.hora+=horas;
		if(this.hora<0) {
			this.hora=0;
		}
	}
	public void ImprimirHora(int horan, int minutosn, int segundosn) {
		System.out.println(horan+":"+minutosn+":"+segundosn);
	}

}
