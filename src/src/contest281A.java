import java.util.Objects;
import java.util.Scanner;

public class contest281A {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in); // input

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n <= 150) {
                sc.nextLine();
                for (int i = 0; i < n; i++) {
                    String op = sc.nextLine();
                    if (op.contains("++")) {
                        x++;
                    } else {
                        x--;
                    }
                }
                System.out.println(x);
            }
        }
    }
}