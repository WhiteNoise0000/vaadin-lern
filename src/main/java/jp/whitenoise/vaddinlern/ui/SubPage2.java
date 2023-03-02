package jp.whitenoise.vaddinlern.ui;

import jakarta.annotation.security.RolesAllowed;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route(value = "sub2", layout = MainView.class)
@RolesAllowed("ADMIN")
public class SubPage2 extends VerticalLayout {

	private final Paragraph label;
	
	public SubPage2() {
		add(new H2("Sub page 2"));
		add("管理者のみ見えるページです");

		// CKEditor5 → ライセンスがGPL2+で使いにくい？
		//		Toolbar[] toolbar = new Toolbar[] {
		//				Toolbar.fontFamily, Toolbar.fontSize,
		//				Toolbar.bold, Toolbar.italic, Toolbar.underline, Toolbar.strikethrough,
		//				Toolbar.alignment, Toolbar.fontColor, Toolbar.highlight,
		//				Toolbar.undo, Toolbar.redo, };
		//		Config config = new Config();
		//		config.setEditorToolBar(toolbar);
		//		config.setPlaceHolder("Here is a place holder");
		//		config.setUILanguage(Language.ja);
		//		VaadinCKEditor editor = new VaadinCKEditorBuilder().with(builder -> {
		//			builder.config = config;
		//			builder.editorData = "<p>This is a classic editor sample.</p>";
		//			builder.editorType = EditorType.CLASSIC;
		//		}).createVaadinCKEditor();
		//		editor.setWidth("80%");
		//		add(editor);
		
		// TinyMCE
//		TinyMce editor = new TinyMce();
//		editor.setConfig("{\"language_url\": \"/ja.js\", \"language\": \"ja\", \"elementpath\": false}");
		//		editor.setWidthFull();
//		add(editor);

		NicEdit editor = new NicEdit();
		editor.setSizeFull();
		editor.setId("editor");
		add(editor);
		
		label = new Paragraph();
		add(new Button("入力確定", event -> label.getElement().setProperty("innerHTML", editor.getValue())));
		add(label);
		add(new RouterLink("メインページ", MainPage.class));
	}
}
