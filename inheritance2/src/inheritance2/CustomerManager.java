package inheritance2;

public class CustomerManager {

	//hangi logger yolan�l�rsa onun log fonksiyonu �al���r.
	public void add(Logger logger) {
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi");
		
		logger.log();
	}
}
