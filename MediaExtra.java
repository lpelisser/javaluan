public class MediaExtra {
    public static void main(String[] args) {

        int[] numeros = {10, 11, 12};

        double media = calcularMedia(numeros);

        System.out.println("A média dos números 10, 11 e 12 é: " + media);
    }

    public static double calcularMedia(int[] numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        return soma / (double) numeros.length;
    }
}
