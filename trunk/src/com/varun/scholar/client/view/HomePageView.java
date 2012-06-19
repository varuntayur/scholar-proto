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
import com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutData;
import com.sencha.gxt.widget.core.client.container.Container;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer.HBoxLayoutAlign;
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

//		SimpleContainer simple = new SimpleContainer();
//		simple.add(con, new MarginData(1));

		return con;
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
		east.setHeadingText("News Feed");
		return east;
	}

	private MarginData buildCenterPanelLayoutData() {
		MarginData centerData = new MarginData();
		return centerData;
	}

	private Container buildCenterPanel() {
		ContentPanel panel = new ContentPanel();

		VBoxLayoutContainer center = new VBoxLayoutContainer();
		center.setPadding(new Padding(5));
		center.setVBoxLayoutAlign(VBoxLayoutAlign.STRETCH);
		center.setBorders(false);
		panel.add(center);

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

		HBoxLayoutContainer c = new HBoxLayoutContainer();
		c.setPadding(new Padding(5));
		c.setHBoxLayoutAlign(HBoxLayoutAlign.MIDDLE);

		TextButton attendance = new TextButton("Attendance");
		attendance.setStylePrimaryName("x-btn");
		c.add(attendance, new BoxLayoutData(new Margins(0, 5, 0, 0)));
		c.add(new TextButton("Lookup/Search"), new BoxLayoutData(new Margins(0,
				5, 0, 0)));
		c.add(new TextButton("Course/Examination"), new BoxLayoutData(
				new Margins(0, 5, 0, 0)));
		c.add(new TextButton("Reports"), new BoxLayoutData(new Margins(0)));

		fieldSet.add(c);

		return fieldSet;
	}

	private FieldSet buildStaffMenu() {
		FieldSet fieldSet = new FieldSet();
		fieldSet.setHeadingText("Staff");
		fieldSet.setCollapsible(true);

		HBoxLayoutContainer c = new HBoxLayoutContainer();
		c.setPadding(new Padding(5));
		c.setHBoxLayoutAlign(HBoxLayoutAlign.MIDDLE);

		c.add(new TextButton("Attendance"), new BoxLayoutData(new Margins(0, 5,
				0, 0)));
		c.add(new TextButton("Lookup/Search"), new BoxLayoutData(new Margins(0,
				5, 0, 0)));
		c.add(new TextButton("TimeTable"), new BoxLayoutData(new Margins(0, 5,
				0, 0)));
		c.add(new TextButton("Reports"), new BoxLayoutData(new Margins(0)));

		fieldSet.add(c);

		return fieldSet;
	}

	private FieldSet buildAdministrationMenu() {
		FieldSet fieldSet = new FieldSet();
		fieldSet.setHeadingText("Administration");
		fieldSet.setCollapsible(true);

		HBoxLayoutContainer c = new HBoxLayoutContainer();
		c.setPadding(new Padding(5));
		c.setHBoxLayoutAlign(HBoxLayoutAlign.MIDDLE);

		c.add(new TextButton("Payroll"), new BoxLayoutData(new Margins(0, 5, 0,
				0)));
		c.add(new TextButton("Fee Collection"), new BoxLayoutData(new Margins(
				0, 5, 0, 0)));
		c.add(new TextButton("Inventory"), new BoxLayoutData(new Margins(0, 5,
				0, 0)));
		c.add(new TextButton("Admissions"), new BoxLayoutData(new Margins(0)));

		fieldSet.add(c);

		return fieldSet;
	}

	private FieldSet buildLibraryMenu() {
		FieldSet fieldSet = new FieldSet();
		fieldSet.setHeadingText("Library");
		fieldSet.setCollapsible(true);

		HBoxLayoutContainer c = new HBoxLayoutContainer();
		c.setPadding(new Padding(5));
		c.setHBoxLayoutAlign(HBoxLayoutAlign.MIDDLE);

		c.add(new TextButton("Inventory"), new BoxLayoutData(new Margins(0, 5,
				0, 0)));
		c.add(new TextButton("Lookup/Search"), new BoxLayoutData(new Margins(0,
				5, 0, 0)));
		c.add(new TextButton("OPAC"),
				new BoxLayoutData(new Margins(0, 5, 0, 0)));
		c.add(new TextButton("Reports"), new BoxLayoutData(new Margins(0)));

		fieldSet.add(c);

		return fieldSet;
	}

	private FieldSet buildOtherMenu() {
		FieldSet fieldSet = new FieldSet();
		fieldSet.setHeadingText("Other");
		fieldSet.setCollapsible(true);

		HBoxLayoutContainer c = new HBoxLayoutContainer();
		c.setPadding(new Padding(5));
		c.setHBoxLayoutAlign(HBoxLayoutAlign.MIDDLE);

		c.add(new TextButton("Inventory"), new BoxLayoutData(new Margins(0, 5,
				0, 0)));
		c.add(new TextButton("Transport"), new BoxLayoutData(new Margins(0, 5,
				0, 0)));
		c.add(new TextButton("Issue Memo"), new BoxLayoutData(new Margins(0, 5,
				0, 0)));
		c.add(new TextButton("Publish School Events"), new BoxLayoutData(
				new Margins(0, 5, 0, 0)));

		c.add(new TextButton("Users/Roles"), new BoxLayoutData(new Margins(0)));

		fieldSet.add(c);

		return fieldSet;
	}

	@Override
	public HasClickHandlers getButton() {
		return null;
	}

}
