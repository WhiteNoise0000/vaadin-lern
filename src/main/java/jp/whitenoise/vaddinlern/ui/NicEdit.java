package jp.whitenoise.vaddinlern.ui;

import java.util.Optional;
import java.util.UUID;

import com.vaadin.flow.component.Synchronize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.textfield.TextArea;

@Tag("textarea")
public class NicEdit extends TextArea {

	public NicEdit() {
		setLabel("label");
		setSizeFull();
		UI.getCurrent().getPage().addJavaScript("./nicEdit.js");
		
		addAttachListener(event -> {
			
			Optional<String> id = getId();
			if (id.isEmpty()) {
				setId(UUID.randomUUID().toString());
				id = getId();
			}
			UI.getCurrent().getPage().executeJs("new nicEditor().panelInstance($0);", id.get());
		});
	}

	@Synchronize(value = "change", property = "value")
	public String getValue() {
	    return getElement().getProperty("value");
	}
}
