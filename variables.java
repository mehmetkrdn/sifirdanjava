package javaçalışmalar;
import java.time.LocalDate; //güncel tarihi alma

public class değişkenler {

	public static void main(String[] args) {
	  String isim= "mehmet";
      System.out.println(isim);
	  String isim2= "ben mehmet";
      System.out.println(isim2);
      String üni= "kocaeli üniversitesi";
      System.out.println("ismim " + isim + " okulum " + üni);
      
      char ilkharf= 'm'; //tanımlanırken char tek tırnak string çift tırnak
      System.out.println("ismimin ilk harfi " + ilkharf);
      
      int yas=22;
      System.out.println("ismim " + isim + " okulum " + üni + " yaşım " + yas);
      System.out.println(yas + isim); //stringde hesap yapmaz yan yana yazdırır
      int yıl = LocalDate.now().getYear(); // güncel tarihi aldık time kütüphanesiyle
      System.out.println(yıl-yas); //sayısal hesaplama yaptık, bunu değişken üzerinde yapıp atayabilirdik.
      // iki int varsa hesaplama yapar iki string veya string+int varsa yan yana yazar.
      double kilom= 68.6;
      System.out.println("kilom= " + kilom);
      double toplam=kilom+yas;
      System.out.println(toplam);
      //int hatalıtoplam=kilom+yas; #hesaplarken ondalık sayı çıkacağı için derleme sırasında hata verir çalışmaz.
      //System.out.println(hatalıtoplam);
      // değişken sayıyla başlamaz = 1harf yanlış adlandırma hata verir.
      // ilkkelime küçük harf ikinci kelime büyük harf kullanımı yaygındır= javaDegisken
      //değişken isimlerin anlamı olması lazım anlaşılabilirlik açısından
	}

}
