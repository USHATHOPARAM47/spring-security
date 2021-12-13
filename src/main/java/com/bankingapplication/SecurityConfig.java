package com.bankingapplication;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
		http.authorizeRequests()
		.antMatchers("/balance").authenticated()
		.antMatchers("/home").permitAll()
		.antMatchers("about").permitAll()
		.antMatchers("/contact").permitAll()
		.and().formLogin()
		.and().httpBasic();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		
		
		auth.inMemoryAuthentication()
		.withUser("usha").password("@47").authorities("Admin").and()
		.withUser("purvi").password("@ph").authorities("user").and()
		.withUser("sona").password("@ss").authorities("user").and()
		.withUser("krishna").password("@kr").authorities("user").and()
		.withUser("pranusha").password("@pr").authorities("user").and()
		.withUser("nimisha").password("@ni").authorities("user").and()
		.passwordEncoder(NoOpPasswordEncoder.getInstance());
		

		
		
	}
	

}
