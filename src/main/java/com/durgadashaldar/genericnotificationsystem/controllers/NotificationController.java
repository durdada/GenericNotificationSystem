package com.durgadashaldar.genericnotificationsystem.controllers;



import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.durgadashaldar.genericnotificationsystem.entities.Message;
import com.durgadashaldar.genericnotificationsystem.entities.Messages;
import com.durgadashaldar.genericnotificationsystem.entities.Order;
import com.durgadashaldar.genericnotificationsystem.entities.ResponseContext;
import com.durgadashaldar.genericnotificationsystem.entities.enums.NotificationListEnum;


@Controller

@RequestMapping("/SendNotification")

@RestController
public class NotificationController {

	
		
	@RequestMapping(path= "/SendMessage" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin(origins = "*")
	public @ResponseBody ResponseContext sendMessage(@RequestBody(required = false) Messages  messages) {
		ResponseContext responseContext = new ResponseContext();
		
		return responseContext;
	}
}
