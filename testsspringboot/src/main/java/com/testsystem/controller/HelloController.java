package com.testsystem.controller;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	}
	)
	//http://localhost:8888/swagger-ui/index.html#/hello-controller/sayHelloUsingGET
	public String sayHello() {
		return "Swagger Hello World";
	}
	@RequestMapping("hi")
	public String welcome(){
    	String text="hi how are you: ";
    	text+="what are you doing";
    	return text;
	}
}