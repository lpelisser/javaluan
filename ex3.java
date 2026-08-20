import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salariominimo = 788.00;

        System.out.println("Digite seu salário: R$");
        double salariousuario = scan.nextDouble();

        double quantidadeSalarios = salariousuario / salariominimo;

        System.out.println("A quantidade de salários mínimos é: " + quantidadeSalarios);

        scan.close();
    }
}
