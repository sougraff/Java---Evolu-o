import java.util.Scanner;

public class area_dobro {

    public static void main(String[] args) {
        System.out.println("digite a altura: ");
        Scanner h = new Scanner(System.in);
        double altura = h.nextDouble();

        System.out.println("digite a largura: ");
        Scanner l = new Scanner(System.in);
        double largura = h.nextDouble();

        double dobro = ((altura + largura) * 2);
        System.out.println("o dobro da area é " + dobro);
    }
}
