package com.playercommunication.multiprocess.mediator;

import com.playercommunication.multiprocess.player.Player;

/**
 * Interface for mediating communication between Player instances.
 */
public interface PlayerMediator {
	/**
	 * Sends a message from the sender to the appropriate recipient.
	 *
	 * @param message the message to be sent
	 * @param sender the player who is sending the message
	 */
	void sendMessage(String message, Player sender);
}