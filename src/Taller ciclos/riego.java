import java.util.Scanner;

public class riego {
    static Scanner sc = new Scanner(System.in);
    static int humedad;
    static int minutosRiego;
    static int consecutivosCriticos;
    static int maxConsecutivosCriticos;

    public static void main(String[] args) {
        minutosRiego = 0;
        consecutivosCriticos = 0;
        maxConsecutivosCriticos = 0;

        System.out.print("Humedad inicial (0-100): ");
        humedad = sc.nextInt();

        for (int minuto = 1; minuto <= 24; minuto++) {
            if (humedad < 40) {
                minutosRiego++;
            }

            if (humedad < 15) {
                consecutivosCriticos++;
                if (consecutivosCriticos > maxConsecutivosCriticos) {
                    maxConsecutivosCriticos = consecutivosCriticos;
                }
            } else {
                consecutivosCriticos = 0;
            }

            if (humedad < 40) {
                humedad += 5;
                if (humedad > 100) {
                    humedad = 100;
                }
            } else if (humedad > 60) {
                humedad -= 3;
                if (humedad < 0) {
                    humedad = 0;
                }
            }
        }

        System.out.println("Minutos con riego encendido: " + minutosRiego);
        if (maxConsecutivosCriticos > 2) {
            System.out.println("Hubo estrés hídrico crítico");
        } else {
            System.out.println("No hubo estrés hídrico crítico");
        }
    }
}
