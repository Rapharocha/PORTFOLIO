package com.gft.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/portfolio")
public class PortfolioController {
	
  	
	@RequestMapping("/home")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("CadastroPortfolio");
		return mv;
	}
	
	@RequestMapping("/projetos")
	public ModelAndView projetos() {
		ModelAndView mv = new ModelAndView("ProjetosPortfolio");
		return mv;
	}
	
	@RequestMapping("/skills")
	public ModelAndView skill() {
		ModelAndView mv = new ModelAndView("Skills");
		return mv;
	}
	
	@RequestMapping("/contato")
	public ModelAndView contato() {
		ModelAndView mv = new ModelAndView("Contato");
		return mv; 
	}
}
