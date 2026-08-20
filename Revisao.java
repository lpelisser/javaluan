import java.util.Scanner;

public class Revisao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva a quantidade de anos: ");
        int anos = scan.nextInt();
        System.out.println(anos);

        System.out.println("Escreva a quantidade de meses: ");
        int meses = scan.nextInt();
        System.out.println(meses);

        System.out.println("Escreva a quantidade de dias: ");
        int dias = scan.nextInt();
        System.out.println(dias);

        int diasTotais = (anos * 365) + (meses * 30) + dias;

        System.out.println("Anos: " + anos + "\nMeses: " + meses + "\nDias: " + dias
                + "\nTotal: " + diasTotais + " dias.");

        scan.close();
    }
}
