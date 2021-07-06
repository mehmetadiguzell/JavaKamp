package inheritance;

public class CustomerManager {

	//polimorfizm
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + "eklendi");
	}
	
	
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
}
//SOLID
//O->OPEN CLOSED PR�NC�PLE->sisteme yeni �zellik eklendi�imde mevcutta blunan yap� de�i�memeli
