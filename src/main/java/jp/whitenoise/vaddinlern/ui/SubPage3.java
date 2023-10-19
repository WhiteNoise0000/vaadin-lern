package jp.whitenoise.vaddinlern.ui;

import jakarta.annotation.security.PermitAll;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.wontlost.zxing.ZXingVaadinReader;
import com.wontlost.zxing.Constants;

@Route(value = "sub3", layout = MainView.class)
@PermitAll
public class SubPage3 extends VerticalLayout {

	public SubPage3() {
		ZXingVaadinReader zXingVaadin = new ZXingVaadinReader();
		zXingVaadin.setFrom(Constants.From.camera);
		zXingVaadin.setId("video"); //id needs to be 'video' if From.camera.
		zXingVaadin.setWidth("350");
		zXingVaadin.setStyle("border : 1px solid gray");
		zXingVaadin.addValueChangeListener(e -> {
			Notification.show(e.getValue());
		});
		add(zXingVaadin);
	}
}
