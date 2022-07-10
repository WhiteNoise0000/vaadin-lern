package jp.whitenoise.vaddinlern.ui;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("login")
@PageTitle("ログイン")
public class LoginView extends VerticalLayout implements BeforeEnterObserver {

    private LoginForm login = new LoginForm(new JpnLoginForm());

    public LoginView() {
        addClassName("login-view");
        setSizeFull();

        setJustifyContentMode(JustifyContentMode.CENTER);
        setAlignItems(Alignment.CENTER);

        login.setAction("login");

        add(new H1("Vaadin 勉強"), login);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {
        if(beforeEnterEvent.getLocation()
            .getQueryParameters()
            .getParameters()
            .containsKey("error")) {
            login.setError(true);
        }
    }
    
    private class JpnLoginForm extends LoginI18n {
    	public JpnLoginForm() {
    		super();
    		Form form = new Form();
    		form.setUsername("ユーザID");
    		form.setPassword("パスワード");
    		form.setSubmit("ログイン");
    		this.setForm(form);
    		ErrorMessage msg = new ErrorMessage();
    		msg.setTitle("ログインエラー");
    		msg.setMessage("ユーザIDまたはパスワードが異なります。");
    		this.setErrorMessage(msg);
    	}
    }
}