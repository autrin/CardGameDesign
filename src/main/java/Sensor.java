import java.util.ArrayList;

public class Sensor {
	private ArrayList<Listener> listeners = new ArrayList<Listener>();
	
	public void subscribe(Listener listener) {
		listeners.add(listener);
	}
	
	public void unsubscribe(Listener listener) {
		listeners.remove(listener);
	}
	
	public void update() {
		for (Listener listener : listeners) {
			listener.update("EVENT X");
		}
	}
}
