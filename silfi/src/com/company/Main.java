package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Silfi Nur Amalia / 6706160043");
        System.out.print("Masukkan Angka :");

        int n = sc.nextInt();
        for(int x=n; x>=1; x--)
        {
            for(int y=x-1; y>=1; y--){
                System.out.print("O");
            }
            for(int z=1; z<=((n+1)-x)*2; z++){
                System.out.print("*");
            }
            for(int y=x-1; y>=1; y--){
                System.out.print("O");
            }
            System.out.println();
        }

        
        for(int i=n; i>=1; i--)
        {
            for(int k=1; k<=n-i; k++){
                System.out.print("O");
            }
            for(int j=i*2; j>=1; j--){
                System.out.print("*");
            }
            for(int k=1; k<=n-i; k++){
                System.out.print("O");
            }
            System.out.println();
        }
    }
}
