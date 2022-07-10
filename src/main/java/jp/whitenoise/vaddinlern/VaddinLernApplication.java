package jp.whitenoise.vaddinlern;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.VaadinServiceInitListener;

@SpringBootApplication
//@Theme(themeClass = Material.class)
//@Theme(themeClass = Lumo.class)
//@Theme("myapp")
@JsModule("@vaadin/vaadin-lumo-styles/presets/compact.js")
@CssImport("./styles/styles.css")
public class VaddinLernApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(VaddinLernApplication.class, args);
	}

	@Bean
	VaadinServiceInitListener vaadinServiceInitListener() {
		return event -> {
			event.addIndexHtmlRequestListener(indexHtmlResponse -> {
				// workaround for https://github.com/vaadin/flow/issues/13437
				indexHtmlResponse.getDocument().head().parent()
						.attr("lang", Locale.getDefault().getLanguage());
			});
		};
	}
}
