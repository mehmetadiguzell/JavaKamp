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
//O->OPEN CLOSED PRÝNCÝPLE->sisteme yeni özellik eklendiðimde mevcutta blunan yapý deðiþmemeli
