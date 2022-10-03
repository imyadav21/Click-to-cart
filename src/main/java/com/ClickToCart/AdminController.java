package com.ClickToCart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	
	@RequestMapping("/")
	public String getHome() {
		return "h.jsp";
	}
	
	

}
