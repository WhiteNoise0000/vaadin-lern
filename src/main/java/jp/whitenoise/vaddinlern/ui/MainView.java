package jp.whitenoise.vaddinlern.ui;

import javax.annotation.security.PermitAll;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasText.WhiteSpace;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.auth.AccessAnnotationChecker;

import jp.whitenoise.vaddinlern.SecurityService;

@Route
@PageTitle("Vaadin勉強")
@PermitAll
//@StyleSheet("https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css")
public class MainView extends AppLayout {

	private final AccessAnnotationChecker accessChecker;

	public MainView(
			@Autowired SecurityService securityService,
			@Autowired AccessAnnotationChecker accessChecker) {
		this.accessChecker = accessChecker;

		H2 title = new H2("ｘｘｘｘｘ管理トップページ");
		title.setWhiteSpace(WhiteSpace.NOWRAP);
		addToNavbar(new DrawerToggle(), title);
		if (securityService.getAuthenticatedUser() != null) {
			VerticalLayout vl = new VerticalLayout(new Button("ログアウト", click -> securityService.logout()));
			vl.setSizeFull();
			vl.setAlignItems(Alignment.END);
			addToNavbar(vl);
		}
		addToDrawer(getMenu());
		setContent(new MainPage());
	}

	private VerticalLayout getMenu() {
		VerticalLayout menu = new VerticalLayout();
		menu.setSpacing(false);
		menu.add(new RouterLink("メイン", MainPage.class));
		createCategory(menu, "カテゴリ1",
				new SubMenu("サブ1-1", SubPage1.class),
				new SubMenu("サブ1-2", SubPage2.class));
		createCategory(menu, "カテゴリ2",
				new SubMenu("サブ2-1", SubPage1.class),
				new SubMenu("サブ2-2", SubPage2.class));
		menu.add(new RouterLink("グリッド", SubPage3.class));
		return menu;
	}

	private void createCategory(VerticalLayout menu, String categoryName, SubMenu... items) {

		Details cat = new Details(categoryName);
		VerticalLayout layout = new VerticalLayout();
		layout.setSpacing(true);
		layout.setPadding(false);
		boolean canAccess = false;
		for (SubMenu item : items) {
			if (accessChecker.hasAccess(item.target())) {
				layout.add(new RouterLink(item.name(), item.target()));
				canAccess = true;
			}
		}
		cat.setContent(layout);

		if (canAccess) {
			menu.add(cat);
		}
	}

	private record SubMenu(String name, Class<? extends Component> target) {
	};
}
