package com.durgadashaldar.genericnotificationsystem.utils;

import com.durgadashaldar.genericnotificationsystem.controllers.AppProperties;
import com.durgadashaldar.genericnotificationsystem.entities.Incident;
import com.durgadashaldar.genericnotificationsystem.entities.Messages;

public interface IncidentUtils {
	
	Messages updateIncidentState(Incident incident,AppProperties  appProperties);
	

}
