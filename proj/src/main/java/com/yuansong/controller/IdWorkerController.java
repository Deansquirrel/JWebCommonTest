package com.yuansong.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yuansong.common.IdWorker;

@Controller
@RequestMapping(value="/IdWorker")
public class IdWorkerController {
	
	private final Logger logger = Logger.getLogger(IdWorkerController.class);
	
	private IdWorker idWorker = null;
	
	public IdWorkerController() {
		idWorker = new IdWorker();
	}
	
	@RequestMapping(value="/NextId",method = RequestMethod.GET)
	public ModelAndView nextId(Map<String, Object> model){
		logger.info("IdWorkerController NextId");
		
		model.put("info", String.valueOf(idWorker.nextId()));
		
		return new ModelAndView("responsePage",model);
	}

}
