package com.atmecs.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	public void configure(HttpSecurity httpsecurity)  {
		
		try {
			httpsecurity.antMatcher("/**").authorizeRequests()
						.antMatchers("/").permitAll()
						.anyRequest().authenticated()
						.and()
						.oauth2Login();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
						
	}
}
