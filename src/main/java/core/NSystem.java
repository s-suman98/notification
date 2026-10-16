package core;

import decorator.RetryGateway;
import enums.NotificationType;
import model.Event;
import strategy.EmailGateway;
import strategy.NotificationGateway;
import strategy.PushGateway;
import strategy.SmsGateway;

import java.util.HashMap;

public class NSystem {


private HashMap< NotificationType, NotificationGateway > gateways;

public NSystem () {
	
	gateways=new HashMap<> ();
	
	gateways.put (NotificationType.EMAIL, new RetryGateway (new EmailGateway ()));
	gateways.put (NotificationType.PUSH, new RetryGateway ( new PushGateway ()));
	gateways.put (NotificationType.SMS,  new RetryGateway (new SmsGateway ()));
}

public void send (Event e) {
	
	gateways.get (e.getRecepient ().getChannel ().getType ()).send (e);
	
	
}
}
