import java.util.Scanner;

public class area_circulo {

    public static void main(String[] args) {
        System.out.println("Digite o raio do circulo: ");
        Scanner raio = new Scanner(System.in);
        int x = raio.nextInt();

        double area = Math.PI * Math.pow(x, 2);
        System.out.println("a area é " + area);
        
    }

}
