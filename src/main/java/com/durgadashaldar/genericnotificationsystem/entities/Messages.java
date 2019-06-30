package com.durgadashaldar.genericnotificationsystem.entities;

import java.util.HashMap;
import java.util.List;

import com.durgadashaldar.genericnotificationsystem.entities.enums.NotificationListEnum;

public class Messages {

	private List<HashMap<NotificationListEnum,Message>> MessageObj;

	public List<HashMap<NotificationListEnum, Message>> getMessageObj() {
		return MessageObj;
	}

	public void setMessageObj(List<HashMap<NotificationListEnum, Message>> messageObj) {
		MessageObj = messageObj;
	}

}
