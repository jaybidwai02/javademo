package com.jay.spring.springmvcorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jay.spring.springmvcorm.entity.User;
import com.jay.spring.springmvcorm.service.interfaces.UserInterface;

@Controller
public class UserController {

	@Autowired
	private UserInterface service;

	@RequestMapping("userReg")
	public String showReg() {
		return "userReg";
	}

	@RequestMapping(value = "registration", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap modelmap) {
		int result = service.save(user);
		modelmap.addAttribute("result", "User created with ID: "+result);
		return "userReg";
	}
}
