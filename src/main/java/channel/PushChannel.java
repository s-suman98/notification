package channel;

import enums.NotificationType;

public class PushChannel implements  Channel{

private  String pushToken;

public PushChannel(String pushToken){
	
	if(pushToken==null||pushToken.isBlank ()){
		
		throw  new IllegalArgumentException ("push token cant be blank");
	}
	this.pushToken=pushToken;
}

@Override
public NotificationType getType () {
	return NotificationType.PUSH;
	
}
}
