import java.util.Scanner;

public class x {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a altura da pessoa
        System.out.print("Digite a altura da pessoa em metros: ");
        double altura = scanner.nextDouble();

        // Calcula o peso ideal usando a fórmula
        double pesoIdeal = (72.7 * altura) - 58;

        // Exibe o resultado
        System.out.printf("O peso ideal para uma altura de %.2f metros é: %.2f kg\n", altura, pesoIdeal);

        // Fecha o scanner
        scanner.close();
    }
}
