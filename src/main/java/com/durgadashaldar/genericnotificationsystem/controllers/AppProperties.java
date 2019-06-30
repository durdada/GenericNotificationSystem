package com.durgadashaldar.genericnotificationsystem.controllers;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
public class AppProperties {

	private String twilioaccountsid;
	private String twilioauthtoken;
	private String fromnumber;
	
	private String tonumber;

	public String getFromnumber() {
		return fromnumber;
	}

	public void setFromnumber(String fromnumber) {
		this.fromnumber = fromnumber;
	}

	public String getTonumber() {
		return tonumber;
	}

	public void setTonumber(String tonumber) {
		this.tonumber = tonumber;
	}

	public String getTwilioaccountsid() {
		return twilioaccountsid;
	}

	public void setTwilioaccountsid(String twilioaccountsid) {
		this.twilioaccountsid = twilioaccountsid;
	}

	public String getTwilioauthtoken() {
		return twilioauthtoken;
	}

	public void setTwilioauthtoken(String twilioauthtoken) {
		this.twilioauthtoken = twilioauthtoken;
	}

}