package com.java.brain.springbootconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.brain.springbootconfig.model.DBSettings;

@RestController
public class GreetingController {

	// If my.greeting value does not exist it takes "Default Value" string
	@Value("${my.greeting:Default value}")
	private String greet;

	@Value("Static value")
	private String staticValue;

	@Value("${my.list.values: Default list}")
	private List<String> list;

	// # Spring expression language
	/*
	 * @Value("#{${my.db.values}}") private Map<Object,Object> dbconnection;
	 */

	@Autowired
	private DBSettings dbsettings;

	@Autowired
	private Environment env;

	@GetMapping("/greeting")
	public String greeting() {
		return greet + " " + staticValue + " " + dbsettings.getHost();
	}

	@GetMapping("/envdetails")
	public String enDetails() {
		
		return env.getProperty("propertySources");
		//return env.toString();
	}

}
