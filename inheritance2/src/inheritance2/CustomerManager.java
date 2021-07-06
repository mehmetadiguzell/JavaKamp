package inheritance2;

public class CustomerManager {

	//hangi logger yolanýlýrsa onun log fonksiyonu çalýþýr.
	public void add(Logger logger) {
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi");
		
		logger.log();
	}
}
