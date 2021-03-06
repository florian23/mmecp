package de.fhg.fokus.streetlife.mmecp.client.view.siteelement;

import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

public class SiteElement<E extends Widget> implements IsWidget {

	private E panel = null;

	public SiteElement(E e, String cssID, String cssClass) {
		this.panel = e;
		this.panel.getElement().setId(cssID);

		if (cssClass != null)
			this.panel.getElement().setClassName(cssClass);

		setParentID();
	}

	public void setParentPanel(Panel p) {
		p.add(this.getPanel());
		setParentID();
	}

	private void setParentID() {
		if (!(this.getPanel() instanceof ComplexPanel))
			return;

		if (this.panel.getElement().getParentElement() != null) {
			this.panel.getElement().getParentElement()
					.setId(getPanel().getElement().getId() + "Wrapper");
			afterParanetAdded();
		}
	}

	protected void afterParanetAdded() {

	}

	public void addWidgetToPanel(Widget w, String cssID, String cssClass) {
		if (panel instanceof Panel) {
			((Panel) panel).add(w);
		} else
			return;

		setIDsOfWidget(w, cssID, cssClass);
	}

	protected void setIDsOfWidget(Widget w, String cssID, String cssClass) {
		if (cssClass != null)
			w.getElement().setClassName(cssClass);

		if (cssID == null)
			return;
		w.getElement().setId(cssID);

		if (w.getElement().getParentElement() != null) {
			w.getElement().getParentElement().setId(cssID + "Wrapper");
		}
	}

	public E getPanel() {
		return this.panel;
	}

	public String getID() {
		return this.panel.getElement().getId();
	}

	public String getWrapperID() {
		if (!(this.getPanel() instanceof ComplexPanel))
			return null;

		if (this.panel.getElement().getParentElement() != null) {
			if (this.panel.getElement().getParentElement().getId()
					.compareTo("") != 0)
				return this.panel.getElement().getParentElement().getId();
		}

		return this.panel.getElement().getId() + "Wrapper";
	}

	public Widget asWidget() {
		return getPanel();
	}
}
