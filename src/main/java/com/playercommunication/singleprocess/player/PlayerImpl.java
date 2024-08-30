package com.playercommunication.singleprocess.player;

import com.playercommunication.singleprocess.mediator.PlayerMediator;

public class PlayerImpl extends Player{

	/**
	 * Constructs a PlayerImpl with the given mediator and name.
	 *
	 * @param playerMediator The mediator used for player communication.
	 * @param playerName The name assigned to the player.
	 */
	public PlayerImpl(PlayerMediator playerMediator, String playerName) {
		super(playerMediator, playerName);
	}

	/**
	 * Sends a message through the mediator, if the message count is within the limit.
	 *
	 * @param message The message to be sent.
	 */
	@Override
	public void sendMessage(String message) {
		if (messageCount < MAX_MESSAGE_COUNT) {
			messageCount++;
			System.out.println(playerName + " sent: " + message + " (" + messageCount + ")");
			playerMediator.sendMessage(message + " (" + messageCount + ")", this);
		}
	}

	/**
	 * Receives a message and responds with an automatic reply, if the message count is within the limit.
	 *
	 * @param message The message received.
	 */
	@Override
	public void receiveMessage(String message) {
		if (messageCount < MAX_MESSAGE_COUNT) {
			messageCount++;
			System.out.println(playerName + " received: " + message);
			sendMessage("Reply to " + AUTO_REPLY_MESSAGE);
		}
	}
}
