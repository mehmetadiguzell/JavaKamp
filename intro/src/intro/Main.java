package intro;

public class Main {

	public static void main(String[] args) {
		// veri tipleri && de�i�kenler
		//camelCase
		//Don't repeat yourself
		String internetSubeButton="�nternet �ubesi";
		double dolarDun=8.18;
		double dolarBugun=8.18;
		int vade=36;
		boolean dustuMu=false;
		System.out.println(internetSubeButton);
		
		//Ko�ullu �fadeler
		if (dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmini g�ster");
		}else if(dolarBugun>dolarDun) {		
			System.out.println("Dolar y�kseldi resmini g�ster");
		}		
		else {		
			System.out.println("Dolar de�i�medi resmini g�ster");
		}
		//Array->veri seti
		/*
		String kredi1="kredi1";
		String kredi2="kredi2";
		String kredi3="kredi3";
		String kredi4="kredi4";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		*/
		String[] krediler={"kredi1","kredi2","kredi3","kredi4"};
		
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		System.out.println("------------");
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		//de�er tip referans tip
		
		System.out.println("--De�er Tipler---");
		
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		System.out.println("-----");
		System.out.println("--referans Tipler---");
		
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2={10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		System.out.println("-----");
			
		String sehir1="�stanbul";
		String sehir2="Ankara";
		sehir1=sehir2;
		sehir2="Diyarbak�r";
		System.out.println(sehir1);
	}	
}
