package com.durgadashaldar.genericnotificationsystem.controllers;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.durgadashaldar.genericnotificationsystem.entities.Order;
import com.durgadashaldar.genericnotificationsystem.entities.ResponseContext;


@Controller

@RequestMapping("/OrderManagementController")
	
@RestController
public class OrderManagementController {

	
	@RequestMapping(name="UpdateOrder", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin(origins = "*")
	public @ResponseBody ResponseContext updateOrder(@RequestBody(required = true) Order order) {
		return null;
	}
}
