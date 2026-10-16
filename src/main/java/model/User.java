package model;

import channel.Channel;
import enums.NotificationType;
import lombok.Builder;
import lombok.Data;

import java.util.Optional;

@Data
@Builder
public class User {
  private  int id;
  private  String username;
  private Channel channel;
  
}
