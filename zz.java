import java.util.Locale;
import java.util.Scanner;

public class zz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        triangulo = A * C/2;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) * C /2;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("triangulo: %.3f\n", triangulo);
        System.out.printf("Circulo: %.3f\n", circulo);
        System.out.printf("Trapezio: %.3f\n", trapezio);
        System.out.printf("Quadrado: %.3f\n", quadrado);
        System.out.printf("Retangulo: %.3f\n", retangulo);

        sc.close();
    }
}
