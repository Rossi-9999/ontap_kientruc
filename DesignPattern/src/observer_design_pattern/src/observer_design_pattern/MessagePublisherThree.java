package observer_design_pattern;

public class MessagePublisherThree implements Observer {

	@Override
	public void update(Message message) {
		// TODO Auto-generated method stub
		System.out.println("MessagePublisherThree :: " + message.getMessageContent());
	}
	

}

