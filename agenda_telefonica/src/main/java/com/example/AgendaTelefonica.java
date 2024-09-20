package com.example;

public class AgendaTelefonica {
    private Contato[] contatos;
    private int contador;

    public AgendaTelefonica(int maxContato){
        contatos = new Contato[maxContato];
        contador = 0;
    }

    public void AddContato(Contato contato) throws AgendaCheiaExeption {
        if (contador>=contatos.length) {
            throw new AgendaCheiaExeption("Agenda Cheia");
        }
        contatos[contador] = contato;
        contador++;
        System.out.println("Contato adicionado com Sucesso!!");
    }
    
    //  Listar
    public void ListarContato() {
        if (contador==0) {
        System.out.println("Agenda Vazia!!");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(contatos[i].toString());
            }
        }
    }
   
    public void BuscarContato(String nome) {
        if (contador==0) {
        System.out.println("Agenda Vazia!!");
        } else {
            for (int i = 0; i < contador; i++) {
                if (contatos[i].getNome().equals(nome)) {
                System.out.println(contatos[i]);
                }
            }}
    }

    public void RemoverContato(String nome) {
     boolean encontrado = false;
     for (int i = 0; i < contador; i++) {
        if (contatos[i].getNome().equalsIgnoreCase(nome)) {
            encontrado = true;
             contatos[i] = contatos[contador-1];
             contatos[contador-1] = null;
             contador --;
             System.out.println("Contato removido");
        }
     
     }


    }


}
