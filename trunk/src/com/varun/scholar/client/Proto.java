package com.varun.scholar.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.varun.scholar.client.view.HomePageView;

public class Proto implements EntryPoint {

	public void onModuleLoad() {
		HomePageView con = new HomePageView();
		
		Viewport viewport = new Viewport();
//		viewport.add(con.asWidget(), new MarginData(15));
		viewport.add(con.asWidget(), new MarginData(5));
		viewport.setBorders(true);
		
		RootPanel.get().add(viewport);
	}
}
