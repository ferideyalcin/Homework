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
public class sayianaliz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int toplamAdet = 0;
        int pozitifAdet = 0;
        int negatifAdet = 0;
        int tekAdet = 0;
        int ciftAdet = 0;
        int asalAdet = 0;
        int genelToplam = 0;
        int pozitifToplam = 0;
        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        System.out.println("Sayi Analiz Programina Hosgeldiniz.");
        System.out.println("Analiz icin tam sayilar giriniz. 0 girerseniz cikis yapar.");

        while (true) {
            System.out.println("Sayi giriniz:");
            int sayi = sc.nextInt();

            if (sayi == 0) {
                break;
            }

            if (toplamAdet == 0) {
                enBuyuk = sayi;
                enKucuk = sayi;
            } else {
                if (sayi > enBuyuk) {
                    enBuyuk = sayi;
                }
                if (sayi > enKucuk) {
                    enKucuk = sayi;
                }
            }

            toplamAdet++;
            genelToplam += sayi;

            if (sayi > 0) {
                pozitifAdet++;
                pozitifToplam += sayi;
            } else {
                negatifAdet++;
            }

            if (sayi % 2 == 0) {
                ciftAdet++;
            } else {
                tekAdet++;
            }

            int geciciSayi = Math.abs(sayi);
            int basamakSayisi = 0;
            while (geciciSayi > 0) {
                geciciSayi /= 10;
                basamakSayisi++;
            }

            boolean asalMi = true;
            if (sayi <= 1) {
                asalMi = false;
            } else {
                for (int i = 2; i <= Math.sqrt(sayi); i++) {
                    if (sayi % i == 0) {
                        asalMi = false;
                        break;
                    }
                }
            }

            if (asalMi) {
                asalAdet++;
            }

            boolean mukemmelMi = false;
            if (sayi > 1) {
                int bolenToplami = 0;
                for (int i = 1; i <= sayi / 2; i++) {
                    if (sayi % i == 0) {
                        bolenToplami += i;
                    }
                }

                if (bolenToplami == sayi) {
                    mukemmelMi = true;
                }

                System.out.println("-> ["+sayi+" Analizi] Basamak:"+basamakSayisi+" | Asal:"+(asalMi ? "Evet":"Hayir")+" | Mukemmel:"+(mukemmelMi ? "Evet":"Hayir"));
            }

            System.out.println("SONUC RAPORU");
            if (toplamAdet == 0) {
                System.out.println("Analiz edilecek hiçbir sayi girilmedi.");
            } else {
                double genelOrtalama = (double) genelToplam / toplamAdet;
                double pozitifOrtalama = (pozitifAdet > 0) ? (double) pozitifToplam / pozitifAdet : 0.0;
                int fark = enBuyuk - enKucuk;

                System.out.println("Toplam Sayi Adedi:" + toplamAdet);
                System.out.println("Pozitif Sayi Adedi:" + pozitifAdet);
                System.out.println("Negatif Sayi Adedi:" + negatifAdet);
                System.out.println("Tek Sayi Adedi:" + tekAdet);
                System.out.println("Cift Sayi Adedi:" + ciftAdet);
                System.out.println("En Buyuk Sayi:" + enBuyuk);
                System.out.println("En Kucuk Sayi:" + enKucuk);
                System.out.println("Sayilarin Toplami:" + genelToplam);
                System.out.println("Aritmetik Ortalama:" + genelOrtalama);
                System.out.println("En Buyuk ve En Kucuk Farki:" + fark);
                System.out.println("Pozitif Sayilarin Ortalammasi:" + pozitifOrtalama);
                System.out.println("Asal Sayi Adedi:" + asalAdet);
            }
        }

    }

}
