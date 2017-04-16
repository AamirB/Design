package coinsflip;

import java.util.Scanner;

public class GamaManager {

	public static void main(String[] args) {
		CoinGame game = new CoinGame("Mark", "Henry");
		String usersAnswer;
		do {
			game.startGame();
			System.out.println("Play Again..?");
			Scanner play = new Scanner(System.in);
			usersAnswer = play.nextLine();
		} while ((usersAnswer.startsWith("y"))
				|| (usersAnswer.startsWith("Y")));

		System.out.println("Exiting the game...!!!");

	}

}
