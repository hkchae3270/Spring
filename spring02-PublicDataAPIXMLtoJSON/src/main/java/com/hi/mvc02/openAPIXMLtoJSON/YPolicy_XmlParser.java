package com.hi.mvc02.openAPIXMLtoJSON;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class YPolicy_XmlParser {
	private DocumentBuilderFactory documentBuilderFactory;
	private DocumentBuilder documentBuilder;
	private Document document;
	private NodeList nodeList;

	public List<YPolicyVO> YPolicy_XmlParser() throws Exception{
		String URL = "https://www.youthcenter.go.kr/opi/empList.do?openApiVlak=5c0e90c4dbb47a74b3a37e0b&pageIndex=1&display=100";
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(URL);
	
		List<YPolicyVO> YPDataList = new ArrayList<YPolicyVO>();
		nodeList = document.getElementsByTagName(URL);
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element elem = (Element)nodeList.item(i);
			String YP_ID = this.getTagValue("bizId", elem);
			String YP_NAME = this.getTagValue("polyBizSjnm", elem);
			String YP_PI = this.getTagValue("polyBizTy", elem);
			String YP_INFO = this.getTagValue("polyItcnCn", elem);
			String YP_CATEGORY = this.getTagValue("plcyTpNm", elem);
			String YP_SSIZE = this.getTagValue("sporScvl", elem);
			String YP_CONTENT = this.getTagValue("sporCn", elem);
			String YP_RQMAGE = this.getTagValue("ageInfo", elem);
			String YP_RQMJOB = this.getTagValue("empmSttsCn", elem);
			String YP_RQMEDU = this.getTagValue("accrRqisCn", elem);
			String YP_RQMMAJR = this.getTagValue("majrRqisCn", elem);
			String YP_RQMFIELD = this.getTagValue("splzRlmRqisCn", elem);
			String YP_AI = this.getTagValue("cnsgNmor", elem);
			String YP_PERIOD = this.getTagValue("rqutPrdCn", elem);
			String YP_PROCEDURE = this.getTagValue("rqutProcCn", elem);
			String YP_ANM = this.getTagValue("jdgnPresCn", elem);
			String YP_URL = this.getTagValue("rqutUrla", elem);
			YPDataList.add(new YPolicyVO(YP_ID, YP_NAME, YP_PI, YP_INFO, YP_CATEGORY, YP_SSIZE,
					YP_CONTENT, YP_RQMAGE, YP_RQMJOB, YP_RQMEDU, YP_RQMMAJR, 
					YP_RQMFIELD, YP_AI, YP_PERIOD, YP_PROCEDURE, YP_ANM, YP_URL));
		}
		
		return YPDataList;
	}

	private String getTagValue(String tagName, Element elem) {
		NodeList nodeList = elem.getElementsByTagName(tagName).item(0).getChildNodes();
		Node node = nodeList.item(0);
		return node.getNodeValue();
	}
}
