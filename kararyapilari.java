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
public class kararyapilari {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi girin.");
        int sayi = sc.nextInt();
        
        if (sayi % 2 == 0){
            System.out.println("Sayiniz cifttir.");
        } else {
            System.out.println("Sayiniz tektir.");
        }
        
        if (sayi > 0){
            System.out.println("Sayiniz pozitif.");
        } else if (sayi < 0) {
            System.out.println("Sayiniz negatiftir.");
        } else {
            System.out.println("Sayiniz 0'dir.");
        }    
        
        System.out.println("Bir sayi daha giriniz.");
        int sayi2 = sc.nextInt();
        
        if (sayi > sayi2) {
            System.out.println(sayi + ">" + sayi2);
        } else if (sayi < sayi2) {
            System.out.println(sayi + "<" + sayi2);
        } else {
            System.out.println(sayi + "=" + sayi2);
        }
        
        System.out.println("Bir sayi daha girin.");
        int sayi3 = sc.nextInt();
        
        if (sayi > sayi2 && sayi > sayi3){
            System.out.println("En buyuk sayi:" + sayi);
        } else if (sayi2 > sayi && sayi2 > sayi3){
            System.out.println("En buyuk sayi:" + sayi2);
        } else if (sayi3 > sayi && sayi3 > sayi2){
            System.out.println("En buyuk sayi:" + sayi3);
        } else {
            System.out.println("Sayilardan en az ikisinde esitlik durumu vardir.");
        }
        
        System.out.println("Notunuzu girin.");
        int not = sc.nextInt();
        
        if (0>not && not>100){
            System.out.println("Yanlis sonuc girdiniz.");
        } else { 
            System.out.println("Dogru sonuc girdiniz.");
        }      
        
        if (not>=90){
            System.out.println("AA aldiniz.");
        } else if (not>=80){
            System.out.println("BA aldiniz.");
        } else if (not>=70){
            System.out.println("BB aldiniz.");
        } else if (not>=60){
            System.out.println("CB aldiniz.");
        } else if (not>=50){
            System.out.println("CC aldiniz.");
        } else {
            System.out.println("FF aldiniz.");
        }
        
        System.out.println("Bir yil giriniz.");
        int yil = sc.nextInt();
        
        if (yil % 4 == 0){
            System.out.println("Girdiginiz yil artiktir.");
        } else {
            System.out.println("Girdiginiz yil artik degildir.");
        }   
        
        System.out.println("Bir sayi girin.");
        int sayi4 = sc.nextInt();
        
        if (sayi4 % 15 == 0){
            System.out.println("Sayiniz hem 3'e hem 5'e bolunur.");
        } else if (sayi4 % 3 == 0){
            System.out.println("Sayiniz 3'e bolunur.");
        } else if (sayi4 % 5 == 0){
            System.out.println("Sayiniz 5' bolunur.");
        } else {
            System.out.println("Sayiniz hem 3'e hem 5'e bolunmez.");
        }
        
        System.out.println("Bir sayi girin.");
        int sayi5 = sc.nextInt();
        System.out.println("Bir sayi daha girin");
        int sayi6 = sc.nextInt();
        
        System.out.println("Yapmak istediginiz islemi girin(+, -, *, /):");
        char islem = sc.next().charAt(0);
        double sonuc = 0;
        
        switch (islem) {
            case '+' -> sonuc = sayi5 + sayi6;
            case '-' -> sonuc = sayi5 - sayi6;
            case '*' -> sonuc = sayi5 * sayi6;
            case '/' -> sonuc = sayi5 / sayi6;
            default -> System.out.println("Islem gecersizdir.");
        }
        
        System.out.println("Islem sonucunuz:" + sonuc);
        
        System.out.println("Bir kenar uzunlugu girin.");
        int sayi7 = sc.nextInt();
        System.out.println("Bir kenar uzunlugu daha girin.");
        int sayi8 = sc.nextInt();
        System.out.println("Bir kenar uzunlugu daha girin.");
        int sayi9 = sc.nextInt();
        
        if (sayi7>=(sayi8+sayi9) || sayi8>=(sayi7+sayi9) || sayi9>=(sayi7+sayi8)){
            System.out.println("Bu kenarlarla ucgen olusturulamaz.");
        } else {
            System.out.println("Bu kenarlarla ucgen olusturulabilir.");
        
        if (sayi7 == sayi8 && sayi8 == sayi9 && sayi7 == sayi9){
            System.out.println("Ucgeniniz eskenardir.");
        } else if (sayi7 == sayi8 || sayi8 == sayi9 || sayi7 == sayi9){
            System.out.println("Ucgeniniz ikizkenardir.");
        } else {
            System.out.println("Ucgeniniz cesitkenardir.");
        }
        
        }  
        
        System.out.println("1-7 arasinda bir sayi girin.");
        int gun = sc.nextInt();
        
        switch (gun) {
            case 1 -> {
                boolean Pazartesi = true;
                System.out.println("Pazartesi");
            }

            case 2 -> {
                boolean Sali = true;
                System.out.println("Sali");
            }

            case 3 -> {
                boolean Carsamba = true;
                System.out.println("Carsamba");
            }

            case 4 -> {
                boolean Persembe = true;
                System.out.println("Persembe");
            }

            case 5 -> {
                boolean Cuma = true;
                System.out.println("Cuma");
            }

            case 6 -> {
                boolean Cumartesi = true;
                System.out.println("Cumartesi");
            }

            case 7 -> {
                boolean Pazar = true;
                System.out.println("Pazar");
            }

            default -> System.out.println("Hatali giris yaptiniz.");
        }
        
        
    }
    
}
