import java.util.Scanner;

public class NumeroInformado {
    public static void main (String [] args) {
        Scanner entradaUsuario = new Scanner (System.in);
        System.out.print("digite o numero desejado: ");

        double numero = entradaUsuario.nextDouble();
        System.out.println("O numero digitado foi " + numero);

        entradaUsuario.close();
    }
}

// EU TENHO TANTOS E TANTOS PORQUES QUE EU VOU FICAR QUIETO PRA NAO OFENDER NINGUEM
