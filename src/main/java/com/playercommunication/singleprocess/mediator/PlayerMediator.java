package com.playercommunication.singleprocess.mediator;

import com.playercommunication.singleprocess.player.Player;

/**
 * Interface for mediating communication between Player instances.
 */
public interface PlayerMediator {
	void sendMessage(String message, Player sender);
}

