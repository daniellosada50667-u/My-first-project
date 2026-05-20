import java.util.Scanner;

public class tesoro {
    static Scanner sc = new Scanner(System.in);
    static int oxigeno = 100;
    static int dificultad;
    static int anterior = 0;
    static int sala = 0;

    public static void main(String[] args) {
        while (sala < 10 && oxigeno > 0) {
            sala++;
            System.out.print("Dificultad sala " + sala + " (1-5): ");
            dificultad = sc.nextInt();

            int consumo = dificultad * 3;
            if (dificultad > anterior && anterior != 0) {
                consumo += 5;
            }

            oxigeno -= consumo;
            anterior = dificultad;

            if (oxigeno <= 0) {
                System.out.println("Fracasó. Oxígeno agotado en la sala " + sala + ".");
                break;
            }
        }

        if (oxigeno > 0 && sala == 10) {
            System.out.println("Éxito. Atravesó las 10 salas.");
        }

        System.out.println("Oxígeno restante: " + oxigeno);
    }
}