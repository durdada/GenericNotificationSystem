# GenericNotificationSystem


Most applications have the need to implement notifications for a variety of use cases and scenarios. 

Create a centralized generic service for notification that can be used by a variety consuming application for their notification needs 

e.g. an incident workflow system may use this system when each incident ticket moves from one state to another,
similarly a order management system may use this service to notify the customer of the status of the order whenever it changes  The system should allow for the following capabilities:

1.	Accept messages including from, to and subject 
2.	Ability to notify on multiple channels (e.g email, slack, you can stub out/mock if required)
3.	Deliver messages in correct order for each consumer of this 

Setup:

Installation : Checkout and run "mvn clean install"

Run : java -jar target/genericnotificationsys-0.0.1-SNAPSHOT.jar

This app has intergration with twilio , please register & create your own auth-sid and then update in application.properties

For SMS & Whatsapp, you have to go an register your number in #Phonenumbers @ Twilip Support section ( THat too is part of applciation.properties
  
Swagger API URL : http://localhost:9030/swagger-ui.html

Main API : localhost:9030/IncidentStateManager/UpdateIncident

{
  "customerCommunicationDetails": {
    "emailId": "string",
    "mobile": "string",
    "name": "string"
  },
  "incidentId": 0,
  "state": "string",
  "stateHistory": {
    "incidentId": 0,
    "state": "string",
    "stateEndTime": "2019-06-30T12:06:26.736Z",
    "stateStartTime": "2019-06-30T12:06:26.736Z"
  }
}

Response :

{
  "entities": [
    {}
  ],
  "errorCodes": "NetworkTimedOut",
  "executionResponse": true,
  "stackTraceElement": {
    "className": "string",
    "fileName": "string",
    "lineNumber": 0,
    "methodName": "string",
    "nativeMethod": true
  }
}
