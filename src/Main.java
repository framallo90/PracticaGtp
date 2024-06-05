import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int opt;
        do{
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir.");
            System.out.println("ingrese opcion");
            opt = scanner.nextInt();
            switch (opt){
                case 1:
                    ejercicio1();
                    break;

                case 2:
                    System.out.print("Por favor ingresa un número para calcular su factorial: ");
                    int n = scanner.nextInt();
                    int factorial = calcularFactorial(n);
                    System.out.println("El factorial de " + n + " es: " + factorial);
                    break;

                case 3:
                    Persona persona = crearPersona();
                    break;

                case 4:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("opcion invalida, vuelva a intentarlo.");
                    break;
            }
        }while (opt != 4);







    }

    public static Persona crearPersona(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nomrbe:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese edad");
        int edad = scanner.nextInt();

        return new Persona(nombre, edad);
    }
    public static void ejercicio1(){
        Scanner scanner = new Scanner(System.in);
        int opt;
        do{
            System.out.println("1. Lunes");
            System.out.println("2. Martes");
            System.out.println("3. Miercoles");
            System.out.println("4. Jueves");
            System.out.println("5. Viernes");
            System.out.println("6. Sabado");
            System.out.println("7. Domingo");
            System.out.println("Elija una dia");
            opt = scanner.nextInt();
            switch (opt){
                case 1:
                    System.out.println("Lunes");
                    break;

                case 2:
                    System.out.println("Martes");
                    break;

                case 3:
                    System.out.println("Miercoles");
                    break;

                case 4:
                    System.out.println("Jueves");
                    break;

                case 5:
                    System.out.println("Viernes");
                    break;

                case 6:
                    System.out.println("Sabado");
                    break;

                case 7:
                    System.out.println("Domingo");
                    break;

                case 8:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion inbvalida, vuelva a intentarlo");
                    break;

            }

        }while (opt!=8);
    }
    public static int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}