package com.example;

public class Gerenciamento {
    private Funcionario funcionarios[];
    private int contador;
    

    public void AddFuncionario(Funcionario funcionario) throws GerenciamentoException {
        if (contador>=funcionarios.length) {
            throw new GerenciamentoException("Dados Invalidos!!");
        
        }

        funcionarios[contador] = funcionario;
        contador++;
        System.out.println("Funcionario adicionado com Sucesso!!");
    }

    public void ListarFuncionarios() {
        if (contador==0) {
            System.out.println("Sem Funcionários");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(funcionarios[i].toString());
            }
        }
    }

    public void RemoverFuncionario(String nome) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            encontrado = true;
             funcionarios[i] = funcionarios[contador-1];
             funcionarios[contador-1] = null;
             contador --;
             System.out.println("Funcionário Removido");
        }
    }

    public void MediaSalarial(double salario, Funcionario funcionario) {
        
    }

}
