package apiClass;

public class CluParameter {
	String kind;
	AnaInput analysisInput;
	Parameters parameters;
	
	public CluParameter() {
		this("パラメータなし");
	}

	public CluParameter(String text) {
		setKind("Conversation");
		setAnalysisInput(new AnaInput(text));
		setParameters(new Parameters());
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public AnaInput getAnalysisInput() {
		return analysisInput;
	}

	public void setAnalysisInput(AnaInput analysisInput) {
		this.analysisInput = analysisInput;
	}

	public Parameters getParameters() {
		return parameters;
	}

	public void setParameters(Parameters parameters) {
		this.parameters = parameters;
	}
	
	

}
