
public class MTCQueueApp {

	public static void main(String[] args) {

		MTCQueueSystem QueueSystem = new MTCQueueSystem();

		Ticket tick1 = new Ticket(1, "Account Enquiry");
		Ticket tick2 = new Ticket(2, "New Contracts");
		Ticket tick3 = new Ticket(2, "New Contracts");
		Ticket tick4 = new Ticket(1, "Account Enquiry");

		QueueSystem.Enqueue(tick4);
		QueueSystem.Enqueue(tick2);
		QueueSystem.Enqueue(tick1);
		QueueSystem.Enqueue(tick3);

		System.out.println("How many people in the queue: " + QueueSystem.HowManyPeopleInTheQueue());
		System.out.println(
				"How many waiting for specific type of service: " + QueueSystem.HowManyWaitinWaitingForService(1));
	}

}
