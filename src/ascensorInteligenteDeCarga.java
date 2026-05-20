import java.util.Scanner;

public class ascensorInteligenteDeCarga {
    static int pesoMaximo = 1000;
    static int pesoActual = 0;
    static int personas = 0;
    static int pesoPersona = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Indique el peso de la persona: ");
            int pesoPersona = sc.nextInt();
            if (pesoActual < 1000 && personas < 8) {
                pesoActual += pesoPersona;
                personas++;
            } else {
                System.out.println(
                        "El ascensor ha alcanzado su peso maximo o su capacidad de personas, no se puede ingresar mas personas");
                break;
            }
        }

        System.out.println("Peso actual: " + pesoActual);
        System.out.println("Personas en el ascensor: " + personas);
    }

}
