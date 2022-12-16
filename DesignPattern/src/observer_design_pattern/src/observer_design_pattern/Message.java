package observer_design_pattern;

public class Message {
	final String messageContent;

	public String getMessageContent() {
		return messageContent;
	}

	public Message(String messageContent) {
		this.messageContent = messageContent;
	}

}
