package com.MJ;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MJController {

	@GetMapping(value = "/getNN")
	public String getThis() {
		return "Hello Nish";
	}
}
