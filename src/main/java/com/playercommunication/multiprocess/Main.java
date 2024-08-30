package com.playercommunication.multiprocess;

import com.playercommunication.multiprocess.factory.PlayerFactory;
import com.playercommunication.multiprocess.mediator.PlayerMediatorImpl;
import com.playercommunication.multiprocess.player.Player;
/**
 * Main class to run the Player Communication application in multi-process mode.
 */
public class Main {
	public static void main(String[] args) {
		// Create the mediator for player communication
		PlayerMediatorImpl mediator = new PlayerMediatorImpl();

		// Create two players using the PlayerFactory
		Player player1 = PlayerFactory.createPlayer(mediator, "Player1", true);
		Player player2 = PlayerFactory.createPlayer(mediator, "Player2", false);

		// Set the players in the mediator
		mediator.setPlayer1(player1);
		mediator.setPlayer2(player2);

		// Create threads for each player
		Thread thread1 = new Thread(player1);
		Thread thread2 = new Thread(player2);

		// Start the threads
		thread1.start();
		thread2.start();
	}
}