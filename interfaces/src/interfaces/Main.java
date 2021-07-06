package interfaces;

public class Main {

	public static void main(String[] args) {
		Customer mehmet=new Customer(1,"Mehmet","Adýgüzel");
		
		Logger[] loggers={new SmsLogger(),new DatabaseLogger()};
		
		CustomerManager customerManager=new CustomerManager(loggers);
		customerManager.add(mehmet);

	}

}
