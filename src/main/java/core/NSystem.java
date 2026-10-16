package core;

import decorator.RetryGateway;
import enums.NotificationType;
import model.Event;
import strategy.EmailGateway;
import strategy.NotificationGateway;
import strategy.PushGateway;
import strategy.SmsGateway;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NSystem {


private HashMap< NotificationType, NotificationGateway > gateways;


private final ExecutorService executor;

public NSystem () {
	
	gateways = new HashMap<> ();
	
	this.executor = Executors.newFixedThreadPool (10);
	
	gateways.put (NotificationType.EMAIL, new RetryGateway (new EmailGateway ()));
	gateways.put (NotificationType.PUSH, new RetryGateway (new PushGateway ()));
	gateways.put (NotificationType.SMS, new RetryGateway (new SmsGateway ()));
}


public void send (Event e) {
	
	
	executor.submit (() -> {
		gateways.get (e.getRecepient ().getChannel ().getType ()).send (e);
		
		
	});
	
	
}

public void shutDown(){
	executor.shutdown ();
}
}
