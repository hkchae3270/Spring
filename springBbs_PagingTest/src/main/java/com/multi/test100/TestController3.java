package com.multi.test100;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TestController3 {
	public static void main(String[] args) throws Exception {
		// fake endpoint that returns XML response
		// String URL = “http://www.mocky.io/v2/5c8bdd5c360000cd198f831e”;
		String URL = "https://www.youthcenter.go.kr/opi/empList.do?openApiVlak=5c0e90c4dbb47a74b3a37e0b&pageIndex=1&display=100";
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(URL);
		System.out.println(doc);
		
		// normalize XML response
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName("emp");
		List<emp> emps = new ArrayList<>();
		System.out.println(nodeList.getLength());
		
		for (int temp = 0; temp < nodeList.getLength(); temp++) {
			Node nNode = nodeList.item(temp);
			Element eElement = (Element) nNode;
			System.out.println(eElement.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element elem = (Element) nNode;
				emp empmodel = new emp(
                        Integer.parseInt(elem.getElementsByTagName("rownum").item(0).getTextContent()),
                        elem.getElementsByTagName("bizId").item(0).getTextContent(),
                        elem.getElementsByTagName("polyBizSecd").item(0).getTextContent(),
                        elem.getElementsByTagName("polyBizTy").item(0).getTextContent(),
                        elem.getElementsByTagName("polyBizSjnm").item(0).getTextContent(),
                        elem.getElementsByTagName("polyItcnCn").item(0).getTextContent(),
                        elem.getElementsByTagName("plcyTpNm").item(0).getTextContent(),
                        elem.getElementsByTagName("sporScvl").item(0).getTextContent(),
                        elem.getElementsByTagName("sporCn").item(0).getTextContent(),
                        elem.getElementsByTagName("ageInfo").item(0).getTextContent(),
                        elem.getElementsByTagName("empmSttsCn").item(0).getTextContent(),
                        elem.getElementsByTagName("accrRqisCn").item(0).getTextContent(),
                        elem.getElementsByTagName("majrRqisCn").item(0).getTextContent(),
                        elem.getElementsByTagName("splzRlmRqisCn").item(0).getTextContent(),
                        elem.getElementsByTagName("cnsgNmor").item(0).getTextContent(),
                        elem.getElementsByTagName("rqutPrdCn").item(0).getTextContent(),
                        elem.getElementsByTagName("rqutProcCn").item(0).getTextContent(),
                        elem.getElementsByTagName("jdgnPresCn").item(0).getTextContent(),
                        elem.getElementsByTagName("rqutUrla").item(0).getTextContent()
                );
                emps.add(empmodel);
			}
		} // for
		System.out.println(emps);
	}
}