package jp.whitenoise.vaddinlern.ui;

import javax.annotation.security.PermitAll;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route(layout = MainView.class)
@PermitAll
public class MainPage extends VerticalLayout {

	public MainPage() {
		VerticalLayout todosList = new VerticalLayout();
		TextField taskField = new TextField();
		Button addButton = new Button("追加");
		addButton.addClickListener(click -> {
			if (taskField.isEmpty())
				return;
			Checkbox checkbox = new Checkbox(taskField.getValue());
			todosList.add(checkbox);
			taskField.clear();
		});
		addButton.addClickShortcut(Key.ENTER);

		Button clearButton = new Button("完了済み削除");
		clearButton.setIcon(VaadinIcon.DEL.create());
		clearButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
		clearButton.addClickListener(event -> {
			todosList.getChildren().forEach(t -> {
				if (t instanceof Checkbox && ((Checkbox) t).getValue()) {
					todosList.remove(t);
				}
			});
		});

		Button subButton = new Button("サブページ");
		subButton.addClickListener(event -> UI.getCurrent().navigate(SubPage1.class));

		DatePicker picker = new DatePicker("日付");
		picker.setI18n(new JpnDataPicker());
		add(
			new H2("Todoリスト"),
			todosList,
			new HorizontalLayout(
					taskField,
					addButton),
			clearButton,
			new H3("日付ピッカーのローカライズ検証"),
			picker, 
			new H3("別ページへのリンクボタン"),
			subButton);
		
	}
}
