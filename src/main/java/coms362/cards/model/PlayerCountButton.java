package coms362.cards.model;

import coms362.cards.events.inbound.SetQuorumEvent;
import coms362.cards.events.inbound.DealEvent;

public class PlayerCountButton extends VariableButton {

    private String kSelectorBase;
    String kId = SetQuorumEvent.kId + DealEvent.kId;

    public PlayerCountButton(String label, Location location) {
        super(sAndL, kId, location);
        String sAndL = kSelectorBase + label;
        // TODO Auto-generated constructor stub
    }

}
