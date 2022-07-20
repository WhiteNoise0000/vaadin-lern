package jp.whitenoise.vaddinlern.ui;

import com.vaadin.flow.component.customfield.CustomField;
import com.vaadin.flow.component.html.Span;

public class LabelField extends CustomField<String> {

	private final Span lblValue;
	
	public LabelField(String label, String val) {
		lblValue = new Span(val);
		lblValue.setWidthFull();
		add(lblValue);
		setLabel(label);
	}
	@Override
	protected String generateModelValue() {
		return lblValue.getText();
	}

	@Override
	protected void setPresentationValue(String newValue) {
		lblValue.setText(newValue);
	}

}
