package apiClass;

public interface CluDefinitionInterface {
	// モデルのデプロイ　→　予測 URL
	static final String apiUrl = "https://gyutan13.cognitiveservices.azure.com/language/:analyze-conversations?api-version=2024-11-15-preview";
	
	//　プロジェクト設定　→　 主キー:
	static final String subscriptionKey = "4500478417f44e2090fc8e1243eb65c2";
	
	// プロジェクトを見る
	static final String projectName = "gyutan230115";
	
	// モデルのデプロイを見る
	static final String deploymentName = "gyutanDeploy";
}
