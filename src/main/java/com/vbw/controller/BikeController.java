package com.vbw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.vbw.dto.BikeDto;
import com.vbw.service.BikeManagerService;

public class BikeController implements Controller {
   BikeManagerService bikeManagerService;
   
	public BikeController(BikeManagerService managerservice) {
	
	this.bikeManagerService = managerservice;
}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView();
		List<BikeDto> bikes1=null;
		
		bikes1=bikeManagerService.displyBike();
		
		mav.addObject("bikes", bikes1);
		
		mav.setViewName("Bikes");
		return mav;
	}

}
