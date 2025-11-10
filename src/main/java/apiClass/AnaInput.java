package apiClass;

public class AnaInput {
	ConItem conversationItem;
	
	public AnaInput(String text){
		ConItem ci = new ConItem(text);
		setConversationItem(ci);
	}

	public ConItem getConversationItem() {
		return conversationItem;
	}

	public void setConversationItem(ConItem conversationItem) {
		this.conversationItem = conversationItem;
	}	
}
