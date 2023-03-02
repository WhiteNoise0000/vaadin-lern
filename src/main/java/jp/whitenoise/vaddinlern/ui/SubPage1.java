package jp.whitenoise.vaddinlern.ui;

import jakarta.annotation.security.PermitAll;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route(value = "sub", layout = MainView.class)
@PermitAll
public class SubPage1 extends VerticalLayout {

	private final TextField name;
	private final TextField age;

	private final Binder<SubForm1> binder = new BeanValidationBinder<SubForm1>(SubForm1.class);

	public SubPage1() {
		add(new H2("Sub page 1"));

		ErrorMessage msg = new ErrorMessage();
		add(msg);
		name = new TextField("名前");
		add(name);
		age = new TextField("年齢");
		add(age);

		SubForm1 form = new SubForm1();
		binder.bindInstanceFields(this);
		binder.setBean(form);
		binder.setStatusLabel(msg);
		binder.withValidator(form.createValidator());
		add(new RouterLink("メインページ", MainPage.class));
		
		add(new LabelField("テスト", "読取専用"));
	}
}
