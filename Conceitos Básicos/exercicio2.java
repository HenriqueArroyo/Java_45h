import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Salário: " + salario;
    }
}

public class exercicio2 {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Calcular Média Salarial");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    removerFuncionario();
                    break;
                case 3:
                    listarFuncionarios();
                    break;
                case 4:
                    calcularMediaSalarial();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);
    }

    private static void adicionarFuncionario() {
        try {
            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade do funcionário: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o salário do funcionário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            funcionarios.add(new Funcionario(nome, idade, salario));
            System.out.println("Funcionário adicionado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar funcionário: " + e.getMessage());
            scanner.nextLine(); 
        }
    }

    private static void removerFuncionario() {
        try {
            System.out.print("Digite o nome do funcionário a ser removido: ");
            String nome = scanner.nextLine();
            boolean removido = false;

            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getNome().equalsIgnoreCase(nome)) {
                    funcionarios.remove(funcionario);
                    removido = true;
                    System.out.println("Funcionário removido com sucesso.");
                    break;
                }
            }

            if (!removido) {
                System.out.println("Funcionário não encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao remover funcionário: " + e.getMessage());
        }
    }

    private static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
    }

    private static void calcularMediaSalarial() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado para calcular a média.");
            return;
        }

        double somaSalarial = 0;
        for (Funcionario funcionario : funcionarios) {
            somaSalarial += funcionario.getSalario();
        }
        double mediaSalarial = somaSalarial / funcionarios.size();
        System.out.println("Média salarial dos funcionários: " + mediaSalarial);
    }
}
