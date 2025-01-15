import java.util.Scanner;

public class soma_resultado {

    public static void main(String[] args) {
    System.out.print("Digite o primeiro numero: ");
    Scanner x = new Scanner(System.in);
    int num1 = x.nextInt();

    System.out.print("Digite o primeiro numero: ");
    Scanner y = new Scanner(System.in);
    int num2 = y.nextInt();

    int soma = (num1 + num2);

    System.out.print("o resultado é " + (soma));

    }

}
