import java.util.Scanner;

public class contest158A {
    public static void main(String[] args) {
        int numPart = 0;
        int k = 0;
        int counterWinners = 0;
        Scanner sc = new Scanner(System.in);
        numPart = sc.nextInt();
        k = sc.nextInt();
        if (k >= 1 && k <= numPart && numPart <= 50) {
            int[] lista = new int[numPart];
            for (int i = 0; i < lista.length; i++) {
                int valor = sc.nextInt();
                if (valor > 0 && valor <= 100) {
                    lista[i] = valor;
                }

            }
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] >= lista[k - 1] && lista[i] > 0) {
                    counterWinners++;
                }
            }
            System.out.println(counterWinners);
        }
    }
}
