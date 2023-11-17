package coms362.cards.events.inbound;

import coms362.cards.abstractcomp.Move;
import coms362.cards.abstractcomp.Player;
import coms362.cards.abstractcomp.RulesDispatch;
import coms362.cards.abstractcomp.Table;

public class DetermineQuorumEvent implements Event{

    @Override
    public Move dispatch(RulesDispatch rules, Table table, Player player) {
        // TODO Auto-generated method stub
        return rules.apply(this, table, player);
    }
    
}
