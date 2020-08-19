package com.java.brain.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // Refreshe config values from Spring cloud config server
public class GreetingController {

	// If my.greeting value does not exist it takes "Default Value" string
	@Value("${my.greeting}")
	private String greet;

	/*
	 * @Value("${app.Description}") private String applicationDes;
	 */

	@Value("Static value")
	private String staticValue;

	/*
	 * @Value("${list.values}") private List<String> list;
	 */

	// # Spring expression language
	/*
	 * @Value("#{${my.db.values}}") private Map<Object,Object> dbconnection;
	 */

	/*
	 * @Value("${my.list.values}") private List<String> mylist;
	 */
	/*
	 * @Autowired private DBSettings dbsettings;
	 * 
	 * @Autowired private Environment env;
	 */

	@GetMapping("/greeting")
	public String greeting() {
		return greet + " " + staticValue;
	}

//	/*
//	 * @GetMapping("/envdetails") public String enDetails() {
//	 * 
//	 * // return env.getProperty("propertySources"); return env.toString(); }
//	 */
}
