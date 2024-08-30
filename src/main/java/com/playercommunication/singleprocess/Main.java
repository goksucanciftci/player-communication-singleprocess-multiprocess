package com.playercommunication.singleprocess;

import com.playercommunication.singleprocess.factory.PlayerFactory;
import com.playercommunication.singleprocess.mediator.PlayerMediatorImpl;
import com.playercommunication.singleprocess.player.Player;

/**
 * Main class to run the Player Communication application in single-process mode.
 */
public class Main {

	public static void main(String[] args) {

		// Create an instance of PlayerMediatorImpl to mediate communication between players.
		PlayerMediatorImpl mediator = new PlayerMediatorImpl();

		// Create two players using the PlayerFactory.
		Player player1 = PlayerFactory.createPlayer(mediator, "Player1");
		Player player2 = PlayerFactory.createPlayer(mediator, "Player2");

		// Set the two players in the mediator to establish communication links.
		mediator.setPlayer1(player1);
		mediator.setPlayer2(player2);

		// Player1 sends a message through the mediator and starts the process.
		player1.sendMessage("Hello");

	}
}