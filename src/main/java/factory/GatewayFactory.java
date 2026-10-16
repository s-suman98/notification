package factory;

import enums.NotificationType;
import strategy.EmailGateway;
import strategy.NotificationGateway;
import strategy.PushGateway;
import strategy.SmsGateway;

public class GatewayFactory {

  public static NotificationGateway getGateway(NotificationType type){
	  
	  switch ( type ){
		  
		  case SMS -> {
			  return new SmsGateway ();
		  }
		  case EMAIL -> {
			  return new EmailGateway ();
		  }
		  case PUSH -> {
			  return new PushGateway ();
		  }
		  
		  default -> throw new IllegalArgumentException ("invalid notification type");
	  }
  };
}
