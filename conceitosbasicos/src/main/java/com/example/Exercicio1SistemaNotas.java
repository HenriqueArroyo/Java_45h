package com.example;

import java.util.Scanner;

public class Exercicio1SistemaNotas {
    double[] notas = new double[4];
    double mediaNotas = 0;
    boolean bonus = true;

    Scanner sc = new Scanner(System.in);
 
    public void calculoNotas() {
        //Pegar todas as notas dos Alunos
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota "+i+":");
            notas[i]=sc.nextDouble();
            //Somar as notas na variavel média
            mediaNotas+=notas[i];
            // invalida o bonus caso nota <9
            if (notas[i]<9) {
                bonus = false;
            }
        }
        mediaNotas/=notas.length;
        // Aplicar o bonus
        if (bonus) {
            mediaNotas= (mediaNotas*1.1>10?
            mediaNotas=10:
            mediaNotas*1.1
            );
        }
        if (mediaNotas>=7) {
            System.out.println("Aprovado");
        } else if (mediaNotas>=5) {
        System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

}
