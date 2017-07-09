package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.service.MainServiceImpl;
import com.cts.vo.LoginVo;



@Controller
public class LoginController {

	@Autowired
	private MainServiceImpl mainServiceImpl;
	
	@RequestMapping("init")
	public ModelAndView initialise(){
		
		ModelAndView model=new ModelAndView("loginpage");
		return model;
	}
	 
	@RequestMapping(value = "add", method=RequestMethod.POST)
	public ModelAndView getLogin(@ModelAttribute("loginpage")LoginVo loginVo,BindingResult result){
		
		ModelAndView modelAndView=new ModelAndView();
		System.out.println("asd");
		if(result.hasErrors()){
			modelAndView.setViewName("loginpage");
			modelAndView.addObject("msg","Error while login!!");
		}else{
			String name = mainServiceImpl.login(loginVo);
			modelAndView.setViewName("loginpage");
			modelAndView.addObject("msg",name);
		}
		return modelAndView;	
	}
}
