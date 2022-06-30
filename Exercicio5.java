import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double cod1, cod2, qnt1, qnt2, valor1, valor2, total;

        cod1 = sc.nextDouble();
        qnt1 = sc.nextDouble();
        valor1 = sc.nextDouble();
        cod2 = sc.nextDouble();
        qnt2 = sc.nextDouble();
        valor2 = sc.nextDouble();
        total = (valor1*qnt1)+(valor2*qnt2);


        System.out.printf("VALOR A PAGAR: $ %.2f", total);
    }
}
