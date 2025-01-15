import java.util.Scanner;

public class metros_centimetros {

    public static void main(String[] args) {
        Scanner mt = new Scanner(System.in);
        System.out.println("Digite o valor em metros: ");
        int x = mt.nextInt();


        int conv = (x * 100);
        System.out.println(x + " metros equivale a " + conv + " centimetros");
    }

}
