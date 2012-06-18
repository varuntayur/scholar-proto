package com.varun.scholar.client.view;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.widget.client.TextButton;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.core.client.util.Padding;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer.BorderLayoutData;
import com.sencha.gxt.widget.core.client.container.Container;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;
import com.sencha.gxt.widget.core.client.container.VBoxLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VBoxLayoutContainer.VBoxLayoutAlign;
import com.sencha.gxt.widget.core.client.form.FieldSet;

public class HomePageView implements IsWidget,
		com.varun.scholar.client.presenter.HomePagePresenter.Display {
	public Widget asWidget() {

		final BorderLayoutContainer con = new BorderLayoutContainer();
		con.setBorders(false);

		HTML north = buildNorthPanel();
		BorderLayoutData northData = buildNorthPanelLayoutData();

		Container center = buildCenterPanel();
		MarginData centerData = buildCenterPanelLayoutData();

		ContentPanel east = buildEastPanel();
		BorderLayoutData eastData = buildEastPanelLayoutData();

		con.setNorthWidget(north, northData);
		con.setCenterWidget(center, centerData);
		con.setEastWidget(east, eastData);

		SimpleContainer simple = new SimpleContainer();
		simple.add(con, new MarginData(1));

		return simple;
	}

	private BorderLayoutData buildEastPanelLayoutData() {
		BorderLayoutData eastData = new BorderLayoutData(150);
		eastData.setMargins(new Margins(0, 5, 0, 5));
		eastData.setCollapsible(true);
		eastData.setSplit(true);
		return eastData;
	}

	private ContentPanel buildEastPanel() {
		ContentPanel east = new ContentPanel();
		return east;
	}

	private MarginData buildCenterPanelLayoutData() {
		MarginData centerData = new MarginData();
		return centerData;
	}

	private Container buildCenterPanel() {
		VBoxLayoutContainer center = new VBoxLayoutContainer();
		center.setPadding(new Padding(5));
		center.setVBoxLayoutAlign(VBoxLayoutAlign.STRETCHMAX);
		center.setBorders(false);

		center.add(buildStudentMenu());
		center.add(buildStaffMenu());
		center.add(buildAdministrationMenu());
		center.add(buildLibraryMenu());
		center.add(buildOtherMenu());

		return center;
	}

	private BorderLayoutData buildNorthPanelLayoutData() {
		BorderLayoutData northData = new BorderLayoutData(35);
		northData.setCollapsible(false);
		northData.setSplit(false);
		return northData;
	}

	private HTML buildNorthPanel() {
		HTML north = new HTML();
		north.setText("Scholar");
		north.setStylePrimaryName("x-logo");
		return north;
	}

	private FieldSet buildStudentMenu() {
		FieldSet fieldSet = new FieldSet();
		fieldSet.setHeadingText("Student");
		fieldSet.setCollapsible(true);
		
		fieldSet.add(new TextButton("Attendance"));
		fieldSet.add(new TextButton("Lookup/Search"));
		fieldSet.add(new TextButton("Course/Examination"));
		fieldSet.add(new TextButton("Reports"));

		return fieldSet;
	}

	private FieldSet buildStaffMenu() {
		FieldSet fieldSet = new FieldSet();
		fieldSet.setHeadingText("Staff");
		fieldSet.setCollapsible(true);

		return fieldSet;
	}

	private FieldSet buildAdministrationMenu() {
		FieldSet fieldSet = new FieldSet();
		fieldSet.setHeadingText("Administration");
		fieldSet.setCollapsible(true);

		return fieldSet;
	}

	private FieldSet buildLibraryMenu() {
		FieldSet fieldSet = new FieldSet();
		fieldSet.setHeadingText("Library");
		fieldSet.setCollapsible(true);

		return fieldSet;
	}

	private FieldSet buildOtherMenu() {
		FieldSet fieldSet = new FieldSet();
		fieldSet.setHeadingText("Other");
		fieldSet.setCollapsible(true);

		return fieldSet;
	}

	@Override
	public HasClickHandlers getButton() {
		return null;
	}

}
