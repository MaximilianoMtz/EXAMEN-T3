import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el perímetro (circunferencia) del círculo
        double perimetro = 2 * Math.PI * radio;

        // Calcular el área del círculo
        double area = Math.PI * Math.pow(radio, 2);

        // Imprimir los resultados
        System.out.println("Perímetro del círculo: " + perimetro);
        System.out.println("Área del círculo: " + area);

        scanner.close();
    }
}
