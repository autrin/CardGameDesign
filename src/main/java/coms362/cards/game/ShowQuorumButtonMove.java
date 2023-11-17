package coms362.cards.game;

import coms362.cards.abstractcomp.Move;
import coms362.cards.abstractcomp.Table;
import coms362.cards.app.ViewFacade;
import coms362.cards.events.remote.CreateButtonRemote;
import coms362.cards.fiftytwo.P52DealButton;
import coms362.cards.model.Location;
import coms362.cards.model.PlayerCountButton;

public class ShowQuorumButtonMove implements Move {

    int[] playerCounts;

    public ShowQuorumButtonMove(int[] playerCounts){
        this.playerCounts = playerCounts;
    }

    @Override
    public void apply(Table table) {
    }

    @Override
    public void apply(ViewFacade views) {
        for(int i = 0; i < playerCounts.length; ++i){
            int playerCount = playerCounts[i];
            String label = playerCount + " player";
            if (playerCount != 1){
                label += 's';
            }

            PlayerCountButton playerCountButton = new PlayerCountButton(label, new Location(250, 50 * (i + 1)));
            views.register(playerCountButton); // so we can find it later.
            views.send(new CreateButtonRemote(playerCountButton));
        }
    }
    
}
