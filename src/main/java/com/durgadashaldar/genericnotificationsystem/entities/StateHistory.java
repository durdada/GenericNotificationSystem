package com.durgadashaldar.genericnotificationsystem.entities;

import java.util.Date;

public class StateHistory {

	private int incidentId;
	private String state;
	private Date stateStartTime;
	private Date stateEndTime;
	public int getIncidentId() {
		return incidentId;
	}
	public void setIncidentId(int incidentId) {
		this.incidentId = incidentId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getStateStartTime() {
		return stateStartTime;
	}
	public void setStateStartTime(Date stateStartTime) {
		this.stateStartTime = stateStartTime;
	}
	public Date getStateEndTime() {
		return stateEndTime;
	}
	public void setStateEndTime(Date stateEndTime) {
		this.stateEndTime = stateEndTime;
	}
}
