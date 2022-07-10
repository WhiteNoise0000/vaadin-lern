package jp.whitenoise.vaddinlern.ui;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

import lombok.Data;

@Data
public class SubFrom1 {
	
	@NotBlank
	private String name;
	
	@PositiveOrZero
	@Max(5)
	private int age;
}
