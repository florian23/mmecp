package de.fhg.fokus.streetlife.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;

public interface Res extends ClientBundle {
  public static final Res INSTANCE =  GWT.create(Res.class);

  @Source("../res/pictures/Streetlife.png")
  public ImageResource streetlifeImage();
  
  @Source("../res/text/streetlife_panel_imprint.htm")
  TextResource streetlifePanelImprint();
}