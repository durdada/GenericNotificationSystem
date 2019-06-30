package com.durgadashaldar.genericnotificationsystem.entities;

import java.util.Optional;


public class Message {
	private Optional<EMailObj> emailObj;
	private Optional<SMSObj> smsObj;
	private Optional<WhatsappOpj> whatsappOpj;
	private Optional<GenericObj> genericObj;
	public Optional<EMailObj> getEmailObj() {
		return emailObj;
	}
	public void setEmailObj(Optional<EMailObj> emailObj) {
		this.emailObj = emailObj;
	}
	public Optional<SMSObj> getSmsObj() {
		return smsObj;
	}
	public void setSmsObj(Optional<SMSObj> smsObj) {
		this.smsObj = smsObj;
	}
	public Optional<WhatsappOpj> getWhatsappOpj() {
		return whatsappOpj;
	}
	public void setWhatsappOpj(Optional<WhatsappOpj> whatsappOpj) {
		this.whatsappOpj = whatsappOpj;
	}
	public Optional<GenericObj> getGenericObj() {
		return genericObj;
	}
	public void setGenericObj(Optional<GenericObj> genericObj) {
		this.genericObj = genericObj;
	}
}
