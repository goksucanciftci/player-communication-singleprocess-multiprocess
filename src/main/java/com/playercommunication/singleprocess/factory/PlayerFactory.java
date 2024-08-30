package com.playercommunication.singleprocess.factory;

import com.playercommunication.singleprocess.mediator.PlayerMediator;
import com.playercommunication.singleprocess.player.Player;
import com.playercommunication.singleprocess.player.PlayerImpl;
/**
 * Factory class for creating Player instances.
 */
public class PlayerFactory {
	/**
	 * Creates a new instance of Player.
	 *
	 * @param mediator The PlayerMediator instance to be used by the Player.
	 * @param name The name to be assigned to the Player.
	 * @return A new Player instance.
	 */
	public static Player createPlayer( PlayerMediator mediator,String name) {
		return new PlayerImpl(mediator, name);
	}
}