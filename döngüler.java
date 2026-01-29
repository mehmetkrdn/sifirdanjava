package javaçalışmalar;

public class döngüler {

	public static void main(String[] args) {
		//Döngüler, belirli bir kod bloğunun istenilen koşul sağlandığı sürece tekrar tekrar çalıştırılmasını sağlayan yapılardır. 
		for(int i=0; i<100; i++) // i++ ile i birer birer artar. Küçük 100 koşulunu sağlayana kadar döngü bloğu çalışır.
			System.out.println(i); //1den 100e kadar sayıları yazarız.
		
		int sayı = 5;
		while(sayı<15) { //şartlı döngüdür diyebiliriz.
			System.out.println(sayı);
			sayı= sayı+5; //sayı artmadığı sürece kısır döngü olur sürekli kendini tekrarlar. Fordaki mantıkla aynı orada blok içinde artıyor.
		}
		int degisken=35;
		do { //do-whileda koşula bakmadan bir kez çalıştırılır eğer koşul sağlanıyorsa basmaya devam eder ancak sağlanmıyorsa bir kez çalıştırılır.
			System.out.println(degisken);
		}while(degisken !=35); //değişken 35 değilse do döngüsüne girer. Koşul.
		
		//iç içe for
		
		for(int i=0; i<5; i++) { //iç içe forda parantez koyarız. yoksa derleyici hangisine ait olduğuun algılayamaz 
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println(); //bir satır atlatıp alt satıra geçme kodudur.
			//dıştaki şart sağlandığı sürece içteki for bitene kadar dışarı çıkılmaz.
			//i başta sıfır j'de 5. 5>0 olduğu için 5 defa * yazılır. (j döngüsünün bitmesi beklenir.)
			//j foru bitince i=1 değeri için yaparız. j 5 değeri i=1 değerinden büyüktür. İçtteki döngü 4 defa sürer. 4 defa yıldız basılır
			//Sıra sıra böyle devam eder. i'nin büyük olduğu değerde döngüler biter. 
		}
	}
}
