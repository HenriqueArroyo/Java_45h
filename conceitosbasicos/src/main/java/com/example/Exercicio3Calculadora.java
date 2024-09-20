package com.example;

import java.util.Scanner;

public class Exercicio3Calculadora {
    //atributos
    double a;
    double b;
    double resultado;
    int escolha;

    Scanner sc = new Scanner(System.in);
 
    //Criar métodos da operação
    public double somar(double a, double b) {
        resultado = (a+b);
        System.out.println(resultado);
        return resultado; 
    }
    public double subtrair(double a, double b) {
        resultado = (a-b);
        System.out.println(resultado);
        return resultado;
    }

    public double multiplicar(double a, double b) {
        resultado = (a*b);
        System.out.println(resultado);
        return resultado;
    }

    public double divisao(double a, double b) {
        try {
            resultado = a/b;
        } catch (Exception e) {
           System.out.println(e);
        }
        System.out.println(resultado);
        return resultado;
    }


    // public double raizQuadrada(double a) throws Exception{
    //     if (a<0) {
    //         throw new Exception("s");
    //     }
    //     try {
    //         resultado = Math.sqrt(a);
    //     } catch (Exception e) {
    //       System.err.println();
    //     }
    // }

    public void menu() {
        System.out.println("Calculadora");
        System.out.println("1. Soma");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Divisão");
        System.out.println("5. Raiz Quadrada");
        System.out.println("6. Sair");
    }


    public void entradaDados() {
        System.out.println("Qual é o primeiro valor?");
        a = sc.nextDouble();
        System.out.println("Qual é o segundo valor?");
        b = sc.nextDouble();
    }


    public void calculadora() {
        
            menu();
            try {
                escolha = sc.nextInt();
                switch (escolha) {
                    case 1:
                    entradaDados();
                    somar(a, b);
                    menu();
                    case 2:
                    entradaDados();
                    subtrair(a, b);
                    menu();
    
                    case 3:
                    entradaDados();
                    multiplicar(a, b);
                    menu();
                    case 4:
                    entradaDados();
                    divisao(a, b);
                    menu();
                    default:

                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

