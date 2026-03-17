import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();

        boolean esPrimo = esPrimo(num);

        System.out.println(esPrimo ? "El numero es primo" : "El numero no es primo");

        sc.close();
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}