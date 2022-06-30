import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double funcionario = sc.nextDouble();
        double horasTrabalhadas = sc.nextDouble();
        double valorHoras = sc.nextDouble();
        double salario = horasTrabalhadas * valorHoras;

        System.out.printf("Number : %.0f\n" , funcionario);
        System.out.printf("Salary = U$ %.2f\n" , salario);


        sc.close();


    }
}
