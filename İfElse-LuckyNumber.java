package javaçalışmalar;

import java.util.Scanner;

public class değişkenlerLuckyNumber {

	public static void main(String[] args) {
		Scanner okuyucu = new Scanner(System.in); //kullanıcıdan input yani giriş alma.
		//değişkenimiz inputu system.in'den yani sistem(konsoldan) alır. scanenr.in konsoldan alınan girdiyi temsil eder.
		//newde scanner sınıfıdan nesne üretiriz
		System.out.println("isminiz nedir");
		String isim = okuyucu.next(); //konsoldan okunan okuyucu nesnesini isim değişkenimize atama işlemi yapılır.
		System.out.println("isminiz: " + isim); //okuyucuya yazılan değer isim değişkenine atılır bizde onu bu sayede ekrana yazdırırız.
		System.out.println("yaşınız kaç");
		int yas= okuyucu.nextInt(); //int de nextInt alınır değişken farkından kaynaklı
		
		int harfsayısı=isim.length(); //isim değişkenin harf sayısını başka değişe atadık bunu Length hesapladı
		int sanslısayı=0;
		if(yas<15) {    //if ile koşul bloğu koyarız ona göre yönlendirme olur
			sanslısayı=(harfsayısı*yas)%10; // % işareti mod almadır. kalan değerini verir.
		}
		else if (yas<40) { //else if de if gibi çalışır sadece isim farkı var
			sanslısayı= (yas*yas-harfsayısı) % 10;
		}
		else { //else ise if ve elseif aralığının veya istenilen şeyin dışında olan kısmı temsil eder.
			sanslısayı= (yas*harfsayısı*harfsayısı)%10;
		}
		
		if(sanslısayı<0) 
			sanslısayı=sanslısayı*-1; //if bloğu tek satırsa parantez koymaya gerek yok.
		
		System.out.println("şanslı sayınız: " + sanslısayı);

		}
	}

