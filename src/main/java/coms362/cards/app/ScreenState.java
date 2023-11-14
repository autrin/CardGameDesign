package coms362.cards.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ScreenState {
    private Queue<ArrayList<String>> remoteIDs = new LinkedList<>();

    public void append(ArrayList<String> screen) {//TODO
        remoteIDs.add(screen);
    }

    public boolean hasMore(){ //TODO

        // return remoteIDs.hasNext();
        return false; //TODO
    }

    public ArrayList<String> currentObjects(){
        return null; //TODO
    }

    public ArrayList<String> nextObjects(){
        return null; //TODO
    }

}
