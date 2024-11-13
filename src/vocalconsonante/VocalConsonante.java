/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocalconsonante;

import java.util.Scanner;

public class VocalConsonante {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String letra;
        char ch;
        do{
        letra= sc.next();
        ch=letra.charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " es una vocal.");
        else 
            System.out.println(ch + " es una consonante.");
        }while(ch!='q');
    }
}
