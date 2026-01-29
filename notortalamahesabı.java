package javaçalışmalar;

import java.util.Scanner;

public class notortalamahesabı {

	public static void main(String[] args) {
		Scanner değer = new Scanner(System.in);
		System.out.println("Vize notunuzu giriniz");
		int vizenotu= değer.nextInt();
		System.out.println("Final notunuzu giriniz");
		int finalnotu= değer.nextInt();
		double ortalama=(vizenotu*0.4)+(finalnotu*0.6);
		System.out.println("Ortalamanız: " + ortalama);
		if(finalnotu<50) {
			System.out.println("Kaldınız");
		}
		else if(ortalama>=60) {
			System.out.println("Geçtiniz");
		}
		else if(ortalama<60) {
			System.out.println("Kaldınız");
		}	
	}
		
}
