package coms362.cards.app;

import java.util.ArrayList;

public class ScreenState {
    private ArrayList<ArrayList<String>> remoteIDs = new ArrayList<>();

    public void append(ArrayList<String> screen) {//TODO
        remoteIDs.add(screen);
    }

    public boolean hasMore(){ //TODO

        // return remoteIDs.hasNext();
    }

    public ArrayList<String> currentObjects(){
        return null; //TODO
    }

    public ArrayList<String> nextObjects(){
        return null; //TODO
    }

}
