package api;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONObject;

public class PaPaGoEx2 {
	// 파파고 API 사용해서 text를 번역한 결과를 리턴
	public static String translate(String text) {
		String clientId = "clientId";
		String clientSecret = "clientSecret";
		String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
		String result = "";
		try {
			text = URLEncoder.encode(text, "UTF-8");
			String postParams = "source=ko&target=en&text=" + text;

			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            con.setDoOutput(true);
            
            try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
                wr.write(postParams.getBytes());
                wr.flush();
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));	
            StringBuilder responseBody = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                responseBody.append(line);
            }
            
            JSONObject json = new JSONObject(responseBody.toString());
            result = json.getJSONObject("message").getJSONObject("result").getString("translatedText");
            
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(translate("잠시 후 수업이 끝납니다"));
		System.out.println(translate("안녕하세요"));
	}

}



