package com.playercommunication.multiprocess.factory;

import com.playercommunication.multiprocess.mediator.PlayerMediator;
import com.playercommunication.multiprocess.player.Player;
import com.playercommunication.multiprocess.player.PlayerImpl;

/**
 * Factory class for creating Player instances.
 */
public class PlayerFactory {
	/**
	 * Creates a new Player instance.
	 *
	 * @param mediator the mediator used for communication between players
	 * @param name the name of the player
	 * @param isInitiator flag indicating if the player is the initiator
	 * @return a new Player instance
	 */
	public static Player createPlayer( PlayerMediator mediator,String name, boolean isInitiator) {
		return new PlayerImpl(mediator, name, isInitiator);
	}
}
