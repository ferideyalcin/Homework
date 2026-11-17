/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.feride;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ferid
 */
public class donguler {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rastgele = new Random();
        System.out.println("Bir sayi giriniz:");
        int sayi = sc.nextInt();
        
        int tekToplam=0;
        int ciftToplam=0;
        
        for(int i=1; i<=sayi; i++){
            System.out.println(i);
   
        if(i%2==0){
            ciftToplam+=i;
        }else{
            tekToplam+=i;
        }
        }
        
        System.out.println("Cift sayilarin toplami:" + ciftToplam);
        System.out.println("Tek sayilarin toplami:" + tekToplam);
        
        System.out.println("Bir sayi giriniz:");
        int sayi2 = sc.nextInt();
        
        for(int i=1; i<=10; i++){
            int sonuc=sayi2*i;
            System.out.println(sayi2 + "*" + i + "=" + sonuc);
    }
        
        System.out.println("Bir sayi giriniz:");
        int sayi3 = sc.nextInt();
        
        if(sayi3<0){
            System.out.println("Negatif sayi girdiniz.");
        }else{
            long faktoriyel=1;
            for(int i=1; i<=sayi3; i++){
                faktoriyel*=i;
            }
        System.out.println(sayi3 + "!=" + faktoriyel);
        }
        
        System.out.println("Bir sayi giriniz:");
        int sayi4 = sc.nextInt();
        
        int basamakSayisi=0;
        
        if(sayi==0){
            basamakSayisi=1;
        }else{
            while(sayi4!=0){
                sayi4 /=10;
                basamakSayisi++;
            }
        }
        
        System.out.println("Girdiginiz sayi " + basamakSayisi + " basamaklidir.");
        
        System.out.println("Bir sayi giriniz:");
        int sayi5 = sc.nextInt();
        
        int tersSayi=0;
        
        while(sayi5!=0){
            int sonBasamak=sayi5%10;
            tersSayi=(tersSayi*10)+sonBasamak;
            sayi5/=10;
        }
        
        System.out.println("Sayinin tersi:"+tersSayi);
        
        System.out.println("Bir sayi giriniz:");
        int sayi6 = sc.nextInt();
        
        boolean asalMi=true;
        
        if(sayi6<=1){
            asalMi=false;
        }else{
            for(int i=2; i<=sayi6/2;i++){
                if(sayi6%i==0){
                    asalMi=false;
                    break;
                }
            }
        }
        
        if(asalMi){
            System.out.println(sayi6 + " asal bir sayidir.");
        }else{
            System.out.println(sayi6 + " asal bir sayi degildir.");
        }
        
        int tutulanSayi=rastgele.nextInt(100)+1;
        int tahmin=0;
        int denemeSayisi=0;
        
        System.out.println("1 ile 100 arasinda bir sayi tuttum. Tahmin et.");
        
        while(tahmin !=tutulanSayi){
            System.out.println("Tahmininiz:");
            tahmin = sc.nextInt();
            denemeSayisi++;
            
            if(tahmin<tutulanSayi){
                System.out.println("Daha buyuk bir sayi giriniz.");
            }else if(tahmin>tutulanSayi){
                System.out.println("Daha kucuk bir sayi giriniz.");
            }else{
                System.out.println("Tebrikler! "+denemeSayisi+". denemede bildiniz.");
            }
            
        }
        
        double toplam=0;
        
        int pozitifSayisi=0;
        int negatifSayisi=0;
        int sifirSayisi=0;
        
        String pozitifler="";
        String negatifler="";
        String sifirlar="";
        
        System.out.println("10 tane sayi giriniz:");
        
        for (int i=1; i<=10; i++) {
            System.out.println(i+". sayi:");
            int sayi7= sc.nextInt();
            
            toplam += sayi7;
            
            if(sayi7>0){
                pozitifSayisi++;
                pozitifler +=sayi7 + " ";        
            }else if(sayi7<0){
                negatifSayisi++;
                negatifler +=sayi7 + " ";
            }else{
                sifirSayisi++;
                sifirlar +=sayi7 + " ";
            }
        }
        
        double ortalama=toplam/10;
        
        System.out.println("Aritmetik ortalama: "+ortalama);
        System.out.println("Pozitif sayilar(" + pozitifSayisi + " adet):" + pozitifler);
        System.out.println("Negatif sayilar(" + negatifSayisi + " adet):" + negatifler);
        System.out.println("Sifirlar("+ sifirSayisi + " adet):"+ sifirlar);
        
        int secim=0;
        
        while(secim!=5){
            System.out.println("1:Bir sayinin karesini hesapla.");
            System.out.println("2:Bir sayinin kupunu hesapla.");
            System.out.println("3:Bir sayinin tek veya cift oldugunu kontrol et.");
            System.out.println("4:Bir sayinin pozitif, negatif veya sifir oldugunu belirle.");
            System.out.println("5:Programdan cik.");
            secim=sc.nextInt();
            if(secim>=1 && secim<=4){
                System.out.println("Islem yapilacak sayiyi giriniz.");
                int sayi8 =sc.nextInt();
                
                switch(secim){
                    case 1 -> System.out.println("Sonuc (Karesi): " + (sayi8*sayi8));
                    case 2 -> System.out.println("Sonuc (Kupu): " + (sayi8*sayi8*sayi8));
                    case 3 -> {
                        if(sayi8%2==0){
                            System.out.println(sayi8 + " cift bir sayidir.");
                        }else{
                            System.out.println(sayi8 + " tek bir sayidir.");
                        }
                    }
                    case 4 -> {
                        if(sayi8>0){
                            System.out.println(sayi8+ " pozitiftir.");
                        }else if(sayi8<0){
                            System.out.println(sayi8+ " negatiftir.");
                        }else{
                            System.out.println("Sayi sifirdir.");
                        }
                    }
                }
            }else if(secim==5){
                System.out.println("Programdan cikiliyor.");
            }else{
                System.out.println("Gecersiz secim! 1 ile 5 arasinda bir sayi giriniz.");
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
