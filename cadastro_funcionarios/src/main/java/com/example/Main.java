package com.example;

import javax.swing.JOptionPane;
import com.example.Gerenciamento;
import com.example.GerenciamentoException;
import com.example.Funcionario;

public class Main {
    public static void main(String[] args) {
    Gerenciamento gerenciamento = new Gerenciamento();
    int operador=0;
    do {
        JOptionPane.showMessageDialog(null, gerenciamento, "Gerenciamento", operador);
        switch (gerenciamento) {
            case value:
                
                break;
        
            default:
                break;
        }
    } while (operador!=5);

    }
}