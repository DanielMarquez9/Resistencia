import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese resistencia 1: ");
        double r1 = scanner.nextDouble();

        System.out.print("Ingrese resistencia 2: ");
        double r2 = scanner.nextDouble();

        System.out.print("Ingrese resistencia 3: ");
        double r3 = scanner.nextDouble();

        if (r1 <= 0 || r2 <= 0 || r3 <= 0) {
            System.out.println("Todas las resistencias deben ser positivas.");
        } else {
            double rTotal = 1 / (1/r1 + 1/r2 + 1/r3);
            System.out.printf("La resistencia total es de %.2f", rTotal);
        }
    }
}
