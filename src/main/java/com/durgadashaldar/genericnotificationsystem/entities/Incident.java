package com.durgadashaldar.genericnotificationsystem.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.durgadashaldar.genericnotificationsystem.entities.enums.NotificationListEnum;

public class Incident {

	private int incidentId;
	private CustomerCommunicationDetails customerCommunicationDetails;
	
	private String state;
	public int getIncidentId() {
		return incidentId;
	}
	public void setIncidentId(int incidentId) {
		this.incidentId = incidentId;
	}
	public CustomerCommunicationDetails getCustomerCommunicationDetails() {
		return customerCommunicationDetails;
	}
	public void setCustomerCommunicationDetails(CustomerCommunicationDetails customerCommunicationDetails) {
		this.customerCommunicationDetails = customerCommunicationDetails;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public StateHistory getStateHistory() {
		return StateHistory;
	}
	public void setStateHistory(StateHistory stateHistory) {
		StateHistory = stateHistory;
	}
	public Messages generateFakeEmailObject(Messages messages) {
		// TODO Auto-generated method stub
		
		
		List<HashMap<NotificationListEnum, Message>> mapEmailList =new ArrayList();
		HashMap<NotificationListEnum, Message> mapEmail =new HashMap<NotificationListEnum, Message>();
		Message messageEmail =new Message();
		mapEmail.put(NotificationListEnum.EMAIL, messageEmail);
		mapEmailList.add(mapEmail);
		messages.setMessageObj(mapEmailList);
		return messages;
	}
	
	public Messages generateFakeSmsObject(Messages messages) {
		// TODO Auto-generated method stub
		
		
		HashMap<NotificationListEnum, Message> mapEmail =new HashMap<NotificationListEnum, Message>();
		Message messageEmail =new Message();
		mapEmail.put(NotificationListEnum.SMS, messageEmail);
		messages.getMessageObj().add(mapEmail);
		return messages;
	}
	private StateHistory StateHistory;
}
