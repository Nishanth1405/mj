package com.MJ;

import java.util.ArrayList;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MJController {

	@GetMapping(value = "/getNN")
	public String getThis() {
		return "Hello Nish";
	}
	@GetMapping(value = "/getName")
	public String getNam() {
		return "Nishanth";
	}

	@GetMapping(value = "getG/{n}")
	public String getGreet(@PathVariable String n) {
		return n + " Nish";
	}

	@GetMapping(value = "getMax/{a}/{b}")
	public String getMax(@PathVariable int a, @PathVariable int b) {
		if (a > b) {
			return a + " is the Greatest";
		} else {
			return b + " is the Greatest";
		}
	}

	@GetMapping(value = "getPrime/{a}/{b}")
	public List<Integer> getP(@PathVariable int a, @PathVariable int b) {
		List<Integer> n = new ArrayList<>();

		for (int i = a; i <= b; i++) {
			boolean isPrime = true;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
				}

			}

			if (isPrime) {
				n.add(i);
			}
		}
		return n;
	}

	@GetMapping(value = "/getAccess")
	public String getAccess(@RequestParam String userName, @RequestParam String password) {

		if (userName.equals("Bristol") && password.equals("Onesoft")) {
			return "Wifi Connected";

		} else {
			return "Wifi Not Connected";
		}

	}

	@GetMapping(value = "/getAge")
	public String getAge(@RequestParam int age) {
		if (age >= 18) {
			return "Eligible for Voting";
		} else {
			return "Not Eligible for Voting";

		}
	}

	
			
		
	}

