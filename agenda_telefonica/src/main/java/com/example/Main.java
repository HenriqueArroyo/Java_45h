package com.example;

import javax.swing.JOptionPane;
import com.example.AgendaCheiaExeption;
import com.example.AgendaTelefonica;
import com.example.Contato;

public class Main {
    public static void main(String[] args) throws AgendaCheiaExeption {
        AgendaTelefonica agenda = new AgendaTelefonica(5);
        int operador=0;
        do {
            System.out.println("\n---Agenda Telefonica---");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contato");
            System.out.println("3. Bucasr Contato(nome)");
            System.out.println("4. Remover Contato(nome)");
            System.out.println("5. Sair");
           operador = Integer.parseInt(JOptionPane.showInputDialog("Digite a Operação")) ;
            switch (operador) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome:");
                    String telefone = JOptionPane.showInputDialog("Digite o Telefone:");
                    Contato contato = new Contato(nome, telefone);
                    agenda.AddContato(contato);
                    break;
                case 2:
                    agenda.ListarContato();
                    break;

                case 3:
                    String nomeBuscar = JOptionPane.showInputDialog("Digite o nome:");
                    agenda.BuscarContato(nomeBuscar);
                    break;

                case 4:
                    String nomeRemover = JOptionPane.showInputDialog("Digite o nome:");
                    agenda.BuscarContato(nomeRemover);
                    break;
                case 5:
                break;
                default:
                
                    break;
            }
        } while (operador!=5);
    }
}