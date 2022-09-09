package day3_homework_12;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("Customer Added");
		this.logger.Log("Log Message");
	}
}