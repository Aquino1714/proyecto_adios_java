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

        // Llamar al metodo restar
        System.out.println("La resta de los dos numeros es: " + restar(numero1, numero2));
    }


    // Metodo para restar dos numeros
    public static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }
}

//1.- agregar un metodo que reste dos numeros (llamarlo en main)
//2.- commit (git add, git commit, git push)
//3.- Agregar la clase persona del proyecto
//4.- commit (git add, git commit, git push)
 