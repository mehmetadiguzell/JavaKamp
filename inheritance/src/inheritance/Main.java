package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer mehmet=new IndividualCustomer();
		mehmet.customerNumber="1111";
		
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.customerNumber="3333";
	
		
		Customer[] customers= {mehmet,hepsiBurada};
		
		
		CustomerManager manager=new CustomerManager();
		
		//manager.add(hepsiBurada);
		//manager.add(mehmet);
		manager.addMultiple(customers);
		

	}
}
 