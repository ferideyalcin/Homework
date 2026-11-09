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
public class deneme {
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Dogru sayinizi girin."); //20 soru var.
        int dogru = sc.nextInt();
        System.out.println("Yanlis sayinizi girin.");
        int yanlis = sc.nextInt();
        System.out.println("Bos sayiniz:" + (20-(dogru+yanlis)));
        
        
        
        if (0>(dogru+yanlis) && (dogru+yanlis)>20){
            System.out.println("Yanlis sonuc girdiniz.");
        } else { 
            System.out.println("Dogru sonuc girdiniz.");
                   
        }
        System.out.println("Netiniz: " + (dogru-(yanlis/4)));
        
        double net = dogru-(yanlis/4);
        
        
        if (net>=15){
            System.out.println("AA aldiniz.");
        } else if (net>=10) {
            System.out.println("BB aldiniz.");
        } else if (net>=5) {
            System.out.println("CC aldiniz.");
        } else { 
            System.out.println("DD aldiniz.");
        }
        
        
        
        
        
        
        
        
        
}
    
}
