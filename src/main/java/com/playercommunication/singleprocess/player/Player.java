package com.playercommunication.singleprocess.player;

import com.playercommunication.singleprocess.mediator.PlayerMediator;

public abstract class Player {

	// Mediator for communication between players
	protected PlayerMediator playerMediator;

	// Counter for the number of messages sent by the player
	protected int messageCount = 0;

	// Maximum number of messages a player can send
	protected static final int MAX_MESSAGE_COUNT = 10;

	// Default auto-reply message
	protected static final String AUTO_REPLY_MESSAGE = "Hello";

	// Name of the player
	protected String playerName;

	/**
	 * Constructs a Player with the given mediator and name.
	 *
	 * @param playerMediator The mediator used for player communication.
	 * @param playerName The name assigned to the player.
	 */
	public Player(PlayerMediator playerMediator, String playerName) {
		this.playerMediator = playerMediator;
		this.playerName = playerName;
	}

	/**
	 * Sends a message to another player through the mediator.
	 *
	 * @param message The message to be sent.
	 */
	public abstract void sendMessage(String message);

	/**
	 * Receives a message from another player.
	 *
	 * @param message The message received.
	 */
	public abstract void receiveMessage(String message);

}