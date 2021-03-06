package de.fhg.fokus.streetlife.mmecp.client.view.dia;

import com.google.gwt.user.client.ui.IsWidget;

public abstract class Chart implements IsWidget {

	private DiagramData data;

	public Chart(DiagramData diagramData) {
		setData(diagramData);
	}

	public DiagramData getData() {
		return data;
	}

	public void setData(DiagramData data) {
		this.data = data;
	}
}
