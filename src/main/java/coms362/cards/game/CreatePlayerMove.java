package coms362.cards.game;

import java.util.Map;

import coms362.cards.abstractcomp.Move;
import coms362.cards.abstractcomp.Player;
import coms362.cards.abstractcomp.Table;
import coms362.cards.app.ViewFacade;
import coms362.cards.events.remote.SetBottomPlayerTextRemote;
import coms362.cards.streams.RemoteTableGateway;

public class CreatePlayerMove implements Move {

    private Integer position;
    private String socketId;
    private Player player;

    public CreatePlayerMove(Integer position, String socketId, Player players) {
        super();
        this.position = position;
        this.socketId = socketId;
        this.player = players;
    }

	@Override
    public void apply(Table table) {
        table.createPlayer(position, socketId);
        this.player = table.getPlayer(position);

    }

    @Override
    public void apply(ViewFacade views) {
        RemoteTableGateway gw = RemoteTableGateway.getInstance();
        views.createView(PartyRole.player, position, socketId, gw);
        String role = "Player " + player.getPlayerNum() + ": Waiting for match to begin.";
		views.send(new SetBottomPlayerTextRemote(role, player));
    }

}
