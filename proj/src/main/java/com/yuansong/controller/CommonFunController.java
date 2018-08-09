package com.yuansong.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yuansong.common.CommonFun;

@Controller
@RequestMapping(value="/CommonFun")
public class CommonFunController {
	
	private final Logger logger = Logger.getLogger(CommonFunController.class);
	
	@RequestMapping(value="/MD5/{str}",method = RequestMethod.GET)
	public ModelAndView md5Encode(@PathVariable String str, Map<String, Object> model){
		logger.info("CommonFunController md5Encode");
		
		model.put("info", CommonFun.md5Encode(str));
		
		return new ModelAndView("responsePage",model);
	}
	
	@RequestMapping(value="/UUID",method = RequestMethod.GET)
	public ModelAndView uuid(Map<String, Object> model){
		logger.info("CommonFunController uuid");
		
		model.put("info", CommonFun.UUID());
		
		return new ModelAndView("responsePage",model);
	}
	
	@RequestMapping(value="/IntranetIp",method = RequestMethod.GET)
	public ModelAndView intranetIp(Map<String, Object> model){
		logger.info("CommonFunController INTRANET_IP");
		
		model.put("info", CommonFun.getIntranetIp());
		
		return new ModelAndView("responsePage",model);
	}
	
	@RequestMapping(value="/InternetIp",method = RequestMethod.GET)
	public ModelAndView internetIp(Map<String, Object> model){
		logger.info("CommonFunController INTERNET_IP");
		
		model.put("info", CommonFun.getInternetIp());
		
		return new ModelAndView("responsePage",model);
	}

}
