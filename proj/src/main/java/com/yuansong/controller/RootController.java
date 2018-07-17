package com.yuansong.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class RootController {

	private final Logger logger = Logger.getLogger(RootController.class);
	
//	@RequestMapping(value="/")
//	public ModelAndView defaultPage(Map<String, Object> model){
//		logger.debug("跳转到 rootPage");
//		System.out.println("跳转到 rootPage");
//		return new ModelAndView("redirect:/rootPage");
//	}
	
	@RequestMapping(value="/PageNotFound")
	public ModelAndView pageNotFound(Map<String, Object> model){
		logger.info("RootController PageNotFound");
		
		return new ModelAndView("pageNotFound",model);
	}
	
	@RequestMapping(value="/testPage")
	public ModelAndView testPage(Map<String, Object> model){
		logger.info("RootController testPage");
		model.put("info", "testPage");
		
		return new ModelAndView("testPage",model);
	}
	
	@RequestMapping(value="/testPageOne")
	public ModelAndView testPageOne(Map<String, Object> model){
		logger.info("RootController testPageOne");
		model.put("info", "testPageOne");

		return new ModelAndView("testPage",model);
	}
	
	@RequestMapping(value="/testErrorPage")
	public ModelAndView testErrorPage(Map<String, Object> model){
		logger.info("RootController testErrorPage");
		model.put("info", "testPageOne");

		throw new RuntimeException("sfesf");
	}
	
}
