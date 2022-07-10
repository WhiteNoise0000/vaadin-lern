package jp.whitenoise.vaddinlern.ui;

import javax.annotation.security.RolesAllowed;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route(value = "sub2", layout = MainView.class)
@RolesAllowed("ADMIN")
public class SubPage2 extends VerticalLayout {

	public SubPage2() {
		add(new H2("Sub page 2"));
		add("管理者のみ見えるページです");
		add(new RouterLink("メインページ", MainPage.class));
	}
}
