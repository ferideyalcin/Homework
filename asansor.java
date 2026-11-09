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
public class asansor {
    
    public static void main(String[] args) {    
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Asansor 10 katlidir.");
        System.out.println("Katiniz hangisi?");
        int kat = sc.nextInt();
        
        if (10 >= kat && kat >= 0){
            System.out.println("Boyle bir kat var");
        } else {
            System.out.println("Boyle bir kat yok.");
                
            
        }
        
        System.out.println("Bir kat gir.");
        int kat1 = sc.nextInt();
        System.out.println("Bir kat daha gir.");
        int kat2 = sc.nextInt();
        
        if (kat1>kat2) {
            System.out.println((kat1-kat2) + " kat aşagi in.");
        } else if (kat2>kat1) { 
            System.out.println((kat2-kat1) + " kat yukari cik.");
        } else { 
               System.out.println("Ayni yerde kal.");
                }              
        
        System.out.println("Bir kat giriniz."); //Kat mesafesi 2 metre.
        int kat3 = sc.nextInt();
        System.out.println("Bir kat daha giriniz.");
        int kat4 = sc.nextInt();
        
        System.out.println("Kat mesafesi:"+ Math.abs(2*kat3-2*kat4));
        
    
    
    
    
        
        
    
    
    }
}
