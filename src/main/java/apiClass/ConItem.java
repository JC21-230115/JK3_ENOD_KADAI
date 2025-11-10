package apiClass;

public class ConItem {
	String id;
	String text;
	String modality;
	String Language;
	String participantId;
	
	public ConItem(String text){
		setId("1");
		setText(text);
		setModality("text");
		setLanguage("ja");
		setParticipantId("1");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getModality() {
		return modality;
	}

	public void setModality(String modality) {
		this.modality = modality;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getParticipantId() {
		return participantId;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}
	
	
	
}
