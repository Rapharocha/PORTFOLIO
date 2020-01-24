package com.gft.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PortfolioController {

	@RequestMapping("/home")
	public String novo() {
		
		return "CadastroPortfolio";
	}
	
	
}
