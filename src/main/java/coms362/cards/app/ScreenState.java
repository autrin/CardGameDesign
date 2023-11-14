package coms362.cards.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class ScreenState {

    private Queue<ArrayList<String>> remoteIDs = new LinkedList<>();

    public void append(ArrayList<String> screen) {
        remoteIDs.add(screen);
    }

    public boolean hasMore() {

        return remoteIDs.isEmpty();
    }

    /**
     * observing the current list
     */
    public ArrayList<String> currentObjects() {
        return remoteIDs.peek();
    }

    /**
     * gets and removes the next list
     */
    public ArrayList<String> nextObjects() {
        return remoteIDs.poll();
    }

}
