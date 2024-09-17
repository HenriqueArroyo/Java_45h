import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int numDisciplinas = 4;

        double[] notas = new double[numDisciplinas];
        double somaNotas = 0.0;
        boolean bonusAplicado = true;

   
        for (int i = 0; i < numDisciplinas; i++) {
            System.out.print("Digite a nota da disciplina " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

            if (notas[i] <= 9) {
                bonusAplicado = false;
            }

            somaNotas += notas[i];
        }

        double media = somaNotas / numDisciplinas;

        if (bonusAplicado) {
            media += media * 0.10; 
        }

        String status;
        if (media >= 7) {
            status = "Aprovado";
        } else if (media >= 5) {
            status = "Recuperação";
        } else {
            status = "Reprovado";
        }

        System.out.printf("Média final: %.2f\n", media);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
