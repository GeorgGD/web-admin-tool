package com.webAdminTool;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * SecurityConfig is meant for configuring spring security
 * @author Georgios Davakos
 * @since 2020-12-24
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * Creates a single user for demo purposes
	 * @param auth The authenticaltion manager at memory level
	 * @throws Exception
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("user")
			.password("password")
			.roles("admin");		
	}

	/**
	 * Configures HTTP requests
	 * @param http The object managing http requests	
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.csrf().disable()
	    	.authorizeRequests()	    	
	    	.anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/login")
			.defaultSuccessUrl("/", true)
			.permitAll();
			
	}


	/**
	 * Makes static files accessable by the client
	 * @param web 	
	 */
	@Override
	public void configure(WebSecurity web) throws Exception {
	    web.ignoring()
	       .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**");
	}
	
	// This is for testing the application
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
