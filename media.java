import java.util.Scanner;

public class media {

    public static void main(String[] args) {
        System.out.println("digite o primeiro numero: ");
        Scanner x = new Scanner(System.in);
        int num1 = x.nextInt();

        System.out.println("digite o segundo numero: ");
        Scanner y = new Scanner(System.in);
        int num2 = y.nextInt();

        int media = (num1 + num2)/2;
        System.out.println("a media é igual a " + media);

    }

}
