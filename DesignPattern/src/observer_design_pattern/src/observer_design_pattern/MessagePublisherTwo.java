package observer_design_pattern;

public class MessagePublisherTwo implements Observer {

	@Override
	public void update(Message message) {
		// TODO Auto-generated method stub
		System.out.println("MessagePublisherTwo :: " + message.getMessageContent());
	}
	

}

