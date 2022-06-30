import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B , C , tringulo, circulo, trapezio, quadrado, retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        tringulo = A * C /2;
        circulo = 3.14159 * C * C;
        trapezio = (A + B)* C /2;
        quadrado = B*B;
        retangulo = A*B;

        System.out.printf("Tringulo: %.3f\ncirculo: %.3f\ntrapezio: %.3f\nquadrado: %.3f" +
                "\nretangulo: %.3f", tringulo,circulo,trapezio,quadrado,retangulo);

    }
}
