package factory;

import strategy.NotificationGateway;
import strategy.SmsGateway;

public class SmsNotificationFactory implements  NotificationFactory{
@Override
public NotificationGateway createGateway () {
	
	return new SmsGateway ();
}
}
