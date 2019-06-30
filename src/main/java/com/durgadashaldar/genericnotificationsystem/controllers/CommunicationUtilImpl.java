package com.durgadashaldar.genericnotificationsystem.controllers;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.durgadashaldar.genericnotificationsystem.entities.ResponseContext;
import com.durgadashaldar.genericnotificationsystem.utils.CommunicationUtil;

public class CommunicationUtilImpl implements CommunicationUtil {

		
		public ResponseContext sendEmail(com.durgadashaldar.genericnotificationsystem.entities.Message message) {
		// TODO Auto-generated method stub
		return null;
	}
		
		 @GetMapping("/twilioaccountsid")
		 public String getTwilioaccountsid(AppProperties appProperties)
		 {
		  return appProperties.getTwilioaccountsid();
		  
		 }
		 
		 @GetMapping("/twilioauthtoken")
		 public String getTwilioauthtoken(AppProperties appProperties)
		 {
				  return appProperties.getTwilioauthtoken();
		 }
		 
		 @GetMapping("/fromnumber")
		 public String getFromnumber(AppProperties appProperties)
		 {
				  return appProperties.getFromnumber();
		 }
		 
		 @GetMapping("/tonumber")
		 public String getTonumber(AppProperties appProperties)
		 {
				  return appProperties.getTonumber();
		 }
		 
		 
		 

	public ResponseContext sendSms(com.durgadashaldar.genericnotificationsystem.entities.Message message, AppProperties appProperties) {
	Twilio.init(getTwilioaccountsid(appProperties),getTwilioauthtoken(appProperties));

        Message messageTw;
		try {
			messageTw = Message
			        .creator(new PhoneNumber(getFromnumber(appProperties)), // to
			                new PhoneNumber(getTonumber(appProperties)), // from
			                "Test SMS?")
			        .create();
			System.out.println(messageTw.getSid());
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

        
    }
		
	

	public ResponseContext sendWhatsapp(com.durgadashaldar.genericnotificationsystem.entities.Message message,AppProperties appProperties) {
		try {
			Twilio.init(getTwilioaccountsid(appProperties),getTwilioauthtoken(appProperties));
			Message messageTw = Message.creator(
			        new com.twilio.type.PhoneNumber("whatsapp:"+getFromnumber(appProperties)),
			        new com.twilio.type.PhoneNumber("whatsapp:"+getTonumber(appProperties)),
			        "Hello there!")
			    .create();

			System.out.println(messageTw.getSid());
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ResponseContext sendSlack(com.durgadashaldar.genericnotificationsystem.entities.Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseContext sendSms(com.durgadashaldar.genericnotificationsystem.entities.Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseContext sendSlack(com.durgadashaldar.genericnotificationsystem.entities.Message message,
			AppProperties appProperties) {
		// TODO Auto-generated method stub
		return null;
	}

}
