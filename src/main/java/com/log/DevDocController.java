package com.log;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevDocController {
@GetMapping(value="GetvalSt")
public String Getof() {
	return "Illai illai solla

Oru kanam podhum

Illai endru sollai

Thanghuvathendraal

Innum innum enakkor

Jenmam vendum

Enna solla pogiraai";
}
}
