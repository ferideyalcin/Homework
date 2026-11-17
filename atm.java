/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.feride;

import java.util.Scanner;

/**
 *
 * @author ferid
 */
public class atm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double bakiye = 10000.0;
        int islemSayisi = 0;
        double toplamYatirilan = 0.0;
        double toplamCekilen = 0.0;
        boolean devamEt = true;

        System.out.println("Akilli ATM Sistemine Hos Geldiniz");

        while (devamEt) {
            System.out.println("Ana Menu");
            System.out.println("1. Bakiye Goruntuleme");
            System.out.println("2. Para Yatirma");
            System.out.println("3. Para Cekme");
            System.out.println("4. Cikis");
            System.out.println("Yapmak istediginiz islemi seciniz (1-4):");

            int secim = sc.nextInt();

            switch (secim) {
                case 1 -> {
                    System.out.printf("Guncel bakiyeniz: %.2f Tl\n", bakiye);
                    islemSayisi++;
                }
                case 2 -> {
                    System.out.println("Yatirmak istediginiz tutari giriniz:");
                    double yatirilanTutar = sc.nextDouble();

                    if (yatirilanTutar <= 0) {
                        System.out.println("Yanlis giris yaptiniz.");
                    } else {
                        bakiye += yatirilanTutar;
                        toplamYatirilan += yatirilanTutar;
                        islemSayisi++;
                        System.out.printf("%.2f TL yatirildi. Yeni bakiye: %.2f Tl\n", yatirilanTutar, bakiye);
                    }
                }
                case 3 -> {
                    System.out.println("Cekmek istediginiz tutari giriniz:");
                    double cekilenTutar = sc.nextDouble();

                    if (cekilenTutar <= 0) {
                        System.out.println("Yanlis giris yaptiniz.");
                    } else if (cekilenTutar > bakiye) {
                        System.out.println("Yetersiz bakiye.");
                    } else {
                        bakiye -= cekilenTutar;
                        toplamCekilen += cekilenTutar;
                        islemSayisi++;
                        System.out.printf("%.2f TL cekildi. Kalan bakiye: %.2f Tl\n", cekilenTutar, bakiye);
                    }
                }
                case 4 -> {
                    devamEt = false;
                    System.out.println("Yapilan islem sayisi: " + islemSayisi);
                    System.out.printf("Yatirilan tutar: %.2f TL\n", toplamYatirilan);
                    System.out.printf("Cekilen tutar: %.2f TL\n", toplamCekilen);
                    System.out.printf("Son bakiyeniz: %.2f TL\n", bakiye);
                }

                default ->
                    System.out.println("Gecersiz bir secim yaptiniz. 1 ile 4 arasinda bir deger giriniz.");
            }
        }

    }

}
