package com.durgadashaldar.genericnotificationsystem.entities;

import com.durgadashaldar.genericnotificationsystem.entities.enums.EmailTypeEnum;

public class EMailObj {

	private String from;
	private String fromAlias;
	private String[] to;
	private String[] cc;
	private String[] bcc;
	private String subject;
	private String body;
	private EmailTypeEnum emailType;
	private Attachments[] attachment;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getFromAlias() {
		return fromAlias;
	}
	public void setFromAlias(String fromAlias) {
		this.fromAlias = fromAlias;
	}
	public String[] getTo() {
		return to;
	}
	public void setTo(String[] to) {
		this.to = to;
	}
	public String[] getCc() {
		return cc;
	}
	public void setCc(String[] cc) {
		this.cc = cc;
	}
	public String[] getBcc() {
		return bcc;
	}
	public void setBcc(String[] bcc) {
		this.bcc = bcc;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public EmailTypeEnum getEmailType() {
		return emailType;
	}
	public void setEmailType(EmailTypeEnum emailType) {
		this.emailType = emailType;
	}
	public Attachments[] getAttachment() {
		return attachment;
	}
	public void setAttachment(Attachments[] attachment) {
		this.attachment = attachment;
	}

}
