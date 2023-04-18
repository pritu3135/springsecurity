package com.example.security2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@EnableWebSecurity
public class securityconfigurer extends WebSecurityConfiguration {
@Autowired
private personservice personservice;

protected void configurer(AuthenticationManagerBuilder auth)throws Exception{
	auth.userDetailsService(personservice);
}

}
