package com.example.model.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter{
	

	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.authorizeRequests()
//	        .antMatchers("/beekeper/**").hasRole("BEEKEPER")
	        .antMatchers("/h2-console/**").permitAll()
	        .and().csrf().disable()
	        .headers().frameOptions().disable();
	    }
	 
//	// Definisanje konfiguracije koja utice na generalnu bezbednost aplikacije
//	    @Override
//	    public void configure(WebSecurity web) throws Exception {
//	        // Autentifikacija ce biti ignorisana ispod navedenih putanja (kako bismo ubrzali pristup resursima)
//	        // Zahtevi koji se mecuju za web.ignoring().antMatchers() nemaju pristup SecurityContext-u
//
//	        // Dozvoljena POST metoda na ruti /auth/login, za svaki drugi tip HTTP metode greska je 401 Unauthorized
//	        web.ignoring().antMatchers(HttpMethod.POST, "/auth/login");
//
//	        // Ovim smo dozvolili pristup statickim resursima aplikacije
//	        web.ignoring().antMatchers(HttpMethod.GET, "/", "/webjars/**", "/*.html", "favicon.ico", "/**/*.html",
//	                "/**/*.css", "/**/*.js");
//	    }
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/h2-console/**");
//    }
//	
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
//		
//        http
//                // komunikacija izmedju klijenta i servera je stateless posto je u pitanju REST aplikacija
//                // ovo znaci da server ne pamti nikakvo stanje, tokeni se ne cuvaju na serveru
//                // ovo nije slucaj kao sa sesijama koje se cuvaju na serverskoj strani - STATEFULL aplikacija
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
//                
//                // svim korisnicima dopusti da pristupe sledecim putanjama:
//                .authorizeRequests()
//                .antMatchers("/trademark/**").permitAll()
////                .antMatchers("/hello/**").permitAll()
//                .antMatchers("/citizen/**").hasRole("CITIZEN")
//                .antMatchers("/employee/**").hasRole("EMPLOYEE")
//                .antMatchers("/all/**").permitAll()
//                .antMatchers("/oauth/**").permitAll()
//                .antMatchers("/auth/**").permitAll()		// /auth/**
//                .antMatchers("/api/**").permitAll()	// /h2-console/** ako se koristi H2 baza)
//                .antMatchers("/h2-console/**").permitAll()	// /h2-console/** ako se koristi H2 baza)
//                .antMatchers("/h2/**").permitAll()
//                .antMatchers("/api/foo").permitAll()		// /api/foo
//                .antMatchers("/home/**").permitAll()
//                .antMatchers("/oauth2/**").permitAll()
//
//                .anyRequest().authenticated().and()
//
//                .cors();
//
//                
//        http.csrf().disable();
//        http.headers().frameOptions().disable();
//    }
	
}
