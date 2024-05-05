import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int num1, num2, num3;
        double number;

        System.out.println("");
        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("");

        System.out.println("");
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();
        System.out.println("");

        System.out.println("");
        System.out.println("Digite o terceiro número: ");
        num3 = scanner.nextInt();
        System.out.println("");

        if (num1 > num2) {
            System.out.println("O primeiro número é maior!");
        }
        else if (num2 > num1) {
            System.out.println("O segundo número é maior!");
        }
        else
            System.out.println("O terceiro número é o maior!");

    }
}
