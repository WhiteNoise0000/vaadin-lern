package jp.whitenoise.vaddinlern;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Component;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.server.VaadinServletRequest;

import jp.whitenoise.vaddinlern.ui.LoginView;

@Component
public class SecurityService {

	public static final GrantedAuthority ADMIN = new SimpleGrantedAuthority("ROLE_ADMIN");

	public UserDetails getAuthenticatedUser() {
		SecurityContext context = SecurityContextHolder.getContext();
		Object principal = context.getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			return (UserDetails) principal;
		}
		// Anonymous or no authentication.
		return null;
	}

	public boolean isAdmin() {
		UserDetails user = getAuthenticatedUser();
		return user != null && user.getAuthorities().contains(ADMIN);
	}

	public void logout() {
		SecurityContextLogoutHandler handler = new SecurityContextLogoutHandler();
		handler.logout(VaadinServletRequest.getCurrent().getHttpServletRequest(), null, null);
		UI.getCurrent().navigate(LoginView.class);
	}
}