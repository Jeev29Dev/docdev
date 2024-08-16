package com.log;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevDocController {
@GetMapping(value="GetvalSt")
public String Getof() {
	return "My name is Jeeva";
}
}
