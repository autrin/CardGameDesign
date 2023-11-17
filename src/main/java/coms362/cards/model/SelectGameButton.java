package coms362.cards.model;

import coms362.cards.events.inbound.SelectGameEvent;

public class SelectGameButton extends VariableButton {
    
    private final static String kSelectorBase = "SelectGame";

    public SelectGameButton(String label, Location location) {
        super(kSelectorBase + label, SelectGameEvent.kId, label, location);
        this.setRemoteId(label);
    }

}
