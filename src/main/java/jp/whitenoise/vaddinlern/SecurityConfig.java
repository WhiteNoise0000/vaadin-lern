package jp.whitenoise.vaddinlern;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.vaadin.flow.spring.security.VaadinWebSecurityConfigurerAdapter;

import jp.whitenoise.vaddinlern.ui.LoginView;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends VaadinWebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		super.configure(http);
		setLoginView(http, LoginView.class);
	}

	/**
	 * Allows access to static resources, bypassing Spring security.
	 */
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/images/**");
		super.configure(web);
	}

	/**
	 * Demo UserDetailService, which only provides two hardcoded
	 * in-memory users and their roles.
	 * NOTE: This should not be used in real-world applications.
	 */
	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		List<UserDetails> users = new ArrayList<>();
		users.add(User.withUsername("user")
				.password("{noop}userpass")
				.roles("USER").build());
		users.add(User.withUsername("admin")
				.password("{noop}adminpass")
				.roles("ADMIN").build());
		return new InMemoryUserDetailsManager(users);
	}
}