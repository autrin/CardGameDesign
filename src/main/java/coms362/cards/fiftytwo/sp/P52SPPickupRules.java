package coms362.cards.fiftytwo.sp;

import coms362.cards.abstractcomp.Move;
import coms362.cards.abstractcomp.Player;
import coms362.cards.abstractcomp.Table;
import coms362.cards.events.inbound.DetermineQuorumEvent;
import coms362.cards.events.inbound.InitGameEvent;
import coms362.cards.events.inbound.SetQuorumEvent;
import coms362.cards.fiftytwo.P52InitMove;
import coms362.cards.fiftytwo.P52Rules;
import coms362.cards.game.SetQuorumMove;
import coms362.cards.model.Quorum;

public class P52SPPickupRules extends P52Rules {

    @Override
    public Move apply(InitGameEvent e, Table table, Player player) {
        return new P52InitMove(table.getPlayerMap(), "52 Pickup Single Player", table);
    }

    @Override
    public Move apply(SetQuorumEvent e, Table table, Player player) {
        return new SetQuorumMove(new Quorum(1, 1));
    }

    @Override
    public Move apply(DetermineQuorumEvent e, Table table, Player player) {
        return new SetQuorumMove(new Quorum(1, 1));
    }

}
