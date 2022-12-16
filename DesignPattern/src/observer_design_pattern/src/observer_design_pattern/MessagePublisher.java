package observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
	private List<Observer> observers = new ArrayList<>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void detach(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyUpdate(Message message) {
		for(Observer o: observers) {
			o.update(message);
		}
	}
	

}
