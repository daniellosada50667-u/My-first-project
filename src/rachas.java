import java.util.Scanner;

public class rachas {
    static Scanner sc = new Scanner(System.in);
    static int puntos = 0;
    static int rachaInvicto = 0;
    static int maxInvicto = 0;
    static int rachaPerdidas = 0;
    static int maxPerdidas = 0;
    static String entrada;
    static char resultado;

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print("Resultado del partido " + i + " (G/E/P): ");
            entrada = sc.nextLine().trim().toUpperCase();
            if (entrada.isEmpty()) {
                i--;
                continue;
            }
            resultado = entrada.charAt(0);

            if (resultado == 'G') {
                puntos += 3;
                rachaInvicto++;
                rachaPerdidas = 0;
            } else if (resultado == 'E') {
                puntos += 1;
                rachaInvicto++;
                rachaPerdidas = 0;
            } else if (resultado == 'P') {
                rachaPerdidas++;
                rachaInvicto = 0;
            } else {
                System.out.println("Entrada inválida. Use G, E o P.");
                i--;
                continue;
            }

            if (rachaInvicto > maxInvicto) {
                maxInvicto = rachaInvicto;
            }
            if (rachaPerdidas > maxPerdidas) {
                maxPerdidas = rachaPerdidas;
            }
        }

        System.out.println("Puntos totales: " + puntos);
        System.out.println("Mayor racha invicto: " + maxInvicto + " partidos");
        System.out.println("Peor racha de derrotas: " + maxPerdidas + " partidos");
    }
}
