package coms362.cards.events.inbound;

import coms362.cards.abstractcomp.Move;
import coms362.cards.abstractcomp.Player;
import coms362.cards.abstractcomp.RulesDispatch;
import coms362.cards.abstractcomp.Table;
import coms362.cards.model.Quorum;
import coms362.cards.socket.SocketMessage;


public class SetQuorumEvent implements Event, EventFactory {

	public static final String kId = "Quorumevent"; //kid for our event

	Quorum quorum = null;

	public SetQuorumEvent(String min, String max) {
		this.quorum = new Quorum(min, max);
	}

	public SetQuorumEvent(Quorum quorum) {
		this.quorum = quorum;
	}

	@Override
	public Move dispatch(RulesDispatch rules, Table table, Player player) {
		return rules.apply(this, table, player);
	}

	public Quorum getQuorum() {
		return quorum;
	}
	/**
	 * Creates a new quorum event with the specified number of players
	 * @param sktEvent event passed in from button (Ex: 4 players)
	 * @return a new Quorum Event
	 */
	public Event createEvent(SocketMessage sktEvent) {
		//need to get the first character, that will be min and max
		int secondIndex = sktEvent.toString().indexOf(' ');
		String playerCount = sktEvent.toString().substring(0, secondIndex);
		return new SetQuorumEvent(playerCount, playerCount);
	}

}
