package com.hi.mvc02;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.hi.mvc02.openAPIXMLtoJSON.ApiTest;
import com.hi.mvc02.openAPIXMLtoJSON.YPolicyDAOImpl;
import com.hi.mvc02.openAPIXMLtoJSON.YPolicyVO;


@Controller
public class HomeController {
	
	@Autowired
	YPolicyDAOImpl dao;
	
	@RequestMapping("api")
	public void home(ApiTest api) {
		ArrayList<YPolicyVO> list = api.api();
		
		
	}
	
}
