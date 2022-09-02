package org.ibm.springboot.controller;

import org.ibm.springboot.model.BianAccountOpeningRequest;
import org.ibm.springboot.model.BianLoginRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://169.51.207.96:32194")
@RestController
@RequestMapping("/api/v1")
public class BianLoginController {
	
	@PostMapping("/login")
	public String validateLoginDetails(@RequestBody BianLoginRequest bianLoginRequest) {
		System.out.println("Validate Customer " + bianLoginRequest);

		return "true";
	}

}
