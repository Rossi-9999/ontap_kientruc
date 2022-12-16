package observer_design_pattern;

public class MessagePublisherOne implements Observer {

	@Override
	public void update(Message message) {
		// TODO Auto-generated method stub
		System.out.println("MessagePublisherOne :: " + message.getMessageContent());
	}
	

}
