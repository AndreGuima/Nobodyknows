package com.adpguima.nobodyknows.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @author André Guimarães <andrepaivaguimaraes@gmail.com>
 *
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	public void configure(HttpSecurity httpSecurity) throws Exception {

		httpSecurity.logout().invalidateHttpSession(true).clearAuthentication(true).and().authorizeRequests()
				.antMatchers("usuario/**").hasAnyRole("ADMIN").anyRequest().denyAll();
	}

}
