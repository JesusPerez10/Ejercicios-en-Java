import java.util.Scanner;
public static void holaMundo() {
    System.out.println("Hola, Mundo!");
}

public static void sumaDeDosNumeros() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el primer número: ");
    int numero1 = scanner.nextInt();
    System.out.print("Ingrese el segundo número: ");
    int numero2 = scanner.nextInt();
    int suma = numero1 + numero2;
    System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
}

public static void numeroParOImpar() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número: ");
    int numero = scanner.nextInt();
    if (numero % 2 == 0) {
        System.out.println("El número " + numero + " es par.");
    } else {
        System.out.println("El número " + numero + " es impar.");
    }
}
public static void factorialDeUnNumero() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número: ");
    int numero = scanner.nextInt();
    long factorial = 1;
    for (int i = 1; i <= numero; i++) {
        factorial *= i;
    }
    System.out.println("El factorial de " + numero + " es: " + factorial);
}
public static void tablaDeMultiplicar() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número: ");
    int numero = scanner.nextInt();
    System.out.println("Tabla de multiplicar del " + numero + ":");
    for (int i = 1; i <= 10; i++) {
        System.out.println(numero + " x " + i + " = " + (numero * i));
    }
}
public static void numeroMayorYMenor() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese una serie de números enteros (termina con un número negativo):");

    int numero;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

    while (true) {
        System.out.print("Ingrese un número: ");
        numero = scanner.nextInt();

        if (numero < 0) {
            break;
        }

        if (numero > maximo) {
            maximo = numero;
        }

        if (numero < minimo) {
            minimo = numero;
        }
    }

    if (maximo == Integer.MIN_VALUE || minimo == Integer.MAX_VALUE) {
        System.out.println("No se ingresaron números válidos.");
    } else {
        System.out.println("El número más grande es: " + maximo);
        System.out.println("El número más pequeño es: " + minimo);
    }
}
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Número más grande y más pequeño de una serie");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    holaMundo();
                    break;
                case 2:
                    sumaDeDosNumeros();
                    break;
                case 3:
                    numeroParOImpar();
                    break;
                case 4:
                    factorialDeUnNumero();
                    break;
                case 5:
                    tablaDeMultiplicar();
                    break;
                case 6:
                numeroMayorYMenor();
                break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 7);

        scanner.close();
    }



