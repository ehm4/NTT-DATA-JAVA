package nttdata.javat1.game;

import java.util.Scanner;

public class Game {
	String opcion;
	Ball b;
	Map m;
	Score s;

	/**
	 * Constructor
	 */
	
	public Game() {

		this.b = new Ball();
		this.m = new Map();
		this.s = new Score(this.b);

	}

	/**
	 * Method to play pinball
	 */

	public void launchAndStart() {
		Scanner t = new Scanner(System.in);
		int balls = 5;
		do {
			// Print menu
			System.out.println("Introduzca el número de la opción que quiere elegir:");
			System.out.println("1. Iniciar juego");
			System.out.println("2. Reiniciar puntuación");
			System.out.println("3. Ver puntuación");
			System.out.println("4. Salir");
			System.out.println("Le quedan: " + balls + " bolas");
			opcion = System.console().readLine();
			// If opcion is 1: play game
			if (opcion.equals("1")) {
				if (balls > 0) {
					do {
						b.setX((int) (Math.random() * 30));
						b.setY((int) (Math.random() * 30));
						switch (m.getMap(b.getX(), b.getY())) {
						case "P":
							System.out.println("La bola ha entrado en un agujero, ha perdido la bola");
							b.setY(0);
							break;
						case "O":
							System.out.println(
									"La bola se ha encontrado con un obstáculo, se restará a la puntuación 100 ptos.");
							s.updateScore(-100);
							break;
						case "A":
							System.out.println(
									"La bola se ha encontrado con un aumento, se sumará a la puntuación 200 ptos.");
							s.updateScore(200);
							break;
						case "B":
							System.out.println("La bola se ha encontrado con un bonus, se sumará una bola.");
							balls++;
							break;
						default:
						}
					} while (b.getY() != 0);
					balls--;
				} else {
					System.out.println("Lo siento se ha quedado sin bolas");
				}
			}
			// If opcion is 2: reset score
			if (opcion.equals("2")) {
				s.resetScore();
				System.out.println("Ha reseteado su puntuación");
			}
			// If opcion is 3: print score
			if (opcion.equals("3")) {
				System.out.println(s.getScore());
			}
			System.out.println("-------------------------------------------------------");
			// If opcion is 4: exit
		} while (!opcion.equals("4"));

		// Print total score
		// Ask if they want to play again
		System.out.println("Gracias por jugar :)");
		System.out.println("Ha obtenido un total de: " + s.getScore());
		System.out.println("¿Quiere volver a jugar? (Y/N)");
		String response = System.console().readLine();
		// Control of response, if it's not "Y" or "N", ask again
		if (!response.equals("Y") && !response.equals("N")) {
			do {
				System.out.println("Lo siento, ha introducido un carácter erróneo.");
				System.out.println("¿Quiere volver a jugar? (Y/N)");
				response = System.console().readLine();
			} while (!response.equals("Y") && !response.equals("N"));
		}
		// If response is "Y": play again
		if (response.equals("Y")) {
			s.resetScore();
			this.launchAndStart();
		}
		// If response is "N": exit game
		else {
			System.out.println("-------------------------------------------------------");
			System.out.println("Espero que le haya gustado.");
			t.close();
		}
	}
}
