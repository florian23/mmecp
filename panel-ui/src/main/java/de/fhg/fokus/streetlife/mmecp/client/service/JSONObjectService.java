package de.fhg.fokus.streetlife.mmecp.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import de.fhg.fokus.streetlife.mmecp.share.dto.PanelObject;

import java.util.ArrayList;

@RemoteServiceRelativePath("JSONObject")
public interface JSONObjectService extends RemoteService {
	public PanelObject[] getPanelObject(String jSONExample);
	public PanelObject getPanelObjectByCoordinate(ArrayList<PanelObject> list);
}
