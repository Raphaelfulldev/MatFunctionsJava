import java.util.Locale;
import java.util.Scanner;

public class xx {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double cod1, numero1, valor1;
        cod1 = sc.nextDouble();
        numero1 = sc.nextDouble();
        valor1 = sc.nextDouble();

        double cod2, numero2, valor2;
        cod2 = sc.nextDouble();
        numero2 = sc.nextDouble();
        valor2 = sc.nextDouble();

        double total = (numero1 * valor1) + (numero2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);

        sc.close();
    }
}
