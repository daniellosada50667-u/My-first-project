import java.util.Scanner;

public class voltearNumero {
    static Scanner sc = new Scanner(System.in);
    static long numero = sc.nextLong();
    static long original = numero;
    static long invertido = 0;

    public static void main(String[] args) {
        while (numero > 0) {
            long digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        System.out.println(invertido);

        if (original == invertido) {
            System.out.println("Palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }
}
