package linkedList;

import java.util.Scanner;

public class Uygulama {
	public static void main(String[] args) {
		LinkedList liste = new LinkedList();
		int secim = -1;
		Scanner inputAl = new Scanner(System.in);
		System.out.println("Hoşgeldiniz\n___________________________________");
		while (secim != 0) {
			System.out.println("Lütfen Seçim Yapınız...");
			System.out.println(
					"\t1-Başa Eleman Ekle\n\t2-Sona Eleman Ekle\n\t3-Araya Eleman Ekle\n\t4-İndex İle Eleman Sil\n\t5-Yazdır\n\t0-Çıkış");
			System.out.print("\tSeçiminiz : ");
			secim = inputAl.nextInt();
			System.out.println("---------------------------------------------------");
			if (secim == 1) {
				System.out.print("Eklenecek eleman değeri giriniz : ");
				int deger = inputAl.nextInt();
				System.out.println();
				liste.basaEkle(deger);
			} else if (secim == 2) {
				System.out.print("Eklenecek eleman değeri giriniz : ");
				int deger = inputAl.nextInt();
				System.out.println();
				liste.sonaEkla(deger);
			} else if (secim == 3) {
				System.out.print("Eklenecek eleman değeri giriniz : ");
				int deger = inputAl.nextInt();
				System.out.println();
				System.out.print("İndex giriniz : ");
				int index = inputAl.nextInt();System.out.println();
				liste.arayaEkle(deger, index);
			}else if(secim==4) {
				System.out.print("İndex giriniz : ");
				int index = inputAl.nextInt();System.out.println();
				liste.indexSil(index);
			}else if(secim==5) {
				liste.yazdir();
			}else if(secim==0) {
				System.out.println("Programdan çıkılıyor iyi günler...");
			}else {
				System.out.println("Hatalı seçim lütfen tekrar deneyiniz");
			}
		}
	}
}
