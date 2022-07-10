package jp.whitenoise.vaddinlern.ui;

import org.apache.logging.log4j.util.Strings;

import com.vaadin.flow.component.html.Span;

public class ErrorMessage extends Span {

	public ErrorMessage() {
		setMinWidth("30em");
		
		// Bootstrap
//		addClassName("alert");
//		addClassName("alert-danger");

		// バッジ
//		getElement().getThemeList().add("badge error");
		
		// Picnic
//		addClassName("warning");
		
		addClassName("error");
	}
	
	@Override
	public void setText(String text) {
		super.setText(text);
		setVisible(!Strings.isEmpty(text));
	}
}
