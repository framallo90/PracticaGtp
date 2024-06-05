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
                    Persona persona = ejercicio3();
                    persona.toString();
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

    public static Persona ejercicio3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nomrbe:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese edad");
        int edad = scanner.nextInt();

        return new Persona(nombre, edad);
    }
    public static void ejercicio1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 7 para el día de la semana:");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido. Introduce un número del 1 al 7.");
        }

        scanner.close();
    }
    public static int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }



}