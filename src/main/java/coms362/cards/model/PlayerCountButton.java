package coms362.cards.model;

import coms362.cards.events.inbound.SetQuorumEvent;
import coms362.cards.events.inbound.DealEvent;

public class PlayerCountButton extends VariableButton {

    private static String kSelectorBase;
    private static String kIds = SetQuorumEvent.kId + DealEvent.kId;

    public PlayerCountButton(String label, Location location) { //TODO
        super(kSelectorBase, kIds, label, location);
    }

}
