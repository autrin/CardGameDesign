package coms362.cards.model;

import coms362.cards.events.inbound.SetQuorumEvent;

public class PlayerCountButton extends VariableButton {

    private final static String kSelectorBase = "PlayerCount";

    public PlayerCountButton(String label, Location location) {
        super(kSelectorBase + label, SetQuorumEvent.kId, label, location);
    }

}
