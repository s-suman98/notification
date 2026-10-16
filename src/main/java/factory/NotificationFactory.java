package factory;

import strategy.NotificationGateway;

public interface NotificationFactory {
	
	NotificationGateway createGateway();
	
}
