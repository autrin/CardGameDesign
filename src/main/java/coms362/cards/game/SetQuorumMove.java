package coms362.cards.game;

import coms362.cards.abstractcomp.Move;
import coms362.cards.abstractcomp.Table;
import coms362.cards.app.ViewFacade;
import coms362.cards.events.remote.HideButtonRemote;
import coms362.cards.model.Quorum;

public class SetQuorumMove implements Move {

    private Quorum quorum;
    private int[] playerCounts;

    public SetQuorumMove(Quorum quorum) {
        this.quorum = quorum;
    }

    public SetQuorumMove(Quorum quorum, int[] playerCounts) {
        this.playerCounts = playerCounts;
        this.quorum = quorum;
    }

    @Override
    public void apply(Table table) {
        table.setQuorum(quorum);
    }

    @Override
    public void apply(ViewFacade view) {
        
        for(int i = 0; i < playerCounts.length; ++i){
            int playerCount = playerCounts[i];
            String label = playerCount + " player";
            if (playerCount != 1){
                label += 's';
            }
            view.send(new HideButtonRemote(label));
        }
    }

}
