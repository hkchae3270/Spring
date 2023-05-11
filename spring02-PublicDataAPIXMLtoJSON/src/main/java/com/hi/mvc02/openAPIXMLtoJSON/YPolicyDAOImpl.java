package com.hi.mvc02.openAPIXMLtoJSON;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class YPolicyDAOImpl  {
	
	@Autowired
	SqlSessionTemplate my;
	

	public void insert(YPolicyVO vo) {
		my.insert("yp", vo);
	}


	public void update(YPolicyVO vo) {
		// TODO Auto-generated method stub

	}


	public YPolicyVO one(String YP_NAME, String CATEGORY, String YP_REGION) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<YPolicyVO> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
