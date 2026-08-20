import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de anos:");
        int anos = scan.nextInt();
        scan.nextLine();
        System.out.println(anos);

        System.out.println("Digite a quantidade de meses:");
        int meses = scan.nextInt();
        scan.nextLine();
        System.out.println(meses);

        System.out.println("Digite a quantidade de dias:");
        int dias = scan.nextInt();
        scan.nextLine();
        System.out.println(dias);

        int diasTotais = (anos * 365) + (meses * 30) + dias;

        System.out.println("A idade de " + anos + " anos, " + meses + " meses e " + dias
                + " dias é equivalente a " + diasTotais + " dias");

        scan.close();
    }
}
