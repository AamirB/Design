package coinsflip;

import java.util.Scanner;

public class CoinGame {

	Player player[] = new Player[2];
	Coin coin;
	CoinGame(String p1, String p2) {
		player[0] = new Player(p1);
		player[1] = new Player(p2);
		coin = new Coin();
	}

	public void startGame() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur coin side 0 or 1 " + player[0].getName());
		String choice1 = sc.next();
		player[0].setOptions(choice1);
		System.out.println("Enter ur coin side 0 or 1 " + player[1].getName());
		String choice2 = sc.next();
		player[1].setOptions(choice2);
		String winningSide = coin.flipped();
		System.out.println("Results is " + winningSide);
		player[0].didPlayerWin(winningSide);
		player[1].didPlayerWin(winningSide);
	}

}
