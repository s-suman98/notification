package model;


import lombok.Data;

@Data
public class Event {

private  int id;

private  User recepient;

private  String subject;

private  String body;
}
