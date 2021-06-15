package com.axsos.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String hello(@RequestParam(value = "name", required = false) String name) {
		if (name == null) {
			return "<h1>Hello Human</h1> <p>Welcome to SpringBoot!</p>";
		}

		return "<h1>Hello " + name + "!</h1> <p>Welcome to SpringBoot!</p>";
	}
}
