package com.varun.scholar.client.presenter;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Widget;

public class HomePagePresenter {

	public interface Display {
		HasClickHandlers getButton();

		Widget asWidget();
	}
}
