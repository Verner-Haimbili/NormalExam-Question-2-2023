import java.util.LinkedList;
import java.util.Queue;

public class MTCQueueSystem {
	private Queue<Ticket> queue;

	public MTCQueueSystem() {
		queue = new LinkedList<Ticket>();
	}

	public void Enqueue(Ticket ticket) {
		queue.add(ticket);
	}

	public Ticket Dequeue() {
		Ticket removed = queue.remove();
		return removed;
	}

	public int HowManyPeopleInTheQueue() {
		return queue.size();
	}

	public int HowManyWaitinWaitingForService(int service) {
		int count = 0;
		for (Ticket ticket : queue) {
			if (ticket.getTypeOfService() == service) {
				count++;
			}
		}
		return count;
	}
}