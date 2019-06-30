package com.durgadashaldar.genericnotificationsystem.controllers;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.durgadashaldar.genericnotificationsystem.entities.Incident;
import com.durgadashaldar.genericnotificationsystem.entities.Messages;
import com.durgadashaldar.genericnotificationsystem.entities.ResponseContext;
import com.durgadashaldar.genericnotificationsystem.utils.IncidentUtilsImpl;


@Controller

@RequestMapping("/IncidentStateManager")
	
@RestController
public class IncidentWorkflowController {


	@Autowired 
	 AppProperties appProperties;
	 
	 


	 
	@RequestMapping(path="/UpdateIncident", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin(origins = "*")
	public @ResponseBody ResponseContext updateIncident(@RequestBody(required = true) Incident incident) {
		IncidentUtilsImpl incidentUtilsImpl=new IncidentUtilsImpl();
		
		
		

		Messages messages=new Messages();
		messages=incidentUtilsImpl.updateIncidentState(incident,appProperties);
		
		
		return null;
	}
	
	
}
