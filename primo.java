import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean esPrimo = true;

        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();

        if (num <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo)
            System.out.println("El numero es primo");
        else
            System.out.println("El numero no es primo");
    }
}