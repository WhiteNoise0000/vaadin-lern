package jp.whitenoise.vaddinlern.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import com.vaadin.flow.component.datepicker.DatePicker;

public class JpnDataPicker extends DatePicker.DatePickerI18n {

	public JpnDataPicker() {
		List<String> names = new ArrayList<>(12);
		IntStream.range(1, 12).forEach(n -> names.add(n + "月"));
		setMonthNames(names);
		setWeekdays(List.of("日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日"));
		setWeekdaysShort(List.of("日", "月", "火", "水", "木", "金", "土"));
		setFirstDayOfWeek(0);
		setToday("今日");
		setCancel("キャンセル");
	}
}
