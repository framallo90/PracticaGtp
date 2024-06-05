import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        //Ejercicio 2
        System.out.print("Por favor ingresa un número para imprimir la serie de Fibonacci hasta ese número: ");
        int limite = scanner.nextInt();
        System.out.println("La serie de Fibonacci hasta " + limite + " es:");
        for (int i = 0; i < limite; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
        System.out.println(); // Salto de línea

        scanner.close();
    }
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib1 = 0, fib2 = 1, fibonacci = 1;
        for (int i = 2; i <= n; i++) {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        return fibonacci;
    }
}