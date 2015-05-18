package com.study.spring;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
 
    @RequestMapping("/welcome/{country}/{username}")
	protected ModelAndView processMe(@PathVariable Map<String, String> varmap) {
		// TODO Auto-generated method stub
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage",
				"Hello ! Welcome to my site ---> "+varmap.get("username")+varmap.get("country"));
		return modelAndView;
	}


    @RequestMapping("/hi")
	protected ModelAndView hi() {
		// TODO Auto-generated method stub
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage",
				"hi User! Welcome to my site");
		return modelAndView;
	}
    
}
