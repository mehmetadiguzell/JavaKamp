package interfaces;

public class Main {

	public static void main(String[] args) {
		Customer mehmet=new Customer(1,"Mehmet","Ad�g�zel");
		
		Logger[] loggers={new SmsLogger(),new DatabaseLogger()};
		
		CustomerManager customerManager=new CustomerManager(loggers);
		customerManager.add(mehmet);

	}

}
