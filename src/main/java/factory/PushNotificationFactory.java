package factory;

import strategy.NotificationGateway;
import strategy.PushGateway;

public class PushNotificationFactory implements  NotificationFactory{
@Override
public NotificationGateway createGateway () {
	return  new PushGateway ();
}
}
