package com.UJC.bolsa.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@EnableWebSecurity
@Configuration
public class AplicationSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
	/*	http
		.authorizeRequests()
		.antMatchers("/webjars/**","/css/**","/image/**","/js/**").permitAll()
		.antMatchers("/candidatura/**").permitAll()
		.antMatchers("/registrar/**").permitAll()
		.antMatchers("/page/**").permitAll();
		
		*/
		
		//Para poder aceder ao perfil do funcionario manuelmente deve descomentar a parte de cima e comentar a 
		//parte de baixo - iniciando do /*htpp  ate a linha que tem o codigo logoutSucessUrl*/
	///*	
		http
		.authorizeRequests()
		.antMatchers("/webjars/**","/css/**","/image/**","/js/**").permitAll()
		.antMatchers("/candidatura/**").permitAll()
		.antMatchers("/registrar/**").permitAll()
		.antMatchers("/page/**").permitAll()
		.anyRequest().authenticated()
		
		.and()
		.formLogin()
		.loginPage("/login")
		.defaultSuccessUrl("/candidatura/cadastrar", true)
		.failureUrl("/loginError")
		.permitAll()
		.and()
		.logout().invalidateHttpSession(true)
		.clearAuthentication(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/candidatura//logout"))
		.logoutSuccessUrl("/candidatura//logout").permitAll();
		
		//*/
	
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return  NoOpPasswordEncoder.getInstance();
		
	}
	
	@Autowired
	private UserDetailsService userDtService;
	
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		
		provider.setUserDetailsService(userDtService);
		provider.setPasswordEncoder(passwordEncoder());
		
		return provider;
	}


}
