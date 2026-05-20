import java.util.Scanner;
public class validador {
    static Scanner sc = new Scanner(System.in);
    static int prev2 = -1;
    static int prev1 = -1;
    static int digito;
    static int inseguro = 0;
    static int motivo = 0;
    public static void main(String[] args) {
        

        while (true) {
            digito = sc.nextInt();
            if (digito < 0) {
                break;
            }

            if (prev2 != -1 && prev1 != -1) {
                if (prev2 == prev1 && prev1 == digito) {
                    inseguro = 1;
                    motivo = 1;
                    break;
                }
                if (prev2 + 1 == prev1 && prev1 + 1 == digito) {
                    inseguro = 1;
                    motivo = 2;
                    break;
                }
            }

            prev2 = prev1;
            prev1 = digito;
        }

        if (inseguro != 0) {
            System.out.println("Contraseña Insegura");
            if (motivo == 1) {
                System.out.println("Motivo: mismo dígito tres veces seguidas");
            } else if (motivo == 2) {
                System.out.println("Motivo: secuencia de tres números consecutivos ascendentes");
            }
        } else {
            System.out.println("Contraseña Segura");
        }
    }
}
