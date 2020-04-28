package com.jay.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jay.spring.springmvc.model.User;

@Controller
public class UserRegController {
	@RequestMapping("registration")
	public ModelAndView showRegForm() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
	}

	@RequestMapping(value = "registration", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user1") User user) {
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
	}

	@RequestMapping("showData")
	public ModelAndView showQueryParam(@RequestParam("id") int id,
			@RequestParam(value = "fname", required = false, defaultValue = "Bidwai") String name) {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
	}
}
