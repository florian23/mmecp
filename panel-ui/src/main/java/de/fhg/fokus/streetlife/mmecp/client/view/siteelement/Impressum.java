package de.fhg.fokus.streetlife.mmecp.client.view.siteelement;

import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

import de.fhg.fokus.streetlife.mmecp.client.Res;

public class Impressum extends SiteElement<VerticalPanel> {

	private static Impressum instance = null;
	public static final String cssID = "ImprintPanel";

	private Impressum() {
		super(new VerticalPanel(), Impressum.cssID, null);
		buildPanel();
	}

	private void buildPanel() {
		HTMLPanel dynContent = new HTMLPanel(Res.INSTANCE
				.streetlifePanelImprint().getText());
		addWidgetToPanel(dynContent, "imprintHTMLPanel", null);
	}

	public static Impressum get() {
		if (instance == null) {
			instance = new Impressum();
		}
		return instance;
	}
}
