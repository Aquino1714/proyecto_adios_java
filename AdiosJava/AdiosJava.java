package Java.AdiosJava;
import java.util.Scanner;
public class AdiosJava {

    public static int multiplicar(int numero1, int numero2) {
        return n1 * n2;
    }

    // Clase Persona
    public class Persona {
        String nombre;
        int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
    }


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

        //Utilizar la clase Persona 
        Persona persona1 = new Persona();
        
        // Usando SETTERS para asignar valores
        persona1.setNombre("Carlos");
        persona1.setEdad(25);
        
        // Obteniendo y mostrando los valores
        System.out.println("Nombre de la persona: " + persona1.getNombre());
        System.out.println("Edad de la persona: " + persona1.getEdad());
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
 