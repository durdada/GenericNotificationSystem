package com.durgadashaldar.genericnotificationsystem.utils;

import com.durgadashaldar.genericnotificationsystem.controllers.AppProperties;
import com.durgadashaldar.genericnotificationsystem.entities.Message;
import com.durgadashaldar.genericnotificationsystem.entities.ResponseContext;

public interface CommunicationUtil {

	ResponseContext sendEmail(Message message);
	
	ResponseContext sendSms(Message message);
	
	ResponseContext sendWhatsapp(Message message,AppProperties appProperties);
	
	ResponseContext sendSlack(Message message,AppProperties appProperties);
	
	
}
