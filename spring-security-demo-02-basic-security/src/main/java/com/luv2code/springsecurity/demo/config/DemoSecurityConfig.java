package com.luv2code.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		
		//add our users for in memory authentication
		
		auth.inMemoryAuthentication().withUser("john").password("test123").roles("EMPLOYEE");
		auth.inMemoryAuthentication().withUser("mary").password("test123").roles("MANAGER");
		auth.inMemoryAuthentication().withUser("susan").password("test123").roles("ADMIN");
		
	}

	
	
}
