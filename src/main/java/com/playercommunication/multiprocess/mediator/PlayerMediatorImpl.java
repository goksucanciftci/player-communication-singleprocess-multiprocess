package com.playercommunication.multiprocess.mediator;

import com.playercommunication.multiprocess.player.Player;


/**
 * Implementation of the PlayerMediator interface.
 * Facilitates communication between two Player instances.
 */
public class PlayerMediatorImpl implements PlayerMediator{
	private Player player1;
	private Player player2;

	/**
	 * Sets the first player.
	 * @param player1 the first player instance
	 */
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	/**
	 * Sets the second player.
	 * @param player2 the second player instance
	 */
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	/**
	 * Sends a message from the sender to the other player.
	 * If the sender is player1, the message is sent to player2, and vice versa.
	 * @param message the message to be sent
	 * @param sender the player who is sending the message
	 */
	@Override
	public void sendMessage(String message, Player sender) {
		if (sender.equals(player1)) {
			player2.receiveMessage(message);
		} else {
			player1.receiveMessage(message);
		}
	}
}

