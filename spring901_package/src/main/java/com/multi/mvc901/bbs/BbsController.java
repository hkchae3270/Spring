package com.multi.mvc901.bbs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class BbsController {
	

	@RequestMapping("bbs/insert")
	public void insert() {
	}
	
	@RequestMapping("bbs/insert2")
	public String insert2() {
		return "member/insert";
	}
}







