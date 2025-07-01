package com.shubham.sbapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.sbapp.feignclient.WelcomeApiCall;

@RestController
public class GreetRest {
	
	@Autowired
	private  WelcomeApiCall welcomeApiCall;
	
	@GetMapping("/greet")
	public String getGreetmsg(){
		
		String welcomeApi = welcomeApiCall.invokeWelcomeApi();
		
		String greet = "Good morning...";
		
		return greet+" "+welcomeApi;
	}
}
