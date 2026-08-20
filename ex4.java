import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um numero inteiro:");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero: " + numero + " é par");
        } else {
            System.out.println("O numero: " + numero + " é ímpar");
        }

        scan.close();
    }
}
