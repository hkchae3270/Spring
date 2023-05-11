package com.hi.mvc02.openAPIXMLtoJSON;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.client.RestTemplate;

public class ApiTest2 {
	
	public static void main(String[] args) {

		ArrayList<YPolicyVO> list = new ArrayList<YPolicyVO>();
		try {
			// 소셜 로그인 , 공공api 등의 url
			//String key = "VXgWV/f5wELzapZjJF7FEqqtFhPbNA8KBIWia3SXOCvY+CXEUok1DhybfbP4USE/g2b/QYT62C2mw3zcSWj2pg==";
			//String url = "http://apis.data.go.kr/B551011/KorWithService/searchKeyword?serviceKey=" + key + "&keyword=%EA%B0%95%EC%9B%90&MobileOS=ETC&MobileApp=AppTest&arrange=A";
			String url = "https://apis.data.go.kr/B551011/KorWithService/searchKeyword?numOfRows=100&pageNo=1&MobileOS=ETC&MobileApp=test&serviceKey=VXgWV%2Ff5wELzapZjJF7FEqqtFhPbNA8KBIWia3SXOCvY%2BCXEUok1DhybfbP4USE%2Fg2b%2FQYT62C2mw3zcSWj2pg%3D%3D&_type=xml&areaCode=6&keyword=%EB%B6%80%EC%82%B0";
			// Spring boot에서 제공하는 RestTemplate
			RestTemplate restTemplate = new RestTemplate();

			// 1. api호출하여 결과를 가져오기
			// 대부분의 api는 get형태가 많다 = 정보를 가져오거나 받아오는 형태
			// RestTemplate.getForObject(URI url, Class<T> responseTyPe) => (호출하는 url, 반환타입)
			//<xml~~~>
			String response = restTemplate.getForObject(url, String.class);

			// XML을 JSON Object로 변환하기
			JSONObject jobj = XML.toJSONObject(response);

			// 변환된 데이터 확인
			// {"items":{"emps":{"emp":[{"name":"one","id":1},{"name":"two","id":2},{"name":"three","id":3}]}}}
			System.out.println("--------------jobj.toString---------------");
			System.out.println(jobj.toString());

			// 3. 데이터에서 꺼내어쓰기
			JSONObject jobj1 = jobj.getJSONObject("items");

			// {"item":[{"name":"one","id":1},{"name":"two","id":2},{"name":"three","id":3}]}
			//System.out.println("--------------jobj1---------------");
			System.out.println(jobj1.toString());

			// 배열 형태이니 반복문을 이용
			//[emp, emp, emp]
			JSONArray jarr = jobj1.getJSONArray("item");
			System.out.println(jarr.length());
			for (int i = 1; i < jarr.length(); i++) {
				// {"yP_ID":"~~~","yP_NAME":"~~", ...}
				String yP_ID = jarr.getJSONObject(i).getString("bizId");
				String yP_NAME = jarr.getJSONObject(i).getString("polyBizSjnm");
				String yP_PI = jarr.getJSONObject(i).getString("polyBizTy");
				String yP_INFO = jarr.getJSONObject(i).getString("polyItcnCn");
				String yP_CATEGORY = jarr.getJSONObject(i).getString("plcyTpNm");
				String yP_SSIZE = jarr.getJSONObject(i).getString("sporScvl");
				String yP_CONTENT = jarr.getJSONObject(i).getString("sporCn");
				String yP_RQMAGE = jarr.getJSONObject(i).getString("ageInfo");
				String yP_RQMJOB = jarr.getJSONObject(i).getString("empmSttsCn");
				String yP_RQMEDU = jarr.getJSONObject(i).getString("accrRqisCn");
				String yP_RQMMAJR = jarr.getJSONObject(i).getString("majrRqisCn");
				String yP_RQMFIELD = jarr.getJSONObject(i).getString("splzRlmRqisCn");
				String yP_AI = jarr.getJSONObject(i).getString("cnsgNmor");
				String yP_PERIOD = jarr.getJSONObject(i).getString("rqutPrdCn");
				String yP_PROCEDURE = jarr.getJSONObject(i).getString("rqutProcCn");
				String yP_ANM = jarr.getJSONObject(i).getString("jdgnPresCn");
				String yP_URL = jarr.getJSONObject(i).getString("rqutUrla");

				YPolicyVO vo = new YPolicyVO(yP_ID, yP_NAME, yP_PI, yP_INFO, yP_CATEGORY, yP_SSIZE, yP_CONTENT,
						yP_RQMAGE, yP_RQMJOB, yP_RQMEDU, yP_RQMMAJR, yP_RQMFIELD, yP_AI, yP_PERIOD, yP_PROCEDURE,
						yP_ANM, yP_URL);
				list.add(vo);
			}

			System.out.println("--------------jarr---------------");
			// System.out.println(jarr);

			// map.put("jobj", jobj.toString());

			// String ret1 = jobj.getString("items"); //y
			// String ret2 = jobj.getString("data"); //123

			// System.out.println(ret1 + "," + ret2);

		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println(list);
		//[JSONObject, JSONObject, JSONObject] ==> {VO, VO, VO}
	}
}