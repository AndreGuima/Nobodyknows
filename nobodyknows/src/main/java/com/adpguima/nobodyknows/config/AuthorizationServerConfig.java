/**
 * 
 */
package com.adpguima.nobodyknows.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

import com.adpguima.nobodyknows.service.MyUserDetailService;

/**
 * @author André Guimarães <andrepaivaguimaraes@gmail.com>
 *
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

	private TokenStore tokenStore = new InMemoryTokenStore();

	@Qualifier("authorizationManagerBean")
	private AuthenticationManager authenticationManager;

	@Autowired
	MyUserDetailService myUserDetailService;

	public void configure(AuthorizationServerEndpointsConfigurer endpointsConfigurer) {

		endpointsConfigurer.tokenStore(this.tokenStore).authenticationManager(this.authenticationManager)
				.userDetailsService(this.myUserDetailService);
	}

	public void configure(ClientDetailsServiceConfigurer clientDetailsServiceConfigurer) throws Exception {

		clientDetailsServiceConfigurer.inMemory().withClient("cliente")
				.authorizedGrantTypes("password", "authorization_code", "refresh_token").scopes("bar", "read", "write")
				.refreshTokenValiditySeconds(20000).accessTokenValiditySeconds(20000).resourceIds("restservice")
				.secret("123");

	}

	@Bean
	@Primary
	public DefaultTokenServices tokenServices() {
		DefaultTokenServices tokenServices = new DefaultTokenServices();

		tokenServices.setSupportRefreshToken(true);
		tokenServices.setTokenStore(tokenStore);

		return tokenServices;
	}

}
