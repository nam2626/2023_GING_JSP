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

import org.json.JSONArray;
import org.json.JSONObject;

public class SearchEx {
	//네이버 검색 기능 작성
	//검색어는 자유롭게
	//검색 결과만 출력
	public static String naverSearch(String text) {
		String clientId = "clientId";
		String clientSecret = "clientSecret";
		String result = "";
		try {
			text = URLEncoder.encode(text, "UTF-8");
			String apiURL = "https://openapi.naver.com/v1/search/blog?query=" + text;

			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));	
            StringBuilder responseBody = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                responseBody.append(line);
            }
            
            JSONObject json = new JSONObject(responseBody.toString());
            JSONArray arr = json.getJSONArray("items");
            
            for(int i=0;i<arr.length();i++) {
            	result += arr.get(i) + "\n";
            }
		
		
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	//뉴스 검색
	//20건이 조회되게끔 처리
	public static String naverNewsSearch(String text) {
		String clientId = "clientId";
		String clientSecret = "clientSecret";
		String result = "";
		try {
			text = URLEncoder.encode(text, "UTF-8");
			String apiURL = "https://openapi.naver.com/v1/search/news.json?display=20&query=" + text;

			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));	
            StringBuilder responseBody = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                responseBody.append(line);
            }
            
            JSONObject json = new JSONObject(responseBody.toString());
            JSONArray arr = json.getJSONArray("items");
            
            for(int i=0;i<arr.length();i++) {
            	result += arr.get(i) + "\n";
            }
		
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
//		System.out.println(naverSearch("삼성전자"));
		System.out.println(naverNewsSearch("태영건설"));
	}

}




