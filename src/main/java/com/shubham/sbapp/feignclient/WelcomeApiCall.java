package com.shubham.sbapp.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "Welcome-API")
public interface WelcomeApiCall {
	
	@GetMapping("/welcome")
	public String invokeWelcomeApi();

}
