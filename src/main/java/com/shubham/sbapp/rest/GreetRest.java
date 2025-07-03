package com.shubham.sbapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.sbapp.feignclient.WelcomeApiCall;

@RestController
public class GreetRest {
	
	@Autowired
	private  WelcomeApiCall welcomeApiCall;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/greet")
	public String getGreetmsg(){
		
		String port = env.getProperty("server.port");
		
		String welcomeApi = welcomeApiCall.invokeWelcomeApi();
		
		String greet = "Good morning...Greet port ("+port+")";
		
		return greet+" "+welcomeApi;
	}
}
