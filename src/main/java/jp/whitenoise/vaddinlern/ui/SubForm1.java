package jp.whitenoise.vaddinlern.ui;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

import com.vaadin.flow.data.binder.ValidationResult;
import com.vaadin.flow.data.binder.Validator;
import com.vaadin.flow.data.binder.ValueContext;

import lombok.Data;

@Data
public class SubForm1 {

	@NotBlank
	private String name;

	@PositiveOrZero
	@Max(5)
	private Integer age;

	public Validator<SubForm1> createValidator() {
		return new Validator<SubForm1>() {
			@Override
			public ValidationResult apply(SubForm1 value, ValueContext context) {
				if ("ok".equals(value.getName())) {
					return ValidationResult.ok();
				}
				return ValidationResult.error("エラーがあります");
			}
		};
	}
}
