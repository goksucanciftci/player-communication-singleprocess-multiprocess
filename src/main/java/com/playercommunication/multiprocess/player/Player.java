package com.playercommunication.multiprocess.player;

import com.playercommunication.multiprocess.mediator.PlayerMediator;
/**
 * Abstract class representing a player in the communication system.
 * Implements the Runnable interface to allow player instances to run on separate threads.
 */

public abstract class Player implements Runnable{

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

	// Flag indicating if the player is the initiator
	protected boolean isInitiator;


	/**
	 * Constructs a new Player instance.
	 *
	 * @param playerMediator the mediator used for communication
	 * @param playerName the name of the player
	 * @param isInitiator flag indicating if the player is the initiator
	 */

	public Player(PlayerMediator playerMediator, String playerName, boolean isInitiator) {
		this.playerMediator = playerMediator;
		this.playerName = playerName;
		this.isInitiator = isInitiator;
	}

	/**
	 * Sends a message to another player.
	 *
	 * @param message the message to be sent
	 */
	public abstract void sendMessage(String message);

	/**
	 * Receives a message from another player.
	 *
	 * @param message the message received
	 */
	public abstract void receiveMessage(String message);

}
