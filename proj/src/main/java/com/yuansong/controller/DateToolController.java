package com.yuansong.controller;

import java.util.Date;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yuansong.common.DateTool;

@Controller
@RequestMapping(value="/DateTool")
public class DateToolController {
	
	private final Logger logger = Logger.getLogger(DateToolController.class);
	
	@RequestMapping(value="/GetDate",method = RequestMethod.GET)
	public ModelAndView getDate(Map<String, Object> model){
		logger.info("DateToolController GetDate");
		
		model.put("info", DateTool.getDateStr());
		
		return new ModelAndView("responsePage",model);
	}
	
	@RequestMapping(value="/GetDateByDate",method = RequestMethod.GET)
	public ModelAndView getDateByDate(Map<String, Object> model){
		logger.info("DateToolController GetDateByDate");
		Date date = new Date();
		date.setTime(1);
		model.put("info", DateTool.getDateStr(date));
		return new ModelAndView("responsePage",model);
	}
	
	@RequestMapping(value="/GetDateFormat",method = RequestMethod.GET)
	public ModelAndView getDateFormat(Map<String, Object> model){
		logger.info("DateToolController GetDateFormat");

		model.put("info", DateTool.getDateStr("yyyy-MM-dd HH:mm"));
		
		return new ModelAndView("responsePage",model);
	}
	
	@RequestMapping(value="/GetDateByDateFormat",method = RequestMethod.GET)
	public ModelAndView getDateByDateFormat(Map<String, Object> model){
		logger.info("DateToolController GetDateByDateFormat");
		Date date = new Date();
		date.setTime(1);
		model.put("info", DateTool.getDateStr(date, "yyyy-MM-dd HH:mm"));
		return new ModelAndView("responsePage",model);
	}

}
