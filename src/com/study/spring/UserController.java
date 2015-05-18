package com.study.spring;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@InitBinder
	private void initDataBinder(WebDataBinder web) {
		//web.setDisallowedFields(new String[] { "hobby" });
		/*SimpleDateFormat smp = new SimpleDateFormat("yyyy*MM*dd");
		web.registerCustomEditor(Date.class, "dob", new CustomDateEditor(smp,
				false));*/
	}

	@RequestMapping(value = "/addnew", method = RequestMethod.GET)
	private ModelAndView showUserForm() {
		ModelAndView modelAndView = new ModelAndView("addUser");
		return modelAndView;
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	private ModelAndView addUser(@Valid @ModelAttribute("user") User user,
			BindingResult result) {
		if (result.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("addUser");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("showUser");
		modelAndView.addObject("msg", "Using ModelAttributes!!");
		return modelAndView;
	}

}
