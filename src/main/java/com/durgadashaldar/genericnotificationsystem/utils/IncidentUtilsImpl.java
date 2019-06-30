package com.durgadashaldar.genericnotificationsystem.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.durgadashaldar.genericnotificationsystem.controllers.AppProperties;
import com.durgadashaldar.genericnotificationsystem.controllers.CommunicationUtilImpl;
import com.durgadashaldar.genericnotificationsystem.entities.Incident;
import com.durgadashaldar.genericnotificationsystem.entities.Message;
import com.durgadashaldar.genericnotificationsystem.entities.Messages;
import com.durgadashaldar.genericnotificationsystem.entities.enums.NotificationListEnum;

public class IncidentUtilsImpl  implements IncidentUtils{

	
	public Messages updateIncidentState(Incident incident,AppProperties appProperties) {
		updateIncidentStateHistory(incident);
		sendCommunication(appProperties);
		Messages messages=new Messages();
		return messages;
	}

	void updateIncidentStateHistory(Incident incident )
	{
		// Add Incident into StateHistory Master
		
	}
	
	void sendCommunication(AppProperties appProperties)
	{
		CommunicationUtilImpl communicationUtilImpl =new CommunicationUtilImpl();
		Message message = new Message();
		communicationUtilImpl.sendSms(message,appProperties);
		communicationUtilImpl.sendWhatsapp(message,appProperties);
	}
}

