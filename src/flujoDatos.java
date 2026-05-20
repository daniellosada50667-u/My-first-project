import java.util.Scanner;

public class flujoDatos {
    static Scanner sc = new Scanner(System.in);
    static int frecuencia;
    static int anterior = -1;
    static int anteriorAnterior = -1;
    static int picos = 0;

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            frecuencia = sc.nextInt();

            if (i >= 3) {
                if (anteriorAnterior < anterior && anterior > frecuencia) {
                    picos++;
                }
            }

            anteriorAnterior = anterior;
            anterior = frecuencia;
        }

        System.out.println("Picos reales: " + picos);
    }
}