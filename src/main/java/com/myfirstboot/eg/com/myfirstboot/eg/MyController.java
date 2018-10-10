package com.myfirstboot.eg.com.myfirstboot.eg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {
	
	/*@Value("${message.special}")
	String wMessage;
	
	@Value("${message2.special}")  //this becomes tedious for many Values hence we use @Configuration properties in application java
	String wMessage2;*/
	
	@Autowired
	MyConfiguration cfg;
	
	@GetMapping("/test")
	public String met()
	{
		return "This is SergiTON " + cfg;
	}
	
	
	
	

}
