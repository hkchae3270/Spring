package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {

	@RequestMapping("food")
	public String 함수이름아무거나(FoodVO bag) {
		System.out.println(bag);
		String like = bag.getLike();
		String dislike = bag.getDislike();
		if (like.equals("라면")) {
			return "like";
		} 
		if (dislike.equals("커피")) {
			return "dislike";
		} 
		if(like.equals("아무거나")) {
			return "redirect:food.jsp";
		}else {
			return "redirect:food.jsp";
		}
	}
}
