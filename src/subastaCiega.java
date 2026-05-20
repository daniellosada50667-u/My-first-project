import java.util.Scanner;

public class subastaCiega {
    static Scanner sc = new Scanner(System.in);
    static int precioBase;
    static int ofertaMax;
    static int ofertasValidas;

    public static void main(String[] args) {
        System.out.print("Precio Base: ");
        precioBase = sc.nextInt();
        ofertaMax = precioBase;
        ofertasValidas = 0;

        while (true) {
            System.out.print("Ingrese oferta (0 para terminar): ");
            int oferta = sc.nextInt();

            if (oferta == 0) {
                break;
            }

            if (oferta > ofertaMax) {
                ofertaMax = oferta;
                ofertasValidas++;
            } else {
                System.out.println("Oferta insuficiente");
            }
        }

        System.out.println("Precio final de venta: " + ofertaMax);
        System.out.println("Ofertas válidas: " + ofertasValidas);
    }
}
