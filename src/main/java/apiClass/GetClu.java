package apiClass;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URISyntaxException;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class GetClu {

	public static String getLanguageText(String parameter) {
		// jsonパラメーターを作成
		CluParameter detectReq = new CluParameter(parameter);
		Gson gson = new Gson();
		String detectReqString = gson.toJson(detectReq);

		// jsonパラメーターを表示
		System.out.println(detectReqString);

		// APIのURLを設定

		String url = CluDefinitionInterface.apiUrl;

		// Subscription-Keyを設定
		HashMap<String, String> map = new HashMap<>();
		map.put("Ocp-Apim-Subscription-Key", CluDefinitionInterface.subscriptionKey);
		//		map.put("Apim-Request-Id", CluDefinitionInterface.requestId);

		// Proxy設定（学内利用のみ）
		InetSocketAddress proxy = new InetSocketAddress("172.17.0.2", 80);

		CluResult response = null;
		try {
			JsonReader reader;
			reader = WebApiConnector.postJsonReader(url, proxy, map, detectReqString);
			//reader = WebApiConnector.postJsonReader(url, map, detectReqString);
			if (reader != null) {
				response = gson.fromJson(reader, CluResult.class);
				reader.close();
			}
		} catch (URISyntaxException e) {
			System.out.println("URISyntaxException");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		String detected = "エラーが発生しているようです。resultsがnullでした";
		try {
			detected = response.getResult().getPrediction().getTopIntent();
		} catch (NullPointerException e) {
		}
		return detected;
	}

}
