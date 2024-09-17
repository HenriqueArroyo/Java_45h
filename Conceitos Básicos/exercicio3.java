import java.util.Scanner;

// Classe base para operações
abstract class Operacao {
    abstract double calcular(double a, double b) throws ArithmeticException;
}

// Subclasse para operação de soma
class Soma extends Operacao {
    @Override
    double calcular(double a, double b) {
        return a + b;
    }
}

// Subclasse para operação de subtração
class Subtracao extends Operacao {
    @Override
    double calcular(double a, double b) {
        return a - b;
    }
}

// Subclasse para operação de multiplicação
class Multiplicacao extends Operacao {
    @Override
    double calcular(double a, double b) {
        return a * b;
    }
}

// Subclasse para operação de divisão
class Divisao extends Operacao {
    @Override
    double calcular(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}

// Subclasse para operação de raiz quadrada
class RaizQuadrada extends Operacao {
    @Override
    double calcular(double a, double b) throws ArithmeticException {
        if (a < 0) {
            throw new ArithmeticException("Raiz quadrada de número negativo não é permitida.");
        }
        return Math.sqrt(a);
    }
}

public class exercicio3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Raiz Quadrada");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    realizarOperacao(new Soma());
                    break;
                case 2:
                    realizarOperacao(new Subtracao());
                    break;
                case 3:
                    realizarOperacao(new Multiplicacao());
                    break;
                case 4:
                    realizarOperacao(new Divisao());
                    break;
                case 5:
                    realizarRaizQuadrada();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 6);
    }

    private static void realizarOperacao(Operacao operacao) {
        try {
            System.out.print("Digite o primeiro número: ");
            double a = lerDouble();
            System.out.print("Digite o segundo número: ");
            double b = lerDouble();
            double resultado = operacao.calcular(a, b);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }

    private static void realizarRaizQuadrada() {
        try {
            System.out.print("Digite o número: ");
            double a = lerDouble();
            RaizQuadrada raizQuadrada = new RaizQuadrada();
            double resultado = raizQuadrada.calcular(a, 0);
            System.out.println("Raiz quadrada: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }

    private static int lerInteiro() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um número inteiro: ");
            }
        }
    }

    private static double lerDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um número: ");
            }
        }
    }
}
