package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		//***** Claslar referans tipdir.
		
		Product product1=new Product(1,"Lenovo",2555.5,"Açýklama",10);//referans oluþturma,instance
		
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("Lenovo v15");
		product2.setDetail("16 GB");
		product2.setUnitPrice(1500);
		product2.setDiscount(10);
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Product product3=new Product();

		Category category1=new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		
		/*
		 * Product[] products= {product1,product2,product3};
		 * 
		 * for (Product product : products) { System.out.println(product.name); }
		 * 
		 * Category category1=new Category(); category1.id=1;
		 * category1.name="Bilgisayar";
		 * 
		 * Category category2=new Category(); category2.id=2;
		 * category2.name="Elektronik";
		 * 
		 * ProductManager productManager=new ProductManager();
		 * productManager.addToCart(product1);
		 * 
		 * productManager.addToCart(product2);
		 * 
		 * productManager.addToCart(product2);
		 */

	}

}
