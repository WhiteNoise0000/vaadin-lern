package jp.whitenoise.vaddinlern.ui;

import javax.annotation.security.PermitAll;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.ValidationResult;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route(value = "sub", layout = MainView.class)
@PermitAll
public class SubPage1 extends VerticalLayout {

	private final Binder<SubFrom1> binder = new BeanValidationBinder<SubFrom1>(SubFrom1.class);

	private final ErrorMessage msg;
	private final TextField name;
	private final TextField age;

	private final SubFrom1 form = new SubFrom1();

	public SubPage1() {
		add(new H2("Sub page 1"));

		msg = new ErrorMessage();
		add(msg);
		name = new TextField("名前");
		add(name);
		age = new TextField("年齢");
		add(age);

		binder.setStatusLabel(msg);
		binder.bindInstanceFields(this);
		binder.setBean(form);
//		binder.forField(name).withValidator((value, context) -> {
//			return ValidationResult.error("名前エラー");
//		}).bind(SubFrom1::getName, SubFrom1::setName);
		binder.withValidator((value, context) -> {
			return ValidationResult.error("エラーがあります");
		});
		binder.addStatusChangeListener(event -> {
			System.out.println(event.hasValidationErrors());
		});
		add(new RouterLink("メインページ", MainPage.class));
	}
}
