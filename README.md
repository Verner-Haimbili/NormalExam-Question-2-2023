## Question-2-2023

Given the following classes, implement the methods:

HowManyPeopleInTheQueue, returns the number of people in the queue.

HowManyWaitingForService,returns how many people are in the queue waiting for a specific type of service. Type of service is used to determine who will help the person, some types of services are account enquiries, new contracts, etc. Notice that each type of service is represented in the system by an integer number.

class Ticket{
  int service;
  String description;
  
  ...
  public int getTypeOfService(){
     return type of service;
   }
}

class MTCQueueSystem{
  private Queue<Ticket> queue;
  
  ...

  public int HowManyPeopleInTheQueue(){}

  public int HowManyWaitingForService(){}

  Note: You can only use methods of class Queue implemented in class. In the end, the queue must be in the same state as it was at the beginning.

  
