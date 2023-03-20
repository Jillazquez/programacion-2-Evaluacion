package Ej_10;

import java.util.Scanner;

/*
 * Programa 3 en raya usando una matriz como tablero
 * @author Juan Manuel Illazquez Duñan
 */
public class Main {
	/*
	 * Metodo que consulta si algun jugador ha ganado la partida o si es turno final
	 * empate
	 */
	public static boolean hasGanado(int[][] juego, int juegos) {
		boolean acaba = false;
		if (juegos <= 8) {
			if (juego[0][0] == juego[0][1] && juego[0][1] == juego[0][2] && juego[0][0] != 0 && juego[0][1] != 0
					&& juego[0][2] != 0) {
				if (juego[0][0] == 1) {
					System.out.println("Gana el jugador 1");
					acaba = true;
					return acaba;
				} else {
					System.out.println("Gane el jugador 2");
					acaba = true;
					return acaba;
				}

			}
			if (juego[1][0] == juego[1][1] && juego[1][1] == juego[1][2] && juego[1][0] != 0 && juego[1][1] != 0
					&& juego[1][2] != 0) {
				if (juego[1][0] == 1) {
					System.out.println("Gana el jugador 1");
					acaba = true;
					return acaba;
				} else {
					System.out.println("Gane el jugador 2");
					acaba = true;
					return acaba;
				}

			}
			if (juego[2][0] == juego[2][1] && juego[2][1] == juego[2][2] && juego[2][0] != 0 && juego[2][1] != 0
					&& juego[2][2] != 0) {
				if (juego[2][0] == 1) {
					System.out.println("Gana el jugador 1");
					acaba = true;
					return acaba;
				} else {
					System.out.println("Gane el jugador 2");
					acaba = true;
					return acaba;
				}

			}

			if (juego[0][0] == juego[1][0] && juego[1][0] == juego[2][0] && juego[0][0] != 0 && juego[1][0] != 0
					&& juego[2][0] != 0) {
				if (juego[0][0] == 1) {
					System.out.println("Gana el jugador 1");
					acaba = true;
					return acaba;
				} else {
					System.out.println("Gane el jugador 2");
					acaba = true;
					return acaba;
				}

			}
			if (juego[0][1] == juego[1][1] && juego[1][1] == juego[2][1] && juego[0][1] != 0 && juego[1][1] != 0
					&& juego[2][1] != 0) {
				if (juego[0][1] == 1) {
					System.out.println("Gana el jugador 1");
					acaba = true;
					return acaba;
				} else {
					System.out.println("Gane el jugador 2");
					acaba = true;
					return acaba;
				}

			}
			if (juego[0][2] == juego[1][2] && juego[1][2] == juego[2][2] && juego[0][2] != 0 && juego[1][2] != 0
					&& juego[2][2] != 0) {
				if (juego[0][2] == 1) {
					System.out.println("Gana el jugador 1");
					acaba = true;
					return acaba;
				} else {
					System.out.println("Gane el jugador 2");
					acaba = true;
					return acaba;
				}

			}

			if (juego[0][0] == juego[1][1] && juego[1][1] == juego[2][2] && juego[0][0] != 0 && juego[1][1] != 0
					&& juego[2][2] != 0) {
				if (juego[0][0] == 1) {
					System.out.println("Gana el jugador 1");
					acaba = true;
					return acaba;
				} else {
					System.out.println("Gane el jugador 2");
					acaba = true;
					return acaba;
				}

			}
			if (juego[0][2] == juego[1][1] && juego[1][1] == juego[2][0] && juego[0][2] != 0 && juego[1][1] != 0
					&& juego[2][0] != 0) {
				if (juego[0][2] == 1) {
					System.out.println("Gana el jugador 1");
					acaba = true;
					return acaba;
				} else {
					System.out.println("Gane el jugador 2");
					acaba = true;
					return acaba;
				}

			}
		} else {
			System.out.println("Empate");
			acaba = true;
			return acaba;
		}
		return acaba;
	}

	/*
	 * Metodo que muestra el estado actual del tablero con las X y O de cada jugador
	 */
	public static void imprimeTablero(int[][] juego) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (juego[i][j] == 1) {
					System.out.print("[O]");
				} else if (juego[i][j] == 2) {
					System.out.print("[X]");
				} else if (juego[i][j] == 0) {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// TODO Auto-generated method stub
		int[][] juego = new int[3][3];
		int[] jugados = new int[9];
		boolean jugar = true;
		boolean acaba = false;
		boolean repetido = false;
		int posicion = 0, juegos = 0, ayuda = 0, seguimos = 0, ganauno = 0, ganados = 0, turno = 0;
		// Bucle infinito que controla si se sigue jugando o no
		while (jugar == true) {
			while (acaba == false) {
				do {
					ayuda = 0;
					turno = 1;
					System.out.println("Jugador 1 donde quieres jugar");
					posicion = teclado.nextInt();
					for (int i = 0; i < jugados.length; i++) {
						if (posicion == jugados[i] || posicion < 1 || posicion > 9) {
							repetido = true;
							ayuda = 0;
						} else
							ayuda++;
						if (ayuda == 9)
							repetido = false;
					}
				} while (repetido == true && juegos < 10);
				jugados[juegos] = posicion;
				juegos++;

				switch (posicion) {
				case 1:
					juego[0][0] = 1;
					break;
				case 2:
					juego[0][1] = 1;
					break;
				case 3:
					juego[0][2] = 1;
					break;
				case 4:
					juego[1][0] = 1;
					break;
				case 5:
					juego[1][1] = 1;
					break;
				case 6:
					juego[1][2] = 1;
					break;
				case 7:
					juego[2][0] = 1;
					break;
				case 8:
					juego[2][1] = 1;
					break;
				case 9:
					juego[2][2] = 1;
					break;
				}
				imprimeTablero(juego);
				acaba = hasGanado(juego, juegos);
				if (acaba == false) {
					do {
						ayuda = 0;
						turno = 2;
						System.out.println("Jugador 2 donde quieres jugar");
						posicion = teclado.nextInt();
						for (int i = 0; i < jugados.length; i++) {
							if (posicion == jugados[i] || posicion < 1 || posicion > 9) {
								repetido = true;
								ayuda = 0;
							} else
								ayuda++;
							if (ayuda == 9)
								repetido = false;
						}
					} while (repetido == true && juegos < 10);
					if (juegos < 9) {
						jugados[juegos] = posicion;
						juegos++;
						switch (posicion) {
						case 1:
							juego[0][0] = 2;
							break;
						case 2:
							juego[0][1] = 2;
							break;
						case 3:
							juego[0][2] = 2;
							break;
						case 4:
							juego[1][0] = 2;
							break;
						case 5:
							juego[1][1] = 2;
							break;
						case 6:
							juego[1][2] = 2;
							break;
						case 7:
							juego[2][0] = 2;
							break;
						case 8:
							juego[2][1] = 2;
							break;
						case 9:
							juego[2][2] = 2;
							break;
						}
					}
					imprimeTablero(juego);
					acaba = hasGanado(juego, juegos);
				}

			}
			if (turno == 1) {
				ganauno++;
			} else {
				ganados++;
			}
			System.out.println("Jugador 1 Quieres jugar otra vez? 0 Si 1 No");
			seguimos = teclado.nextInt();
			if (seguimos == 0) {
				System.out.println("Jugador 2 Quieres jugar otra vez? 0 Si 1 No");
				seguimos = teclado.nextInt();
				if (seguimos == 0) {
					jugar = true;
					acaba = false;
					juegos = 0;
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							juego[i][j] = 0;
						}
					}
					for (int i = 0; i < jugados.length; i++) {
						jugados[i] = 0;
					}
				} else {
					jugar = false;
					System.out.println("El jugador uno ha ganado " + ganauno);
					System.out.println("El jugador dos ha ganado " + ganados);
				}
			} else {
				jugar = false;
				System.out.println("El jugador uno ha ganado " + ganauno);
				System.out.println("El jugador dos ha ganado " + ganados);
			}
		}
	}

}
