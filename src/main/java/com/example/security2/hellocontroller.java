package com.example.security2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
@GetMapping("hello1")
public String hello1() {
	System.out.println(" from hello1");
	return "i am from hello1" ;
}

}
