package factory;

import strategy.EmailGateway;
import strategy.NotificationGateway;

public class EmailNotificationFactory implements  NotificationFactory{
@Override
public NotificationGateway createGateway () {
	return  new EmailGateway ();
}
}
