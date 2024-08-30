package com.playercommunication.multiprocess.player;

import com.playercommunication.multiprocess.mediator.PlayerMediator;

/**
 * Concrete implementation of the Player class.
 */
public class PlayerImpl extends Player{

	/**
	 * Constructs a new PlayerImpl instance.
	 *
	 * @param playerMediator the mediator used for communication
	 * @param playerName the name of the player
	 * @param isInitiator flag indicating if the player is the initiator
	 */
	public PlayerImpl(PlayerMediator playerMediator, String playerName, boolean isInitiator) {
		super(playerMediator, playerName, isInitiator);
	}

	/**
	 * Sends a message to another player.
	 *
	 * @param message the message to be sent
	 */
	@Override
	public synchronized void sendMessage(String message) {
		if (messageCount < MAX_MESSAGE_COUNT) {
			messageCount++;
			System.out.println(playerName + " sent: " + message + " (" + messageCount + ")");
			playerMediator.sendMessage(message + " (" + messageCount + ")", this);
		}
	}

	/**
	 * Receives a message from another player.
	 *
	 * @param message the message received
	 */
	@Override
	public synchronized void receiveMessage(String message) {
		if (messageCount < MAX_MESSAGE_COUNT) {
			messageCount++;
			System.out.println(playerName + " received: " + message);
			sendMessage("Reply to " + AUTO_REPLY_MESSAGE);
		}
	}

	/**
	 * Runs the player thread. If the player is the initiator, sends the initial message.
	 */
	@Override
	public void run() {
		if (isInitiator) {
			sendMessage("Hello");
		}
	}
}

