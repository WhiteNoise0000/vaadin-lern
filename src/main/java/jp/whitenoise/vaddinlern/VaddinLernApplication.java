package jp.whitenoise.vaddinlern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;

@SpringBootApplication
@PWA(name = "Vaadin勉強", shortName = "Vaadin勉強")
@JsModule("@vaadin/vaadin-lumo-styles/presets/compact.js")
@CssImport("./styles/styles.css")
public class VaddinLernApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(VaddinLernApplication.class, args);
	}

	// @Bean
	// VaadinServiceInitListener vaadinServiceInitListener() {
	// 	return event -> {
	// 		event.addIndexHtmlRequestListener(indexHtmlResponse -> {
	// 			// workaround for https://github.com/vaadin/flow/issues/13437
	// 			indexHtmlResponse.getDocument().head().parent()
	// 					.attr("lang", Locale.getDefault().getLanguage());
	// 		});
	// 	};
	// }
}
