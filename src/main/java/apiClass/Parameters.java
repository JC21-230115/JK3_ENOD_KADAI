package apiClass;

public class Parameters {
	String projectName;
	boolean verbose;
	String deploymentName;
	String stringIndexType;

	public Parameters() {
		setProjectName(CluDefinitionInterface.projectName);
		setVerbose(true);
		setDeploymentName(CluDefinitionInterface.deploymentName);
		setStringIndexType("TextElement_V8");
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public boolean getVerbose() {
		return verbose;
	}

	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	public String getDeploymentName() {
		return deploymentName;
	}

	public void setDeploymentName(String deploymentName) {
		this.deploymentName = deploymentName;
	}

	public String getStringIndexType() {
		return stringIndexType;
	}

	public void setStringIndexType(String stringIndexType) {
		this.stringIndexType = stringIndexType;
	}
	
	
}
