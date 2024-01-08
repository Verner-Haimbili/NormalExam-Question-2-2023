public class Ticket {
	int typeOfService;
	String description;

	public Ticket(int typeOfService, String description) {
		this.typeOfService = typeOfService;
		this.description = description;
	}

	public int getTypeOfService() {
		return typeOfService;
	}

	public String getDescription() {
		return description;
	}
}