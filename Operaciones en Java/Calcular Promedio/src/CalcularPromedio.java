import java.util.Scanner;

public class CalcularPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

        double promedio = (num1 + num2 + num3) / 3;

        System.out.println("El promedio de los tres números es: " + promedio);

        // Cerrar el Scanner
        scanner.close();
    }
}