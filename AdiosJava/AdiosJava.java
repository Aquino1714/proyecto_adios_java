package Java.AdiosJava;
import java.util.Scanner;
public class AdiosJava {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero1: ");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero2: ");
        numero2 = scanner.nextInt();
        System.out.println("La suma de los dos numeros es: " + (numero1 + numero2));
    }
}
