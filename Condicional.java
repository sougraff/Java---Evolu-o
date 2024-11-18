import java.util.Scanner;


public class Condicional {

    public static void main(String[] args) {
    
    Scanner entradaUsuario = new Scanner(System.in);
    System.out.println("A soma de 2 + 2 é igual a  4?, se sim, digite verdade, se nao, digite, falso: ");
    
    String resposta = entradaUsuario.nextLine();

    if (resposta.equals("verdade")) {
        System.out.println("Correto!");
    } else {
        System.out.println("Errado!");
    }
    
    entradaUsuario.close();
    }

}