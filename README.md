# javaluan
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

 int diasTotais = (anos*365) + (meses*30) + dias;

 System.out.println("A idade de" + anos + "anos" + meses + "meses" + dias + "dias" + "dias é equivalente a" + diasTotais + "dias");
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
public class ex2{
    public static void main(String[] args) {
      
        int[] numeros1 = {8, 9, 7};
        int[] numeros2 = {4, 5, 6};

        double media1 = calcularMedia(numeros1);
        double media2 = calcularMedia(numeros2);

      double somaMedias = media1 + media2;

      double mediaDasMedias = (media1 + media2) / 2;

      System.out.println("Média dos números 8, 9 e 7: " + media1);
      System.out.println("Média dos números 4, 5 e 6: " + media2);
      System.out.println("Soma das duas médias: " + somaMedias);
      System.out.println("Média das médias: " + mediaDasMedias);
      

    

    }
    public static double calcularMedia(int[] numeros) {
        int soma = 0;
    
        for (int num : numeros) {
            soma += num;
        }
        
        
        return soma / (double) numeros.length;
    }
}
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        double salariominimo = 788.00;


        System.out.println("Digite seu salário: R$");
        double salariousuario = scan.nextDouble();

        double quantidadeSalarios = salariousuario / salariominimo;

        System.out.println("A quantidade de salários mínimos é: " + quantidadeSalarios);
        
        scan.close();
    }
    
}
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um numero inteiro:");
        int numero = scan.nextInt();

        if (numero % 2 == 0){
            System.out.println("O numero: 3" + numero + " é par");
        
        }else{
            System.out.println("O numero: " + numero + " é ímpar");
        }

        scan.close();
    }
    
}
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

import javax.swing.JOptionPane;

public class luan {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Escreva seu nome:");

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Escreva sua idade:"));

        String objetivo = JOptionPane.showInputDialog("Quais seus objetivos de vida:");

      System.out.printf("Nome: %s",nome, "\nIdade: %s", idade, "\nObjetivo: %s");
      JOptionPane.showMessageDialog(null,"Nome:" + nome + "\nIdade:" + idade + "\nObjetivos:" + objetivo,"informação",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class revisão {
    public static void main(String[] args){
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

        int diasTotais = (anos*365) + (meses*30) + dias;

    System.out.println("Anos:"+ anos + "\nmeses:" + meses + "\ndias:15" + dias + diasTotais + "dias.");


        scan.close();
    }
   
}
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
public class revisão2 {
    public static void main(String[] args) {
        //A média dos números 4, 5 e 6.//

        int[] numeros = {10,11,12};

        double media = calcularmedia(numeros);

        System.out.println("A média dos numeros 10,11,12 é:" + media);
    }
    public static double calcularmedia (int[] numeros ){
    int soma = 0;
    
        for (int num : numeros) {
            soma += num;
        }
        
        
        return soma / (double) numeros.length;
    }

    
}





 scan.close();

    }
}
