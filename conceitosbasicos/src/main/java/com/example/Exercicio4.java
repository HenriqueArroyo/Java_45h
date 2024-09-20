package com.example;

import java.util.Scanner;

public class Exercicio4 {
    int n = 1;

    Scanner sc = new Scanner(System.in);

    public long calculoFatorial(int numero) {
             if (n==0 || n==1) {
                return 1;
             } else {
                return n*calculoFatorial(n-1);
             }
    }

    public void calculadora() {
        while () {
            
        }
    }
}
