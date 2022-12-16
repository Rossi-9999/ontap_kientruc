package observer_design_pattern;

public class Main {
	public static void main(String[] args) {
		MessagePublisherOne m1 = new MessagePublisherOne();
		MessagePublisherTwo m2 = new MessagePublisherTwo();
		MessagePublisherThree m3 = new MessagePublisherThree();
		
		MessagePublisher mp = new MessagePublisher();
		
		mp.attach(m1);
		mp.attach(m2);
		
		mp.notifyUpdate(new Message("First Message"));
		
		mp.detach(m1);
		mp.detach(m3);
		
		mp.notifyUpdate(new Message("Second Message"));
	}
}
