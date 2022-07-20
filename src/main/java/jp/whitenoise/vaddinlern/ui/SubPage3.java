package jp.whitenoise.vaddinlern.ui;

import javax.annotation.security.PermitAll;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.grid.HeaderRow;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import mybatis.mapper.ActorInfoMapper;
import mybatis.model.ActorInfo;

@Route(value = "sub3", layout = MainView.class)
@PermitAll
public class SubPage3 extends VerticalLayout {

	public SubPage3(@Autowired ActorInfoMapper actorInfoMapper) {
		Grid<ActorInfo> grid = new Grid<>(ActorInfo.class);
		grid.addThemeVariants(GridVariant.LUMO_COLUMN_BORDERS,
		        GridVariant.LUMO_NO_ROW_BORDERS, GridVariant.LUMO_ROW_STRIPES);
		grid.setItems(query -> {
			return actorInfoMapper.selectAllForPaging(query.getLimit(), query.getOffset()).stream();
		});
		grid.setPageSize(100);
		grid.setColumnReorderingAllowed(true);
		grid.setSortableColumns();
		// Create a header row
		HeaderRow topRow = grid.prependHeaderRow();
		topRow.join(grid.getColumnByKey("firstName"), grid.getColumnByKey("lastName"))
		        .setComponent(new Label("Name"));
		add(grid);
	}
}
